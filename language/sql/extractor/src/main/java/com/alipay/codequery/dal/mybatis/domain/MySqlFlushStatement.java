package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlFlushStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_binary_logs")
    private Integer isBinaryLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_des_key_file")
    private Integer isDesKeyFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_engine_logs")
    private Integer isEngineLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_error_logs")
    private Integer isErrorLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_for_export")
    private Integer isForExport;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_general_logs")
    private Integer isGeneralLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_hots")
    private Integer isHots;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_local")
    private Integer isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_logs")
    private Integer isLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_master")
    private Integer isMaster;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_no_write_to_binlog")
    private Integer isNoWriteToBinlog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_optimizer_costs")
    private Integer isOptimizerCosts;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_privileges")
    private Integer isPrivileges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_query_cache")
    private Integer isQueryCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_relay_logs")
    private Integer isRelayLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_slow_logs")
    private Integer isSlowLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_status")
    private Integer isStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_table_option")
    private Integer isTableOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_user_resources")
    private Integer isUserResources;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_with_read_lock")
    private Integer isWithReadLock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.relay_logs_for_channel_oid")
    private Long relayLogsForChannelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.version_oid")
    private Long versionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    public MySqlFlushStatement(Long oid, Integer isBinaryLogs, Integer isDesKeyFile, Integer isEngineLogs, Integer isErrorLogs, Integer isForExport, Integer isGeneralLogs, Integer isHots, Integer isLocal, Integer isLogs, Integer isMaster, Integer isNoWriteToBinlog, Integer isOptimizerCosts, Integer isPrivileges, Integer isQueryCache, Integer isRelayLogs, Integer isSlowLogs, Integer isStatus, Integer isTableOption, Integer isUserResources, Integer isWithReadLock, Long relayLogsForChannelOid, Long versionOid) {
        this.oid = oid;
        this.isBinaryLogs = isBinaryLogs;
        this.isDesKeyFile = isDesKeyFile;
        this.isEngineLogs = isEngineLogs;
        this.isErrorLogs = isErrorLogs;
        this.isForExport = isForExport;
        this.isGeneralLogs = isGeneralLogs;
        this.isHots = isHots;
        this.isLocal = isLocal;
        this.isLogs = isLogs;
        this.isMaster = isMaster;
        this.isNoWriteToBinlog = isNoWriteToBinlog;
        this.isOptimizerCosts = isOptimizerCosts;
        this.isPrivileges = isPrivileges;
        this.isQueryCache = isQueryCache;
        this.isRelayLogs = isRelayLogs;
        this.isSlowLogs = isSlowLogs;
        this.isStatus = isStatus;
        this.isTableOption = isTableOption;
        this.isUserResources = isUserResources;
        this.isWithReadLock = isWithReadLock;
        this.relayLogsForChannelOid = relayLogsForChannelOid;
        this.versionOid = versionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    public MySqlFlushStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_binary_logs")
    public Integer getIsBinaryLogs() {
        return isBinaryLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_binary_logs")
    public void setIsBinaryLogs(Integer isBinaryLogs) {
        this.isBinaryLogs = isBinaryLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_des_key_file")
    public Integer getIsDesKeyFile() {
        return isDesKeyFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_des_key_file")
    public void setIsDesKeyFile(Integer isDesKeyFile) {
        this.isDesKeyFile = isDesKeyFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_engine_logs")
    public Integer getIsEngineLogs() {
        return isEngineLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_engine_logs")
    public void setIsEngineLogs(Integer isEngineLogs) {
        this.isEngineLogs = isEngineLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_error_logs")
    public Integer getIsErrorLogs() {
        return isErrorLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_error_logs")
    public void setIsErrorLogs(Integer isErrorLogs) {
        this.isErrorLogs = isErrorLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_for_export")
    public Integer getIsForExport() {
        return isForExport;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_for_export")
    public void setIsForExport(Integer isForExport) {
        this.isForExport = isForExport;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_general_logs")
    public Integer getIsGeneralLogs() {
        return isGeneralLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_general_logs")
    public void setIsGeneralLogs(Integer isGeneralLogs) {
        this.isGeneralLogs = isGeneralLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_hots")
    public Integer getIsHots() {
        return isHots;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_hots")
    public void setIsHots(Integer isHots) {
        this.isHots = isHots;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_local")
    public Integer getIsLocal() {
        return isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_local")
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_logs")
    public Integer getIsLogs() {
        return isLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_logs")
    public void setIsLogs(Integer isLogs) {
        this.isLogs = isLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_master")
    public Integer getIsMaster() {
        return isMaster;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_master")
    public void setIsMaster(Integer isMaster) {
        this.isMaster = isMaster;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_no_write_to_binlog")
    public Integer getIsNoWriteToBinlog() {
        return isNoWriteToBinlog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_no_write_to_binlog")
    public void setIsNoWriteToBinlog(Integer isNoWriteToBinlog) {
        this.isNoWriteToBinlog = isNoWriteToBinlog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_optimizer_costs")
    public Integer getIsOptimizerCosts() {
        return isOptimizerCosts;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_optimizer_costs")
    public void setIsOptimizerCosts(Integer isOptimizerCosts) {
        this.isOptimizerCosts = isOptimizerCosts;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_privileges")
    public Integer getIsPrivileges() {
        return isPrivileges;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_privileges")
    public void setIsPrivileges(Integer isPrivileges) {
        this.isPrivileges = isPrivileges;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_query_cache")
    public Integer getIsQueryCache() {
        return isQueryCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_query_cache")
    public void setIsQueryCache(Integer isQueryCache) {
        this.isQueryCache = isQueryCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_relay_logs")
    public Integer getIsRelayLogs() {
        return isRelayLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_relay_logs")
    public void setIsRelayLogs(Integer isRelayLogs) {
        this.isRelayLogs = isRelayLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_slow_logs")
    public Integer getIsSlowLogs() {
        return isSlowLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_slow_logs")
    public void setIsSlowLogs(Integer isSlowLogs) {
        this.isSlowLogs = isSlowLogs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_status")
    public Integer getIsStatus() {
        return isStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_status")
    public void setIsStatus(Integer isStatus) {
        this.isStatus = isStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_table_option")
    public Integer getIsTableOption() {
        return isTableOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_table_option")
    public void setIsTableOption(Integer isTableOption) {
        this.isTableOption = isTableOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_user_resources")
    public Integer getIsUserResources() {
        return isUserResources;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_user_resources")
    public void setIsUserResources(Integer isUserResources) {
        this.isUserResources = isUserResources;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_with_read_lock")
    public Integer getIsWithReadLock() {
        return isWithReadLock;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_with_read_lock")
    public void setIsWithReadLock(Integer isWithReadLock) {
        this.isWithReadLock = isWithReadLock;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.relay_logs_for_channel_oid")
    public Long getRelayLogsForChannelOid() {
        return relayLogsForChannelOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.relay_logs_for_channel_oid")
    public void setRelayLogsForChannelOid(Long relayLogsForChannelOid) {
        this.relayLogsForChannelOid = relayLogsForChannelOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.version_oid")
    public Long getVersionOid() {
        return versionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.version_oid")
    public void setVersionOid(Long versionOid) {
        this.versionOid = versionOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
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
        MySqlFlushStatement other = (MySqlFlushStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsBinaryLogs() == null ? other.getIsBinaryLogs() == null : this.getIsBinaryLogs().equals(other.getIsBinaryLogs()))
            && (this.getIsDesKeyFile() == null ? other.getIsDesKeyFile() == null : this.getIsDesKeyFile().equals(other.getIsDesKeyFile()))
            && (this.getIsEngineLogs() == null ? other.getIsEngineLogs() == null : this.getIsEngineLogs().equals(other.getIsEngineLogs()))
            && (this.getIsErrorLogs() == null ? other.getIsErrorLogs() == null : this.getIsErrorLogs().equals(other.getIsErrorLogs()))
            && (this.getIsForExport() == null ? other.getIsForExport() == null : this.getIsForExport().equals(other.getIsForExport()))
            && (this.getIsGeneralLogs() == null ? other.getIsGeneralLogs() == null : this.getIsGeneralLogs().equals(other.getIsGeneralLogs()))
            && (this.getIsHots() == null ? other.getIsHots() == null : this.getIsHots().equals(other.getIsHots()))
            && (this.getIsLocal() == null ? other.getIsLocal() == null : this.getIsLocal().equals(other.getIsLocal()))
            && (this.getIsLogs() == null ? other.getIsLogs() == null : this.getIsLogs().equals(other.getIsLogs()))
            && (this.getIsMaster() == null ? other.getIsMaster() == null : this.getIsMaster().equals(other.getIsMaster()))
            && (this.getIsNoWriteToBinlog() == null ? other.getIsNoWriteToBinlog() == null : this.getIsNoWriteToBinlog().equals(other.getIsNoWriteToBinlog()))
            && (this.getIsOptimizerCosts() == null ? other.getIsOptimizerCosts() == null : this.getIsOptimizerCosts().equals(other.getIsOptimizerCosts()))
            && (this.getIsPrivileges() == null ? other.getIsPrivileges() == null : this.getIsPrivileges().equals(other.getIsPrivileges()))
            && (this.getIsQueryCache() == null ? other.getIsQueryCache() == null : this.getIsQueryCache().equals(other.getIsQueryCache()))
            && (this.getIsRelayLogs() == null ? other.getIsRelayLogs() == null : this.getIsRelayLogs().equals(other.getIsRelayLogs()))
            && (this.getIsSlowLogs() == null ? other.getIsSlowLogs() == null : this.getIsSlowLogs().equals(other.getIsSlowLogs()))
            && (this.getIsStatus() == null ? other.getIsStatus() == null : this.getIsStatus().equals(other.getIsStatus()))
            && (this.getIsTableOption() == null ? other.getIsTableOption() == null : this.getIsTableOption().equals(other.getIsTableOption()))
            && (this.getIsUserResources() == null ? other.getIsUserResources() == null : this.getIsUserResources().equals(other.getIsUserResources()))
            && (this.getIsWithReadLock() == null ? other.getIsWithReadLock() == null : this.getIsWithReadLock().equals(other.getIsWithReadLock()))
            && (this.getRelayLogsForChannelOid() == null ? other.getRelayLogsForChannelOid() == null : this.getRelayLogsForChannelOid().equals(other.getRelayLogsForChannelOid()))
            && (this.getVersionOid() == null ? other.getVersionOid() == null : this.getVersionOid().equals(other.getVersionOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsBinaryLogs() == null) ? 0 : getIsBinaryLogs().hashCode());
        result = prime * result + ((getIsDesKeyFile() == null) ? 0 : getIsDesKeyFile().hashCode());
        result = prime * result + ((getIsEngineLogs() == null) ? 0 : getIsEngineLogs().hashCode());
        result = prime * result + ((getIsErrorLogs() == null) ? 0 : getIsErrorLogs().hashCode());
        result = prime * result + ((getIsForExport() == null) ? 0 : getIsForExport().hashCode());
        result = prime * result + ((getIsGeneralLogs() == null) ? 0 : getIsGeneralLogs().hashCode());
        result = prime * result + ((getIsHots() == null) ? 0 : getIsHots().hashCode());
        result = prime * result + ((getIsLocal() == null) ? 0 : getIsLocal().hashCode());
        result = prime * result + ((getIsLogs() == null) ? 0 : getIsLogs().hashCode());
        result = prime * result + ((getIsMaster() == null) ? 0 : getIsMaster().hashCode());
        result = prime * result + ((getIsNoWriteToBinlog() == null) ? 0 : getIsNoWriteToBinlog().hashCode());
        result = prime * result + ((getIsOptimizerCosts() == null) ? 0 : getIsOptimizerCosts().hashCode());
        result = prime * result + ((getIsPrivileges() == null) ? 0 : getIsPrivileges().hashCode());
        result = prime * result + ((getIsQueryCache() == null) ? 0 : getIsQueryCache().hashCode());
        result = prime * result + ((getIsRelayLogs() == null) ? 0 : getIsRelayLogs().hashCode());
        result = prime * result + ((getIsSlowLogs() == null) ? 0 : getIsSlowLogs().hashCode());
        result = prime * result + ((getIsStatus() == null) ? 0 : getIsStatus().hashCode());
        result = prime * result + ((getIsTableOption() == null) ? 0 : getIsTableOption().hashCode());
        result = prime * result + ((getIsUserResources() == null) ? 0 : getIsUserResources().hashCode());
        result = prime * result + ((getIsWithReadLock() == null) ? 0 : getIsWithReadLock().hashCode());
        result = prime * result + ((getRelayLogsForChannelOid() == null) ? 0 : getRelayLogsForChannelOid().hashCode());
        result = prime * result + ((getVersionOid() == null) ? 0 : getVersionOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isBinaryLogs=").append(isBinaryLogs);
        sb.append(", isDesKeyFile=").append(isDesKeyFile);
        sb.append(", isEngineLogs=").append(isEngineLogs);
        sb.append(", isErrorLogs=").append(isErrorLogs);
        sb.append(", isForExport=").append(isForExport);
        sb.append(", isGeneralLogs=").append(isGeneralLogs);
        sb.append(", isHots=").append(isHots);
        sb.append(", isLocal=").append(isLocal);
        sb.append(", isLogs=").append(isLogs);
        sb.append(", isMaster=").append(isMaster);
        sb.append(", isNoWriteToBinlog=").append(isNoWriteToBinlog);
        sb.append(", isOptimizerCosts=").append(isOptimizerCosts);
        sb.append(", isPrivileges=").append(isPrivileges);
        sb.append(", isQueryCache=").append(isQueryCache);
        sb.append(", isRelayLogs=").append(isRelayLogs);
        sb.append(", isSlowLogs=").append(isSlowLogs);
        sb.append(", isStatus=").append(isStatus);
        sb.append(", isTableOption=").append(isTableOption);
        sb.append(", isUserResources=").append(isUserResources);
        sb.append(", isWithReadLock=").append(isWithReadLock);
        sb.append(", relayLogsForChannelOid=").append(relayLogsForChannelOid);
        sb.append(", versionOid=").append(versionOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}