
package com.alipay.codequery.properties.model;

import com.alipay.codequery.properties.dal.mybatis.domain.Comment;


public class PropertyComment extends Node{

  /**
   * @param printableText
   */
  public PropertyComment(String printableText) {
    this.printableText = printableText;
  }

  /**
   * Constructor.
   * @param printableText
   * @param localLocation
   */
  public PropertyComment(String printableText, Location.LocalLocation localLocation) {
    this.printableText = printableText;
    this.localLocation = localLocation;
  }

  /**
   * Get the string presentation of the lement.
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
  public Comment extractComment() {
    return new Comment(this.oid, this.printableText, this.file.oid, this.location.oid);
  }
}
