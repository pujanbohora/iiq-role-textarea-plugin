/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.aspectj.lang.JoinPoint
 *  org.aspectj.lang.JoinPoint$StaticPart
 *  org.aspectj.lang.Signature
 *  org.aspectj.runtime.internal.Conversions
 *  org.aspectj.runtime.reflect.Factory
 *  sailpoint.object.Application
 *  sailpoint.object.AttributeMetaData
 *  sailpoint.object.AttributeSource
 *  sailpoint.object.AttributeTarget
 *  sailpoint.object.ObjectAttribute$EditMode
 *  sailpoint.object.Rule
 *  sailpoint.object.SearchInputDefinition$PropertyType
 *  sailpoint.object.Workflow
 *  sailpoint.tools.TracingAspect
 *  sailpoint.tools.Util
 *  sailpoint.tools.xml.SerializationMode
 *  sailpoint.tools.xml.XMLClass
 *  sailpoint.tools.xml.XMLProperty
 */
package sailpoint.object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import sailpoint.object.Application;
import sailpoint.object.AttributeMetaData;
import sailpoint.object.AttributeSource;
import sailpoint.object.AttributeTarget;
import sailpoint.object.BaseAttributeDefinition;
import sailpoint.object.ObjectAttribute;
import sailpoint.object.Rule;
import sailpoint.object.SearchInputDefinition;
import sailpoint.object.Workflow;
import sailpoint.tools.TracingAspect;
import sailpoint.tools.Util;
import sailpoint.tools.xml.SerializationMode;
import sailpoint.tools.xml.XMLClass;
import sailpoint.tools.xml.XMLProperty;

/*
 * Exception performing whole class analysis ignored.
 */
