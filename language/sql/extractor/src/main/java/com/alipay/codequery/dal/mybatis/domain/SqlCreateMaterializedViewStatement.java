package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCreateMaterializedViewStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.cache")
    private Integer cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.compress")
    private Integer compress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.compress_level")
    private Integer compressLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.distributed_by_type_oid")
    private Long distributedByTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.enable_query_rewrite")
    private Integer enableQueryRewrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.free_lists")
    private Integer freeLists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.initrans")
    private Integer initrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_build_deferred")
    private Integer isBuildDeferred;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_build_immediate")
    private Integer isBuildImmediate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_compress_for_oltp")
    private Integer isCompressForOltp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_if_not_exists")
    private Integer isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh")
    private Integer isRefresh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_complete")
    private Integer isRefreshComplete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_fast")
    private Integer isRefreshFast;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_force")
    private Integer isRefreshForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_next")
    private Integer isRefreshNext;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_commit")
    private Integer isRefreshOnCommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_demand")
    private Integer isRefreshOnDemand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_over_write")
    private Integer isRefreshOnOverWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_start_with")
    private Integer isRefreshStartWith;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_with_row_id")
    private Integer isWithRowId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.lify_cycle_oid")
    private Long lifyCycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.logging")
    private Integer logging;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.maxtrans")
    private Integer maxtrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.next_oid")
    private Long nextOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.parallel")
    private Integer parallel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.parallel_value")
    private Integer parallelValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.partition_by_oid")
    private Long partitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctfree")
    private Integer pctfree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctincrease")
    private Integer pctincrease;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctthreshold")
    private Integer pctthreshold;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctused")
    private Integer pctused;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.query_oid")
    private Long queryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.start_with_oid")
    private Long startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.storage")
    private String storage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.tablespace_oid")
    private Long tablespaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    public SqlCreateMaterializedViewStatement(Long oid, Integer cache, Long commentOid, Integer compress, Integer compressLevel, Long distributedByTypeOid, Integer enableQueryRewrite, Integer freeLists, Integer initrans, Integer isBuildDeferred, Integer isBuildImmediate, Integer isCompressForOltp, Integer isIfNotExists, Integer isRefresh, Integer isRefreshComplete, Integer isRefreshFast, Integer isRefreshForce, Integer isRefreshNext, Integer isRefreshOnCommit, Integer isRefreshOnDemand, Integer isRefreshOnOverWrite, Integer isRefreshStartWith, Integer isWithRowId, Long lifyCycleOid, Integer logging, Integer maxtrans, Long nameOid, Long nextOid, Integer parallel, Integer parallelValue, Long partitionByOid, Integer pctfree, Integer pctincrease, Integer pctthreshold, Integer pctused, Long queryOid, Long startWithOid, String storage, Long tablespaceOid) {
        this.oid = oid;
        this.cache = cache;
        this.commentOid = commentOid;
        this.compress = compress;
        this.compressLevel = compressLevel;
        this.distributedByTypeOid = distributedByTypeOid;
        this.enableQueryRewrite = enableQueryRewrite;
        this.freeLists = freeLists;
        this.initrans = initrans;
        this.isBuildDeferred = isBuildDeferred;
        this.isBuildImmediate = isBuildImmediate;
        this.isCompressForOltp = isCompressForOltp;
        this.isIfNotExists = isIfNotExists;
        this.isRefresh = isRefresh;
        this.isRefreshComplete = isRefreshComplete;
        this.isRefreshFast = isRefreshFast;
        this.isRefreshForce = isRefreshForce;
        this.isRefreshNext = isRefreshNext;
        this.isRefreshOnCommit = isRefreshOnCommit;
        this.isRefreshOnDemand = isRefreshOnDemand;
        this.isRefreshOnOverWrite = isRefreshOnOverWrite;
        this.isRefreshStartWith = isRefreshStartWith;
        this.isWithRowId = isWithRowId;
        this.lifyCycleOid = lifyCycleOid;
        this.logging = logging;
        this.maxtrans = maxtrans;
        this.nameOid = nameOid;
        this.nextOid = nextOid;
        this.parallel = parallel;
        this.parallelValue = parallelValue;
        this.partitionByOid = partitionByOid;
        this.pctfree = pctfree;
        this.pctincrease = pctincrease;
        this.pctthreshold = pctthreshold;
        this.pctused = pctused;
        this.queryOid = queryOid;
        this.startWithOid = startWithOid;
        this.storage = storage;
        this.tablespaceOid = tablespaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    public SqlCreateMaterializedViewStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.cache")
    public Integer getCache() {
        return cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.cache")
    public void setCache(Integer cache) {
        this.cache = cache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.compress")
    public Integer getCompress() {
        return compress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.compress")
    public void setCompress(Integer compress) {
        this.compress = compress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.compress_level")
    public Integer getCompressLevel() {
        return compressLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.compress_level")
    public void setCompressLevel(Integer compressLevel) {
        this.compressLevel = compressLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.distributed_by_type_oid")
    public Long getDistributedByTypeOid() {
        return distributedByTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.distributed_by_type_oid")
    public void setDistributedByTypeOid(Long distributedByTypeOid) {
        this.distributedByTypeOid = distributedByTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.enable_query_rewrite")
    public Integer getEnableQueryRewrite() {
        return enableQueryRewrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.enable_query_rewrite")
    public void setEnableQueryRewrite(Integer enableQueryRewrite) {
        this.enableQueryRewrite = enableQueryRewrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.free_lists")
    public Integer getFreeLists() {
        return freeLists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.free_lists")
    public void setFreeLists(Integer freeLists) {
        this.freeLists = freeLists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.initrans")
    public Integer getInitrans() {
        return initrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.initrans")
    public void setInitrans(Integer initrans) {
        this.initrans = initrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_build_deferred")
    public Integer getIsBuildDeferred() {
        return isBuildDeferred;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_build_deferred")
    public void setIsBuildDeferred(Integer isBuildDeferred) {
        this.isBuildDeferred = isBuildDeferred;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_build_immediate")
    public Integer getIsBuildImmediate() {
        return isBuildImmediate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_build_immediate")
    public void setIsBuildImmediate(Integer isBuildImmediate) {
        this.isBuildImmediate = isBuildImmediate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_compress_for_oltp")
    public Integer getIsCompressForOltp() {
        return isCompressForOltp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_compress_for_oltp")
    public void setIsCompressForOltp(Integer isCompressForOltp) {
        this.isCompressForOltp = isCompressForOltp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_if_not_exists")
    public Integer getIsIfNotExists() {
        return isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_if_not_exists")
    public void setIsIfNotExists(Integer isIfNotExists) {
        this.isIfNotExists = isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh")
    public Integer getIsRefresh() {
        return isRefresh;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh")
    public void setIsRefresh(Integer isRefresh) {
        this.isRefresh = isRefresh;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_complete")
    public Integer getIsRefreshComplete() {
        return isRefreshComplete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_complete")
    public void setIsRefreshComplete(Integer isRefreshComplete) {
        this.isRefreshComplete = isRefreshComplete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_fast")
    public Integer getIsRefreshFast() {
        return isRefreshFast;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_fast")
    public void setIsRefreshFast(Integer isRefreshFast) {
        this.isRefreshFast = isRefreshFast;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_force")
    public Integer getIsRefreshForce() {
        return isRefreshForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_force")
    public void setIsRefreshForce(Integer isRefreshForce) {
        this.isRefreshForce = isRefreshForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_next")
    public Integer getIsRefreshNext() {
        return isRefreshNext;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_next")
    public void setIsRefreshNext(Integer isRefreshNext) {
        this.isRefreshNext = isRefreshNext;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_commit")
    public Integer getIsRefreshOnCommit() {
        return isRefreshOnCommit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_commit")
    public void setIsRefreshOnCommit(Integer isRefreshOnCommit) {
        this.isRefreshOnCommit = isRefreshOnCommit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_demand")
    public Integer getIsRefreshOnDemand() {
        return isRefreshOnDemand;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_demand")
    public void setIsRefreshOnDemand(Integer isRefreshOnDemand) {
        this.isRefreshOnDemand = isRefreshOnDemand;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_over_write")
    public Integer getIsRefreshOnOverWrite() {
        return isRefreshOnOverWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_over_write")
    public void setIsRefreshOnOverWrite(Integer isRefreshOnOverWrite) {
        this.isRefreshOnOverWrite = isRefreshOnOverWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_start_with")
    public Integer getIsRefreshStartWith() {
        return isRefreshStartWith;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_start_with")
    public void setIsRefreshStartWith(Integer isRefreshStartWith) {
        this.isRefreshStartWith = isRefreshStartWith;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_with_row_id")
    public Integer getIsWithRowId() {
        return isWithRowId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_with_row_id")
    public void setIsWithRowId(Integer isWithRowId) {
        this.isWithRowId = isWithRowId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.lify_cycle_oid")
    public Long getLifyCycleOid() {
        return lifyCycleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.lify_cycle_oid")
    public void setLifyCycleOid(Long lifyCycleOid) {
        this.lifyCycleOid = lifyCycleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.logging")
    public Integer getLogging() {
        return logging;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.logging")
    public void setLogging(Integer logging) {
        this.logging = logging;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.maxtrans")
    public Integer getMaxtrans() {
        return maxtrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.maxtrans")
    public void setMaxtrans(Integer maxtrans) {
        this.maxtrans = maxtrans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.next_oid")
    public Long getNextOid() {
        return nextOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.next_oid")
    public void setNextOid(Long nextOid) {
        this.nextOid = nextOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.parallel")
    public Integer getParallel() {
        return parallel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.parallel")
    public void setParallel(Integer parallel) {
        this.parallel = parallel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.parallel_value")
    public Integer getParallelValue() {
        return parallelValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.parallel_value")
    public void setParallelValue(Integer parallelValue) {
        this.parallelValue = parallelValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.partition_by_oid")
    public Long getPartitionByOid() {
        return partitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.partition_by_oid")
    public void setPartitionByOid(Long partitionByOid) {
        this.partitionByOid = partitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctfree")
    public Integer getPctfree() {
        return pctfree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctfree")
    public void setPctfree(Integer pctfree) {
        this.pctfree = pctfree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctincrease")
    public Integer getPctincrease() {
        return pctincrease;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctincrease")
    public void setPctincrease(Integer pctincrease) {
        this.pctincrease = pctincrease;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctthreshold")
    public Integer getPctthreshold() {
        return pctthreshold;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctthreshold")
    public void setPctthreshold(Integer pctthreshold) {
        this.pctthreshold = pctthreshold;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctused")
    public Integer getPctused() {
        return pctused;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctused")
    public void setPctused(Integer pctused) {
        this.pctused = pctused;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.query_oid")
    public Long getQueryOid() {
        return queryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.query_oid")
    public void setQueryOid(Long queryOid) {
        this.queryOid = queryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.start_with_oid")
    public Long getStartWithOid() {
        return startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.start_with_oid")
    public void setStartWithOid(Long startWithOid) {
        this.startWithOid = startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.storage")
    public String getStorage() {
        return storage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.storage")
    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.tablespace_oid")
    public Long getTablespaceOid() {
        return tablespaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.tablespace_oid")
    public void setTablespaceOid(Long tablespaceOid) {
        this.tablespaceOid = tablespaceOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
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
        SqlCreateMaterializedViewStatement other = (SqlCreateMaterializedViewStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCache() == null ? other.getCache() == null : this.getCache().equals(other.getCache()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getCompress() == null ? other.getCompress() == null : this.getCompress().equals(other.getCompress()))
            && (this.getCompressLevel() == null ? other.getCompressLevel() == null : this.getCompressLevel().equals(other.getCompressLevel()))
            && (this.getDistributedByTypeOid() == null ? other.getDistributedByTypeOid() == null : this.getDistributedByTypeOid().equals(other.getDistributedByTypeOid()))
            && (this.getEnableQueryRewrite() == null ? other.getEnableQueryRewrite() == null : this.getEnableQueryRewrite().equals(other.getEnableQueryRewrite()))
            && (this.getFreeLists() == null ? other.getFreeLists() == null : this.getFreeLists().equals(other.getFreeLists()))
            && (this.getInitrans() == null ? other.getInitrans() == null : this.getInitrans().equals(other.getInitrans()))
            && (this.getIsBuildDeferred() == null ? other.getIsBuildDeferred() == null : this.getIsBuildDeferred().equals(other.getIsBuildDeferred()))
            && (this.getIsBuildImmediate() == null ? other.getIsBuildImmediate() == null : this.getIsBuildImmediate().equals(other.getIsBuildImmediate()))
            && (this.getIsCompressForOltp() == null ? other.getIsCompressForOltp() == null : this.getIsCompressForOltp().equals(other.getIsCompressForOltp()))
            && (this.getIsIfNotExists() == null ? other.getIsIfNotExists() == null : this.getIsIfNotExists().equals(other.getIsIfNotExists()))
            && (this.getIsRefresh() == null ? other.getIsRefresh() == null : this.getIsRefresh().equals(other.getIsRefresh()))
            && (this.getIsRefreshComplete() == null ? other.getIsRefreshComplete() == null : this.getIsRefreshComplete().equals(other.getIsRefreshComplete()))
            && (this.getIsRefreshFast() == null ? other.getIsRefreshFast() == null : this.getIsRefreshFast().equals(other.getIsRefreshFast()))
            && (this.getIsRefreshForce() == null ? other.getIsRefreshForce() == null : this.getIsRefreshForce().equals(other.getIsRefreshForce()))
            && (this.getIsRefreshNext() == null ? other.getIsRefreshNext() == null : this.getIsRefreshNext().equals(other.getIsRefreshNext()))
            && (this.getIsRefreshOnCommit() == null ? other.getIsRefreshOnCommit() == null : this.getIsRefreshOnCommit().equals(other.getIsRefreshOnCommit()))
            && (this.getIsRefreshOnDemand() == null ? other.getIsRefreshOnDemand() == null : this.getIsRefreshOnDemand().equals(other.getIsRefreshOnDemand()))
            && (this.getIsRefreshOnOverWrite() == null ? other.getIsRefreshOnOverWrite() == null : this.getIsRefreshOnOverWrite().equals(other.getIsRefreshOnOverWrite()))
            && (this.getIsRefreshStartWith() == null ? other.getIsRefreshStartWith() == null : this.getIsRefreshStartWith().equals(other.getIsRefreshStartWith()))
            && (this.getIsWithRowId() == null ? other.getIsWithRowId() == null : this.getIsWithRowId().equals(other.getIsWithRowId()))
            && (this.getLifyCycleOid() == null ? other.getLifyCycleOid() == null : this.getLifyCycleOid().equals(other.getLifyCycleOid()))
            && (this.getLogging() == null ? other.getLogging() == null : this.getLogging().equals(other.getLogging()))
            && (this.getMaxtrans() == null ? other.getMaxtrans() == null : this.getMaxtrans().equals(other.getMaxtrans()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getNextOid() == null ? other.getNextOid() == null : this.getNextOid().equals(other.getNextOid()))
            && (this.getParallel() == null ? other.getParallel() == null : this.getParallel().equals(other.getParallel()))
            && (this.getParallelValue() == null ? other.getParallelValue() == null : this.getParallelValue().equals(other.getParallelValue()))
            && (this.getPartitionByOid() == null ? other.getPartitionByOid() == null : this.getPartitionByOid().equals(other.getPartitionByOid()))
            && (this.getPctfree() == null ? other.getPctfree() == null : this.getPctfree().equals(other.getPctfree()))
            && (this.getPctincrease() == null ? other.getPctincrease() == null : this.getPctincrease().equals(other.getPctincrease()))
            && (this.getPctthreshold() == null ? other.getPctthreshold() == null : this.getPctthreshold().equals(other.getPctthreshold()))
            && (this.getPctused() == null ? other.getPctused() == null : this.getPctused().equals(other.getPctused()))
            && (this.getQueryOid() == null ? other.getQueryOid() == null : this.getQueryOid().equals(other.getQueryOid()))
            && (this.getStartWithOid() == null ? other.getStartWithOid() == null : this.getStartWithOid().equals(other.getStartWithOid()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getTablespaceOid() == null ? other.getTablespaceOid() == null : this.getTablespaceOid().equals(other.getTablespaceOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCache() == null) ? 0 : getCache().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getCompress() == null) ? 0 : getCompress().hashCode());
        result = prime * result + ((getCompressLevel() == null) ? 0 : getCompressLevel().hashCode());
        result = prime * result + ((getDistributedByTypeOid() == null) ? 0 : getDistributedByTypeOid().hashCode());
        result = prime * result + ((getEnableQueryRewrite() == null) ? 0 : getEnableQueryRewrite().hashCode());
        result = prime * result + ((getFreeLists() == null) ? 0 : getFreeLists().hashCode());
        result = prime * result + ((getInitrans() == null) ? 0 : getInitrans().hashCode());
        result = prime * result + ((getIsBuildDeferred() == null) ? 0 : getIsBuildDeferred().hashCode());
        result = prime * result + ((getIsBuildImmediate() == null) ? 0 : getIsBuildImmediate().hashCode());
        result = prime * result + ((getIsCompressForOltp() == null) ? 0 : getIsCompressForOltp().hashCode());
        result = prime * result + ((getIsIfNotExists() == null) ? 0 : getIsIfNotExists().hashCode());
        result = prime * result + ((getIsRefresh() == null) ? 0 : getIsRefresh().hashCode());
        result = prime * result + ((getIsRefreshComplete() == null) ? 0 : getIsRefreshComplete().hashCode());
        result = prime * result + ((getIsRefreshFast() == null) ? 0 : getIsRefreshFast().hashCode());
        result = prime * result + ((getIsRefreshForce() == null) ? 0 : getIsRefreshForce().hashCode());
        result = prime * result + ((getIsRefreshNext() == null) ? 0 : getIsRefreshNext().hashCode());
        result = prime * result + ((getIsRefreshOnCommit() == null) ? 0 : getIsRefreshOnCommit().hashCode());
        result = prime * result + ((getIsRefreshOnDemand() == null) ? 0 : getIsRefreshOnDemand().hashCode());
        result = prime * result + ((getIsRefreshOnOverWrite() == null) ? 0 : getIsRefreshOnOverWrite().hashCode());
        result = prime * result + ((getIsRefreshStartWith() == null) ? 0 : getIsRefreshStartWith().hashCode());
        result = prime * result + ((getIsWithRowId() == null) ? 0 : getIsWithRowId().hashCode());
        result = prime * result + ((getLifyCycleOid() == null) ? 0 : getLifyCycleOid().hashCode());
        result = prime * result + ((getLogging() == null) ? 0 : getLogging().hashCode());
        result = prime * result + ((getMaxtrans() == null) ? 0 : getMaxtrans().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getNextOid() == null) ? 0 : getNextOid().hashCode());
        result = prime * result + ((getParallel() == null) ? 0 : getParallel().hashCode());
        result = prime * result + ((getParallelValue() == null) ? 0 : getParallelValue().hashCode());
        result = prime * result + ((getPartitionByOid() == null) ? 0 : getPartitionByOid().hashCode());
        result = prime * result + ((getPctfree() == null) ? 0 : getPctfree().hashCode());
        result = prime * result + ((getPctincrease() == null) ? 0 : getPctincrease().hashCode());
        result = prime * result + ((getPctthreshold() == null) ? 0 : getPctthreshold().hashCode());
        result = prime * result + ((getPctused() == null) ? 0 : getPctused().hashCode());
        result = prime * result + ((getQueryOid() == null) ? 0 : getQueryOid().hashCode());
        result = prime * result + ((getStartWithOid() == null) ? 0 : getStartWithOid().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getTablespaceOid() == null) ? 0 : getTablespaceOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cache=").append(cache);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", compress=").append(compress);
        sb.append(", compressLevel=").append(compressLevel);
        sb.append(", distributedByTypeOid=").append(distributedByTypeOid);
        sb.append(", enableQueryRewrite=").append(enableQueryRewrite);
        sb.append(", freeLists=").append(freeLists);
        sb.append(", initrans=").append(initrans);
        sb.append(", isBuildDeferred=").append(isBuildDeferred);
        sb.append(", isBuildImmediate=").append(isBuildImmediate);
        sb.append(", isCompressForOltp=").append(isCompressForOltp);
        sb.append(", isIfNotExists=").append(isIfNotExists);
        sb.append(", isRefresh=").append(isRefresh);
        sb.append(", isRefreshComplete=").append(isRefreshComplete);
        sb.append(", isRefreshFast=").append(isRefreshFast);
        sb.append(", isRefreshForce=").append(isRefreshForce);
        sb.append(", isRefreshNext=").append(isRefreshNext);
        sb.append(", isRefreshOnCommit=").append(isRefreshOnCommit);
        sb.append(", isRefreshOnDemand=").append(isRefreshOnDemand);
        sb.append(", isRefreshOnOverWrite=").append(isRefreshOnOverWrite);
        sb.append(", isRefreshStartWith=").append(isRefreshStartWith);
        sb.append(", isWithRowId=").append(isWithRowId);
        sb.append(", lifyCycleOid=").append(lifyCycleOid);
        sb.append(", logging=").append(logging);
        sb.append(", maxtrans=").append(maxtrans);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", nextOid=").append(nextOid);
        sb.append(", parallel=").append(parallel);
        sb.append(", parallelValue=").append(parallelValue);
        sb.append(", partitionByOid=").append(partitionByOid);
        sb.append(", pctfree=").append(pctfree);
        sb.append(", pctincrease=").append(pctincrease);
        sb.append(", pctthreshold=").append(pctthreshold);
        sb.append(", pctused=").append(pctused);
        sb.append(", queryOid=").append(queryOid);
        sb.append(", startWithOid=").append(startWithOid);
        sb.append(", storage=").append(storage);
        sb.append(", tablespaceOid=").append(tablespaceOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}