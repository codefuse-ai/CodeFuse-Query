package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterLogFileGroupStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    public static final MySqlAlterLogFileGroupStatement mySqlAlterLogFileGroupStatement = new MySqlAlterLogFileGroupStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.oid")
    public static final SqlColumn<Long> oid = mySqlAlterLogFileGroupStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.add_undo_file_oid")
    public static final SqlColumn<Long> addUndoFileOid = mySqlAlterLogFileGroupStatement.addUndoFileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.engine_oid")
    public static final SqlColumn<Long> engineOid = mySqlAlterLogFileGroupStatement.engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.initial_size_oid")
    public static final SqlColumn<Long> initialSizeOid = mySqlAlterLogFileGroupStatement.initialSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.is_wait")
    public static final SqlColumn<Integer> isWait = mySqlAlterLogFileGroupStatement.isWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlAlterLogFileGroupStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    public static final class MySqlAlterLogFileGroupStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> addUndoFileOid = column("`add_undo_file_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> engineOid = column("`engine_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> initialSizeOid = column("`initial_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWait = column("`is_wait`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MySqlAlterLogFileGroupStatement() {
            super("my_sql_alter_log_file_group_statement");
        }
    }
}