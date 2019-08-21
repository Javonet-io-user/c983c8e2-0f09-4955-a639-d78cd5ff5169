package combit.ListLabel25;

public enum LlExportOption {
  ExportAllInOneFile(0L),
  ExportFile(1L),
  ExportPath(2L),
  ExportTarget(3L),
  ExportQuiet(4L),
  ExportShowResult(5L),
  ExportShowResultAvailable(6L),
  ExportSendAsMail(7L),
  ExportSendAsMailAvailable(8L),
  ExportMailBody(9L),
  ExportMailHtmlBody(10L),
  ExportMailAttachmentList(11L),
  ExportMailSecureConnection(12L),
  ExportMailSmtpServerTimeOut(13L),
  ExportMailSmtpServerAddress(14L),
  ExportMailSmtpServerPort(15L),
  ExportMailSmtpUser(16L),
  ExportMailSmtpPassword(17L),
  ExportMailSmtpProxyType(18L),
  ExportMailSmtpProxyAddress(19L),
  ExportMailSmtpProxyPort(20L),
  ExportMailSmtpProxyUser(21L),
  ExportMailSmtpProxyPassword(22L),
  ExportMailSmtpSenderAddress(23L),
  ExportMailSmtpSenderName(24L),
  ExportMailSmtpReplyTo(25L),
  ExportMailSmtpFrom(26L),
  ExportMailSmtpPopBeforeSmtp(27L),
  ExportMailSmtpServerUser(28L),
  ExportMailSmtpServerPassword(29L),
  ExportMailTo(30L),
  ExportMailCc(31L),
  ExportMailBcc(32L),
  ExportMailProvider(33L),
  ExportMailSubject(34L),
  ExportMailShowDialog(35L),
  ExportMailSendResultAs(36L),
  ExportSaveAsZip(37L),
  ExportSaveAsZipAvailable(38L),
  ExportZipFile(39L),
  ExportZipPath(40L),
  ExportOnlyTableData(41L),
  ExportSignResult(42L),
  ExportSignResultAvailable(43L),
  ExportSignatureProvider(44L),
  ExportSignatureProviderOption(45L),
  ExportSignatureFormat(46L),
  PictureFormat(47L),
  PictureJpegEncoding(48L),
  PictureJpegQuality(49L),
  PictureBitsPerPixel(50L),
  PictureCropFile(51L),
  PictureCropFrameWidth(52L),
  UsePosFrame(53L),
  VerbosityRectangle(54L),
  VerbosityBarcode(55L),
  VerbosityDrawing(56L),
  VerbosityEllipse(57L),
  VerbosityLine(58L),
  VerbosityText(59L),
  VerbosityTextFrames(60L),
  VerbosityRtf(61L),
  VerbosityRtfFrames(62L),
  VerbosityTable(63L),
  VerbosityTableCell(64L),
  VerbosityTableFrames(65L),
  VerbosityLLXObject(66L),
  VerbosityLLXObjectHtmlObject(67L),
  HtmlTitle(68L),
  HtmlFormHeader(69L),
  HtmlFormFooter(70L),
  LayouterPercentaged(71L),
  LayouterFixedPageHeight(72L),
  PdfTitle(73L),
  PdfSubject(74L),
  PdfKeywords(75L),
  PdfAuthor(76L),
  PdfEncryptionEncryptFile(77L),
  PdfEncryptionEnablePrinting(78L),
  PdfEncryptionEnableChanging(79L),
  PdfEncryptionEnableCopying(80L),
  PdfEncryptionLevel(81L),
  PdfOwnerPassword(82L),
  PdfUserPassword(83L),
  PdfFontMode(84L),
  PdfExcludedFonts(85L),
  PdfCompressStreamMethod(86L),
  PdfPdfAMode(87L),
  PdfDontStackWorldModifications(88L),
  PdfFileAttachments(89L),
  Resolution(90L),
  TxtFrameChar(91L),
  TxtSeparatorChar(92L),
  TxtIgnoreGroupLines(93L),
  TxtIgnoreHeaderFooterLines(94L),
  TxtCharset(95L),
  TtyEmulation(96L),
  TtyDestination(97L),
  TtyDefaultFilename(98L),
  TtyAdvanceAfterPrint(99L),
  TiffCompressionType(100L),
  TiffCompressionQuality(101L),
  XlsFontScalingPercentage(102L),
  XlsPrintingZoom(103L),
  XlsIgnoreGroupLines(104L),
  XlsIgnoreHeaderFooterLines(105L),
  XlsIgnoreLineWrapForDataOnlyExport(106L),
  XlsConvertNumeric(107L),
  XlsAllPagesOneSheet(108L),
  XlsWorksheetName(109L),
  XlsFileFormat(110L),
  XlsAutoFit(111L),
  XmlTitle(112L),
  XhtmlUseAdvancedCss(113L),
  XhtmlToolbarType(114L),
  XhtmlTitle(115L),
  XhtmlUseSeparateCss(116L),
  JqmTitle(117L),
  JqmCDN(118L),
  JqmListDataFilter(119L),
  JqmUseDividerLines(120L),
  JqmBaseTheme(121L),
  JqmHeaderTheme(122L),
  JqmDividerTheme(123L),
  JqmColumnMode(124L),
  DocxFontScalingPercentage(125L),
  DocxAllPagesOneFile(126L),
  DocxCellScalingPercentageHeight(127L),
  DocxCellScalingPercentageWidth(128L),
  DocxFloatingTableMode(129L),
  SvgTitle(130L),
  PdfZUGFeRDConformanceLevel(131L),
  PdfZUGFeRDXmlPath(132L),
  PdfZUGFeRDVersion(133L),
  PptxFontScalingPercentage(134L),
  PptxAnimation(135L),
  ExportMailPop3SocketTimeout(136L),
  ExportMailPop3SenderDomain(137L),
  ExportMailPop3ServerPort(138L),
  ExportMailPop3ServerAddress(139L),
  ExportMailPop3ServerUser(140L),
  ExportMailPop3ServerPassword(141L),
  ExportMailPop3ProxyAddress(142L),
  ExportMailPop3ProxyPort(143L),
  ExportMailPop3ProxyUser(144L),
  ExportMailPop3ProxyPassword(145L),
  ExportMailXmapiServerUser(146L),
  ExportMailXmapiServerPassword(147L),
  ExportMailXmapiSuppressLogonFailure(148L),
  ExportMailXmapiDeleteAfterSend(149L),
  ExportMailSignatureName(150L),
  ;
  private long numVal;

  LlExportOption(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
