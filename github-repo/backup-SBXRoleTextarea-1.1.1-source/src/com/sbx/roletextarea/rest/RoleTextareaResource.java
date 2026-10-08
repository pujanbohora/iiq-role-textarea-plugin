package com.sbx.roletextarea.rest;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sailpoint.object.Bundle;
import sailpoint.object.ObjectAttribute;
import sailpoint.object.ObjectConfig;
import sailpoint.rest.plugin.AllowAll;
import sailpoint.rest.plugin.BasePluginResource;

/**
 * Exposes the "multilineAttributes" plugin setting to the RoleEditor snippet.
 *
 * The built-in /rest/plugins/{id}/settings endpoint requires FullAccessPlugin,
 * which ordinary role managers do not have, hence this endpoint.
 *
 * This is a read-only configuration lookup. It performs no role or
 * permission checks and writes nothing: whether an attribute is editable for
 * the current user is decided by IIQ when it renders RoleEditor, and the
 * snippet only converts a text input that IIQ actually rendered.
 *
 * Names are filtered by attribute definition only (must exist, be a
 * single-valued string), because RoleEditor also renders int/long/date
 * attributes as text inputs and those must never become textareas.
 */
@Path("sbxroletextarea")
@Produces(MediaType.APPLICATION_JSON)
public class RoleTextareaResource extends BasePluginResource {

    private static final Log log = LogFactory.getLog(RoleTextareaResource.class);

    public static final String PLUGIN_NAME = "SBXRoleTextarea";
    public static final String SETTING_MULTILINE_ATTRIBUTES = "multilineAttributes";

    @Override
    public String getPluginName() {
        return PLUGIN_NAME;
    }

    /**
     * Returns {"multilineAttributes": [...accepted names...],
     *          "rejected": {name: reason, ...}}.
     * Readable by any authenticated user (no plugin-admin right needed);
     * it only exposes attribute names.
     */
    @GET
    @Path("config")
    @AllowAll
    public Map<String, Object> getConfig() {
        List<String> accepted = new ArrayList<>();
        Map<String, String> rejected = new LinkedHashMap<>();

        List<String> configured = getSettingMultiString(SETTING_MULTILINE_ATTRIBUTES);
        ObjectConfig roleConfig = ObjectConfig.getObjectConfig(Bundle.class);

        if (configured != null) {
            for (String raw : configured) {
                String name = (raw == null) ? "" : raw.trim();
                if (name.isEmpty() || accepted.contains(name)) {
                    continue;
                }
                String reason = getRejectReason(roleConfig, name);
                if (reason == null) {
                    accepted.add(name);
                } else {
                    rejected.put(name, reason);
                    log.warn(PLUGIN_NAME + ": ignoring multiline attribute '" + name + "': " + reason);
                }
            }
        }

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("multilineAttributes", accepted);
        result.put("rejected", rejected);
        return result;
    }

    /**
     * Definition-only sanity check of a configured name. Returns null when the
     * attribute is a single-valued string. Editability (editMode, allowed
     * values, user rights) is deliberately not evaluated here.
     */
    private static String getRejectReason(ObjectConfig roleConfig, String name) {
        ObjectAttribute attr = (roleConfig == null) ? null : roleConfig.getObjectAttribute(name);
        if (attr == null) {
            return "not a Role extended attribute";
        }
        String type = attr.getType();
        if (type != null && !ObjectAttribute.TYPE_STRING.equals(type)) {
            return "type is " + type + ", not string";
        }
        if (attr.isMulti()) {
            return "is multi-valued";
        }
        return null;
    }
}
