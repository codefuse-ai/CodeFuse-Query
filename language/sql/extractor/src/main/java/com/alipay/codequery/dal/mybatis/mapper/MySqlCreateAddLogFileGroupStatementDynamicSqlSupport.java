package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlCreateAddLogFileGroupStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    public static final MySqlCreateAddLogFileGroupStatement mySqlCreateAddLogFileGroupStatement = new MySqlCreateAddLogFileGroupStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_add_log_file_group_statement.oid")
    public static final SqlColumn<Long> oid = mySqlCreateAddLogFileGroupStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_add_log_file_group_statement.add_undo_file_oid")
    public static final SqlColumn<Long> addUndoFileOid = mySqlCreateAddLogFileGroupStatement.addUndoFileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_add_log_file_group_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = mySqlCreateAddLogFileGroupStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_add_log_file_group_statement.engine_oid")
    public static final SqlColumn<Long> engineOid = mySqlCreateAddLogFileGroupStatement.engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_add_log_file_group_statement.initial_size_oid")
    public static final SqlColumn<Long> initialSizeOid = mySqlCreateAddLogFileGroupStatement.initialSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_add_log_file_group_statement.is_wait")
    public static final SqlColumn<Integer> isWait = mySqlCreateAddLogFileGroupStatement.isWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_add_log_file_group_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlCreateAddLogFileGroupStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_add_log_file_group_statement.node_group_oid")
    public static final SqlColumn<Long> nodeGroupOid = mySqlCreateAddLogFileGroupStatement.nodeGroupOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_add_log_file_group_statement.redo_buffer_size_oid")
    public static final SqlColumn<Long> redoBufferSizeOid = mySqlCreateAddLogFileGroupStatement.redoBufferSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_add_log_file_group_statement.undo_buffer_size_oid")
    public static final SqlColumn<Long> undoBufferSizeOid = mySqlCreateAddLogFileGroupStatement.undoBufferSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    public static final class MySqlCreateAddLogFileGroupStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> addUndoFileOid = column("`add_undo_file_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> engineOid = column("`engine_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> initialSizeOid = column("`initial_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWait = column("`is_wait`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nodeGroupOid = column("`node_group_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> redoBufferSizeOid = column("`redo_buffer_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> undoBufferSizeOid = column("`undo_buffer_size_oid`", JDBCType.BIGINT);

        public MySqlCreateAddLogFileGroupStatement() {
            super("my_sql_create_add_log_file_group_statement");
        }
    }
}