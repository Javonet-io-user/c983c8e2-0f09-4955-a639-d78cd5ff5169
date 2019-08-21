package combit.ListLabel25.DataProviders;

public enum GraphQLQueryType {
  unknown(0L),
  select_all(1L),
  filter_by_id(2L),
  filter_by_columns(3L),
  filter(4L),
  drillDown(5L),
  ;
  private long numVal;

  GraphQLQueryType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
