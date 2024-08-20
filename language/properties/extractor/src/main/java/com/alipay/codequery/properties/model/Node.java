
package com.alipay.codequery.properties.model;


public class Node {

  /**
   * The location info of the element.
   */
  public Location location;

  /**
   * The parent node.
   */
  public Node parent;

  /**
   * The local location info of the element.
   */
  public Location.LocalLocation localLocation;

  /**
   * The printable text of the element, aka the corresponding src code.
   */
  public String printableText;

  /**
   * The oid of the element, which can be uniquely identified the element.
   */
  public Long oid;

  /**
   * The file info the element.
   */
  public File file;

  /**
   * Get the printable text of the element.
   * @return
   */
  public String getPrintableText() {
    return printableText;
  }

  /**
   * Set printable text of the element.
   * @param line
   */
  public void setPrintableText(String line) {
    this.printableText = line;
  }

  /**
   * Constructor.
   * @param oid
   */
  public Node(Long oid) {
    this.oid = oid;
  }

  /**
   * Constructor.
   * @param oid
   * @param printableText
   * @param file
   */
  public Node(Long oid, String printableText, File file) {
    this.oid = oid;
    this.printableText = printableText;
    this.file = file;
  }

  /**
   * Default constructor.
   */
  public Node() {
  }
}
