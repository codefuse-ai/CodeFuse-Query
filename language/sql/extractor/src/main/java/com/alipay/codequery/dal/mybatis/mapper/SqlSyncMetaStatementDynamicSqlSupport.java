package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSyncMetaStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    public static final SqlSyncMetaStatement sqlSyncMetaStatement = new SqlSyncMetaStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sync_meta_statement.oid")
    public static final SqlColumn<Long> oid = sqlSyncMetaStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sync_meta_statement.from_oid")
    public static final SqlColumn<Long> fromOid = sqlSyncMetaStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sync_meta_statement.ignore")
    public static final SqlColumn<Integer> ignore = sqlSyncMetaStatement.ignore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sync_meta_statement.like_oid")
    public static final SqlColumn<Long> likeOid = sqlSyncMetaStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sync_meta_statement.restrict")
    public static final SqlColumn<Integer> restrict = sqlSyncMetaStatement.restrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    public static final class SqlSyncMetaStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> ignore = column("`ignore`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> restrict = column("`restrict`", JDBCType.BIGINT);

        public SqlSyncMetaStatement() {
            super("sql_sync_meta_statement");
        }
    }
}