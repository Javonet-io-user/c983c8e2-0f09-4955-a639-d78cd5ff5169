package combit.ListLabel25;

public enum LlQueryObjectAllowedTypes {
  LLX(1L),
  Unknown(-1L),
  ;
  private long numVal;

  LlQueryObjectAllowedTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
