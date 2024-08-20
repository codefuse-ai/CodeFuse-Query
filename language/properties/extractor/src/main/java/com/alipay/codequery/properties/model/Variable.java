
package com.alipay.codequery.properties.model;


public class Variable extends Node {

  /**
   * The begin index of the variable in its parent.
   */
  public int beginIndex;

  /**
   * The name of the variable.
   */
  public String name;

  /**
   * @param printableText
   */
  public Variable(String printableText) {
    this.printableText = printableText;
  }

  /**
   * Constructor.
   * @param printableText
   * @param beginIndex
   */
  public Variable(String printableText, int beginIndex) {
    this.printableText = printableText;
    this.beginIndex = beginIndex;
  }

  /**
   * The printable text of the element.
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
  public com.alipay.codequery.properties.dal.mybatis.domain.Variable extractVariable() {
    return new com.alipay.codequery.properties.dal.mybatis.domain.Variable(this.oid, this.parent.oid, this.beginIndex, this.name, this.printableText);
  }
}
