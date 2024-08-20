
package com.alipay.codequery.properties.model;


public class File extends Node{
  /**
   * File's relative path.
   */
  public String relativePath;
  /**
   * File's extention.
   */
  public String extension;
  /**
   * File's name.
   */
  public String name;

  /**
   * Extract corresponding mybatis object.
   * @return
   */
  public com.alipay.codequery.properties.dal.mybatis.domain.File extractFile(){
    return new com.alipay.codequery.properties.dal.mybatis.domain.File(this.oid, this.relativePath, this.extension, this.name);
  }

  /**
   * Constructor.
   * @param oid
   */
  public File(Long oid) {
    super(oid);
  }

  /**
   * Default constructor.
   */
  public File() {
  }
}
