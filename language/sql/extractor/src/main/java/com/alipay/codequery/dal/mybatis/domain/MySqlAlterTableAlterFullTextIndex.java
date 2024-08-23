package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlAlterTableAlterFullTextIndex implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.analyzer_name_oid")
    private Long analyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.analyzer_type")
    private String analyzerType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.index_name_oid")
    private Long indexNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    public MySqlAlterTableAlterFullTextIndex(Long oid, Long analyzerNameOid, String analyzerType, Long indexNameOid) {
        this.oid = oid;
        this.analyzerNameOid = analyzerNameOid;
        this.analyzerType = analyzerType;
        this.indexNameOid = indexNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    public MySqlAlterTableAlterFullTextIndex() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.analyzer_name_oid")
    public Long getAnalyzerNameOid() {
        return analyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.analyzer_name_oid")
    public void setAnalyzerNameOid(Long analyzerNameOid) {
        this.analyzerNameOid = analyzerNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.analyzer_type")
    public String getAnalyzerType() {
        return analyzerType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.analyzer_type")
    public void setAnalyzerType(String analyzerType) {
        this.analyzerType = analyzerType == null ? null : analyzerType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.index_name_oid")
    public Long getIndexNameOid() {
        return indexNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.index_name_oid")
    public void setIndexNameOid(Long indexNameOid) {
        this.indexNameOid = indexNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
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
        MySqlAlterTableAlterFullTextIndex other = (MySqlAlterTableAlterFullTextIndex) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAnalyzerNameOid() == null ? other.getAnalyzerNameOid() == null : this.getAnalyzerNameOid().equals(other.getAnalyzerNameOid()))
            && (this.getAnalyzerType() == null ? other.getAnalyzerType() == null : this.getAnalyzerType().equals(other.getAnalyzerType()))
            && (this.getIndexNameOid() == null ? other.getIndexNameOid() == null : this.getIndexNameOid().equals(other.getIndexNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAnalyzerNameOid() == null) ? 0 : getAnalyzerNameOid().hashCode());
        result = prime * result + ((getAnalyzerType() == null) ? 0 : getAnalyzerType().hashCode());
        result = prime * result + ((getIndexNameOid() == null) ? 0 : getIndexNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", analyzerNameOid=").append(analyzerNameOid);
        sb.append(", analyzerType=").append(analyzerType);
        sb.append(", indexNameOid=").append(indexNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}