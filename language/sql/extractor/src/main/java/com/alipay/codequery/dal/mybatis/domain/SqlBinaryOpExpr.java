package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlBinaryOpExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_both_name")
    private Integer isBothName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_function_and_right_literal")
    private Integer isLeftFunctionAndRightLiteral;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_literal_and_right_name")
    private Integer isLeftLiteralAndRightName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_name_and_right_literal")
    private Integer isLeftNameAndRightLiteral;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_name_and_literal")
    private Integer isNameAndLiteral;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_parenthesized")
    private Integer isParenthesized;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.left_oid")
    private Long leftOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.operator")
    private String operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.right_oid")
    private Long rightOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    public SqlBinaryOpExpr(Long oid, Integer isBothName, Integer isLeftFunctionAndRightLiteral, Integer isLeftLiteralAndRightName, Integer isLeftNameAndRightLiteral, Integer isNameAndLiteral, Integer isParenthesized, Long leftOid, String operator, Long rightOid) {
        this.oid = oid;
        this.isBothName = isBothName;
        this.isLeftFunctionAndRightLiteral = isLeftFunctionAndRightLiteral;
        this.isLeftLiteralAndRightName = isLeftLiteralAndRightName;
        this.isLeftNameAndRightLiteral = isLeftNameAndRightLiteral;
        this.isNameAndLiteral = isNameAndLiteral;
        this.isParenthesized = isParenthesized;
        this.leftOid = leftOid;
        this.operator = operator;
        this.rightOid = rightOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    public SqlBinaryOpExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_both_name")
    public Integer getIsBothName() {
        return isBothName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_both_name")
    public void setIsBothName(Integer isBothName) {
        this.isBothName = isBothName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_function_and_right_literal")
    public Integer getIsLeftFunctionAndRightLiteral() {
        return isLeftFunctionAndRightLiteral;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_function_and_right_literal")
    public void setIsLeftFunctionAndRightLiteral(Integer isLeftFunctionAndRightLiteral) {
        this.isLeftFunctionAndRightLiteral = isLeftFunctionAndRightLiteral;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_literal_and_right_name")
    public Integer getIsLeftLiteralAndRightName() {
        return isLeftLiteralAndRightName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_literal_and_right_name")
    public void setIsLeftLiteralAndRightName(Integer isLeftLiteralAndRightName) {
        this.isLeftLiteralAndRightName = isLeftLiteralAndRightName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_name_and_right_literal")
    public Integer getIsLeftNameAndRightLiteral() {
        return isLeftNameAndRightLiteral;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_name_and_right_literal")
    public void setIsLeftNameAndRightLiteral(Integer isLeftNameAndRightLiteral) {
        this.isLeftNameAndRightLiteral = isLeftNameAndRightLiteral;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_name_and_literal")
    public Integer getIsNameAndLiteral() {
        return isNameAndLiteral;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_name_and_literal")
    public void setIsNameAndLiteral(Integer isNameAndLiteral) {
        this.isNameAndLiteral = isNameAndLiteral;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_parenthesized")
    public Integer getIsParenthesized() {
        return isParenthesized;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_parenthesized")
    public void setIsParenthesized(Integer isParenthesized) {
        this.isParenthesized = isParenthesized;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.left_oid")
    public Long getLeftOid() {
        return leftOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.left_oid")
    public void setLeftOid(Long leftOid) {
        this.leftOid = leftOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.operator")
    public String getOperator() {
        return operator;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.operator")
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.right_oid")
    public Long getRightOid() {
        return rightOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.right_oid")
    public void setRightOid(Long rightOid) {
        this.rightOid = rightOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
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
        SqlBinaryOpExpr other = (SqlBinaryOpExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsBothName() == null ? other.getIsBothName() == null : this.getIsBothName().equals(other.getIsBothName()))
            && (this.getIsLeftFunctionAndRightLiteral() == null ? other.getIsLeftFunctionAndRightLiteral() == null : this.getIsLeftFunctionAndRightLiteral().equals(other.getIsLeftFunctionAndRightLiteral()))
            && (this.getIsLeftLiteralAndRightName() == null ? other.getIsLeftLiteralAndRightName() == null : this.getIsLeftLiteralAndRightName().equals(other.getIsLeftLiteralAndRightName()))
            && (this.getIsLeftNameAndRightLiteral() == null ? other.getIsLeftNameAndRightLiteral() == null : this.getIsLeftNameAndRightLiteral().equals(other.getIsLeftNameAndRightLiteral()))
            && (this.getIsNameAndLiteral() == null ? other.getIsNameAndLiteral() == null : this.getIsNameAndLiteral().equals(other.getIsNameAndLiteral()))
            && (this.getIsParenthesized() == null ? other.getIsParenthesized() == null : this.getIsParenthesized().equals(other.getIsParenthesized()))
            && (this.getLeftOid() == null ? other.getLeftOid() == null : this.getLeftOid().equals(other.getLeftOid()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getRightOid() == null ? other.getRightOid() == null : this.getRightOid().equals(other.getRightOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsBothName() == null) ? 0 : getIsBothName().hashCode());
        result = prime * result + ((getIsLeftFunctionAndRightLiteral() == null) ? 0 : getIsLeftFunctionAndRightLiteral().hashCode());
        result = prime * result + ((getIsLeftLiteralAndRightName() == null) ? 0 : getIsLeftLiteralAndRightName().hashCode());
        result = prime * result + ((getIsLeftNameAndRightLiteral() == null) ? 0 : getIsLeftNameAndRightLiteral().hashCode());
        result = prime * result + ((getIsNameAndLiteral() == null) ? 0 : getIsNameAndLiteral().hashCode());
        result = prime * result + ((getIsParenthesized() == null) ? 0 : getIsParenthesized().hashCode());
        result = prime * result + ((getLeftOid() == null) ? 0 : getLeftOid().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getRightOid() == null) ? 0 : getRightOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isBothName=").append(isBothName);
        sb.append(", isLeftFunctionAndRightLiteral=").append(isLeftFunctionAndRightLiteral);
        sb.append(", isLeftLiteralAndRightName=").append(isLeftLiteralAndRightName);
        sb.append(", isLeftNameAndRightLiteral=").append(isLeftNameAndRightLiteral);
        sb.append(", isNameAndLiteral=").append(isNameAndLiteral);
        sb.append(", isParenthesized=").append(isParenthesized);
        sb.append(", leftOid=").append(leftOid);
        sb.append(", operator=").append(operator);
        sb.append(", rightOid=").append(rightOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}