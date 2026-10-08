/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.aspectj.lang.JoinPoint
 *  org.aspectj.lang.JoinPoint$StaticPart
 *  org.aspectj.lang.Signature
 *  org.aspectj.runtime.internal.Conversions
 *  org.aspectj.runtime.reflect.Factory
 *  sailpoint.object.BaseAttributeDefinition$BaseAttributeDefinitionByDisplayNameComparator
 *  sailpoint.object.Filter$LogicalOperation
 *  sailpoint.object.PropertyInfo
 *  sailpoint.tools.Internationalizer
 *  sailpoint.tools.TracingAspect
 *  sailpoint.tools.xml.AbstractXmlObject
 *  sailpoint.tools.xml.SerializationMode
 *  sailpoint.tools.xml.XMLClass
 *  sailpoint.tools.xml.XMLProperty
 */
package sailpoint.object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import sailpoint.object.BaseAttributeDefinition;
import sailpoint.object.Filter;
import sailpoint.object.PropertyInfo;
import sailpoint.tools.Internationalizer;
import sailpoint.tools.TracingAspect;
import sailpoint.tools.xml.AbstractXmlObject;
import sailpoint.tools.xml.SerializationMode;
import sailpoint.tools.xml.XMLClass;
import sailpoint.tools.xml.XMLProperty;

