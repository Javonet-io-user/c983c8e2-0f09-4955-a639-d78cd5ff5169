package combit.ListLabel25.DataProviders;

public enum GraphQLQueryArgumentStandardType {
  none(0L),
  id(1L),
  where(2L),
  filter(3L),
  orderBy(4L),
  skip(5L),
  after(6L),
  before(7L),
  first(8L),
  last(9L),
  ;
  private long numVal;

  GraphQLQueryArgumentStandardType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
