package combit.ListLabel25.DataProviders;

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
import jio.System.*;
import combit.ListLabel25.DataProviders.*;
import jio.System.Runtime.InteropServices.*;

public class DataProviderThreadSafenessAttribute extends Attribute implements _Attribute {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDataProviderThreadSafeness(DataProviderThreadSafeness value) {
    try {
      javonetHandle.set("DataProviderThreadSafeness", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DataProviderThreadSafeness getDataProviderThreadSafeness() {
    try {
      Object res = javonetHandle.<NEnum>get("DataProviderThreadSafeness");
      if (res == null) return null;
      return DataProviderThreadSafeness.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DataProviderThreadSafenessAttribute() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel25.DataProviders.DataProviderThreadSafenessAttribute");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataProviderThreadSafenessAttribute(NObject handle) {
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
