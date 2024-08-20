
package com.alipay.codequery.properties.model;


public class EmptyLine extends Node {

  /**
   * @param line
   */
  public EmptyLine(String line, Location.LocalLocation localLocation) {
    this.printableText = line;
    this.localLocation = localLocation;
  }

  /**
   * Get printable text.
   * @return
   */
  public String toString() {
    if (printableText != null) {
      return printableText;
    }
    return null;
  }

  /**
   * Extract corresponding mybatis object.
   * @return
   */
  public com.alipay.codequery.properties.dal.mybatis.domain.EmptyLine extractEmptyLine() {
    return new com.alipay.codequery.properties.dal.mybatis.domain.EmptyLine(this.oid, this.location.oid, this.file.oid);
  }
}
