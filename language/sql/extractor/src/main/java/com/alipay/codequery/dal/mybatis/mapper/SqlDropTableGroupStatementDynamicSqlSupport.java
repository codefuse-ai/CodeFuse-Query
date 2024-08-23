package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropTableGroupStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_group_statement")
    public static final SqlDropTableGroupStatement sqlDropTableGroupStatement = new SqlDropTableGroupStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_group_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropTableGroupStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_group_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropTableGroupStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_group_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropTableGroupStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_group_statement.table_group_name")
    public static final SqlColumn<String> tableGroupName = sqlDropTableGroupStatement.tableGroupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_group_statement")
    public static final class SqlDropTableGroupStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> tableGroupName = column("`table_group_name`", JDBCType.VARCHAR);

        public SqlDropTableGroupStatement() {
            super("sql_drop_table_group_statement");
        }
    }
}