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

public class GraphQLResolverProperty {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setQueriesObjectName(java.lang.String value) {
    try {
      javonetHandle.set("QueriesObjectName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getQueriesObjectName() {
    try {
      java.lang.String res = javonetHandle.get("QueriesObjectName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMutationsObjectName(java.lang.String value) {
    try {
      javonetHandle.set("MutationsObjectName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMutationsObjectName() {
    try {
      java.lang.String res = javonetHandle.get("MutationsObjectName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<GraphQLObject> getObjects() {
    try {
      Object res = javonetHandle.<NObject>get("Objects");
      if (res == null) return null;
      return new List<GraphQLObject>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public GraphQLResolverProperty() {
    try {
      javonetHandle = Javonet.New("combit.ListLabel25.DataProviders.GraphQLResolverProperty");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GraphQLResolverProperty(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static GraphQLResolverProperty DeserilizeFromJson(
      java.lang.String serilizedResolverProperty) {
    try {
      Object res =
          Javonet.getType("combit.ListLabel25.DataProviders.GraphQLResolverProperty")
              .invoke("DeserilizeFromJson", serilizedResolverProperty);
      if (res == null) return null;
      return new GraphQLResolverProperty((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerilizeToJson(GraphQLResolverProperty resolverProperty) {
    try {
      java.lang.String res =
          Javonet.getType("combit.ListLabel25.DataProviders.GraphQLResolverProperty")
              .invoke("SerilizeToJson", resolverProperty);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
