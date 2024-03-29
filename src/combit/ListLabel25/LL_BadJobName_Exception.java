package combit.ListLabel25;

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
import combit.ListLabel25.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class LL_BadJobName_Exception extends ListLabelException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public LL_BadJobName_Exception() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel25.LL_BadJobName_Exception");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LL_BadJobName_Exception(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel25.LL_BadJobName_Exception", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LL_BadJobName_Exception(java.lang.String message, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel25.LL_BadJobName_Exception", message, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LL_BadJobName_Exception(NObject handle) {
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
