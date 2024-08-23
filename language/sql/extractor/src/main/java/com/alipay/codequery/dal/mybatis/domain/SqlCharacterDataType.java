package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCharacterDataType implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.char_set_name")
    private String charSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.char_type")
    private String charType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.collate")
    private String collate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.is_has_binary")
    private Integer isHasBinary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.length")
    private Integer length;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    public SqlCharacterDataType(Long oid, String charSetName, String charType, String collate, Integer isHasBinary, Integer length) {
        this.oid = oid;
        this.charSetName = charSetName;
        this.charType = charType;
        this.collate = collate;
        this.isHasBinary = isHasBinary;
        this.length = length;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    public SqlCharacterDataType() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.char_set_name")
    public String getCharSetName() {
        return charSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.char_set_name")
    public void setCharSetName(String charSetName) {
        this.charSetName = charSetName == null ? null : charSetName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.char_type")
    public String getCharType() {
        return charType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.char_type")
    public void setCharType(String charType) {
        this.charType = charType == null ? null : charType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.collate")
    public String getCollate() {
        return collate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.collate")
    public void setCollate(String collate) {
        this.collate = collate == null ? null : collate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.is_has_binary")
    public Integer getIsHasBinary() {
        return isHasBinary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.is_has_binary")
    public void setIsHasBinary(Integer isHasBinary) {
        this.isHasBinary = isHasBinary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.length")
    public Integer getLength() {
        return length;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.length")
    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
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
        SqlCharacterDataType other = (SqlCharacterDataType) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCharSetName() == null ? other.getCharSetName() == null : this.getCharSetName().equals(other.getCharSetName()))
            && (this.getCharType() == null ? other.getCharType() == null : this.getCharType().equals(other.getCharType()))
            && (this.getCollate() == null ? other.getCollate() == null : this.getCollate().equals(other.getCollate()))
            && (this.getIsHasBinary() == null ? other.getIsHasBinary() == null : this.getIsHasBinary().equals(other.getIsHasBinary()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCharSetName() == null) ? 0 : getCharSetName().hashCode());
        result = prime * result + ((getCharType() == null) ? 0 : getCharType().hashCode());
        result = prime * result + ((getCollate() == null) ? 0 : getCollate().hashCode());
        result = prime * result + ((getIsHasBinary() == null) ? 0 : getIsHasBinary().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", charSetName=").append(charSetName);
        sb.append(", charType=").append(charType);
        sb.append(", collate=").append(collate);
        sb.append(", isHasBinary=").append(isHasBinary);
        sb.append(", length=").append(length);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}