package combit.ListLabel25.DataProviders;

public enum NodeType {
  Flat(0L),
  Table(1L),
  ;
  private long numVal;

  NodeType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
