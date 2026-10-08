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
 *  sailpoint.object.AttributeSource
 *  sailpoint.object.ObjectAttribute$EditMode
 *  sailpoint.object.Rule
 *  sailpoint.object.Workflow
 *  sailpoint.persistence.ExtendedAttributeUtil
 *  sailpoint.persistence.ExtendedAttributeUtil$PropertyMapping
 *  sailpoint.tools.GeneralException
 *  sailpoint.tools.Internationalizer
 *  sailpoint.tools.Message
 *  sailpoint.tools.Message$Type
 *  sailpoint.tools.Pair
 *  sailpoint.tools.TracingAspect
 *  sailpoint.tools.Util
 *  sailpoint.web.BaseDTO
 *  sailpoint.web.system.AttributeSourceDTO
 *  sailpoint.web.util.WebUtil
 */
package sailpoint.web.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.faces.model.SelectItem;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import sailpoint.object.AttributeSource;
import sailpoint.object.ObjectAttribute;
import sailpoint.object.Rule;
import sailpoint.object.Workflow;
import sailpoint.persistence.ExtendedAttributeUtil;
import sailpoint.tools.GeneralException;
import sailpoint.tools.Internationalizer;
import sailpoint.tools.Message;
import sailpoint.tools.Pair;
import sailpoint.tools.TracingAspect;
import sailpoint.tools.Util;
import sailpoint.web.BaseDTO;
import sailpoint.web.system.AttributeSourceDTO;
import sailpoint.web.util.WebUtil;

