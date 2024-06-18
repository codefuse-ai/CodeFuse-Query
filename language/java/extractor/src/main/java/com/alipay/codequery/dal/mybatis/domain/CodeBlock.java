package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class CodeBlock implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.number_of_statement")
    private Integer numberOfStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.parent_hash_id")
    private Long parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.is_empty")
    private Integer isEmpty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.location_hash_id")
    private Long locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.debug_message")
    private String debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: code_block")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: code_block")
    public CodeBlock(Long elementHashId, Integer numberOfStatement, Long parentHashId, Integer isEmpty, Long locationHashId, String debugMessage) {
        this.elementHashId = elementHashId;
        this.numberOfStatement = numberOfStatement;
        this.parentHashId = parentHashId;
        this.isEmpty = isEmpty;
        this.locationHashId = locationHashId;
        this.debugMessage = debugMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: code_block")
    public CodeBlock() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.number_of_statement")
    public Integer getNumberOfStatement() {
        return numberOfStatement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.number_of_statement")
    public void setNumberOfStatement(Integer numberOfStatement) {
        this.numberOfStatement = numberOfStatement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.parent_hash_id")
    public Long getParentHashId() {
        return parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.parent_hash_id")
    public void setParentHashId(Long parentHashId) {
        this.parentHashId = parentHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.is_empty")
    public Integer getIsEmpty() {
        return isEmpty;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.is_empty")
    public void setIsEmpty(Integer isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.location_hash_id")
    public Long getLocationHashId() {
        return locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.location_hash_id")
    public void setLocationHashId(Long locationHashId) {
        this.locationHashId = locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.debug_message")
    public String getDebugMessage() {
        return debugMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.debug_message")
    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage == null ? null : debugMessage.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: code_block")
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
        CodeBlock other = (CodeBlock) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getNumberOfStatement() == null ? other.getNumberOfStatement() == null : this.getNumberOfStatement().equals(other.getNumberOfStatement()))
            && (this.getParentHashId() == null ? other.getParentHashId() == null : this.getParentHashId().equals(other.getParentHashId()))
            && (this.getIsEmpty() == null ? other.getIsEmpty() == null : this.getIsEmpty().equals(other.getIsEmpty()))
            && (this.getLocationHashId() == null ? other.getLocationHashId() == null : this.getLocationHashId().equals(other.getLocationHashId()))
            && (this.getDebugMessage() == null ? other.getDebugMessage() == null : this.getDebugMessage().equals(other.getDebugMessage()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: code_block")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getNumberOfStatement() == null) ? 0 : getNumberOfStatement().hashCode());
        result = prime * result + ((getParentHashId() == null) ? 0 : getParentHashId().hashCode());
        result = prime * result + ((getIsEmpty() == null) ? 0 : getIsEmpty().hashCode());
        result = prime * result + ((getLocationHashId() == null) ? 0 : getLocationHashId().hashCode());
        result = prime * result + ((getDebugMessage() == null) ? 0 : getDebugMessage().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: code_block")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", numberOfStatement=").append(numberOfStatement);
        sb.append(", parentHashId=").append(parentHashId);
        sb.append(", isEmpty=").append(isEmpty);
        sb.append(", locationHashId=").append(locationHashId);
        sb.append(", debugMessage=").append(debugMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}