package combit.ListLabel25;

public enum LlAutoMasterMode {
  None(0L),
  AsVariables(1L),
  AsFields(2L),
  ;
  private long numVal;

  LlAutoMasterMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
