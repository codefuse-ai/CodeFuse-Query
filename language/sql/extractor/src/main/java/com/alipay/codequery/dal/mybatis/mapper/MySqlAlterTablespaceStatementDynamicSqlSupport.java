package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterTablespaceStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    public static final MySqlAlterTablespaceStatement mySqlAlterTablespaceStatement = new MySqlAlterTablespaceStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.oid")
    public static final SqlColumn<Long> oid = mySqlAlterTablespaceStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.add_data_file_oid")
    public static final SqlColumn<Long> addDataFileOid = mySqlAlterTablespaceStatement.addDataFileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.drop_data_file_oid")
    public static final SqlColumn<Long> dropDataFileOid = mySqlAlterTablespaceStatement.dropDataFileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.engine_oid")
    public static final SqlColumn<Long> engineOid = mySqlAlterTablespaceStatement.engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.initial_size_oid")
    public static final SqlColumn<Long> initialSizeOid = mySqlAlterTablespaceStatement.initialSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.is_wait")
    public static final SqlColumn<Integer> isWait = mySqlAlterTablespaceStatement.isWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlAlterTablespaceStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    public static final class MySqlAlterTablespaceStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> addDataFileOid = column("`add_data_file_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dropDataFileOid = column("`drop_data_file_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> engineOid = column("`engine_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> initialSizeOid = column("`initial_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWait = column("`is_wait`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MySqlAlterTablespaceStatement() {
            super("my_sql_alter_tablespace_statement");
        }
    }
}