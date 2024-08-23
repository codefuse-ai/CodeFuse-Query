package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlInsertStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.hints_size")
    private Integer hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_delayed")
    private Integer isDelayed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_fulltext_dictionary")
    private Integer isFulltextDictionary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_high_priority")
    private Integer isHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_if_not_exists")
    private Integer isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_ignore")
    private Integer isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_low_priority")
    private Integer isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_overwrite")
    private Integer isOverwrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_rollback_on_fail")
    private Integer isRollbackOnFail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    public MySqlInsertStatement(Long oid, Integer hintsSize, Integer isDelayed, Integer isFulltextDictionary, Integer isHighPriority, Integer isIfNotExists, Integer isIgnore, Integer isLowPriority, Integer isOverwrite, Integer isRollbackOnFail) {
        this.oid = oid;
        this.hintsSize = hintsSize;
        this.isDelayed = isDelayed;
        this.isFulltextDictionary = isFulltextDictionary;
        this.isHighPriority = isHighPriority;
        this.isIfNotExists = isIfNotExists;
        this.isIgnore = isIgnore;
        this.isLowPriority = isLowPriority;
        this.isOverwrite = isOverwrite;
        this.isRollbackOnFail = isRollbackOnFail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    public MySqlInsertStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.hints_size")
    public Integer getHintsSize() {
        return hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.hints_size")
    public void setHintsSize(Integer hintsSize) {
        this.hintsSize = hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_delayed")
    public Integer getIsDelayed() {
        return isDelayed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_delayed")
    public void setIsDelayed(Integer isDelayed) {
        this.isDelayed = isDelayed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_fulltext_dictionary")
    public Integer getIsFulltextDictionary() {
        return isFulltextDictionary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_fulltext_dictionary")
    public void setIsFulltextDictionary(Integer isFulltextDictionary) {
        this.isFulltextDictionary = isFulltextDictionary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_high_priority")
    public Integer getIsHighPriority() {
        return isHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_high_priority")
    public void setIsHighPriority(Integer isHighPriority) {
        this.isHighPriority = isHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_if_not_exists")
    public Integer getIsIfNotExists() {
        return isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_if_not_exists")
    public void setIsIfNotExists(Integer isIfNotExists) {
        this.isIfNotExists = isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_ignore")
    public Integer getIsIgnore() {
        return isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_ignore")
    public void setIsIgnore(Integer isIgnore) {
        this.isIgnore = isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_low_priority")
    public Integer getIsLowPriority() {
        return isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_low_priority")
    public void setIsLowPriority(Integer isLowPriority) {
        this.isLowPriority = isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_overwrite")
    public Integer getIsOverwrite() {
        return isOverwrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_overwrite")
    public void setIsOverwrite(Integer isOverwrite) {
        this.isOverwrite = isOverwrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_rollback_on_fail")
    public Integer getIsRollbackOnFail() {
        return isRollbackOnFail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_rollback_on_fail")
    public void setIsRollbackOnFail(Integer isRollbackOnFail) {
        this.isRollbackOnFail = isRollbackOnFail;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
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
        MySqlInsertStatement other = (MySqlInsertStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getHintsSize() == null ? other.getHintsSize() == null : this.getHintsSize().equals(other.getHintsSize()))
            && (this.getIsDelayed() == null ? other.getIsDelayed() == null : this.getIsDelayed().equals(other.getIsDelayed()))
            && (this.getIsFulltextDictionary() == null ? other.getIsFulltextDictionary() == null : this.getIsFulltextDictionary().equals(other.getIsFulltextDictionary()))
            && (this.getIsHighPriority() == null ? other.getIsHighPriority() == null : this.getIsHighPriority().equals(other.getIsHighPriority()))
            && (this.getIsIfNotExists() == null ? other.getIsIfNotExists() == null : this.getIsIfNotExists().equals(other.getIsIfNotExists()))
            && (this.getIsIgnore() == null ? other.getIsIgnore() == null : this.getIsIgnore().equals(other.getIsIgnore()))
            && (this.getIsLowPriority() == null ? other.getIsLowPriority() == null : this.getIsLowPriority().equals(other.getIsLowPriority()))
            && (this.getIsOverwrite() == null ? other.getIsOverwrite() == null : this.getIsOverwrite().equals(other.getIsOverwrite()))
            && (this.getIsRollbackOnFail() == null ? other.getIsRollbackOnFail() == null : this.getIsRollbackOnFail().equals(other.getIsRollbackOnFail()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getHintsSize() == null) ? 0 : getHintsSize().hashCode());
        result = prime * result + ((getIsDelayed() == null) ? 0 : getIsDelayed().hashCode());
        result = prime * result + ((getIsFulltextDictionary() == null) ? 0 : getIsFulltextDictionary().hashCode());
        result = prime * result + ((getIsHighPriority() == null) ? 0 : getIsHighPriority().hashCode());
        result = prime * result + ((getIsIfNotExists() == null) ? 0 : getIsIfNotExists().hashCode());
        result = prime * result + ((getIsIgnore() == null) ? 0 : getIsIgnore().hashCode());
        result = prime * result + ((getIsLowPriority() == null) ? 0 : getIsLowPriority().hashCode());
        result = prime * result + ((getIsOverwrite() == null) ? 0 : getIsOverwrite().hashCode());
        result = prime * result + ((getIsRollbackOnFail() == null) ? 0 : getIsRollbackOnFail().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", hintsSize=").append(hintsSize);
        sb.append(", isDelayed=").append(isDelayed);
        sb.append(", isFulltextDictionary=").append(isFulltextDictionary);
        sb.append(", isHighPriority=").append(isHighPriority);
        sb.append(", isIfNotExists=").append(isIfNotExists);
        sb.append(", isIgnore=").append(isIgnore);
        sb.append(", isLowPriority=").append(isLowPriority);
        sb.append(", isOverwrite=").append(isOverwrite);
        sb.append(", isRollbackOnFail=").append(isRollbackOnFail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}