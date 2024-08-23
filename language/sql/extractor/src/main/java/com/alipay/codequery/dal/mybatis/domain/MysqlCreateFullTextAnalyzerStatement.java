package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MysqlCreateFullTextAnalyzerStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.charfilters")
    private String charfilters;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.tokenizer")
    private String tokenizer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.tokenizers")
    private String tokenizers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    public MysqlCreateFullTextAnalyzerStatement(Long oid, String charfilters, Long nameOid, String tokenizer, String tokenizers) {
        this.oid = oid;
        this.charfilters = charfilters;
        this.nameOid = nameOid;
        this.tokenizer = tokenizer;
        this.tokenizers = tokenizers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    public MysqlCreateFullTextAnalyzerStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.charfilters")
    public String getCharfilters() {
        return charfilters;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.charfilters")
    public void setCharfilters(String charfilters) {
        this.charfilters = charfilters == null ? null : charfilters.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.tokenizer")
    public String getTokenizer() {
        return tokenizer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.tokenizer")
    public void setTokenizer(String tokenizer) {
        this.tokenizer = tokenizer == null ? null : tokenizer.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.tokenizers")
    public String getTokenizers() {
        return tokenizers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.tokenizers")
    public void setTokenizers(String tokenizers) {
        this.tokenizers = tokenizers == null ? null : tokenizers.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
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
        MysqlCreateFullTextAnalyzerStatement other = (MysqlCreateFullTextAnalyzerStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCharfilters() == null ? other.getCharfilters() == null : this.getCharfilters().equals(other.getCharfilters()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getTokenizer() == null ? other.getTokenizer() == null : this.getTokenizer().equals(other.getTokenizer()))
            && (this.getTokenizers() == null ? other.getTokenizers() == null : this.getTokenizers().equals(other.getTokenizers()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCharfilters() == null) ? 0 : getCharfilters().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getTokenizer() == null) ? 0 : getTokenizer().hashCode());
        result = prime * result + ((getTokenizers() == null) ? 0 : getTokenizers().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", charfilters=").append(charfilters);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", tokenizer=").append(tokenizer);
        sb.append(", tokenizers=").append(tokenizers);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}