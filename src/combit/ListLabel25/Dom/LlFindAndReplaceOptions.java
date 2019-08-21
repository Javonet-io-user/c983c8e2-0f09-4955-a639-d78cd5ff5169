package combit.ListLabel25.Dom;

public enum LlFindAndReplaceOptions {
  None(0L),
  CaseSensitive(1L),
  ;
  private long numVal;

  LlFindAndReplaceOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
