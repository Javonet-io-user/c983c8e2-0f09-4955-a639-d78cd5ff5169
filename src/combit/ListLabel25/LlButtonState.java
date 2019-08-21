package combit.ListLabel25;

public enum LlButtonState {
  Invisible(0L),
  Default(1L),
  Enabled(2L),
  Disabled(3L),
  ;
  private long numVal;

  LlButtonState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
