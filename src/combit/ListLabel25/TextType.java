package combit.ListLabel25;

public enum TextType {
  CompletePlainText(1L),
  PartialPlainText(2L),
  RtfStream(3L),
  ;
  private long numVal;

  TextType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
