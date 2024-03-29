package combit.ListLabel25;

public enum LlError {
  LL_ERR_STG_CANNOTGETMETAFILE(-1010L),
  LL_ERR_STG_BADSTORAGE(-1009L),
  LL_ERR_STG_ACCESSDENIED(-1008L),
  LL_ERR_STG_BADJOB(-1007L),
  LL_ERR_STG_ENDOFLIST(-1006L),
  LL_ERR_STG_BADHANDLE(-1005L),
  LL_ERR_STG_UNKNOWNSYSTEM(-1004L),
  LL_ERR_STG_WRITE(-1003L),
  LL_ERR_STG_READ(-1002L),
  LL_ERR_STG_BADVERSION(-1001L),
  LL_ERR_STG_NOSTORAGE(-1000L),
  LL_WRN_REPEAT_DATA(-998L),
  LL_ERR_EXCEPTION(-104L),
  LL_ERR_WIN32ONLY(-103L),
  LL_ERR_NO_MEMORY(-102L),
  LL_ERR_NO_LANG_DLL(-101L),
  LL_ERR_BAD_DLLS(-100L),
  LL_ERR_USER_ABORTED(-99L),
  LL_ERR_NOCHART(-48L),
  LL_ERR_NODESTINATION(-47L),
  LL_ERR_CANNOTCREATETEMPFILE(-46L),
  LL_ERR_BADCODEPAGE(-45L),
  LL_ERR_BUFFERTOOSMALL(-44L),
  LL_ERR_NOTFINISHED(-43L),
  LL_ERR_NOTINHOSTPRINTERMODE(-42L),
  LL_ERR_NOVALIDPAGES(-41L),
  LL_ERR_RESERVED(-40L),
  LL_ERR_SAVEPRINTERCFG(-39L),
  LL_ERR_NOPRINTERCFG(-38L),
  LL_ERR_UNKNOWNSORTORDER(-37L),
  LL_ERR_UNKNOWNFIELD(-36L),
  LL_ERR_UNKNOWNVARIABLE(-35L),
  LL_ERR_ONLYWITHONETABLE(-34L),
  LL_ERR_CFGBADMODE(-33L),
  LL_ERR_BAD_MODE(-32L),
  LL_ERR_UNKNOWN(-31L),
  LL_ERR_NO_TEXTOBJECT(-30L),
  LL_ERR_NO_OBJECT(-29L),
  LL_ERR_NO_TABLEOBJECT(-28L),
  LL_ERR_UNKNOWNOBJECT(-27L),
  LL_ERR_NOOBJECT(-26L),
  LL_ERR_BADOBJNAME(-25L),
  LL_ERR_CFGBADFILE(-24L),
  LL_ERR_EXPRESSION(-23L),
  LL_ERR_CFGNOTFOUND(-22L),
  LL_ERR_NO_TABLE(-21L),
  LL_ERR_BAD_EXPRMODE(-20L),
  LL_ERR_BAD_EXPRESSION(-19L),
  LL_ERR_PARAMETER(-18L),
  LL_ERR_NO_PREVIEWFILES(-17L),
  LL_ERR_NO_PREVIEWMODE(-16L),
  LL_ERR_BAD_PRINTER(-15L),
  LL_ERR_NEEDS_VB(-14L),
  LL_ERR_PRINTING(-12L),
  LL_ERR_NO_PRINTER(-11L),
  LL_ERR_NO_PROJECT(-10L),
  LL_ERR_NOT_YET_PRINTING(-7L),
  LL_ERR_ALREADY_PRINTING(-6L),
  LL_ERR_NO_BOX(-5L),
  LL_ERR_PRINTING_JOB(-4L),
  LL_ERR_BAD_OBJECTTYPE(-3L),
  LL_ERR_TASK_ACTIVE(-2L),
  LL_ERR_BAD_JOBHANDLE(-1L),
  ;
  private long numVal;

  LlError(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
