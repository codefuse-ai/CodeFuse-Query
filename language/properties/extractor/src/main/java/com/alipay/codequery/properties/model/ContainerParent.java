
package com.alipay.codequery.properties.model;


public class ContainerParent extends Node {
  /**
   * Constructor.
   * @param oid
   * @param parentOid
   */
  public ContainerParent(Long oid, Long parentOid) {
      this.oid = oid;
      this.parent = new Node(parentOid);
  }

  /**
   * Extract corresponding mybatis object.
   * @return
   */
  public com.alipay.codequery.properties.dal.mybatis.domain.ContainerParent extractContainerParent() {
    return new com.alipay.codequery.properties.dal.mybatis.domain.ContainerParent(this.oid, this.parent.oid);
  }

}
