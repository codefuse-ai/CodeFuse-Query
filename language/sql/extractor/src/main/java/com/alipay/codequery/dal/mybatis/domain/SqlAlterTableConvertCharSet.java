package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterTableConvertCharSet implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.charset_oid")
    private Long charsetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.collate_oid")
    private Long collateOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_convert_char_set")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_convert_char_set")
    public SqlAlterTableConvertCharSet(Long oid, Long charsetOid, Long collateOid) {
        this.oid = oid;
        this.charsetOid = charsetOid;
        this.collateOid = collateOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_convert_char_set")
    public SqlAlterTableConvertCharSet() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.charset_oid")
    public Long getCharsetOid() {
        return charsetOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.charset_oid")
    public void setCharsetOid(Long charsetOid) {
        this.charsetOid = charsetOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.collate_oid")
    public Long getCollateOid() {
        return collateOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.collate_oid")
    public void setCollateOid(Long collateOid) {
        this.collateOid = collateOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_convert_char_set")
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
        SqlAlterTableConvertCharSet other = (SqlAlterTableConvertCharSet) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCharsetOid() == null ? other.getCharsetOid() == null : this.getCharsetOid().equals(other.getCharsetOid()))
            && (this.getCollateOid() == null ? other.getCollateOid() == null : this.getCollateOid().equals(other.getCollateOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_convert_char_set")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCharsetOid() == null) ? 0 : getCharsetOid().hashCode());
        result = prime * result + ((getCollateOid() == null) ? 0 : getCollateOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_convert_char_set")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", charsetOid=").append(charsetOid);
        sb.append(", collateOid=").append(collateOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}