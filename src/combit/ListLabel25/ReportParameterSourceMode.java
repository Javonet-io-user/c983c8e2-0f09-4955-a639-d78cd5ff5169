package combit.ListLabel25;

public enum ReportParameterSourceMode {
  Database(0L),
  Choice(1L),
  EditableText(2L),
  ;
  private long numVal;

  ReportParameterSourceMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
