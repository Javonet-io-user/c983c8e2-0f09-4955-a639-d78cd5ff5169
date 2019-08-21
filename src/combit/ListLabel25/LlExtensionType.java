package combit.ListLabel25;

public enum LlExtensionType {
  Export(1L),
  Barcode(2L),
  Object(3L),
  Wizard(4L),
  ;
  private long numVal;

  LlExtensionType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