@XMLClass
public class ObjectAttribute
extends BaseAttributeDefinition {
    boolean _system;
    boolean _standard;
    boolean _silent;
    int _extendedNumber;
    boolean _namedColumn;
    boolean _external;
    Rule _rule;
    List<AttributeSource> _sources;
    List<AttributeTarget> _targets;
    boolean _groupFactory;
    EditMode _editMode;
    Rule _listenerRule;
    Workflow _listenerWorkflow;
    private static Map<String, SearchInputDefinition.PropertyType> typeToPropertyTypeMap;
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

    public ObjectAttribute() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_0, (Object)((Object)this), (Object)((Object)this));
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorEntry(joinPoint);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorExit(joinPoint);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceConstructorThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void add(AttributeSource src) {
        AttributeSource attributeSource = src;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_1, (Object)((Object)this), (Object)((Object)this), (Object)attributeSource);
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this._sources == null) {
                this._sources = new ArrayList<AttributeSource>();
            }
            this._sources.add(src);
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean remove(AttributeSource src) {
        AttributeSource attributeSource = src;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_2, (Object)((Object)this), (Object)((Object)this), (Object)attributeSource);
        try {
            boolean bl;
            boolean bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean removed = false;
            if (this._sources != null) {
                removed = this._sources.remove(src);
            }
            boolean bl3 = bl2 = (bl = removed);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void add(AttributeTarget target) {
        AttributeTarget attributeTarget = target;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_3, (Object)((Object)this), (Object)((Object)this), (Object)attributeTarget);
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this._targets == null) {
                this._targets = new ArrayList<AttributeTarget>();
            }
            this._targets.add(target);
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean remove(AttributeTarget target) {
        AttributeTarget attributeTarget = target;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_4, (Object)((Object)this), (Object)((Object)this), (Object)attributeTarget);
        try {
            boolean bl;
            boolean bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean removed = false;
            if (this._targets != null) {
                removed = this._targets.remove(target);
            }
            boolean bl3 = bl2 = (bl = removed);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void load() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_5, (Object)((Object)this), (Object)((Object)this));
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            if (this._rule != null) {
                this._rule.load();
            }
            if (this._listenerRule != null) {
                this._listenerRule.load();
            }
            if (this._listenerWorkflow != null) {
                this._listenerWorkflow.load();
            }
            if (this._sources != null) {
                for (AttributeSource src : this._sources) {
                    src.load();
                }
            }
            if (this._targets != null) {
                for (AttributeTarget target : this._targets) {
                    target.load();
                }
            }
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public void setSystem(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_6, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._system = b;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isSystem() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_7, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._system);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public void setStandard(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_8, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._standard = b;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isStandard() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_9, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._standard);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public void setSilent(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_10, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._silent = b;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isSilent() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_11, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._silent);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public void setExtendedNumber(int i) {
        int n = i;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_12, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.intObject((int)n));
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._extendedNumber = i;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public int getExtendedNumber() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_13, (Object)((Object)this), (Object)((Object)this));
        try {
            int n;
            int n2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            int n3 = n2 = (n = this._extendedNumber);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.intObject((int)n2));
            return n;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public void setNamedColumn(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_14, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._namedColumn = b;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isNamedColumn() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_15, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._namedColumn);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public void setExternal(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_16, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._external = b;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isExternal() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_17, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._external);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty(mode=SerializationMode.REFERENCE, xmlname="RuleRef")
    public void setRule(Rule r) {
        Rule rule = r;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_18, (Object)((Object)this), (Object)((Object)this), (Object)rule);
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._rule = r;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Rule getRule() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_19, (Object)((Object)this), (Object)((Object)this));
        try {
            Rule rule;
            Rule rule2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Rule rule3 = rule2 = (rule = this._rule);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)rule2);
            return rule;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty(mode=SerializationMode.INLINE_LIST_UNQUALIFIED)
    public void setSources(List<AttributeSource> sources) {
        List<AttributeSource> list = sources;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_20, (Object)((Object)this), (Object)((Object)this), list);
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._sources = sources;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<AttributeSource> getSources() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_21, (Object)((Object)this), (Object)((Object)this));
        try {
            List<AttributeSource> list;
            List<AttributeSource> list2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            List<AttributeSource> list3 = list2 = (list = this._sources);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, list2);
            return list;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty(xmlname="AttributeTargets", mode=SerializationMode.LIST)
    public void setTargets(List<AttributeTarget> targets) {
        List<AttributeTarget> list = targets;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_22, (Object)((Object)this), (Object)((Object)this), list);
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._targets = targets;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public List<AttributeTarget> getTargets() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_23, (Object)((Object)this), (Object)((Object)this));
        try {
            List<AttributeTarget> list;
            List<AttributeTarget> list2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            List<AttributeTarget> list3 = list2 = (list = this._targets);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, list2);
            return list;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public void setGroupFactory(boolean b) {
        boolean bl = b;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_24, (Object)((Object)this), (Object)((Object)this), (Object)Conversions.booleanObject((boolean)bl));
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._groupFactory = b;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isGroupFactory() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_25, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = this._groupFactory);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty
    public EditMode getEditMode() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_26, (Object)((Object)this), (Object)((Object)this));
        try {
            EditMode editMode;
            EditMode editMode2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            EditMode editMode3 = editMode2 = (editMode = this._editMode);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)editMode2);
            return editMode;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setEditMode(EditMode type) {
        EditMode editMode = type;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_27, (Object)((Object)this), (Object)((Object)this), (Object)editMode);
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._editMode = type;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty(mode=SerializationMode.REFERENCE, xmlname="ListenerRule")
    public void setListenerRule(Rule r) {
        Rule rule = r;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_28, (Object)((Object)this), (Object)((Object)this), (Object)rule);
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._listenerRule = r;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Rule getListenerRule() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_29, (Object)((Object)this), (Object)((Object)this));
        try {
            Rule rule;
            Rule rule2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Rule rule3 = rule2 = (rule = this._listenerRule);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)rule2);
            return rule;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @XMLProperty(mode=SerializationMode.REFERENCE, xmlname="ListenerWorkflow")
    public void setListenerWorkflow(Workflow w) {
        Workflow workflow = w;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_30, (Object)((Object)this), (Object)((Object)this), (Object)workflow);
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._listenerWorkflow = w;
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public Workflow getListenerWorkflow() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_31, (Object)((Object)this), (Object)((Object)this));
        try {
            Workflow workflow;
            Workflow workflow2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            Workflow workflow3 = workflow2 = (workflow = this._listenerWorkflow);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)workflow2);
            return workflow;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isExtended() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_32, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl2 = this._extendedNumber > 0;
            boolean bl3 = bl = bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl));
            return bl2;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @Deprecated
    public String getExtendedName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_33, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String name = null;
            if (this._extendedNumber > 0) {
                name = "extended" + Util.itoa((int)this.getExtendedNumber());
            }
            String string3 = string2 = (string = name);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @Deprecated
    public String getExtendedIdentityName() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_34, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String name = null;
            if (this._extendedNumber > 0) {
                name = "extendedIdentity" + Util.itoa((int)this.getExtendedNumber());
            }
            String string3 = string2 = (string = name);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isIdentity() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_35, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = (bl = TYPE_IDENTITY.equals(this._type));
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isSearchable() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_36, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl2 = this.isStandard() || this.isExtended() || this.isNamedColumn() || this.isExternal();
            boolean bl3 = bl = bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl));
            return bl2;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isCustom() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_37, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl2 = this.isExtended() || this.isNamedColumn() || this.isExternal() || this.isMulti();
            boolean bl3 = bl = bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl));
            return bl2;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public AttributeSource getSource(AttributeSource other) {
        AttributeSource attributeSource = other;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_38, (Object)((Object)this), (Object)((Object)this), (Object)attributeSource);
        try {
            AttributeSource attributeSource2;
            AttributeSource attributeSource3;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            AttributeSource match = null;
            if (this._sources != null) {
                for (AttributeSource src : this._sources) {
                    if (!src.isMatch(other)) continue;
                    match = src;
                    break;
                }
            }
            AttributeSource attributeSource4 = attributeSource3 = (attributeSource2 = match);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, attributeSource3);
            return attributeSource2;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public AttributeTarget getTarget(AttributeTarget other) {
        AttributeTarget attributeTarget = other;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_39, (Object)((Object)this), (Object)((Object)this), (Object)attributeTarget);
        try {
            AttributeTarget attributeTarget2;
            AttributeTarget attributeTarget3;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            AttributeTarget match = null;
            if (this._targets != null) {
                for (AttributeTarget target : this._targets) {
                    if (!target.isMatch((AttributeSource)other)) continue;
                    match = target;
                    break;
                }
            }
            AttributeTarget attributeTarget4 = attributeTarget3 = (attributeTarget2 = match);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, attributeTarget3);
            return attributeTarget2;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isEditable() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_40, (Object)((Object)this), (Object)((Object)this));
        try {
            boolean bl;
            boolean bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            boolean bl3 = bl2 = this._editMode != null && !EditMode.ReadOnly.equals((Object)this._editMode) && !this._system ? (bl = true) : (bl = false);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl2));
            return bl;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public String getEditModeString() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_41, (Object)((Object)this), (Object)((Object)this));
        try {
            String string;
            String string2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            String string3 = string2 = this._editMode == null ? (string = EditMode.ReadOnly.name()) : (string = this._editMode.name());
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public void setEditModeString(String editModeString) {
        String string = editModeString;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_42, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$ptwAspectInstance.traceMethodEntry(joinPoint);
            this._editMode = EditMode.valueOf((String)editModeString);
            Object var4_4 = null;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodExit(joinPoint, var4_4);
            return;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    /*
     * Unable to fully structure code
     */
    public String getSourceAttribute(Application app) {
        var6_2 = app;
        var5_3 = Factory.makeJP((JoinPoint.StaticPart)ObjectAttribute.ajc$tjp_43, (Object)this, (Object)this, (Object)var6_2);
        try {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodEntry(var5_3);
            source = this.getSource(app);
            if (source == null) ** GOTO lbl-1000
            mappedTo = source.getName();
            rule = source.getRule();
            if (rule != null) {
                v0 = var7_7 = "Rule:" + rule.getName();
            } else if (mappedTo != null) {
                v0 = var7_7 = mappedTo;
            } else lbl-1000:
            // 2 sources

            {
                v0 = var7_7 = null;
            }
            v1 = var8_8 = v0;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodExit(var5_3, var8_8);
            return var7_7;
        }
        catch (Throwable var9_9) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodThrow(var5_3, var9_9);
            throw var9_9;
        }
    }

    public AttributeSource getSource(Application app) {
        Application application = app;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_44, (Object)((Object)this), (Object)((Object)this), (Object)application);
        try {
            AttributeSource attributeSource;
            AttributeSource attributeSource2;
            AttributeSource attributeSource3;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodEntry(joinPoint);
            if (app != null && Util.size(this._sources) > 0) {
                for (AttributeSource source : this._sources) {
                    Application sourceApp = source.getApplication();
                    if (sourceApp == null || !app.equals((Object)sourceApp)) continue;
                    attributeSource2 = attributeSource3 = source;
                    break;
                }
            } else {
                attributeSource2 = attributeSource3 = null;
            }
            AttributeSource attributeSource4 = attributeSource = attributeSource2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodExit(joinPoint, attributeSource);
            return attributeSource3;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    @Deprecated
    public String sourcedBy(Application app) {
        Application application = app;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_45, (Object)((Object)this), (Object)((Object)this), (Object)application);
        try {
            String string;
            String string2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodEntry(joinPoint);
            String string3 = string2 = (string = this.getSourceAttribute(app));
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodExit(joinPoint, (Object)string2);
            return string;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public boolean isSourcedBy(Application app) {
        Application application = app;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_46, (Object)((Object)this), (Object)((Object)this), (Object)application);
        try {
            boolean bl;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodEntry(joinPoint);
            boolean bl2 = this.getSourceAttribute(app) != null;
            boolean bl3 = bl = bl2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodExit(joinPoint, Conversions.booleanObject((boolean)bl));
            return bl2;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public int getSourceOrdinal(String key) {
        String string = key;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_47, (Object)((Object)this), (Object)((Object)this), (Object)string);
        try {
            int n;
            int n2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodEntry(joinPoint);
            int ordinal = -1;
            if (key != null && this._sources != null) {
                for (int i = 0; i < this._sources.size(); ++i) {
                    AttributeSource src = this._sources.get(i);
                    if (!key.equals(src.getKey())) continue;
                    ordinal = i;
                    break;
                }
            }
            int n3 = n2 = (n = ordinal);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodExit(joinPoint, Conversions.intObject((int)n2));
            return n;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public int getSourceOrdinal(AttributeMetaData metadata) {
        AttributeMetaData attributeMetaData = metadata;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_48, (Object)((Object)this), (Object)((Object)this), (Object)attributeMetaData);
        try {
            int n;
            int n2;
            String key;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodEntry(joinPoint);
            int ordinal = -1;
            if (metadata != null && (key = metadata.getSource()) != null) {
                ordinal = this.getSourceOrdinal(key);
            }
            int n3 = n2 = (n = ordinal);
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodExit(joinPoint, Conversions.intObject((int)n2));
            return n;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public AttributeSource getSource(AttributeMetaData metadata) {
        AttributeMetaData attributeMetaData = metadata;
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_49, (Object)((Object)this), (Object)((Object)this), (Object)attributeMetaData);
        try {
            AttributeSource attributeSource;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodEntry(joinPoint);
            int ordinal = this.getSourceOrdinal(metadata);
            AttributeSource attributeSource2 = ordinal > -1 ? this._sources.get(ordinal) : null;
            AttributeSource attributeSource3 = attributeSource = attributeSource2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodExit(joinPoint, (Object)attributeSource);
            return attributeSource2;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    public SearchInputDefinition.PropertyType getPropertyType() {
        JoinPoint joinPoint = Factory.makeJP((JoinPoint.StaticPart)ajc$tjp_50, (Object)((Object)this), (Object)((Object)this));
        try {
            SearchInputDefinition.PropertyType propertyType;
            SearchInputDefinition.PropertyType propertyType2;
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodEntry(joinPoint);
            SearchInputDefinition.PropertyType propertyType3 = propertyType2 = this._type == null ? (propertyType = SearchInputDefinition.PropertyType.String) : (propertyType = typeToPropertyTypeMap.get(this._type));
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodExit(joinPoint, (Object)propertyType2);
            return propertyType;
        }
        catch (Throwable throwable) {
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().traceMethodThrow(joinPoint, throwable);
            throw throwable;
        }
    }

    static {
        ObjectAttribute.ajc$preClinit();
        ajc$sailpoint_tools_TracingAspect$ptwAspectInstance = TracingAspect.ajc$createAspectInstance((String)"sailpoint.object.ObjectAttribute");
        try {
            typeToPropertyTypeMap = new HashMap<String, SearchInputDefinition.PropertyType>();
            typeToPropertyTypeMap.put("boolean", SearchInputDefinition.PropertyType.Boolean);
            typeToPropertyTypeMap.put("date", SearchInputDefinition.PropertyType.Date);
            typeToPropertyTypeMap.put(TYPE_IDENTITY, SearchInputDefinition.PropertyType.Identity);
            typeToPropertyTypeMap.put("int", SearchInputDefinition.PropertyType.Integer);
            typeToPropertyTypeMap.put("secret", SearchInputDefinition.PropertyType.String);
            typeToPropertyTypeMap.put("string", SearchInputDefinition.PropertyType.String);
            typeToPropertyTypeMap.put(TYPE_RULE, SearchInputDefinition.PropertyType.Rule);
        }
        catch (Throwable throwable) {
            if (throwable instanceof ExceptionInInitializerError) {
                throw (ExceptionInInitializerError)throwable;
            }
            ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().initLogger(ajc$tjp_51);
            throw throwable;
        }
        ObjectAttribute.ajc$sailpoint_tools_TracingAspect$localAspectOf().initLogger(ajc$tjp_51);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ObjectAttribute.java", ObjectAttribute.class);
        ajc$tjp_0 = factory.makeSJP("constructor-execution", (Signature)factory.makeConstructorSig("1", "sailpoint.object.ObjectAttribute", "", "", ""), 245);
        ajc$tjp_1 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "add", "sailpoint.object.ObjectAttribute", "sailpoint.object.AttributeSource", "src", "", "void"), 248);
        ajc$tjp_10 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setSilent", "sailpoint.object.ObjectAttribute", "boolean", "b", "", "void"), 351);
        ajc$tjp_11 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isSilent", "sailpoint.object.ObjectAttribute", "", "", "", "boolean"), 361);
        ajc$tjp_12 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setExtendedNumber", "sailpoint.object.ObjectAttribute", "int", "i", "", "void"), 366);
        ajc$tjp_13 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getExtendedNumber", "sailpoint.object.ObjectAttribute", "", "", "", "int"), 381);
        ajc$tjp_14 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setNamedColumn", "sailpoint.object.ObjectAttribute", "boolean", "b", "", "void"), 386);
        ajc$tjp_15 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isNamedColumn", "sailpoint.object.ObjectAttribute", "", "", "", "boolean"), 390);
        ajc$tjp_16 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setExternal", "sailpoint.object.ObjectAttribute", "boolean", "b", "", "void"), 398);
        ajc$tjp_17 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isExternal", "sailpoint.object.ObjectAttribute", "", "", "", "boolean"), 413);
        ajc$tjp_18 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setRule", "sailpoint.object.ObjectAttribute", "sailpoint.object.Rule", "r", "", "void"), 418);
        ajc$tjp_19 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getRule", "sailpoint.object.ObjectAttribute", "", "", "", "sailpoint.object.Rule"), 433);
        ajc$tjp_2 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "remove", "sailpoint.object.ObjectAttribute", "sailpoint.object.AttributeSource", "src", "", "boolean"), 254);
        ajc$tjp_20 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setSources", "sailpoint.object.ObjectAttribute", "java.util.List", "sources", "", "void"), 438);
        ajc$tjp_21 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getSources", "sailpoint.object.ObjectAttribute", "", "", "", "java.util.List"), 446);
        ajc$tjp_22 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setTargets", "sailpoint.object.ObjectAttribute", "java.util.List", "targets", "", "void"), 456);
        ajc$tjp_23 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getTargets", "sailpoint.object.ObjectAttribute", "", "", "", "java.util.List"), 465);
        ajc$tjp_24 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setGroupFactory", "sailpoint.object.ObjectAttribute", "boolean", "b", "", "void"), 470);
        ajc$tjp_25 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isGroupFactory", "sailpoint.object.ObjectAttribute", "", "", "", "boolean"), 481);
        ajc$tjp_26 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getEditMode", "sailpoint.object.ObjectAttribute", "", "", "", "sailpoint.object.ObjectAttribute$EditMode"), 489);
        ajc$tjp_27 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setEditMode", "sailpoint.object.ObjectAttribute", "sailpoint.object.ObjectAttribute$EditMode", "type", "", "void"), 493);
        ajc$tjp_28 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setListenerRule", "sailpoint.object.ObjectAttribute", "sailpoint.object.Rule", "r", "", "void"), 498);
        ajc$tjp_29 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getListenerRule", "sailpoint.object.ObjectAttribute", "", "", "", "sailpoint.object.Rule"), 530);
        ajc$tjp_3 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "add", "sailpoint.object.ObjectAttribute", "sailpoint.object.AttributeTarget", "target", "", "void"), 261);
        ajc$tjp_30 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setListenerWorkflow", "sailpoint.object.ObjectAttribute", "sailpoint.object.Workflow", "w", "", "void"), 535);
        ajc$tjp_31 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getListenerWorkflow", "sailpoint.object.ObjectAttribute", "", "", "", "sailpoint.object.Workflow"), 545);
        ajc$tjp_32 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isExtended", "sailpoint.object.ObjectAttribute", "", "", "", "boolean"), 555);
        ajc$tjp_33 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getExtendedName", "sailpoint.object.ObjectAttribute", "", "", "", "java.lang.String"), 564);
        ajc$tjp_34 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getExtendedIdentityName", "sailpoint.object.ObjectAttribute", "", "", "", "java.lang.String"), 577);
        ajc$tjp_35 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isIdentity", "sailpoint.object.ObjectAttribute", "", "", "", "boolean"), 592);
        ajc$tjp_36 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isSearchable", "sailpoint.object.ObjectAttribute", "", "", "", "boolean"), 596);
        ajc$tjp_37 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isCustom", "sailpoint.object.ObjectAttribute", "", "", "", "boolean"), 600);
        ajc$tjp_38 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getSource", "sailpoint.object.ObjectAttribute", "sailpoint.object.AttributeSource", "other", "", "sailpoint.object.AttributeSource"), 605);
        ajc$tjp_39 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getTarget", "sailpoint.object.ObjectAttribute", "sailpoint.object.AttributeTarget", "other", "", "sailpoint.object.AttributeTarget"), 619);
        ajc$tjp_4 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "remove", "sailpoint.object.ObjectAttribute", "sailpoint.object.AttributeTarget", "target", "", "boolean"), 267);
        ajc$tjp_40 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isEditable", "sailpoint.object.ObjectAttribute", "", "", "", "boolean"), 636);
        ajc$tjp_41 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getEditModeString", "sailpoint.object.ObjectAttribute", "", "", "", "java.lang.String"), 650);
        ajc$tjp_42 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setEditModeString", "sailpoint.object.ObjectAttribute", "java.lang.String", "editModeString", "", "void"), 663);
        ajc$tjp_43 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getSourceAttribute", "sailpoint.object.ObjectAttribute", "sailpoint.object.Application", "app", "", "java.lang.String"), 689);
        ajc$tjp_44 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getSource", "sailpoint.object.ObjectAttribute", "sailpoint.object.Application", "app", "", "sailpoint.object.AttributeSource"), 707);
        ajc$tjp_45 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "sourcedBy", "sailpoint.object.ObjectAttribute", "sailpoint.object.Application", "app", "", "java.lang.String"), 727);
        ajc$tjp_46 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isSourcedBy", "sailpoint.object.ObjectAttribute", "sailpoint.object.Application", "app", "", "boolean"), 734);
        ajc$tjp_47 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getSourceOrdinal", "sailpoint.object.ObjectAttribute", "java.lang.String", "key", "", "int"), 742);
        ajc$tjp_48 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getSourceOrdinal", "sailpoint.object.ObjectAttribute", "sailpoint.object.AttributeMetaData", "metadata", "", "int"), 761);
        ajc$tjp_49 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getSource", "sailpoint.object.ObjectAttribute", "sailpoint.object.AttributeMetaData", "metadata", "", "sailpoint.object.AttributeSource"), 777);
        ajc$tjp_5 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "load", "sailpoint.object.ObjectAttribute", "", "", "", "void"), 283);
        ajc$tjp_50 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "getPropertyType", "sailpoint.object.ObjectAttribute", "", "", "", "sailpoint.object.SearchInputDefinition$PropertyType"), 786);
        ajc$tjp_51 = factory.makeSJP("staticinitialization", (Signature)factory.makeInitializerSig("8", "sailpoint.object.ObjectAttribute"), 796);
        ajc$tjp_6 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setSystem", "sailpoint.object.ObjectAttribute", "boolean", "b", "", "void"), 311);
        ajc$tjp_7 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isSystem", "sailpoint.object.ObjectAttribute", "", "", "", "boolean"), 328);
        ajc$tjp_8 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "setStandard", "sailpoint.object.ObjectAttribute", "boolean", "b", "", "void"), 333);
        ajc$tjp_9 = factory.makeSJP("method-execution", (Signature)factory.makeMethodSig("1", "isStandard", "sailpoint.object.ObjectAttribute", "", "", "", "boolean"), 346);
    }
}
