
package com.alipay.codequery.properties.model;

public class Folder extends Node{

  /**
   * Folder's relative path.
   */
  public String relativePath;

  /**
   * Folder's name.
   */
  public String name;

  /**
   * Default constructor.
   */
  public Folder() {
  }

  /**
   * Constructor.
   * @param oid
   */
  public Folder(Long oid) {
    super(oid);
  }

  /**
   * Extract corresponding mybatis object.
   * @return
   */
  public com.alipay.codequery.properties.dal.mybatis.domain.Folder extractFolder(){
    return new com.alipay.codequery.properties.dal.mybatis.domain.Folder(this.oid,this.relativePath,this.name, this.parent.oid);
  }
}
