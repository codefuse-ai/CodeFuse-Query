package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlOptimizeStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.cluster_oid")
    private Long clusterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.deduplicate_by_oid")
    private Long deduplicateByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.is_deduplicate")
    private Integer isDeduplicate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.is_final")
    private Integer isFinal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    public SqlOptimizeStatement(Long oid, Long clusterOid, Long deduplicateByOid, Integer isDeduplicate, Integer isFinal) {
        this.oid = oid;
        this.clusterOid = clusterOid;
        this.deduplicateByOid = deduplicateByOid;
        this.isDeduplicate = isDeduplicate;
        this.isFinal = isFinal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    public SqlOptimizeStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.cluster_oid")
    public Long getClusterOid() {
        return clusterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.cluster_oid")
    public void setClusterOid(Long clusterOid) {
        this.clusterOid = clusterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.deduplicate_by_oid")
    public Long getDeduplicateByOid() {
        return deduplicateByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.deduplicate_by_oid")
    public void setDeduplicateByOid(Long deduplicateByOid) {
        this.deduplicateByOid = deduplicateByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.is_deduplicate")
    public Integer getIsDeduplicate() {
        return isDeduplicate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.is_deduplicate")
    public void setIsDeduplicate(Integer isDeduplicate) {
        this.isDeduplicate = isDeduplicate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.is_final")
    public Integer getIsFinal() {
        return isFinal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.is_final")
    public void setIsFinal(Integer isFinal) {
        this.isFinal = isFinal;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
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
        SqlOptimizeStatement other = (SqlOptimizeStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getClusterOid() == null ? other.getClusterOid() == null : this.getClusterOid().equals(other.getClusterOid()))
            && (this.getDeduplicateByOid() == null ? other.getDeduplicateByOid() == null : this.getDeduplicateByOid().equals(other.getDeduplicateByOid()))
            && (this.getIsDeduplicate() == null ? other.getIsDeduplicate() == null : this.getIsDeduplicate().equals(other.getIsDeduplicate()))
            && (this.getIsFinal() == null ? other.getIsFinal() == null : this.getIsFinal().equals(other.getIsFinal()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getClusterOid() == null) ? 0 : getClusterOid().hashCode());
        result = prime * result + ((getDeduplicateByOid() == null) ? 0 : getDeduplicateByOid().hashCode());
        result = prime * result + ((getIsDeduplicate() == null) ? 0 : getIsDeduplicate().hashCode());
        result = prime * result + ((getIsFinal() == null) ? 0 : getIsFinal().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", clusterOid=").append(clusterOid);
        sb.append(", deduplicateByOid=").append(deduplicateByOid);
        sb.append(", isDeduplicate=").append(isDeduplicate);
        sb.append(", isFinal=").append(isFinal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}