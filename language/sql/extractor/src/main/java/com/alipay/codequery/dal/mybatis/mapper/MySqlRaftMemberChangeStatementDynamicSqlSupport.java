package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlRaftMemberChangeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    public static final MySqlRaftMemberChangeStatement mySqlRaftMemberChangeStatement = new MySqlRaftMemberChangeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.oid")
    public static final SqlColumn<Long> oid = mySqlRaftMemberChangeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.host_oid")
    public static final SqlColumn<Long> hostOid = mySqlRaftMemberChangeStatement.hostOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.is_force")
    public static final SqlColumn<Integer> isForce = mySqlRaftMemberChangeStatement.isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.is_no_leader")
    public static final SqlColumn<Integer> isNoLeader = mySqlRaftMemberChangeStatement.isNoLeader;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.shard_oid")
    public static final SqlColumn<Long> shardOid = mySqlRaftMemberChangeStatement.shardOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.status_oid")
    public static final SqlColumn<Long> statusOid = mySqlRaftMemberChangeStatement.statusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    public static final class MySqlRaftMemberChangeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> hostOid = column("`host_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForce = column("`is_force`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoLeader = column("`is_no_leader`", JDBCType.BIGINT);

        public final SqlColumn<Long> shardOid = column("`shard_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> statusOid = column("`status_oid`", JDBCType.BIGINT);

        public MySqlRaftMemberChangeStatement() {
            super("my_sql_raft_member_change_statement");
        }
    }
}