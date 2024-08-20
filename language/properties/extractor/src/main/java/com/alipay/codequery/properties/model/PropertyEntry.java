
package com.alipay.codequery.properties.model;

import com.alipay.codequery.properties.util.SafeProperties;
import com.alipay.codequery.properties.dal.mybatis.domain.Entry;


public class PropertyEntry extends Node {
  private String key;

  private String value;

  /**
   * Constructor.
   * @param key
   * @param value
   */
  public PropertyEntry(String key, String value) {
    this.key = key;
    this.value = value;
  }

  /**
   * @param key
   * @param value
   * @param printableText
   */
  public PropertyEntry(String key, String value, String printableText, Location.LocalLocation localLocation) {
    this(key, value);
    this.printableText = printableText;
    this.localLocation = localLocation;
  }

  /**
   * Get the key value of the entry.
   * @return
   */
  public String getKey() {
    return key;
  }

  /**
   * Set the key value of the entry.
   * @param key
   */
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Get the value of the entry.
   * @return
   */
  public String getValue() {
    return value;
  }

  /**
   * Set the value of the entry.
   * @param value
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * The printable text of the entry element.
   * @return
   */
  public String toString() {
    if (this.printableText != null) {
      return this.printableText;
    }
    if (key != null && value != null) {
      String k = SafeProperties.saveConvert(key, true);
      String v = SafeProperties.saveConvert(value, false);
      return k + "=" + v;
    }
    return null;
  }

  /**
   * Extract corresponding mybatis object.
   * @return
   */
  public Entry extractEntry() {
    return new Entry(this.oid, this.key, this.value, this.printableText, this.location.oid);
  }

}
