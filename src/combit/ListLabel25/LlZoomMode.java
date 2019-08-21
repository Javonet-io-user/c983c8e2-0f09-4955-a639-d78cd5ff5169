package combit.ListLabel25;

public enum LlZoomMode {
  Factor(0L),
  Percentage(1L),
  ;
  private long numVal;

  LlZoomMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
