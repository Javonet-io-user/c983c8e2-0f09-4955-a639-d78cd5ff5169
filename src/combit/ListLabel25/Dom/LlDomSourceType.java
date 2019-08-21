package combit.ListLabel25.Dom;

public enum LlDomSourceType {
  Database(0L),
  Choice(1L),
  Text(2L),
  ;
  private long numVal;

  LlDomSourceType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
