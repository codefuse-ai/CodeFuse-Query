
package com.alipay.codequery.properties.model;


public class Location extends Node{

  /**
   * The file info of the location.
   */
  public File file;

  /**
   * The start line number of the location.
   */
  public int startLineNumber;

  /**
   * The start column number of the location.
   */
  public int startColumnNumber;

  /**
   * The end line number of the location.
   */
  public int endLineNumber;

  /**
   * The end column number of the location.
   */
  public int endColumnNumber;

  /**
   * Constructor.
   * @param oid
   */
  public Location(Long oid) {
    super(oid);
  }

  /**
   * Default constructor.
   */
  public Location() {
  }

  /**
   * Constructor.
   * @param oid
   * @param file
   * @param localLocation
   */
  public Location(Long oid, File file, LocalLocation localLocation) {
    this.oid = oid;
    this.file = file;
    this.startLineNumber = localLocation.startLineNumber;
    this.startColumnNumber = localLocation.startColumnNumber;
    this.endLineNumber = localLocation.endLineNumber;
    this.endColumnNumber = localLocation.endColumnNumber;
  }

  /**
   * Extract corresponding mybatis object.
   * @return
   */
  public com.alipay.codequery.properties.dal.mybatis.domain.Location extractLocation(){
    return new com.alipay.codequery.properties.dal.mybatis.domain.Location(
      this.oid,
      this.file.oid,
      this.startLineNumber,
      this.startColumnNumber,
      this.endLineNumber,
      this.endColumnNumber);
  }

  /**
   * The local location element.
   */
  public static class LocalLocation extends Location {

    /**
     * Default constructor.
     */
    public LocalLocation() {

    }

    /**
     * Constructor.
     * @param startLineNumber
     * @param startColumnNumber
     * @param endLineNumber
     * @param endColumnNumber
     */
    public LocalLocation(int startLineNumber,int startColumnNumber, int endLineNumber, int endColumnNumber ){
      this.startLineNumber = startLineNumber;
      this.startColumnNumber = startColumnNumber;
      this.endLineNumber = endLineNumber;
      this.endColumnNumber = endColumnNumber;
    }
  }

  /**
   * NumberOfLines element.
   */
  public static class NumberOfLines extends Location {

    /**
     * The total number of lines of the element.
     */
    public int numberOfLines;

    /**
     * The total number of comment lines of the element.
     */
    public int numberOfCommentLines;

    /**
     * The total number of code lines of the element.
     */
    public int numberOfCodeLines;

    /**
     * Constructor.
     * @param oid
     */
    public NumberOfLines(Long oid) {
      this.oid = oid;
    }

    /**
     * Extract corresponding mybatis object.
     * @return
     */
    public com.alipay.codequery.properties.dal.mybatis.domain.NumberOfLines extractNumberOfLines(){
      return new com.alipay.codequery.properties.dal.mybatis.domain.NumberOfLines(this.oid, this.numberOfLines,this.numberOfCodeLines,this.numberOfCommentLines);
    }
  }

}
