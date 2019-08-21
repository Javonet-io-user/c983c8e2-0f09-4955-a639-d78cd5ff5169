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
import combit.ListLabel25.DataProviders.*;
import jio.System.Collections.Generic.*;
import combit.ListLabel25.Dom.*;
import combit.ListLabel25.*;

public class DatasourceParameterDomBuilder {
  protected NObject javonetHandle;

  public DatasourceParameterDomBuilder() {
    try {
      javonetHandle = Javonet.New("combit.ListLabel25.DataProviders.DatasourceParameterDomBuilder");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatasourceParameterDomBuilder(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CreateReportParametersForDatasourceParameters(
      IEnumerable<DatasourceParameter> parameters,
      ProjectBase project,
      java.lang.Boolean reuseExisting) {
    try {
      javonetHandle.invoke(
          "CreateReportParametersForDatasourceParameters", parameters, project, reuseExisting);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CreateReportParametersForDatasourceParameters(
      IEnumerable<DatasourceParameter> parameters,
      ListLabel llJob,
      java.lang.Boolean reuseExisting) {
    try {
      javonetHandle.invoke(
          "CreateReportParametersForDatasourceParameters", parameters, llJob, reuseExisting);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