public class ObjectAttributeDTO
extends BaseDTO {
    String _originalName;
    String _name;
    String _displayName;
    String _description;
    String _type;
    boolean _multi;
    boolean _required;
    Object _defaultValue;
    String _categoryName;
    List<Object> _allowedValues;
    boolean _system;
    boolean _standard;
    boolean _silent;
    boolean _external;
    boolean _groupFactory;
    boolean _searchable;
    int _extendedNumber;
    boolean _namedColumn;
    String _editMode;
    String _rule;
    String _listenerRule;
    String _listenerWorkflow;
    List<AttributeSourceDTO> _sources;
    private static Log _log;
    String _className;
    List<SelectItem> _editModes;
    List<SelectItem> _types;
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
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_36;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_37;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_38;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_39;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_40;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_41;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_42;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_43;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_44;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_45;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_46;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_47;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_48;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_49;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_50;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_51;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_52;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_53;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_54;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_55;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_56;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_57;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_58;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_59;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_60;

    public ObjectAttributeDTO(String className) {
        String string = className;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_0, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorEntry(joinPoint);
            this._className = className;
            this._name = "new attribute";
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorExit(joinPoint);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public ObjectAttributeDTO(String className, ObjectAttribute src) {
        String string = className;
        ObjectAttribute objectAttribute = src;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_1, (Object)((Object)this), (Object)((Object)this), (Object)string, (Object)((Object)objectAttribute));
        try {
            Workflow wf;
            Rule rule;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorEntry(joinPoint);
            this._className = className;
            this._originalName = src.getName();
            this._name = src.getName();
            this._displayName = src.getDisplayName();
            this._description = src.getDescription();
            this._type = src.getType();
            this._multi = src.isMulti();
            this._required = src.isRequired();
            this._defaultValue = src.getDefaultValue();
            this._categoryName = src.getCategoryName();
            this._allowedValues = src.getAllowedValues();
            this._system = src.isSystem();
            this._standard = src.isStandard();
            this._silent = src.isSilent();
            this._external = src.isExternal();
            this._groupFactory = src.isGroupFactory();
            this._extendedNumber = src.getExtendedNumber();
            ExtendedAttributeUtil.PropertyMapping pm = ExtendedAttributeUtil.getPropertyMapping((String)className, (String)src.getName());
            this._namedColumn = pm != null && pm.namedColumn;
            this._searchable = this._extendedNumber > 0 || this._namedColumn;
            ObjectAttribute.EditMode emode = src.getEditMode();
            if (emode != null) {
                this._editMode = emode.toString();
            }
            if ((rule = src.getRule()) != null) {
                this._rule = rule.getId();
            }
            if ((rule = src.getListenerRule()) != null) {
                this._listenerRule = rule.getId();
            }
            if ((wf = src.getListenerWorkflow()) != null) {
                this._listenerWorkflow = wf.getId();
            }
            this._sources = new ArrayList<AttributeSourceDTO>();
            List<AttributeSource> sources = src.getSources();
            if (sources != null) {
                for (AttributeSource attsrc : sources) {
                    this._sources.add(new AttributeSourceDTO(attsrc));
                }
            }
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorExit(joinPoint);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public ObjectAttributeDTO(ObjectAttributeDTO src) {
        ObjectAttributeDTO objectAttributeDTO = src;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_2, (Object)((Object)this), (Object)((Object)this), (Object)((Object)objectAttributeDTO));
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorEntry(joinPoint);
            this.setUid(src.getUid());
            this._className = src.getClassName();
            this._originalName = src.getOriginalName();
            this._name = src.getName();
            this._displayName = src.getDisplayName();
            this._description = src.getDescription();
            this._type = src.getType();
            this._multi = src.isMulti();
            this._required = src.isRequired();
            this._defaultValue = src.getDefaultValue();
            this._categoryName = src.getCategoryName();
            this._allowedValues = src.getAllowedValues();
            this._system = src.isSystem();
            this._standard = src.isStandard();
            this._silent = src.isSilent();
            this._external = src.isExternal();
            this._groupFactory = src.isGroupFactory();
            this._extendedNumber = src.getExtendedNumber();
            this._namedColumn = src.isNamedColumn();
            this._searchable = src.isSearchable();
            this._editMode = src.getEditMode();
            this._rule = src.getRule();
            this._listenerRule = src.getListenerRule();
            this._listenerWorkflow = src.getListenerWorkflow();
            this._sources = new ArrayList<AttributeSourceDTO>();
            List<AttributeSourceDTO> sources = src.getSources();
            if (sources != null) {
                for (AttributeSourceDTO attsrc : sources) {
                    this._sources.add(new AttributeSourceDTO(attsrc));
                }
            }
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorExit(joinPoint);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getClassName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_3, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._className);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getOriginalName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_4, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._originalName);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_5, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._name);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setName(String s) {
        String string = s;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_6, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (!this._system && !this._standard) {
                this._name = this.trim(s);
            }
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getDisplayName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_7, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._displayName);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setDisplayName(String s) {
        String string = s;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_8, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._displayName = this.trim(s);
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @Deprecated
    public String getDisplayableName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_9, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string2 = this._displayName != null ? this.getDisplayableName(this.getLocale()) : this._name;
            String string3 = string = string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string);
            return string2;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getDisplayableName(Locale locale) {
        Locale locale2 = locale;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_10, (Object)((Object)this), (Object)((Object)this), (Object)locale2);
        try {
            String localized;
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = this._displayName == null ? (string = this._name) : ((localized = Internationalizer.getMessage((String)this._displayName, (Locale)locale)) == null ? (string = this._displayName) : (string = localized));
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getDescription() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_11, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._description);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setDescription(String s) {
        String string = s;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_12, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._description = this.trim(s);
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getType() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_13, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this._type == null) {
                this._type = "string";
            }
            String string3 = string2 = (string = this._type);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setType(String s) {
        String string = s;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_14, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (!this._system && !this._standard) {
                this._type = s;
            }
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isMulti() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_15, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._multi);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setMulti(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_16, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (!this._system && !this._standard) {
                this._multi = b;
            }
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isRequired() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_17, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._required);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setRequired(boolean required) {
        boolean bl = required;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_18, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._required = required;
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Object getDefaultValue() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_19, (Object)((Object)this), (Object)((Object)this));
        try {
            Object object;
            Object object2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Object object3 = object2 = (object = this._defaultValue);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, object2);
            return object;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setDefaultValue(Object o) {
        Object object = o;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_20, (Object)((Object)this), (Object)((Object)this), (Object)object);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (!this._system && !this._standard) {
                this._defaultValue = o;
            }
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getCategoryName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_21, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._categoryName);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setCategoryName(String categoryName) {
        String string = categoryName;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_22, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._categoryName = categoryName;
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getCategoryDisplayName(Locale locale, TimeZone timeZone) {
        Locale locale2 = locale;
        TimeZone timeZone2 = timeZone;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_23, (Object)((Object)this), (Object)((Object)this), (Object)locale2, (Object)timeZone2);
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = new Message(this.getCategoryName(), new Object[0]).getLocalizedMessage(locale, timeZone));
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<Object> getAllowedValues() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_24, (Object)((Object)this), (Object)((Object)this));
        try {
            List<Object> list;
            List<Object> list2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            List<Object> list3 = list2 = (list = this._allowedValues);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, list2);
            return list;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setAllowedValues(List<Object> vals) {
        List<Object> list = vals;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_25, (Object)((Object)this), (Object)((Object)this), list);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._allowedValues = vals;
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isSystem() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_26, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._system);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isStandard() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_27, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._standard);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isSilent() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_28, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._silent);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isExternal() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_29, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._external);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setExternal(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_30, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._external = b;
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isGroupFactory() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_31, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._groupFactory);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setGroupFactory(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_32, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._groupFactory = b;
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isSearchable() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_33, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._searchable);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setSearchable(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_34, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._searchable = b;
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isNamedColumn() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_35, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._namedColumn);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setNamedColumn(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_36, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._namedColumn = b;
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public int getExtendedNumber() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_37, (Object)((Object)this), (Object)((Object)this));
        try {
            int n;
            int n2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            int n3 = n2 = (n = this._extendedNumber);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.intObject((int)n2));
            return n;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setExtendedNumber(int i) {
        int n = i;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_38, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.intObject((int)n));
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._extendedNumber = i;
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isExtended() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_39, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl2 = this._extendedNumber > 0;
            boolean bl3 = bl = bl2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl));
            return bl2;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getEditMode() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_40, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this._editMode == null) {
                this._editMode = ObjectAttribute.EditMode.ReadOnly.toString();
            }
            String string3 = string2 = (string = this._editMode);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setEditMode(String s) {
        String string = s;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_41, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._editMode = s;
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isEditable() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_42, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl2 = this._editMode != null && !this._editMode.equals(ObjectAttribute.EditMode.ReadOnly.toString());
            boolean bl3 = bl = bl2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl));
            return bl2;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setEditable(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_43, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._editMode = !b ? ObjectAttribute.EditMode.ReadOnly.toString() : ObjectAttribute.EditMode.Permanent.toString();
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getRule() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_44, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._rule);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setRule(String s) {
        String string = s;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_45, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._rule = this.trim(s);
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getListenerRule() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_46, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._listenerRule);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setListenerRule(String s) {
        String string = s;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_47, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._listenerRule = this.trim(s);
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getListenerWorkflow() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_48, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._listenerWorkflow);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setListenerWorkflow(String s) {
        String string = s;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_49, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._listenerWorkflow = this.trim(s);
            Object var4_4 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<AttributeSourceDTO> getSources() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_50, (Object)((Object)this), (Object)((Object)this));
        try {
            List<AttributeSourceDTO> list;
            List<AttributeSourceDTO> list2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            List<AttributeSourceDTO> list3 = list2 = (list = this._sources);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, list2);
            return list;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<SelectItem> getAllowedValuesSelectItems() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_51, (Object)((Object)this), (Object)((Object)this));
        try {
            ArrayList<SelectItem> arrayList;
            ArrayList<SelectItem> arrayList2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            ArrayList<SelectItem> result = new ArrayList<SelectItem>();
            if (!this._required) {
                result.add(new SelectItem((Object)"", WebUtil.localizeMessage((String)"select_value")));
            }
            for (Object value : Util.safeIterable(this._allowedValues)) {
                if (value instanceof Pair) {
                    Pair item = (Pair)value;
                    result.add(new SelectItem(item.getFirst(), (String)item.getSecond()));
                    continue;
                }
                result.add(new SelectItem(value, value.toString()));
            }
            ArrayList<SelectItem> arrayList3 = arrayList2 = (arrayList = result);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, arrayList2);
            return arrayList;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<SelectItem> getEditModes() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_52, (Object)((Object)this), (Object)((Object)this));
        try {
            List<SelectItem> list;
            List<SelectItem> list2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this._editModes == null) {
                this._editModes = new ArrayList<SelectItem>();
                ObjectAttribute.EditMode mode = ObjectAttribute.EditMode.ReadOnly;
                String key = this.getMessage("objconfig_edit_mode_readonly", new Object[0]);
                this._editModes.add(new SelectItem((Object)mode, key));
                mode = ObjectAttribute.EditMode.Permanent;
                key = this.getMessage("objconfig_edit_mode_permanent", new Object[0]);
                this._editModes.add(new SelectItem((Object)mode, key));
                mode = ObjectAttribute.EditMode.UntilFeedValueChanges;
                key = this.getMessage("objconfig_edit_mode_temporary", new Object[0]);
                this._editModes.add(new SelectItem((Object)mode, key));
            }
            List<SelectItem> list3 = list2 = (list = this._editModes);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, list2);
            return list;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<SelectItem> getTypes() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_53, (Object)((Object)this), (Object)((Object)this));
        try {
            List<SelectItem> list;
            List<SelectItem> list2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this._types == null) {
                this._types = new ArrayList<SelectItem>();
                String type = "string";
                String key = this.getMessage("oconfig_type_string", new Object[0]);
                this._types.add(new SelectItem((Object)type, key));
                type = "int";
                key = this.getMessage("oconfig_type_int", new Object[0]);
                this._types.add(new SelectItem((Object)type, key));
                type = "boolean";
                key = this.getMessage("oconfig_type_boolean", new Object[0]);
                this._types.add(new SelectItem((Object)type, key));
                type = "date";
                key = this.getMessage("oconfig_type_date", new Object[0]);
                this._types.add(new SelectItem((Object)type, key));
                this._types.add(new SelectItem((Object)ObjectAttribute.TYPE_RULE, this.getMessage("oconfig_type_rule", new Object[0])));
                this._types.add(new SelectItem((Object)ObjectAttribute.TYPE_IDENTITY, this.getMessage("oconfig_type_identity", new Object[0])));
            }
            List<SelectItem> list3 = list2 = (list = this._types);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, list2);
            return list;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getSourceSummary() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_54, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string2 = "???";
            String string3 = string = "???";
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string);
            return string2;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public ObjectAttribute convert() throws GeneralException {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_55, (Object)((Object)this), (Object)((Object)this));
        try {
            ObjectAttribute objectAttribute;
            ObjectAttribute objectAttribute2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            ObjectAttribute att = new ObjectAttribute();
            att.setName(this._name);
            att.setDisplayName(this.collapse(this._displayName));
            att.setDescription(this._description);
            att.setMulti(this._multi);
            att.setRequired(this._required);
            att.setDefaultValue(this.simplify(this._defaultValue));
            att.setCategoryName(this.collapse(this._categoryName));
            att.setAllowedValues(this._allowedValues);
            if (this._type != null && !this._type.equals("string")) {
                att.setType(this._type);
            }
            att.setSystem(this._system);
            att.setStandard(this._standard);
            att.setSilent(this._silent);
            att.setGroupFactory(this._groupFactory);
            att.setExternal(this._external);
            ExtendedAttributeUtil.PropertyMapping pm = ExtendedAttributeUtil.getPropertyMapping((String)this._className, (String)this._name);
            boolean bl = this._namedColumn = pm != null && pm.namedColumn;
            if (this._namedColumn) {
                att.setNamedColumn(true);
                att.setExtendedNumber(0);
            } else {
                att.setExtendedNumber(this._extendedNumber);
            }
            if (this._editMode != null) {
                ObjectAttribute.EditMode emode = Enum.valueOf(ObjectAttribute.EditMode.class, this._editMode);
                if (emode == ObjectAttribute.EditMode.ReadOnly) {
                    emode = null;
                }
                att.setEditMode(emode);
            }
            att.setRule((Rule)this.resolve(Rule.class, this._rule));
            att.setListenerRule((Rule)this.resolve(Rule.class, this._listenerRule));
            att.setListenerWorkflow((Workflow)this.resolve(Workflow.class, this._listenerWorkflow));
            if (this._sources != null && this._sources.size() > 0) {
                ArrayList<AttributeSource> sources = new ArrayList<AttributeSource>();
                for (AttributeSourceDTO src : this._sources) {
                    sources.add(src.convert());
                }
                att.setSources(sources);
            }
            ObjectAttribute objectAttribute3 = objectAttribute2 = (objectAttribute = att);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)objectAttribute2);
            return objectAttribute;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Object simplify(Object src) {
        Object object = src;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_56, (Object)((Object)this), (Object)((Object)this), (Object)object);
        try {
            Object object2;
            Object object3;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Object actual = src;
            if (src instanceof String) {
                actual = this.collapse((String)src);
            }
            Object object4 = object3 = (object2 = actual);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, object3);
            return object2;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String collapse(String src) {
        String string = src;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_57, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            String string2;
            String string3;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (src != null && src.length() == 0) {
                src = null;
            }
            String string4 = string3 = (string2 = src);
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string3);
            return string2;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getDefaultValueString() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_58, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            Date dateVal;
            String string2;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = this._type.equals("string") ? (string2 = (String)this._defaultValue) : (this._type.equals("boolean") ? (this._defaultValue == null ? (string2 = "false") : (string2 = this._defaultValue.toString().toLowerCase())) : (this._type.equals("date") ? ((dateVal = (Date)this._defaultValue) == null ? (string2 = null) : (string2 = String.valueOf(dateVal.getTime()))) : (this._type.equals("int") ? (this._defaultValue == null ? (string2 = "") : (string2 = String.valueOf((Integer)this._defaultValue))) : (this._type.equals(ObjectAttribute.TYPE_IDENTITY) ? (this._defaultValue == null ? (string2 = "") : (string2 = this._defaultValue.toString())) : (this._defaultValue == null ? (string2 = null) : (string2 = this._defaultValue.toString()))))));
            String string4 = string = string3;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string);
            return string2;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setDefaultValueString(String strVal) {
        String string = strVal;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_59, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (!this._system && !this._standard) {
                if (this._type.equals("string")) {
                    this._defaultValue = strVal;
                } else if (this._type.equals("boolean")) {
                    this._defaultValue = Boolean.parseBoolean(strVal);
                } else if (this._type.equals("date")) {
                    if (strVal.trim().length() == 0) {
                        this._defaultValue = null;
                    } else {
                        try {
                            this._defaultValue = new Date(Long.parseLong(strVal));
                        }
                        catch (Exception ex) {
                            _log.error((Object)"Error setting date", (Throwable)ex);
                            this._defaultValue = null;
                        }
                    }
                } else if (this._type.equals("int")) {
                    if (strVal.trim().length() == 0) {
                        this._defaultValue = null;
                    } else {
                        try {
                            this._defaultValue = Integer.parseInt(strVal);
                        }
                        catch (Exception ex) {
                            _log.error((Object)("Could not set integer value: " + strVal + ", message: " + ex.getMessage()));
                            this.addMessage(new Message(Message.Type.Error, "err_not_valid_def_integer", new Object[]{strVal}), null);
                        }
                    }
                } else {
                    this._defaultValue = strVal;
                }
            }
            Object var5_6 = null;
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var5_6);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    static {
        ObjectAttributeDTO.ajc$preClinit();
        ajc$sailpoint_tools_TracingAspect$ptwAspectInstance = TracingAspect.ajc$createAspectInstance((String)"sailpoint.web.system.ObjectAttributeDTO");
        try {
            _log = LogFactory.getLog(ObjectAttributeDTO.class);
        }
        catch (Throwable throwable) {
            if (throwable instanceof ExceptionInInitializerError) {
                throw (ExceptionInInitializerError)throwable;
            }
            ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.initLogger(ajc$tjp_60);
            throw throwable;
        }
        ObjectAttributeDTO.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.initLogger(ajc$tjp_60);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ObjectAttributeDTO.java", ObjectAttributeDTO.class);
        ajc$tjp_0 = factory.makeSJP("constructor-execution", (Signature)factory.makeConstructorSig("1", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "className", ""), 105);
        ajc$tjp_1 = factory.makeSJP("constructor-execution", (Signature)factory.makeConstructorSig("1", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String:sailpoint.object.ObjectAttribute", "className:src", ""), 115);
        ajc$tjp_10 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDisplayableName", "sailpoint.web.system.ObjectAttributeDTO", "java.util.Locale", "locale", "", "java.lang.String"), 264);
        ajc$tjp_11 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDescription", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 277);
        ajc$tjp_12 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDescription", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "s", "", "void"), 281);
        ajc$tjp_13 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getType", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 287);
        ajc$tjp_14 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setType", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "s", "", "void"), 293);
        ajc$tjp_15 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isMulti", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "boolean"), 298);
        ajc$tjp_16 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setMulti", "sailpoint.web.system.ObjectAttributeDTO", "boolean", "b", "", "void"), 302);
        ajc$tjp_17 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isRequired", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "boolean"), 307);
        ajc$tjp_18 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setRequired", "sailpoint.web.system.ObjectAttributeDTO", "boolean", "required", "", "void"), 311);
        ajc$tjp_19 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDefaultValue", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.Object"), 315);
        ajc$tjp_2 = factory.makeSJP("constructor-execution", (Signature)factory.makeConstructorSig("1", "sailpoint.web.system.ObjectAttributeDTO", "sailpoint.web.system.ObjectAttributeDTO", "src", ""), 172);
        ajc$tjp_20 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDefaultValue", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.Object", "o", "", "void"), 319);
        ajc$tjp_21 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getCategoryName", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 324);
        ajc$tjp_22 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setCategoryName", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "categoryName", "", "void"), 328);
        ajc$tjp_23 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getCategoryDisplayName", "sailpoint.web.system.ObjectAttributeDTO", "java.util.Locale:java.util.TimeZone", "locale:timeZone", "", "java.lang.String"), 332);
        ajc$tjp_24 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getAllowedValues", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.util.List"), 336);
        ajc$tjp_25 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setAllowedValues", "sailpoint.web.system.ObjectAttributeDTO", "java.util.List", "vals", "", "void"), 340);
        ajc$tjp_26 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isSystem", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "boolean"), 348);
        ajc$tjp_27 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isStandard", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "boolean"), 352);
        ajc$tjp_28 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isSilent", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "boolean"), 356);
        ajc$tjp_29 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isExternal", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "boolean"), 360);
        ajc$tjp_3 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getClassName", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 215);
        ajc$tjp_30 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setExternal", "sailpoint.web.system.ObjectAttributeDTO", "boolean", "b", "", "void"), 364);
        ajc$tjp_31 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isGroupFactory", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "boolean"), 368);
        ajc$tjp_32 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setGroupFactory", "sailpoint.web.system.ObjectAttributeDTO", "boolean", "b", "", "void"), 372);
        ajc$tjp_33 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isSearchable", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "boolean"), 376);
        ajc$tjp_34 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setSearchable", "sailpoint.web.system.ObjectAttributeDTO", "boolean", "b", "", "void"), 380);
        ajc$tjp_35 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isNamedColumn", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "boolean"), 384);
        ajc$tjp_36 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setNamedColumn", "sailpoint.web.system.ObjectAttributeDTO", "boolean", "b", "", "void"), 388);
        ajc$tjp_37 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getExtendedNumber", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "int"), 392);
        ajc$tjp_38 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setExtendedNumber", "sailpoint.web.system.ObjectAttributeDTO", "int", "i", "", "void"), 400);
        ajc$tjp_39 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isExtended", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "boolean"), 407);
        ajc$tjp_4 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getOriginalName", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 224);
        ajc$tjp_40 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getEditMode", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 413);
        ajc$tjp_41 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setEditMode", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "s", "", "void"), 419);
        ajc$tjp_42 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isEditable", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "boolean"), 427);
        ajc$tjp_43 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setEditable", "sailpoint.web.system.ObjectAttributeDTO", "boolean", "b", "", "void"), 432);
        ajc$tjp_44 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getRule", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 439);
        ajc$tjp_45 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setRule", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "s", "", "void"), 443);
        ajc$tjp_46 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getListenerRule", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 447);
        ajc$tjp_47 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setListenerRule", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "s", "", "void"), 451);
        ajc$tjp_48 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getListenerWorkflow", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 455);
        ajc$tjp_49 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setListenerWorkflow", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "s", "", "void"), 459);
        ajc$tjp_5 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getName", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 230);
        ajc$tjp_50 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getSources", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.util.List"), 463);
        ajc$tjp_51 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getAllowedValuesSelectItems", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.util.List"), 470);
        ajc$tjp_52 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getEditModes", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.util.List"), 493);
        ajc$tjp_53 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getTypes", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.util.List"), 523);
        ajc$tjp_54 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getSourceSummary", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 572);
        ajc$tjp_55 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "convert", "sailpoint.web.system.ObjectAttributeDTO", "", "", "sailpoint.tools.GeneralException", "sailpoint.object.ObjectAttribute"), 588);
        ajc$tjp_56 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "simplify", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.Object", "src", "", "java.lang.Object"), 650);
        ajc$tjp_57 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "collapse", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "src", "", "java.lang.String"), 657);
        ajc$tjp_58 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDefaultValueString", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 665);
        ajc$tjp_59 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDefaultValueString", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "strVal", "", "void"), 721);
        ajc$tjp_6 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setName", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "s", "", "void"), 234);
        ajc$tjp_60 = factory.makeSJP("staticinitialization", (Signature)factory.makeInitializerSig("8", "sailpoint.web.system.ObjectAttributeDTO"), 81);
        ajc$tjp_7 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDisplayName", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 239);
        ajc$tjp_8 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDisplayName", "sailpoint.web.system.ObjectAttributeDTO", "java.lang.String", "s", "", "void"), 243);
        ajc$tjp_9 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDisplayableName", "sailpoint.web.system.ObjectAttributeDTO", "", "", "", "java.lang.String"), 254);
    }
}
