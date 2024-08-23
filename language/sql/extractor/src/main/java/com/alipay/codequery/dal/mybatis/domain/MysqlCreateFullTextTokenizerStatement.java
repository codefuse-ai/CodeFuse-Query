package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MysqlCreateFullTextTokenizerStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.type_name_oid")
    private Long typeNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.user_defined_dict_oid")
    private Long userDefinedDictOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_tokenizer_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_tokenizer_statement")
    public MysqlCreateFullTextTokenizerStatement(Long oid, Long nameOid, Long typeNameOid, Long userDefinedDictOid) {
        this.oid = oid;
        this.nameOid = nameOid;
        this.typeNameOid = typeNameOid;
        this.userDefinedDictOid = userDefinedDictOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_tokenizer_statement")
    public MysqlCreateFullTextTokenizerStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.type_name_oid")
    public Long getTypeNameOid() {
        return typeNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.type_name_oid")
    public void setTypeNameOid(Long typeNameOid) {
        this.typeNameOid = typeNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.user_defined_dict_oid")
    public Long getUserDefinedDictOid() {
        return userDefinedDictOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.user_defined_dict_oid")
    public void setUserDefinedDictOid(Long userDefinedDictOid) {
        this.userDefinedDictOid = userDefinedDictOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_tokenizer_statement")
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
        MysqlCreateFullTextTokenizerStatement other = (MysqlCreateFullTextTokenizerStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getTypeNameOid() == null ? other.getTypeNameOid() == null : this.getTypeNameOid().equals(other.getTypeNameOid()))
            && (this.getUserDefinedDictOid() == null ? other.getUserDefinedDictOid() == null : this.getUserDefinedDictOid().equals(other.getUserDefinedDictOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_tokenizer_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getTypeNameOid() == null) ? 0 : getTypeNameOid().hashCode());
        result = prime * result + ((getUserDefinedDictOid() == null) ? 0 : getUserDefinedDictOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_tokenizer_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", typeNameOid=").append(typeNameOid);
        sb.append(", userDefinedDictOid=").append(userDefinedDictOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}