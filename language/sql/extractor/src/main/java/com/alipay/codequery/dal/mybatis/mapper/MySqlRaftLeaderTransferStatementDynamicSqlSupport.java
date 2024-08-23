package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlRaftLeaderTransferStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    public static final MySqlRaftLeaderTransferStatement mySqlRaftLeaderTransferStatement = new MySqlRaftLeaderTransferStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_leader_transfer_statement.oid")
    public static final SqlColumn<Long> oid = mySqlRaftLeaderTransferStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_leader_transfer_statement.from_oid")
    public static final SqlColumn<Long> fromOid = mySqlRaftLeaderTransferStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_leader_transfer_statement.shard_oid")
    public static final SqlColumn<Long> shardOid = mySqlRaftLeaderTransferStatement.shardOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_leader_transfer_statement.timeout_oid")
    public static final SqlColumn<Long> timeoutOid = mySqlRaftLeaderTransferStatement.timeoutOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_leader_transfer_statement.to_oid")
    public static final SqlColumn<Long> toOid = mySqlRaftLeaderTransferStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    public static final class MySqlRaftLeaderTransferStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> shardOid = column("`shard_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> timeoutOid = column("`timeout_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public MySqlRaftLeaderTransferStatement() {
            super("my_sql_raft_leader_transfer_statement");
        }
    }
}