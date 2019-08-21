package combit.ListLabel25.Dom;

public enum LlReplaceAction {
  Replace(0L),
  Skip(1L),
  CancelGlobally(2L),
  ;
  private long numVal;

  LlReplaceAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
