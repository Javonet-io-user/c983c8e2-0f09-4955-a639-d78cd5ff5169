package combit.ListLabel25;

public enum LlDialogBitmapButton {
  With_Bitmaps(1L),
  Without_Bitmaps(8192L),
  ;
  private long numVal;

  LlDialogBitmapButton(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
