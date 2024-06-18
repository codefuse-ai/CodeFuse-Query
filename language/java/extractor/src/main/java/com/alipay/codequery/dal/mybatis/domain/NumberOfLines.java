package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class NumberOfLines implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_total_lines")
    private Integer numberOfTotalLines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_valid_lines")
    private Integer numberOfValidLines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_comment_lines")
    private Integer numberOfCommentLines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: number_of_lines")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: number_of_lines")
    public NumberOfLines(Long elementHashId, Integer numberOfTotalLines, Integer numberOfValidLines, Integer numberOfCommentLines) {
        this.elementHashId = elementHashId;
        this.numberOfTotalLines = numberOfTotalLines;
        this.numberOfValidLines = numberOfValidLines;
        this.numberOfCommentLines = numberOfCommentLines;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: number_of_lines")
    public NumberOfLines() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_total_lines")
    public Integer getNumberOfTotalLines() {
        return numberOfTotalLines;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_total_lines")
    public void setNumberOfTotalLines(Integer numberOfTotalLines) {
        this.numberOfTotalLines = numberOfTotalLines;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_valid_lines")
    public Integer getNumberOfValidLines() {
        return numberOfValidLines;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_valid_lines")
    public void setNumberOfValidLines(Integer numberOfValidLines) {
        this.numberOfValidLines = numberOfValidLines;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_comment_lines")
    public Integer getNumberOfCommentLines() {
        return numberOfCommentLines;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_comment_lines")
    public void setNumberOfCommentLines(Integer numberOfCommentLines) {
        this.numberOfCommentLines = numberOfCommentLines;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: number_of_lines")
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
        NumberOfLines other = (NumberOfLines) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getNumberOfTotalLines() == null ? other.getNumberOfTotalLines() == null : this.getNumberOfTotalLines().equals(other.getNumberOfTotalLines()))
            && (this.getNumberOfValidLines() == null ? other.getNumberOfValidLines() == null : this.getNumberOfValidLines().equals(other.getNumberOfValidLines()))
            && (this.getNumberOfCommentLines() == null ? other.getNumberOfCommentLines() == null : this.getNumberOfCommentLines().equals(other.getNumberOfCommentLines()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: number_of_lines")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getNumberOfTotalLines() == null) ? 0 : getNumberOfTotalLines().hashCode());
        result = prime * result + ((getNumberOfValidLines() == null) ? 0 : getNumberOfValidLines().hashCode());
        result = prime * result + ((getNumberOfCommentLines() == null) ? 0 : getNumberOfCommentLines().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: number_of_lines")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", numberOfTotalLines=").append(numberOfTotalLines);
        sb.append(", numberOfValidLines=").append(numberOfValidLines);
        sb.append(", numberOfCommentLines=").append(numberOfCommentLines);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}