package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlManageInstanceGroupStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    public static final MySqlManageInstanceGroupStatement mySqlManageInstanceGroupStatement = new MySqlManageInstanceGroupStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.oid")
    public static final SqlColumn<Long> oid = mySqlManageInstanceGroupStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.group_names_to_string")
    public static final SqlColumn<String> groupNamesToString = mySqlManageInstanceGroupStatement.groupNamesToString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.operation_oid")
    public static final SqlColumn<Long> operationOid = mySqlManageInstanceGroupStatement.operationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.replication_oid")
    public static final SqlColumn<Long> replicationOid = mySqlManageInstanceGroupStatement.replicationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    public static final class MySqlManageInstanceGroupStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> groupNamesToString = column("`group_names_to_string`", JDBCType.VARCHAR);

        public final SqlColumn<Long> operationOid = column("`operation_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> replicationOid = column("`replication_oid`", JDBCType.BIGINT);

        public MySqlManageInstanceGroupStatement() {
            super("my_sql_manage_instance_group_statement");
        }
    }
}