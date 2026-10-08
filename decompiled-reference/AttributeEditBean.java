/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.faces.model.SelectItem
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 *  org.aspectj.lang.JoinPoint
 *  org.aspectj.lang.JoinPoint$StaticPart
 *  org.aspectj.lang.Signature
 *  org.aspectj.runtime.internal.Conversions
 *  org.aspectj.runtime.reflect.Factory
 *  sailpoint.api.ObjectUtil
 *  sailpoint.api.SailPointFactory
 *  sailpoint.object.Attributes
 *  sailpoint.object.Identity
 *  sailpoint.object.IdentityTypeDefinition
 *  sailpoint.object.Link
 *  sailpoint.object.ObjectConfig
 *  sailpoint.object.Permission
 *  sailpoint.object.Resolver
 *  sailpoint.object.SailPointObject
 *  sailpoint.tools.GeneralException
 *  sailpoint.tools.Pair
 *  sailpoint.tools.TracingAspect
 *  sailpoint.tools.Util
 *  sailpoint.web.BaseBean
 *  sailpoint.web.BaseDTO
 *  sailpoint.web.modeler.EditablePermissions
 *  sailpoint.web.modeler.RoleAttributesUtil$IFilteredAttributesInfo
 *  sailpoint.web.system.ObjectAttributeDTO
 */
package sailpoint.web;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.faces.model.SelectItem;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import sailpoint.api.ObjectUtil;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Attributes;
import sailpoint.object.BaseAttributeDefinition;
import sailpoint.object.Identity;
import sailpoint.object.IdentityTypeDefinition;
import sailpoint.object.Link;
import sailpoint.object.ObjectAttribute;
import sailpoint.object.ObjectConfig;
import sailpoint.object.Permission;
import sailpoint.object.Resolver;
import sailpoint.object.SailPointObject;
import sailpoint.tools.GeneralException;
import sailpoint.tools.Pair;
import sailpoint.tools.TracingAspect;
import sailpoint.tools.Util;
import sailpoint.web.BaseBean;
import sailpoint.web.BaseDTO;
import sailpoint.web.modeler.EditablePermissions;
import sailpoint.web.modeler.RoleAttributesUtil;
import sailpoint.web.system.ObjectAttributeDTO;

