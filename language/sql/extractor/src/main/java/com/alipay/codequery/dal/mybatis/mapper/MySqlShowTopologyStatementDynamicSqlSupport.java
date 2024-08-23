package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowTopologyStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_topology_statement")
    public static final MySqlShowTopologyStatement mySqlShowTopologyStatement = new MySqlShowTopologyStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_topology_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowTopologyStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_topology_statement.is_full")
    public static final SqlColumn<Integer> isFull = mySqlShowTopologyStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_topology_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowTopologyStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_topology_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowTopologyStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_topology_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = mySqlShowTopologyStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_topology_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowTopologyStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_topology_statement")
    public static final class MySqlShowTopologyStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowTopologyStatement() {
            super("my_sql_show_topology_statement");
        }
    }
}