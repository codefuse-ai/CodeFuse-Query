
package com.alipay.codequery.properties.model;

public class Program extends Node{
  /**
   * The prefix of the root node(Corpus).
   */
  public String prefix = "";

  /**
   * Default constructor.
   */
  public Program() {
  }

  /**
   * Constructor by set oid.
   * @param oid
   */
  public Program(Long oid) {
    super(oid);
  }

  /**
   * Extract corresponding mybatis object.
   * @return
   */
  public com.alipay.codequery.properties.dal.mybatis.domain.Program extractProgram(){
    return new com.alipay.codequery.properties.dal.mybatis.domain.Program(this.oid, this.prefix);
  }
}
