package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterMaterializedViewStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.enable_query_rewrite")
    private Integer enableQueryRewrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_rebuild")
    private Integer isRebuild;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh")
    private Integer isRefresh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_complete")
    private Integer isRefreshComplete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_fast")
    private Integer isRefreshFast;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_force")
    private Integer isRefreshForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_next")
    private Integer isRefreshNext;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_commit")
    private Integer isRefreshOnCommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_demand")
    private Integer isRefreshOnDemand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_over_write")
    private Integer isRefreshOnOverWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_start_with")
    private Integer isRefreshStartWith;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.next_oid")
    private Long nextOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.start_with_oid")
    private Long startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    public SqlAlterMaterializedViewStatement(Long oid, Integer enableQueryRewrite, Integer isRebuild, Integer isRefresh, Integer isRefreshComplete, Integer isRefreshFast, Integer isRefreshForce, Integer isRefreshNext, Integer isRefreshOnCommit, Integer isRefreshOnDemand, Integer isRefreshOnOverWrite, Integer isRefreshStartWith, Long nameOid, Long nextOid, Long startWithOid) {
        this.oid = oid;
        this.enableQueryRewrite = enableQueryRewrite;
        this.isRebuild = isRebuild;
        this.isRefresh = isRefresh;
        this.isRefreshComplete = isRefreshComplete;
        this.isRefreshFast = isRefreshFast;
        this.isRefreshForce = isRefreshForce;
        this.isRefreshNext = isRefreshNext;
        this.isRefreshOnCommit = isRefreshOnCommit;
        this.isRefreshOnDemand = isRefreshOnDemand;
        this.isRefreshOnOverWrite = isRefreshOnOverWrite;
        this.isRefreshStartWith = isRefreshStartWith;
        this.nameOid = nameOid;
        this.nextOid = nextOid;
        this.startWithOid = startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    public SqlAlterMaterializedViewStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.enable_query_rewrite")
    public Integer getEnableQueryRewrite() {
        return enableQueryRewrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.enable_query_rewrite")
    public void setEnableQueryRewrite(Integer enableQueryRewrite) {
        this.enableQueryRewrite = enableQueryRewrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_rebuild")
    public Integer getIsRebuild() {
        return isRebuild;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_rebuild")
    public void setIsRebuild(Integer isRebuild) {
        this.isRebuild = isRebuild;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh")
    public Integer getIsRefresh() {
        return isRefresh;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh")
    public void setIsRefresh(Integer isRefresh) {
        this.isRefresh = isRefresh;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_complete")
    public Integer getIsRefreshComplete() {
        return isRefreshComplete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_complete")
    public void setIsRefreshComplete(Integer isRefreshComplete) {
        this.isRefreshComplete = isRefreshComplete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_fast")
    public Integer getIsRefreshFast() {
        return isRefreshFast;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_fast")
    public void setIsRefreshFast(Integer isRefreshFast) {
        this.isRefreshFast = isRefreshFast;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_force")
    public Integer getIsRefreshForce() {
        return isRefreshForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_force")
    public void setIsRefreshForce(Integer isRefreshForce) {
        this.isRefreshForce = isRefreshForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_next")
    public Integer getIsRefreshNext() {
        return isRefreshNext;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_next")
    public void setIsRefreshNext(Integer isRefreshNext) {
        this.isRefreshNext = isRefreshNext;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_commit")
    public Integer getIsRefreshOnCommit() {
        return isRefreshOnCommit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_commit")
    public void setIsRefreshOnCommit(Integer isRefreshOnCommit) {
        this.isRefreshOnCommit = isRefreshOnCommit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_demand")
    public Integer getIsRefreshOnDemand() {
        return isRefreshOnDemand;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_demand")
    public void setIsRefreshOnDemand(Integer isRefreshOnDemand) {
        this.isRefreshOnDemand = isRefreshOnDemand;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_over_write")
    public Integer getIsRefreshOnOverWrite() {
        return isRefreshOnOverWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_over_write")
    public void setIsRefreshOnOverWrite(Integer isRefreshOnOverWrite) {
        this.isRefreshOnOverWrite = isRefreshOnOverWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_start_with")
    public Integer getIsRefreshStartWith() {
        return isRefreshStartWith;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_start_with")
    public void setIsRefreshStartWith(Integer isRefreshStartWith) {
        this.isRefreshStartWith = isRefreshStartWith;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.next_oid")
    public Long getNextOid() {
        return nextOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.next_oid")
    public void setNextOid(Long nextOid) {
        this.nextOid = nextOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.start_with_oid")
    public Long getStartWithOid() {
        return startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.start_with_oid")
    public void setStartWithOid(Long startWithOid) {
        this.startWithOid = startWithOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
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
        SqlAlterMaterializedViewStatement other = (SqlAlterMaterializedViewStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getEnableQueryRewrite() == null ? other.getEnableQueryRewrite() == null : this.getEnableQueryRewrite().equals(other.getEnableQueryRewrite()))
            && (this.getIsRebuild() == null ? other.getIsRebuild() == null : this.getIsRebuild().equals(other.getIsRebuild()))
            && (this.getIsRefresh() == null ? other.getIsRefresh() == null : this.getIsRefresh().equals(other.getIsRefresh()))
            && (this.getIsRefreshComplete() == null ? other.getIsRefreshComplete() == null : this.getIsRefreshComplete().equals(other.getIsRefreshComplete()))
            && (this.getIsRefreshFast() == null ? other.getIsRefreshFast() == null : this.getIsRefreshFast().equals(other.getIsRefreshFast()))
            && (this.getIsRefreshForce() == null ? other.getIsRefreshForce() == null : this.getIsRefreshForce().equals(other.getIsRefreshForce()))
            && (this.getIsRefreshNext() == null ? other.getIsRefreshNext() == null : this.getIsRefreshNext().equals(other.getIsRefreshNext()))
            && (this.getIsRefreshOnCommit() == null ? other.getIsRefreshOnCommit() == null : this.getIsRefreshOnCommit().equals(other.getIsRefreshOnCommit()))
            && (this.getIsRefreshOnDemand() == null ? other.getIsRefreshOnDemand() == null : this.getIsRefreshOnDemand().equals(other.getIsRefreshOnDemand()))
            && (this.getIsRefreshOnOverWrite() == null ? other.getIsRefreshOnOverWrite() == null : this.getIsRefreshOnOverWrite().equals(other.getIsRefreshOnOverWrite()))
            && (this.getIsRefreshStartWith() == null ? other.getIsRefreshStartWith() == null : this.getIsRefreshStartWith().equals(other.getIsRefreshStartWith()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getNextOid() == null ? other.getNextOid() == null : this.getNextOid().equals(other.getNextOid()))
            && (this.getStartWithOid() == null ? other.getStartWithOid() == null : this.getStartWithOid().equals(other.getStartWithOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getEnableQueryRewrite() == null) ? 0 : getEnableQueryRewrite().hashCode());
        result = prime * result + ((getIsRebuild() == null) ? 0 : getIsRebuild().hashCode());
        result = prime * result + ((getIsRefresh() == null) ? 0 : getIsRefresh().hashCode());
        result = prime * result + ((getIsRefreshComplete() == null) ? 0 : getIsRefreshComplete().hashCode());
        result = prime * result + ((getIsRefreshFast() == null) ? 0 : getIsRefreshFast().hashCode());
        result = prime * result + ((getIsRefreshForce() == null) ? 0 : getIsRefreshForce().hashCode());
        result = prime * result + ((getIsRefreshNext() == null) ? 0 : getIsRefreshNext().hashCode());
        result = prime * result + ((getIsRefreshOnCommit() == null) ? 0 : getIsRefreshOnCommit().hashCode());
        result = prime * result + ((getIsRefreshOnDemand() == null) ? 0 : getIsRefreshOnDemand().hashCode());
        result = prime * result + ((getIsRefreshOnOverWrite() == null) ? 0 : getIsRefreshOnOverWrite().hashCode());
        result = prime * result + ((getIsRefreshStartWith() == null) ? 0 : getIsRefreshStartWith().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getNextOid() == null) ? 0 : getNextOid().hashCode());
        result = prime * result + ((getStartWithOid() == null) ? 0 : getStartWithOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", enableQueryRewrite=").append(enableQueryRewrite);
        sb.append(", isRebuild=").append(isRebuild);
        sb.append(", isRefresh=").append(isRefresh);
        sb.append(", isRefreshComplete=").append(isRefreshComplete);
        sb.append(", isRefreshFast=").append(isRefreshFast);
        sb.append(", isRefreshForce=").append(isRefreshForce);
        sb.append(", isRefreshNext=").append(isRefreshNext);
        sb.append(", isRefreshOnCommit=").append(isRefreshOnCommit);
        sb.append(", isRefreshOnDemand=").append(isRefreshOnDemand);
        sb.append(", isRefreshOnOverWrite=").append(isRefreshOnOverWrite);
        sb.append(", isRefreshStartWith=").append(isRefreshStartWith);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", nextOid=").append(nextOid);
        sb.append(", startWithOid=").append(startWithOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}