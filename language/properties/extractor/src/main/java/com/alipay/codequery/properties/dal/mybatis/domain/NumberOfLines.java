package com.alipay.codequery.properties.dal.mybatis.domain;

import javax.persistence.*;

@Table(name = "number_of_lines")
public class NumberOfLines {
    @Column(name = "element_oid")
    private Long elementOid;

    @Column(name = "number_of_lines")
    private Integer numberOfLines;

    @Column(name = "number_of_valid_lines")
    private Integer numberOfValidLines;

    @Column(name = "number_of_comment_lines")
    private Integer numberOfCommentLines;

    public NumberOfLines(Long elementOid, Integer numberOfLines, Integer numberOfValidLines, Integer numberOfCommentLines) {
        this.elementOid = elementOid;
        this.numberOfLines = numberOfLines;
        this.numberOfValidLines = numberOfValidLines;
        this.numberOfCommentLines = numberOfCommentLines;
    }

    public NumberOfLines() {
        super();
    }

    /**
     * @return element_oid
     */
    public Long getElementOid() {
        return elementOid;
    }

    /**
     * @param elementOid
     */
    public void setElementOid(Long elementOid) {
        this.elementOid = elementOid;
    }

    /**
     * @return number_of_lines
     */
    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    /**
     * @param numberOfLines
     */
    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    /**
     * @return number_of_valid_lines
     */
    public Integer getNumberOfValidLines() {
        return numberOfValidLines;
    }

    /**
     * @param numberOfValidLines
     */
    public void setNumberOfValidLines(Integer numberOfValidLines) {
        this.numberOfValidLines = numberOfValidLines;
    }

    /**
     * @return number_of_comment_lines
     */
    public Integer getNumberOfCommentLines() {
        return numberOfCommentLines;
    }

    /**
     * @param numberOfCommentLines
     */
    public void setNumberOfCommentLines(Integer numberOfCommentLines) {
        this.numberOfCommentLines = numberOfCommentLines;
    }
}