public class AttributeEditBean
extends BaseDTO
implements Serializable {
    private static final long serialVersionUID = 4252988364760980102L;
    private static final Log log;
    String editedObjectId;
    Class editedObjectClass;
    protected BaseBean ownerBean;
    Map<String, BaseAttributeDefinition> objectAttributeMap;
    List<String> viewAttributes;
    Attributes<String, Object> attributes;
    Map<String, EditablePermissions> permissions;
    Map<String, String> dateValues;
    Map<String, Boolean> boolValues;
    Map<String, IdentityProxy> identities;
    List<SelectItem> availableRights;
    private List<? extends BaseAttributeDefinition> attributeDefinitions;
    private List<? extends BaseAttributeDefinition> missingAttributeDefinitions;
    private Map<String, ObjectAttributeDTO> missingAttributesInfo;
    private List<ObjectAttributeDTO> objectAttributeDTOs;
    private static transient /* synthetic */ TracingAspect ajc$sailpoint_tools_TracingAspect$ptwAspectInstance;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_15;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_16;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_17;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_18;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_19;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_20;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_21;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_22;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_23;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_24;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_25;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_26;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_27;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_28;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_29;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_30;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_31;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_32;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_33;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_34;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_35;

    public AttributeEditBean(String editedObjectId, Class editedObjectClass, List<? extends BaseAttributeDefinition> objectAttributes, List<String> viewAttributes, Attributes<String, Object> attributeValues) {
        String string = editedObjectId;
        Class clazz = editedObjectClass;
        List<? extends BaseAttributeDefinition> list = objectAttributes;
        List<String> list2 = viewAttributes;
        Attributes<String, Object> attributes = attributeValues;
        Object[] objectArray = new Object[]{string, clazz, list, list2, attributes};
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_0, (Object)this, (Object)this, (Object[])objectArray);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorEntry(joinPoint);
            this.init(editedObjectId, editedObjectClass, objectAttributes, viewAttributes, attributeValues);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorExit(joinPoint);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public AttributeEditBean(String editedObjectId, Class editedObjectClass, BaseBean ownerBean, List<? extends BaseAttributeDefinition> objectAttributes, List<String> viewAttributes, Attributes<String, Object> attributeValues) {
        String string = editedObjectId;
        Class clazz = editedObjectClass;
        BaseBean baseBean = ownerBean;
        List<? extends BaseAttributeDefinition> list = objectAttributes;
        List<String> list2 = viewAttributes;
        Attributes<String, Object> attributes = attributeValues;
        Object[] objectArray = new Object[]{string, clazz, baseBean, list, list2, attributes};
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_1, (Object)this, (Object)this, (Object[])objectArray);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorEntry(joinPoint);
            this.ownerBean = ownerBean;
            this.init(editedObjectId, editedObjectClass, objectAttributes, viewAttributes, attributeValues);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorExit(joinPoint);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    private void init(String editedObjectId, Class editedObjectClass, Collection<? extends BaseAttributeDefinition> objectAttributes, List<String> viewAttributes, Attributes<String, Object> attributeValues) {
        String string = editedObjectId;
        Class clazz = editedObjectClass;
        Collection<? extends BaseAttributeDefinition> collection = objectAttributes;
        List<String> list = viewAttributes;
        Attributes<String, Object> attributes = attributeValues;
        Object[] objectArray = new Object[]{string, clazz, collection, list, attributes};
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_2, (Object)this, (Object)this, (Object[])objectArray);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this.editedObjectId = editedObjectId;
            this.editedObjectClass = editedObjectClass;
            this.objectAttributeMap = new HashMap<String, BaseAttributeDefinition>();
            if (objectAttributes != null && !objectAttributes.isEmpty()) {
                for (BaseAttributeDefinition baseAttributeDefinition : objectAttributes) {
                    this.objectAttributeMap.put(baseAttributeDefinition.getName(), baseAttributeDefinition);
                }
            }
            if (viewAttributes != null && !viewAttributes.isEmpty()) {
                this.viewAttributes = new ArrayList<String>();
                this.viewAttributes.addAll(viewAttributes);
            } else {
                this.viewAttributes = null;
            }
            this.attributes = attributeValues;
            this.dateValues = new HashMap<String, String>();
            this.permissions = new HashMap<String, EditablePermissions>();
            this.identities = new HashMap<String, IdentityProxy>();
            this.boolValues = new HashMap<String, Boolean>();
            this.translateAttributes(attributeValues);
            Object var15_15 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var15_15);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void translateAttributes(Attributes<String, Object> attributeValues) {
        Attributes<String, Object> attributes = attributeValues;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_3, (Object)this, (Object)this, attributes);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            List<? extends BaseAttributeDefinition> attributeDefinitions = this.getAttributeDefinitions();
            if (attributeDefinitions != null && !attributeDefinitions.isEmpty()) {
                for (BaseAttributeDefinition baseAttributeDefinition : attributeDefinitions) {
                    SailPointObject editedObject;
                    if (baseAttributeDefinition == null) continue;
                    String attributeName = baseAttributeDefinition.getName();
                    if ("permission".equals(baseAttributeDefinition.getType())) {
                        Permission p = (Permission)attributeValues.get((Object)attributeName);
                        EditablePermissions permsDTO = new EditablePermissions(p);
                        this.permissions.put(attributeName, permsDTO);
                        continue;
                    }
                    if ("date".equals(baseAttributeDefinition.getType())) {
                        Date dateValue = attributeValues.getDate(attributeName);
                        if (dateValue == null) {
                            this.dateValues.put(attributeName, "");
                            continue;
                        }
                        this.dateValues.put(attributeName, String.valueOf(dateValue.getTime()));
                        continue;
                    }
                    if ("boolean".equals(baseAttributeDefinition.getType())) {
                        Boolean boolVal = attributeValues.getBooleanObject(attributeName);
                        if (boolVal == null) {
                            this.boolValues.put(attributeName, null);
                            continue;
                        }
                        this.boolValues.put(attributeName, boolVal);
                        continue;
                    }
                    if (!ObjectAttribute.TYPE_IDENTITY.equals(baseAttributeDefinition.getType()) || (editedObject = this.getEditedObject()) == null) continue;
                    if (baseAttributeDefinition instanceof ObjectAttribute && ((ObjectAttribute)baseAttributeDefinition).getExtendedNumber() > 0 && editedObject.supportsExtendedIdentity()) {
                        this.loadIdentityInfoFromExtendedIdentityAttributes((ObjectAttribute)baseAttributeDefinition);
                        continue;
                    }
                    this.loadIdentityInfoFromAttributes(attributeName, attributeValues.get((Object)attributeName));
                }
                this.availableRights = EditablePermissions.getAvailableRights((Resolver)this.getContext());
            }
            Object var10_10 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var10_10);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void reloadAttributes(Attributes<String, Object> attributes) {
        Attributes<String, Object> attributes2 = attributes;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_4, (Object)this, (Object)this, attributes2);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this.fetchAttributeDefinitions();
            this.init(this.editedObjectId, this.editedObjectClass, this.objectAttributeMap.values(), this.viewAttributes, attributes);
            Object var4_4 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    private void loadIdentityInfoFromAttributes(String attributeName, Object value) {
        String string = attributeName;
        Object object = value;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_5, (Object)this, (Object)this, (Object)string, (Object)object);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Identity identity = null;
            if (value == null) {
                identity = null;
            } else if (value instanceof String) {
                try {
                    identity = (Identity)SailPointFactory.getCurrentContext().getObjectByName(Identity.class, (String)value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex);
                }
            } else if (value instanceof Identity) {
                identity = (Identity)value;
            } else {
                throw new IllegalStateException("Invalid value for identity type");
            }
            this.identities.put(attributeName, new IdentityProxy(identity));
            Object var8_8 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var8_8);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    private void loadIdentityInfoFromExtendedIdentityAttributes(ObjectAttribute attributeDefinition) {
        ObjectAttribute objectAttribute = attributeDefinition;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_6, (Object)this, (Object)this, (Object)((Object)objectAttribute));
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            SailPointObject editedObject = this.getEditedObject();
            if (editedObject != null) {
                Identity relatedIdentity = editedObject.getExtendedIdentity(attributeDefinition.getExtendedNumber());
                this.identities.put(attributeDefinition.getName(), new IdentityProxy(relatedIdentity));
            }
            Object var6_6 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var6_6);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<? extends BaseAttributeDefinition> getAttributeDefinitions() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_7, (Object)this, (Object)this);
        try {
            List<? extends BaseAttributeDefinition> list;
            List<? extends BaseAttributeDefinition> list2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this.attributeDefinitions == null) {
                this.fetchAttributeDefinitions();
            }
            List<? extends BaseAttributeDefinition> list3 = list2 = (list = this.attributeDefinitions);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, list2);
            return list;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    private List<ObjectAttributeDTO> getObjectAttributeDTOs() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_8, (Object)this, (Object)this);
        try {
            List<ObjectAttributeDTO> list;
            List<ObjectAttributeDTO> list2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this.objectAttributeDTOs == null) {
                this.loadObjectAttributeDTOs();
            }
            List<ObjectAttributeDTO> list3 = list2 = (list = this.objectAttributeDTOs);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, list2);
            return list;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    private void loadObjectAttributeDTOs() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_9, (Object)this, (Object)this);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this.objectAttributeDTOs = new ArrayList<ObjectAttributeDTO>();
            List<? extends BaseAttributeDefinition> attrDefs = this.getAttributeDefinitions();
            if (attrDefs != null) {
                for (BaseAttributeDefinition baseAttributeDefinition : attrDefs) {
                    ObjectAttributeDTO dto = new ObjectAttributeDTO(this.editedObjectClass.getSimpleName(), (ObjectAttribute)baseAttributeDefinition);
                    this.objectAttributeDTOs.add(dto);
                    if (!"Identity".equals(this.editedObjectClass.getSimpleName()) || !"type".equals(baseAttributeDefinition.getName())) continue;
                    ObjectConfig config = Identity.getObjectConfig();
                    ArrayList<Pair> types = new ArrayList<Pair>();
                    for (IdentityTypeDefinition def : config.getIdentityTypesList()) {
                        types.add(new Pair((Object)def.getName(), (Object)this.getMessage(def.getDisplayName(), new Object[0])));
                    }
                    dto.setAllowedValues(types);
                }
            }
            Object var10_10 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var10_10);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Map<String, ObjectAttributeDTO> getMissingAttributesInfo() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_10, (Object)this, (Object)this);
        try {
            Map<String, ObjectAttributeDTO> map;
            Map<String, ObjectAttributeDTO> map2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this.missingAttributesInfo == null) {
                this.loadMissingAttributesInfo();
            }
            Map<String, ObjectAttributeDTO> map3 = map2 = (map = this.missingAttributesInfo);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, map2);
            return map;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    private void loadMissingAttributesInfo() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_11, (Object)this, (Object)this);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this.missingAttributesInfo = new HashMap<String, ObjectAttributeDTO>();
            for (BaseAttributeDefinition baseAttributeDefinition : this.missingAttributeDefinitions) {
                this.missingAttributesInfo.put(baseAttributeDefinition.getName(), new ObjectAttributeDTO(this.editedObjectClass.getSimpleName(), (ObjectAttribute)baseAttributeDefinition));
            }
            Object var4_4 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    private void fetchAttributeDefinitions() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_12, (Object)this, (Object)this);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Collection<BaseAttributeDefinition> allDefsCollection = this.objectAttributeMap.values();
            List<BaseAttributeDefinition> allDefs = Arrays.asList(allDefsCollection.toArray(new BaseAttributeDefinition[allDefsCollection.size()]));
            List<BaseAttributeDefinition> viewFilteredDefs = this.filterViewAttributeDefinitions(allDefs);
            RoleAttributesUtil.IFilteredAttributesInfo filteredInfo = this.getFilteredAttributesInfo(viewFilteredDefs);
            this.attributeDefinitions = filteredInfo.getFilteredAttributeDefinitions();
            this.missingAttributeDefinitions = filteredInfo.getMissingAttributeDefinitions();
            this.loadObjectAttributeDTOs();
            this.loadMissingAttributesInfo();
            Object var6_6 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var6_6);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    private List<BaseAttributeDefinition> filterViewAttributeDefinitions(List<BaseAttributeDefinition> allDefs) {
        List<BaseAttributeDefinition> list = allDefs;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_13, (Object)this, (Object)this, list);
        try {
            ArrayList<BaseAttributeDefinition> arrayList;
            ArrayList<BaseAttributeDefinition> arrayList2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            ArrayList<BaseAttributeDefinition> filteredDefs = new ArrayList<BaseAttributeDefinition>();
            if (this.viewAttributes == null || this.viewAttributes.isEmpty()) {
                if (allDefs != null && !allDefs.isEmpty()) {
                    filteredDefs.addAll(allDefs);
                }
            } else {
                for (String attributeName : this.viewAttributes) {
                    BaseAttributeDefinition attribute = this.objectAttributeMap.get(attributeName);
                    if (attribute == null) continue;
                    filteredDefs.add(attribute);
                }
            }
            ArrayList<BaseAttributeDefinition> arrayList3 = arrayList2 = (arrayList = filteredDefs);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, arrayList2);
            return arrayList;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    protected RoleAttributesUtil.IFilteredAttributesInfo getFilteredAttributesInfo(final List<? extends BaseAttributeDefinition> attributeDefinitions) {
        List<? extends BaseAttributeDefinition> list = attributeDefinitions;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_14, (Object)this, (Object)this, list);
        try {
            RoleAttributesUtil.IFilteredAttributesInfo iFilteredAttributesInfo;
            RoleAttributesUtil.IFilteredAttributesInfo iFilteredAttributesInfo2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            RoleAttributesUtil.IFilteredAttributesInfo iFilteredAttributesInfo3 = iFilteredAttributesInfo2 = (iFilteredAttributesInfo = new RoleAttributesUtil.IFilteredAttributesInfo(){
                private static transient /* synthetic */ TracingAspect ajc$sailpoint_tools_TracingAspect$ptwAspectInstance;
                private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
                private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
                private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
                private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
                {
                    AttributeEditBean attributeEditBean = AttributeEditBean.this;
                    List list2 = list;
                    JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_0, (Object)this, (Object)this, (Object)attributeEditBean, (Object)list2);
                    try {
                        1.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorEntry(joinPoint);
                        1.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorExit(joinPoint);
                        return;
                    }
                    catch (Throwable throwable) {
                        1.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorThrow(joinPoint, throwable);
                        throw throwable;
                    }
                }

                public List<? extends BaseAttributeDefinition> getMissingAttributeDefinitions() {
                    JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_1, (Object)this, (Object)this);
                    try {
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        1.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
                        ArrayList arrayList3 = arrayList2 = (arrayList = new ArrayList());
                        1.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, arrayList2);
                        return arrayList;
                    }
                    catch (Throwable throwable) {
                        1.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
                        throw throwable;
                    }
                }

                public List<? extends BaseAttributeDefinition> getFilteredAttributeDefinitions() {
                    JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_2, (Object)this, (Object)this);
                    try {
                        List list;
                        List list2;
                        1.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
                        List list3 = list2 = (list = attributeDefinitions);
                        1.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)list2);
                        return list;
                    }
                    catch (Throwable throwable) {
                        1.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
                        throw throwable;
                    }
                }

                static {
                    1.ajc$preClinit();
                    ajc$sailpoint_tools_TracingAspect$ptwAspectInstance = TracingAspect.ajc$createAspectInstance((String)"sailpoint.web.AttributeEditBean$1");
                    try {
                    }
                    catch (Throwable throwable) {
                        if (throwable instanceof ExceptionInInitializerError) {
                            throw (ExceptionInInitializerError)throwable;
                        }
                        1.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.initLogger(ajc$tjp_3);
                        throw throwable;
                    }
                    1.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.initLogger(ajc$tjp_3);
                }

                private static /* synthetic */ void ajc$preClinit() {
                    Factory factory = new Factory("AttributeEditBean.java", 1.class);
                    ajc$tjp_0 = factory.makeSJP("constructor-execution", (Signature)factory.makeConstructorSig("0", "sailpoint.web.AttributeEditBean$1", "sailpoint.web.AttributeEditBean:java.util.List", "this$0:arg1", ""), 301);
                    ajc$tjp_1 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getMissingAttributeDefinitions", "sailpoint.web.AttributeEditBean$1", "", "", "", "java.util.List"), 304);
                    ajc$tjp_2 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getFilteredAttributeDefinitions", "sailpoint.web.AttributeEditBean$1", "", "", "", "java.util.List"), 308);
                    ajc$tjp_3 = factory.makeSJP("staticinitialization", (Signature)factory.makeInitializerSig("8", "sailpoint.web.AttributeEditBean$1"), 0);
                }
            });
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)iFilteredAttributesInfo2);
            return iFilteredAttributesInfo;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<String> getCategories() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_15, (Object)this, (Object)this);
        try {
            ArrayList<String> arrayList;
            ArrayList<String> arrayList2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            ArrayList<String> categories = new ArrayList<String>();
            List<? extends BaseAttributeDefinition> allAttrs = this.getAttributeDefinitions();
            for (BaseAttributeDefinition baseAttributeDefinition : allAttrs) {
                String categoryName = baseAttributeDefinition.getCategoryName();
                if (categoryName == null || categoryName.trim().length() == 0) continue;
                categories.add(categoryName);
            }
            ArrayList<String> arrayList3 = arrayList2 = (arrayList = categories);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, arrayList2);
            return arrayList;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<ObjectAttributeDTO> getAttributeDefinitionsWithNoCategory() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_16, (Object)this, (Object)this);
        try {
            ArrayList<ObjectAttributeDTO> arrayList;
            ArrayList<ObjectAttributeDTO> arrayList2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            ArrayList<ObjectAttributeDTO> noCategoryAttributes = new ArrayList<ObjectAttributeDTO>();
            List<ObjectAttributeDTO> allAttrs = this.getObjectAttributeDTOs();
            for (ObjectAttributeDTO attr : allAttrs) {
                String categoryName = attr.getCategoryName();
                if (categoryName != null && categoryName.trim().length() != 0) continue;
                noCategoryAttributes.add(new ObjectAttributeDTO(attr));
            }
            ArrayList<ObjectAttributeDTO> arrayList3 = arrayList2 = (arrayList = noCategoryAttributes);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, arrayList2);
            return arrayList;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Map<String, List<ObjectAttributeDTO>> getAttributeDefinitionsByCategory() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_17, (Object)this, (Object)this);
        try {
            HashMap<String, List<ObjectAttributeDTO>> hashMap;
            HashMap<String, List<ObjectAttributeDTO>> hashMap2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            HashMap<String, List<ObjectAttributeDTO>> attributesMap = new HashMap<String, List<ObjectAttributeDTO>>();
            List<ObjectAttributeDTO> allAttrs = this.getObjectAttributeDTOs();
            for (ObjectAttributeDTO attr : allAttrs) {
                String categoryName = attr.getCategoryDisplayName(this.getLocale(), this.getUserTimeZone());
                if (categoryName == null || categoryName.trim().length() == 0) continue;
                if (!attributesMap.containsKey(categoryName)) {
                    attributesMap.put(categoryName, new ArrayList());
                }
                ((List)attributesMap.get(categoryName)).add(new ObjectAttributeDTO(attr));
            }
            HashMap<String, List<ObjectAttributeDTO>> hashMap3 = hashMap2 = (hashMap = attributesMap);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, hashMap2);
            return hashMap;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setAttributeDefinitions(List<? extends BaseAttributeDefinition> attributeDefinitions) {
        List<? extends BaseAttributeDefinition> list = attributeDefinitions;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_18, (Object)this, (Object)this, list);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Object var4_4 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Map<String, Object> getAttributes() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_19, (Object)this, (Object)this);
        try {
            Attributes<String, Object> attributes;
            Attributes<String, Object> attributes2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Attributes<String, Object> attributes3 = attributes2 = (attributes = this.attributes);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, attributes2);
            return attributes;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setAttributes(Map<String, Object> attributes) {
        Map<String, Object> map = attributes;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_20, (Object)this, (Object)this, map);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this.attributes.setMap(attributes);
            Object var4_4 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Map<String, String> getDateValues() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_21, (Object)this, (Object)this);
        try {
            Map<String, String> map;
            Map<String, String> map2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Map<String, String> map3 = map2 = (map = this.dateValues);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, map2);
            return map;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setDateValues(Map<String, String> dateValues) {
        Map<String, String> map = dateValues;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_22, (Object)this, (Object)this, map);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this.dateValues != dateValues) {
                this.dateValues.clear();
                this.dateValues.putAll(dateValues);
            }
            Object var4_4 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Map<String, Boolean> getBoolValues() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_23, (Object)this, (Object)this);
        try {
            Map<String, Boolean> map;
            Map<String, Boolean> map2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Map<String, Boolean> map3 = map2 = (map = this.boolValues);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, map2);
            return map;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setBoolValues(Map<String, Boolean> boolValues) {
        Map<String, Boolean> map = boolValues;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_24, (Object)this, (Object)this, map);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this.boolValues != boolValues) {
                this.boolValues.clear();
                this.boolValues.putAll(boolValues);
            }
            Object var4_4 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Map<String, IdentityProxy> getIdentities() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_25, (Object)this, (Object)this);
        try {
            Map<String, IdentityProxy> map;
            Map<String, IdentityProxy> map2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Map<String, IdentityProxy> map3 = map2 = (map = this.identities);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, map2);
            return map;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setIdentities(Map<String, IdentityProxy> identities) {
        Map<String, IdentityProxy> map = identities;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_26, (Object)this, (Object)this, map);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this.identities != identities) {
                this.identities.clear();
                this.identities.putAll(identities);
            }
            Object var4_4 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Map<String, EditablePermissions> getPermissions() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_27, (Object)this, (Object)this);
        try {
            Map<String, EditablePermissions> map;
            Map<String, EditablePermissions> map2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Map<String, EditablePermissions> map3 = map2 = (map = this.permissions);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, map2);
            return map;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setPermissions(Map<String, EditablePermissions> permissions) {
        Map<String, EditablePermissions> map = permissions;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_28, (Object)this, (Object)this, map);
        try {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this.permissions != permissions) {
                this.permissions.clear();
                this.permissions.putAll(permissions);
            }
            Object var4_4 = null;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<SelectItem> getAvailableRights() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_29, (Object)this, (Object)this);
        try {
            List<SelectItem> list;
            List<SelectItem> list2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            List<SelectItem> list3 = list2 = (list = this.availableRights);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, list2);
            return list;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean applySpecialValues() throws GeneralException {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_30, (Object)this, (Object)this);
        try {
            boolean bl;
            boolean bl2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean anyChanged = false;
            List<? extends BaseAttributeDefinition> attributeDefinitions = this.getAttributeDefinitions();
            for (BaseAttributeDefinition baseAttributeDefinition : attributeDefinitions) {
                String attributeName = baseAttributeDefinition.getName();
                if ("permission".equals(baseAttributeDefinition.getType())) {
                    Permission p = (Permission)this.attributes.get((Object)attributeName);
                    EditablePermissions ep = this.permissions.get(attributeName);
                    p.setRights(Util.listToCsv((List)ep.getSelectedRights()));
                    p.setTarget(ep.getTarget());
                    anyChanged = true;
                    continue;
                }
                if ("date".equals(baseAttributeDefinition.getType())) {
                    String dateString = this.dateValues.get(attributeName);
                    if (dateString != null && dateString.trim().length() > 0) {
                        Long dateInMillis = Long.parseLong(dateString);
                        this.attributes.put((Object)attributeName, (Object)new Date(dateInMillis));
                    } else {
                        this.attributes.put((Object)attributeName, null);
                    }
                    anyChanged = true;
                    continue;
                }
                if ("boolean".equals(baseAttributeDefinition.getType())) {
                    Boolean boolVal = this.boolValues.get(attributeName);
                    if (boolVal != null) {
                        this.attributes.put((Object)attributeName, (Object)boolVal);
                    } else {
                        this.attributes.put((Object)attributeName, null);
                    }
                    anyChanged = true;
                    continue;
                }
                if (!ObjectAttribute.TYPE_IDENTITY.equals(baseAttributeDefinition.getType())) continue;
                IdentityProxy identityProxy = this.identities.get(attributeName);
                if (identityProxy != null) {
                    String id = identityProxy.getId();
                    if (id != null && id.trim().length() > 0) {
                        Identity identity = (Identity)this.getContext().getObjectById(Identity.class, id);
                        if (attributeName.compareToIgnoreCase("manager") == 0) {
                            this.attributes.put((Object)attributeName, (Object)identity);
                        } else {
                            this.attributes.put((Object)attributeName, (Object)identity.getName());
                        }
                    } else {
                        this.attributes.put((Object)attributeName, null);
                    }
                } else {
                    this.attributes.put((Object)attributeName, null);
                }
                anyChanged = true;
            }
            boolean bl3 = bl2 = (bl = anyChanged);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Map<BaseAttributeDefinition, Object> getChanges(SailPointObject obj) throws GeneralException {
        SailPointObject sailPointObject = obj;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_31, (Object)this, (Object)this, (Object)sailPointObject);
        try {
            HashMap<BaseAttributeDefinition, Object> hashMap;
            HashMap<BaseAttributeDefinition, Object> hashMap2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            HashMap<BaseAttributeDefinition, Object> changes = null;
            this.applySpecialValues();
            Map<String, Object> editedAttributes = this.getAttributes();
            Set<String> attributeNames = editedAttributes.keySet();
            if (attributeNames != null) {
                for (String attributeName : attributeNames) {
                    BaseAttributeDefinition attributeDef = this.objectAttributeMap.get(attributeName);
                    boolean isEditable = true;
                    if (attributeDef instanceof ObjectAttribute) {
                        isEditable = ((ObjectAttribute)attributeDef).isEditable();
                    }
                    if (attributeDef == null || !isEditable) continue;
                    Object originalValue = null;
                    if (obj instanceof Link) {
                        Link link = (Link)obj;
                        originalValue = link.getAttribute(attributeName);
                    } else {
                        SailPointObject editedObject = this.getEditedObject();
                        if (ObjectAttribute.TYPE_IDENTITY.equals(attributeDef.getType()) && editedObject != null && editedObject.supportsExtendedIdentity() && ((ObjectAttribute)attributeDef).getExtendedNumber() > 0 && attributeDef.getName().compareTo("manager") != 0) {
                            Identity relatedIdentity = obj.getExtendedIdentity(((ObjectAttribute)attributeDef).getExtendedNumber());
                            if (relatedIdentity != null) {
                                originalValue = relatedIdentity.getId();
                            }
                        } else if (obj instanceof Identity) {
                            originalValue = ObjectUtil.getObjectAttributeValue((SailPointObject)obj, (ObjectAttribute)((ObjectAttribute)attributeDef));
                        }
                    }
                    Object newValue = editedAttributes.get(attributeName);
                    Object valueToCheck = editedAttributes.get(attributeName);
                    if (ObjectAttribute.TYPE_IDENTITY.equals(attributeDef.getType())) {
                        IdentityProxy proxy = this.identities.get(attributeName);
                        valueToCheck = null == proxy ? null : proxy.getId();
                    } else if ("boolean".equals(attributeDef.getType()) || originalValue instanceof Boolean) {
                        originalValue = Util.otob((Object)originalValue);
                        valueToCheck = Util.otob((Object)valueToCheck);
                    }
                    if (Util.nullSafeEq((Object)originalValue, (Object)valueToCheck, (boolean)true, (boolean)true)) continue;
                    if (changes == null) {
                        changes = new HashMap<BaseAttributeDefinition, Object>();
                    }
                    changes.put(attributeDef, newValue);
                }
            }
            HashMap<BaseAttributeDefinition, Object> hashMap3 = hashMap2 = (hashMap = changes);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, hashMap2);
            return hashMap;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean commit(SailPointObject obj) throws GeneralException {
        SailPointObject sailPointObject = obj;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_32, (Object)this, (Object)this, (Object)sailPointObject);
        try {
            boolean bl;
            boolean bl2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean anyChanged = this.applySpecialValues();
            Collection<BaseAttributeDefinition> defs = this.objectAttributeMap.values();
            if (defs != null) {
                Map<String, Object> editedAttributes = this.getAttributes();
                Map destAttributes = obj.getExtendedAttributes();
                if (destAttributes == null) {
                    throw new GeneralException("Missing destination attribute map");
                }
                for (BaseAttributeDefinition def : defs) {
                    if (!(def instanceof ObjectAttribute) || obj.isExtendedIdentityType((ObjectAttribute)def)) continue;
                    String name = def.getName();
                    destAttributes.put(name, editedAttributes.get(name));
                    anyChanged = true;
                }
            }
            boolean bl3 = bl2 = (bl = anyChanged);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    private SailPointObject getEditedObject() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_33, (Object)this, (Object)this);
        try {
            SailPointObject sailPointObject;
            SailPointObject sailPointObject2;
            SailPointObject editedObject;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            try {
                editedObject = this.editedObjectId == null ? (SailPointObject)this.editedObjectClass.getConstructor(new Class[0]).newInstance(new Object[0]) : this.getContext().getObjectById(this.editedObjectClass, this.editedObjectId);
            }
            catch (IllegalArgumentException e) {
                log.error((Object)("Could not instantiate a " + this.editedObjectClass.getName() + " object with id " + this.editedObjectId), (Throwable)e);
                editedObject = null;
            }
            catch (SecurityException e) {
                log.error((Object)("Could not instantiate a " + this.editedObjectClass.getName() + " object with id " + this.editedObjectId), (Throwable)e);
                editedObject = null;
            }
            catch (GeneralException e) {
                log.error((Object)("Could not instantiate a " + this.editedObjectClass.getName() + " object with id " + this.editedObjectId), (Throwable)e);
                editedObject = null;
            }
            catch (InstantiationException e) {
                log.error((Object)("Could not instantiate a " + this.editedObjectClass.getName() + " object with id " + this.editedObjectId), (Throwable)e);
                editedObject = null;
            }
            catch (IllegalAccessException e) {
                log.error((Object)("Could not instantiate a " + this.editedObjectClass.getName() + " object with id " + this.editedObjectId), (Throwable)e);
                editedObject = null;
            }
            catch (InvocationTargetException e) {
                log.error((Object)("Could not instantiate a " + this.editedObjectClass.getName() + " object with id " + this.editedObjectId), (Throwable)e);
                editedObject = null;
            }
            catch (NoSuchMethodException e) {
                log.error((Object)("Could not instantiate a " + this.editedObjectClass.getName() + " object with id " + this.editedObjectId), (Throwable)e);
                editedObject = null;
            }
            SailPointObject sailPointObject3 = sailPointObject2 = (sailPointObject = editedObject);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)sailPointObject2);
            return sailPointObject;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Map<String, BaseAttributeDefinition> getObjectAttributeMap() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_34, (Object)this, (Object)this);
        try {
            Map<String, BaseAttributeDefinition> map;
            Map<String, BaseAttributeDefinition> map2;
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Map<String, BaseAttributeDefinition> map3 = map2 = (map = this.objectAttributeMap);
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, map2);
            return map;
        }
        catch (Throwable throwable) {
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    static {
        AttributeEditBean.ajc$preClinit();
        ajc$sailpoint_tools_TracingAspect$ptwAspectInstance = TracingAspect.ajc$createAspectInstance((String)"sailpoint.web.AttributeEditBean");
        try {
            log = LogFactory.getLog(AttributeEditBean.class);
        }
        catch (Throwable throwable) {
            if (throwable instanceof ExceptionInInitializerError) {
                throw (ExceptionInInitializerError)throwable;
            }
            AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.initLogger(ajc$tjp_35);
            throw throwable;
        }
        AttributeEditBean.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.initLogger(ajc$tjp_35);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AttributeEditBean.java", AttributeEditBean.class);
        ajc$tjp_0 = factory.makeSJP("constructor-execution", (Signature)factory.makeConstructorSig("1", "sailpoint.web.AttributeEditBean", "java.lang.String:java.lang.Class:java.util.List:java.util.List:sailpoint.object.Attributes", "editedObjectId:editedObjectClass:objectAttributes:viewAttributes:attributeValues", ""), 70);
        ajc$tjp_1 = factory.makeSJP("constructor-execution", (Signature)factory.makeConstructorSig("1", "sailpoint.web.AttributeEditBean", "java.lang.String:java.lang.Class:sailpoint.web.BaseBean:java.util.List:java.util.List:sailpoint.object.Attributes", "editedObjectId:editedObjectClass:ownerBean:objectAttributes:viewAttributes:attributeValues", ""), 74);
        ajc$tjp_10 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getMissingAttributesInfo", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.Map"), 239);
        ajc$tjp_11 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("2", "loadMissingAttributesInfo", "sailpoint.web.AttributeEditBean", "", "", "", "void"), 248);
        ajc$tjp_12 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("2", "fetchAttributeDefinitions", "sailpoint.web.AttributeEditBean", "", "", "", "void"), 257);
        ajc$tjp_13 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("2", "filterViewAttributeDefinitions", "sailpoint.web.AttributeEditBean", "java.util.List", "allDefs", "", "java.util.List"), 271);
        ajc$tjp_14 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("4", "getFilteredAttributesInfo", "sailpoint.web.AttributeEditBean", "java.util.List", "attributeDefinitions", "", "sailpoint.web.modeler.RoleAttributesUtil$IFilteredAttributesInfo"), 301);
        ajc$tjp_15 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getCategories", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.List"), 316);
        ajc$tjp_16 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getAttributeDefinitionsWithNoCategory", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.List"), 335);
        ajc$tjp_17 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getAttributeDefinitionsByCategory", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.Map"), 353);
        ajc$tjp_18 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setAttributeDefinitions", "sailpoint.web.AttributeEditBean", "java.util.List", "attributeDefinitions", "", "void"), 378);
        ajc$tjp_19 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getAttributes", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.Map"), 381);
        ajc$tjp_2 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("2", "init", "sailpoint.web.AttributeEditBean", "java.lang.String:java.lang.Class:java.util.Collection:java.util.List:sailpoint.object.Attributes", "editedObjectId:editedObjectClass:objectAttributes:viewAttributes:attributeValues", "", "void"), 80);
        ajc$tjp_20 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setAttributes", "sailpoint.web.AttributeEditBean", "java.util.Map", "attributes", "", "void"), 385);
        ajc$tjp_21 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDateValues", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.Map"), 389);
        ajc$tjp_22 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDateValues", "sailpoint.web.AttributeEditBean", "java.util.Map", "dateValues", "", "void"), 393);
        ajc$tjp_23 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getBoolValues", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.Map"), 400);
        ajc$tjp_24 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setBoolValues", "sailpoint.web.AttributeEditBean", "java.util.Map", "boolValues", "", "void"), 404);
        ajc$tjp_25 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getIdentities", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.Map"), 411);
        ajc$tjp_26 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setIdentities", "sailpoint.web.AttributeEditBean", "java.util.Map", "identities", "", "void"), 415);
        ajc$tjp_27 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getPermissions", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.Map"), 422);
        ajc$tjp_28 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setPermissions", "sailpoint.web.AttributeEditBean", "java.util.Map", "permissions", "", "void"), 426);
        ajc$tjp_29 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getAvailableRights", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.List"), 433);
        ajc$tjp_3 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "translateAttributes", "sailpoint.web.AttributeEditBean", "sailpoint.object.Attributes", "attributeValues", "", "void"), 114);
        ajc$tjp_30 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "applySpecialValues", "sailpoint.web.AttributeEditBean", "", "", "sailpoint.tools.GeneralException", "boolean"), 444);
        ajc$tjp_31 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getChanges", "sailpoint.web.AttributeEditBean", "sailpoint.object.SailPointObject", "obj", "sailpoint.tools.GeneralException", "java.util.Map"), 509);
        ajc$tjp_32 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "commit", "sailpoint.web.AttributeEditBean", "sailpoint.object.SailPointObject", "obj", "sailpoint.tools.GeneralException", "boolean"), 592);
        ajc$tjp_33 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("2", "getEditedObject", "sailpoint.web.AttributeEditBean", "", "", "", "sailpoint.object.SailPointObject"), 663);
        ajc$tjp_34 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getObjectAttributeMap", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.Map"), 695);
        ajc$tjp_35 = factory.makeSJP("staticinitialization", (Signature)factory.makeInitializerSig("8", "sailpoint.web.AttributeEditBean"), 42);
        ajc$tjp_4 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "reloadAttributes", "sailpoint.web.AttributeEditBean", "sailpoint.object.Attributes", "attributes", "", "void"), 162);
        ajc$tjp_5 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("2", "loadIdentityInfoFromAttributes", "sailpoint.web.AttributeEditBean", "java.lang.String:java.lang.Object", "attributeName:value", "", "void"), 167);
        ajc$tjp_6 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("2", "loadIdentityInfoFromExtendedIdentityAttributes", "sailpoint.web.AttributeEditBean", "sailpoint.object.ObjectAttribute", "attributeDefinition", "", "void"), 186);
        ajc$tjp_7 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getAttributeDefinitions", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.List"), 195);
        ajc$tjp_8 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("2", "getObjectAttributeDTOs", "sailpoint.web.AttributeEditBean", "", "", "", "java.util.List"), 203);
        ajc$tjp_9 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("2", "loadObjectAttributeDTOs", "sailpoint.web.AttributeEditBean", "", "", "", "void"), 212);
    }

    public class IdentityProxy
    implements Serializable {
        private String id;
        private String displayableName;
        private static transient /* synthetic */ TracingAspect ajc$sailpoint_tools_TracingAspect$ptwAspectInstance;
        private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
        private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
        private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
        private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
        private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
        private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
        private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
        private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;

        public IdentityProxy(Identity identity) {
            AttributeEditBean attributeEditBean = AttributeEditBean.this;
            Identity identity2 = identity;
            JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_0, (Object)this, (Object)this, (Object)attributeEditBean, (Object)identity2);
            try {
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorEntry(joinPoint);
                if (identity == null) {
                    this.id = null;
                } else {
                    this.id = identity.getId();
                    this.displayableName = identity.getDisplayableName();
                }
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorExit(joinPoint);
                return;
            }
            catch (Throwable throwable) {
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorThrow(joinPoint, throwable);
                throw throwable;
            }
        }

        public String getId() {
            JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_1, (Object)this, (Object)this);
            try {
                String string;
                String string2;
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
                String string3 = string2 = (string = this.id);
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
                return string;
            }
            catch (Throwable throwable) {
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
                throw throwable;
            }
        }

        public void setId(String id) {
            String string = id;
            JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_2, (Object)this, (Object)this, (Object)string);
            try {
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
                this.id = id;
                Object var4_4 = null;
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
                return;
            }
            catch (Throwable throwable) {
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
                throw throwable;
            }
        }

        public String getDisplayableName() {
            JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_3, (Object)this, (Object)this);
            try {
                String string;
                String string2;
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
                String string3 = string2 = (string = this.displayableName);
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
                return string;
            }
            catch (Throwable throwable) {
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
                throw throwable;
            }
        }

        public void setDisplayableName(String val) {
            String string = val;
            JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_4, (Object)this, (Object)this, (Object)string);
            try {
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
                Object var4_4 = null;
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
                return;
            }
            catch (Throwable throwable) {
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
                throw throwable;
            }
        }

        public void setIdentity(Identity identity) {
            Identity identity2 = identity;
            JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_5, (Object)this, (Object)this, (Object)identity2);
            try {
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
                this.id = identity.getId();
                Object var4_4 = null;
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
                return;
            }
            catch (Throwable throwable) {
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
                throw throwable;
            }
        }

        public Identity getIdentity() throws GeneralException {
            JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_6, (Object)this, (Object)this);
            try {
                Identity identity;
                Identity identity2;
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
                Identity identity3 = identity2 = this.id == null ? (identity = null) : (identity = (Identity)AttributeEditBean.this.getContext().getObjectById(Identity.class, this.id));
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)identity2);
                return identity;
            }
            catch (Throwable throwable) {
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
                throw throwable;
            }
        }

        static {
            IdentityProxy.ajc$preClinit();
            ajc$sailpoint_tools_TracingAspect$ptwAspectInstance = TracingAspect.ajc$createAspectInstance((String)"sailpoint.web.AttributeEditBean$IdentityProxy");
            try {
            }
            catch (Throwable throwable) {
                if (throwable instanceof ExceptionInInitializerError) {
                    throw (ExceptionInInitializerError)throwable;
                }
                IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.initLogger(ajc$tjp_7);
                throw throwable;
            }
            IdentityProxy.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.initLogger(ajc$tjp_7);
        }

        private static /* synthetic */ void ajc$preClinit() {
            Factory factory = new Factory("AttributeEditBean.java", IdentityProxy.class);
            ajc$tjp_0 = factory.makeSJP("constructor-execution", (Signature)factory.makeConstructorSig("1", "sailpoint.web.AttributeEditBean$IdentityProxy", "sailpoint.web.AttributeEditBean:sailpoint.object.Identity", "this$0:identity", ""), 623);
            ajc$tjp_1 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getId", "sailpoint.web.AttributeEditBean$IdentityProxy", "", "", "", "java.lang.String"), 633);
            ajc$tjp_2 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setId", "sailpoint.web.AttributeEditBean$IdentityProxy", "java.lang.String", "id", "", "void"), 637);
            ajc$tjp_3 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDisplayableName", "sailpoint.web.AttributeEditBean$IdentityProxy", "", "", "", "java.lang.String"), 641);
            ajc$tjp_4 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDisplayableName", "sailpoint.web.AttributeEditBean$IdentityProxy", "java.lang.String", "val", "", "void"), 646);
            ajc$tjp_5 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setIdentity", "sailpoint.web.AttributeEditBean$IdentityProxy", "sailpoint.object.Identity", "identity", "", "void"), 649);
            ajc$tjp_6 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getIdentity", "sailpoint.web.AttributeEditBean$IdentityProxy", "", "", "sailpoint.tools.GeneralException", "sailpoint.object.Identity"), 653);
            ajc$tjp_7 = factory.makeSJP("staticinitialization", (Signature)factory.makeInitializerSig("8", "sailpoint.web.AttributeEditBean$IdentityProxy"), 0);
        }
    }
}
