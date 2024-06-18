package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ExpressionListExpressionRelation implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.expression_list_hash_id")
    private Long expressionListHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.expression_hash_id")
    private Long expressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.position")
    private Integer position;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    public ExpressionListExpressionRelation(Long expressionListHashId, Long expressionHashId, Integer position) {
        this.expressionListHashId = expressionListHashId;
        this.expressionHashId = expressionHashId;
        this.position = position;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    public ExpressionListExpressionRelation() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.expression_list_hash_id")
    public Long getExpressionListHashId() {
        return expressionListHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.expression_list_hash_id")
    public void setExpressionListHashId(Long expressionListHashId) {
        this.expressionListHashId = expressionListHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.expression_hash_id")
    public Long getExpressionHashId() {
        return expressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.expression_hash_id")
    public void setExpressionHashId(Long expressionHashId) {
        this.expressionHashId = expressionHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.position")
    public Integer getPosition() {
        return position;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ExpressionListExpressionRelation other = (ExpressionListExpressionRelation) that;
        return (this.getExpressionListHashId() == null ? other.getExpressionListHashId() == null : this.getExpressionListHashId().equals(other.getExpressionListHashId()))
            && (this.getExpressionHashId() == null ? other.getExpressionHashId() == null : this.getExpressionHashId().equals(other.getExpressionHashId()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpressionListHashId() == null) ? 0 : getExpressionListHashId().hashCode());
        result = prime * result + ((getExpressionHashId() == null) ? 0 : getExpressionHashId().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expressionListHashId=").append(expressionListHashId);
        sb.append(", expressionHashId=").append(expressionHashId);
        sb.append(", position=").append(position);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}