@XMLClass
public abstract class BaseAttributeDefinition
extends AbstractXmlObject {
    public static final String TYPE_STRING = "string";
    public static final String TYPE_SECRET = "secret";
    public static final String TYPE_LONG = "long";
    public static final String TYPE_INT = "int";
    public static final String TYPE_BOOLEAN = "boolean";
    public static final String TYPE_DATE = "date";
    public static final String TYPE_PERMISSION = "permission";
    public static final String TYPE_RULE;
    public static final String TYPE_IDENTITY;
    public static final String TYPE_SCOPE;
    public static final String TYPE_COMPLEX = "complex";
    private static List<Filter.LogicalOperation> _mvOps;
    private static List<Filter.LogicalOperation> _nonLikeOps;
    private static List<Filter.LogicalOperation> _booleanOps;
    private static List<Filter.LogicalOperation> _permissionOps;
    private static List<Filter.LogicalOperation> _stdOps;
    String _name;
    String _displayName;
    String _type;
    boolean _multi;
    String _description;
    protected String _categoryName;
    private Object _defaultValue;
    protected List<Object> _allowedValues;
    protected boolean _required;
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

    public BaseAttributeDefinition() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_0, (Object)((Object)this), (Object)((Object)this));
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorEntry(joinPoint);
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorExit(joinPoint);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public String getName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_1, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._name);
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setName(String name) {
        String string = name;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_2, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._name = name;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public String getDisplayName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_3, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._displayName);
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setDisplayName(String name) {
        String string = name;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_4, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._displayName = name;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @Deprecated
    public String getDisplayableName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_5, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this.getDisplayableName(null));
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getDisplayableName(Locale locale) {
        Locale locale2 = locale;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_6, (Object)((Object)this), (Object)((Object)this), (Object)locale2);
        try {
            String localized;
            String string;
            String string2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = this._displayName == null ? (string = this._name) : ((localized = Internationalizer.getMessage((String)this._displayName, (Locale)locale)) == null ? (string = this._displayName) : (string = localized));
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public String getType() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_7, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._type);
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setType(String type) {
        String string = type;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_8, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._type = type;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public boolean isMulti() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_9, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._multi);
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setMulti(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_10, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._multi = b;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isMultiValued() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_11, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._multi);
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setMultiValued(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_12, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._multi = b;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @Deprecated
    @XMLProperty(xmlname="multiValued")
    public boolean isXmlMultiValued() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_13, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl2 = false;
            boolean bl3 = bl = false;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl));
            return bl2;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @Deprecated
    public void setXmlMultiValued(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_14, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._multi = b;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty(mode=SerializationMode.ELEMENT)
    public String getDescription() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_15, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._description);
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setDescription(String description) {
        String string = description;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_16, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._description = description;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public String getCategoryName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_17, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this._categoryName);
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setCategoryName(String categoryName) {
        String string = categoryName;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_18, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._categoryName = categoryName;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public boolean isRequired() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_19, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._required);
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setRequired(boolean required) {
        boolean bl = required;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_20, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._required = required;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Object getDefaultValue() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_21, (Object)((Object)this), (Object)((Object)this));
        try {
            Object object;
            Object object2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Object object3 = object2 = (object = this._defaultValue);
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, object2);
            return object;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setDefaultValue(Object defaultValue) {
        Object object = defaultValue;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_22, (Object)((Object)this), (Object)((Object)this), (Object)object);
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._defaultValue = defaultValue;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @Deprecated
    @XMLProperty(mode=SerializationMode.ATTRIBUTE, xmlname="defaultValue")
    public String getDefaultValueXmlAttribute() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_23, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string2 = this._defaultValue instanceof String ? (String)this._defaultValue : null;
            String string3 = string = string2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string);
            return string2;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @Deprecated
    public void setDefaultValueXmlAttribute(String value) {
        String string = value;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_24, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._defaultValue = value;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @Deprecated
    @XMLProperty(xmlname="DefaultValue")
    public Object getDefaultValueXmlElement() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_25, (Object)((Object)this), (Object)((Object)this));
        try {
            Object object;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Object object2 = this._defaultValue instanceof String ? null : this._defaultValue;
            Object object3 = object = object2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, object);
            return object2;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @Deprecated
    public void setDefaultValueXmlElement(Object value) {
        Object object = value;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_26, (Object)((Object)this), (Object)((Object)this), (Object)object);
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._defaultValue = value;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getDefaultValueAsString() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_27, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string2 = this._defaultValue != null ? this._defaultValue.toString() : null;
            String string3 = string = string2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string);
            return string2;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setDefaultValueAsString(String s) {
        String string = s;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_28, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._defaultValue = s == null ? s : s;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty(mode=SerializationMode.LIST)
    public List<Object> getAllowedValues() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_29, (Object)((Object)this), (Object)((Object)this));
        try {
            List<Object> list;
            List<Object> list2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            List<Object> list3 = list2 = (list = this._allowedValues);
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, list2);
            return list;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setAllowedValues(List<Object> val) {
        List<Object> list = val;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_30, (Object)((Object)this), (Object)((Object)this), list);
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._allowedValues = val;
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isType(String type) {
        String string = type;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_31, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            boolean bl;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl2 = type.equals(this._type) || this._type == null && type.equals(TYPE_STRING);
            boolean bl3 = bl = bl2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl));
            return bl2;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isComplex() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_32, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = TYPE_COMPLEX.equals(this._type));
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void assimilate(BaseAttributeDefinition src) {
        BaseAttributeDefinition baseAttributeDefinition = src;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_33, (Object)((Object)this), (Object)((Object)this), (Object)((Object)baseAttributeDefinition));
        try {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._name = src.getName();
            this._displayName = src.getDisplayName();
            this._type = src.getType();
            this._multi = src.isMulti();
            this._description = src.getDescription();
            this._defaultValue = src.getDefaultValue();
            Object var4_4 = null;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<Filter.LogicalOperation> getAllowedOperations() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_34, (Object)((Object)this), (Object)((Object)this));
        try {
            List<Filter.LogicalOperation> list;
            List<Filter.LogicalOperation> list2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            List<Filter.LogicalOperation> list3 = list2 = this._multi ? (list = _mvOps) : (TYPE_LONG.equals(this._type) || TYPE_INT.equals(this._type) || TYPE_DATE.equals(this._type) ? (list = _nonLikeOps) : (TYPE_BOOLEAN.equals(this._type) ? (list = _booleanOps) : (TYPE_PERMISSION.equals(this._type) ? (list = _permissionOps) : (list = _stdOps))));
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, list2);
            return list;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public static Comparator<BaseAttributeDefinition> getByDisplayableNameComparator() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_35, null, null);
        try {
            Comparator<BaseAttributeDefinition> comparator;
            Comparator<BaseAttributeDefinition> comparator2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Comparator<BaseAttributeDefinition> comparator3 = comparator2 = (comparator = BaseAttributeDefinition.getByDisplayableNameComparator(Locale.getDefault()));
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, comparator2);
            return comparator;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public static Comparator<BaseAttributeDefinition> getByDisplayableNameComparator(Locale locale) {
        Locale locale2 = locale;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_36, null, null, (Object)locale2);
        try {
            BaseAttributeDefinitionByDisplayNameComparator baseAttributeDefinitionByDisplayNameComparator;
            BaseAttributeDefinitionByDisplayNameComparator baseAttributeDefinitionByDisplayNameComparator2;
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            BaseAttributeDefinitionByDisplayNameComparator baseAttributeDefinitionByDisplayNameComparator3 = baseAttributeDefinitionByDisplayNameComparator2 = (baseAttributeDefinitionByDisplayNameComparator = new BaseAttributeDefinitionByDisplayNameComparator(locale, null));
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)baseAttributeDefinitionByDisplayNameComparator2);
            return baseAttributeDefinitionByDisplayNameComparator;
        }
        catch (Throwable throwable) {
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    static {
        BaseAttributeDefinition.ajc$preClinit();
        ajc$sailpoint_tools_TracingAspect$ptwAspectInstance = TracingAspect.ajc$createAspectInstance((String)"sailpoint.object.BaseAttributeDefinition");
        try {
            TYPE_RULE = PropertyInfo.TYPE_RULE;
            TYPE_IDENTITY = PropertyInfo.TYPE_IDENTITY;
            TYPE_SCOPE = PropertyInfo.TYPE_SCOPE;
            _mvOps = new ArrayList<Filter.LogicalOperation>();
            _mvOps.add(Filter.LogicalOperation.CONTAINS_ALL);
            _mvOps.add(Filter.LogicalOperation.ISNULL);
            _mvOps.add(Filter.LogicalOperation.NOTNULL);
            _nonLikeOps = new ArrayList<Filter.LogicalOperation>();
            _nonLikeOps.add(Filter.LogicalOperation.EQ);
            _nonLikeOps.add(Filter.LogicalOperation.GE);
            _nonLikeOps.add(Filter.LogicalOperation.GT);
            _nonLikeOps.add(Filter.LogicalOperation.IN);
            _nonLikeOps.add(Filter.LogicalOperation.ISNULL);
            _nonLikeOps.add(Filter.LogicalOperation.LE);
            _nonLikeOps.add(Filter.LogicalOperation.LT);
            _nonLikeOps.add(Filter.LogicalOperation.NE);
            _nonLikeOps.add(Filter.LogicalOperation.NOTNULL);
            _booleanOps = new ArrayList<Filter.LogicalOperation>();
            _booleanOps.add(Filter.LogicalOperation.EQ);
            _booleanOps.add(Filter.LogicalOperation.NE);
            _booleanOps.add(Filter.LogicalOperation.ISNULL);
            _booleanOps.add(Filter.LogicalOperation.NOTNULL);
            _permissionOps = new ArrayList<Filter.LogicalOperation>();
            _permissionOps.add(Filter.LogicalOperation.EQ);
            _permissionOps.add(Filter.LogicalOperation.IN);
            _permissionOps.add(Filter.LogicalOperation.ISNULL);
            _permissionOps.add(Filter.LogicalOperation.NE);
            _permissionOps.add(Filter.LogicalOperation.NOTNULL);
            _stdOps = new ArrayList<Filter.LogicalOperation>();
            _stdOps.add(Filter.LogicalOperation.EQ);
            _stdOps.add(Filter.LogicalOperation.IN);
            _stdOps.add(Filter.LogicalOperation.ISNULL);
            _stdOps.add(Filter.LogicalOperation.LIKE);
            _stdOps.add(Filter.LogicalOperation.NE);
            _stdOps.add(Filter.LogicalOperation.NOTNULL);
        }
        catch (Throwable throwable) {
            if (throwable instanceof ExceptionInInitializerError) {
                throw (ExceptionInInitializerError)throwable;
            }
            BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.initLogger(ajc$tjp_37);
            throw throwable;
        }
        BaseAttributeDefinition.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.initLogger(ajc$tjp_37);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("BaseAttributeDefinition.java", BaseAttributeDefinition.class);
        ajc$tjp_0 = factory.makeSJP("constructor-execution", (Signature)factory.makeConstructorSig("1", "sailpoint.object.BaseAttributeDefinition", "", "", ""), 234);
        ajc$tjp_1 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getName", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.lang.String"), 243);
        ajc$tjp_10 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setMulti", "sailpoint.object.BaseAttributeDefinition", TYPE_BOOLEAN, "b", "", "void"), 317);
        ajc$tjp_11 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isMultiValued", "sailpoint.object.BaseAttributeDefinition", "", "", "", TYPE_BOOLEAN), 325);
        ajc$tjp_12 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setMultiValued", "sailpoint.object.BaseAttributeDefinition", TYPE_BOOLEAN, "b", "", "void"), 329);
        ajc$tjp_13 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isXmlMultiValued", "sailpoint.object.BaseAttributeDefinition", "", "", "", TYPE_BOOLEAN), 342);
        ajc$tjp_14 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setXmlMultiValued", "sailpoint.object.BaseAttributeDefinition", TYPE_BOOLEAN, "b", "", "void"), 354);
        ajc$tjp_15 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDescription", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.lang.String"), 362);
        ajc$tjp_16 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDescription", "sailpoint.object.BaseAttributeDefinition", "java.lang.String", "description", "", "void"), 366);
        ajc$tjp_17 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getCategoryName", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.lang.String"), 371);
        ajc$tjp_18 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setCategoryName", "sailpoint.object.BaseAttributeDefinition", "java.lang.String", "categoryName", "", "void"), 375);
        ajc$tjp_19 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isRequired", "sailpoint.object.BaseAttributeDefinition", "", "", "", TYPE_BOOLEAN), 380);
        ajc$tjp_2 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setName", "sailpoint.object.BaseAttributeDefinition", "java.lang.String", "name", "", "void"), 247);
        ajc$tjp_20 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setRequired", "sailpoint.object.BaseAttributeDefinition", TYPE_BOOLEAN, "required", "", "void"), 384);
        ajc$tjp_21 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDefaultValue", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.lang.Object"), 401);
        ajc$tjp_22 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDefaultValue", "sailpoint.object.BaseAttributeDefinition", "java.lang.Object", "defaultValue", "", "void"), 405);
        ajc$tjp_23 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDefaultValueXmlAttribute", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.lang.String"), 415);
        ajc$tjp_24 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDefaultValueXmlAttribute", "sailpoint.object.BaseAttributeDefinition", "java.lang.String", "value", "", "void"), 424);
        ajc$tjp_25 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDefaultValueXmlElement", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.lang.Object"), 434);
        ajc$tjp_26 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDefaultValueXmlElement", "sailpoint.object.BaseAttributeDefinition", "java.lang.Object", "value", "", "void"), 443);
        ajc$tjp_27 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDefaultValueAsString", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.lang.String"), 454);
        ajc$tjp_28 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDefaultValueAsString", "sailpoint.object.BaseAttributeDefinition", "java.lang.String", "s", "", "void"), 461);
        ajc$tjp_29 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getAllowedValues", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.util.List"), 477);
        ajc$tjp_3 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDisplayName", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.lang.String"), 256);
        ajc$tjp_30 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setAllowedValues", "sailpoint.object.BaseAttributeDefinition", "java.util.List", "val", "", "void"), 481);
        ajc$tjp_31 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isType", "sailpoint.object.BaseAttributeDefinition", "java.lang.String", "type", "", TYPE_BOOLEAN), 494);
        ajc$tjp_32 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isComplex", "sailpoint.object.BaseAttributeDefinition", "", "", "", TYPE_BOOLEAN), 502);
        ajc$tjp_33 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "assimilate", "sailpoint.object.BaseAttributeDefinition", "sailpoint.object.BaseAttributeDefinition", "src", "", "void"), 511);
        ajc$tjp_34 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getAllowedOperations", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.util.List"), 528);
        ajc$tjp_35 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("9", "getByDisplayableNameComparator", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.util.Comparator"), 565);
        ajc$tjp_36 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("9", "getByDisplayableNameComparator", "sailpoint.object.BaseAttributeDefinition", "java.util.Locale", "locale", "", "java.util.Comparator"), 569);
        ajc$tjp_37 = factory.makeSJP("staticinitialization", (Signature)factory.makeInitializerSig("8", "sailpoint.object.BaseAttributeDefinition"), 78);
        ajc$tjp_4 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setDisplayName", "sailpoint.object.BaseAttributeDefinition", "java.lang.String", "name", "", "void"), 260);
        ajc$tjp_5 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDisplayableName", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.lang.String"), 273);
        ajc$tjp_6 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getDisplayableName", "sailpoint.object.BaseAttributeDefinition", "java.util.Locale", "locale", "", "java.lang.String"), 281);
        ajc$tjp_7 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getType", "sailpoint.object.BaseAttributeDefinition", "", "", "", "java.lang.String"), 300);
        ajc$tjp_8 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setType", "sailpoint.object.BaseAttributeDefinition", "java.lang.String", "type", "", "void"), 303);
        ajc$tjp_9 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isMulti", "sailpoint.object.BaseAttributeDefinition", "", "", "", TYPE_BOOLEAN), 313);
    }
}
