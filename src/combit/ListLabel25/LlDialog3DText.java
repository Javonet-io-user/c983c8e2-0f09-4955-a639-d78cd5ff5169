package combit.ListLabel25;

public enum LlDialog3DText {
  Texts_2D(0L),
  Texts_3D(32768L),
  ;
  private long numVal;

  LlDialog3DText(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
