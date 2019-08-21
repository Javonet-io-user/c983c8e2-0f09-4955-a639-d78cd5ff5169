package combit.ListLabel25.Dom;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import combit.ListLabel25.Dom.*;

public class PropertyChartEngineRscript extends PropertyChartEngineBase {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDataSamplesForDesigner(java.lang.String value) {
    try {
      javonetHandle.set("DataSamplesForDesigner", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDataSamplesForDesigner() {
    try {
      java.lang.String res = javonetHandle.get("DataSamplesForDesigner");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRScriptTimeoutMS(java.lang.String value) {
    try {
      javonetHandle.set("RScriptTimeoutMS", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRScriptTimeoutMS() {
    try {
      java.lang.String res = javonetHandle.get("RScriptTimeoutMS");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRScriptEnableRealtimePreview(java.lang.Boolean value) {
    try {
      javonetHandle.set("RScriptEnableRealtimePreview", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getRScriptEnableRealtimePreview() {
    try {
      java.lang.Boolean res = javonetHandle.get("RScriptEnableRealtimePreview");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyRScriptData getRScriptData() {
    try {
      Object res = javonetHandle.<NObject>get("RScriptData");
      if (res == null) return null;
      return new PropertyRScriptData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyRScriptOutputExtension getRScriptOutputExtension() {
    try {
      Object res = javonetHandle.<NObject>get("RScriptOutputExtension");
      if (res == null) return null;
      return new PropertyRScriptOutputExtension((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyRScriptCommonVarExport getRScriptCommonVarExport() {
    try {
      Object res = javonetHandle.<NObject>get("RScriptCommonVarExport");
      if (res == null) return null;
      return new PropertyRScriptCommonVarExport((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyChartEngineRscript(PropertyChartEngineBase item) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel25.Dom.PropertyChartEngineRscript", item);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PropertyChartEngineRscript(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
