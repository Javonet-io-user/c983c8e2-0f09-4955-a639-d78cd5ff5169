package combit.ListLabel25;

public enum LlSetPrinterInPrinterFileModes {
  Standard(0L),
  ForceDefaultValues(32768L),
  ;
  private long numVal;

  LlSetPrinterInPrinterFileModes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
