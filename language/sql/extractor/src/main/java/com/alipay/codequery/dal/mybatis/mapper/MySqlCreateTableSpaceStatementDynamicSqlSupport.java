package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlCreateTableSpaceStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    public static final MySqlCreateTableSpaceStatement mySqlCreateTableSpaceStatement = new MySqlCreateTableSpaceStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.oid")
    public static final SqlColumn<Long> oid = mySqlCreateTableSpaceStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.add_data_file_oid")
    public static final SqlColumn<Long> addDataFileOid = mySqlCreateTableSpaceStatement.addDataFileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.auto_extent_size_oid")
    public static final SqlColumn<Long> autoExtentSizeOid = mySqlCreateTableSpaceStatement.autoExtentSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = mySqlCreateTableSpaceStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.engine_oid")
    public static final SqlColumn<Long> engineOid = mySqlCreateTableSpaceStatement.engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.extent_size_oid")
    public static final SqlColumn<Long> extentSizeOid = mySqlCreateTableSpaceStatement.extentSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.file_block_size_oid")
    public static final SqlColumn<Long> fileBlockSizeOid = mySqlCreateTableSpaceStatement.fileBlockSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.initial_size_oid")
    public static final SqlColumn<Long> initialSizeOid = mySqlCreateTableSpaceStatement.initialSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.is_wait")
    public static final SqlColumn<Integer> isWait = mySqlCreateTableSpaceStatement.isWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.log_file_group_oid")
    public static final SqlColumn<Long> logFileGroupOid = mySqlCreateTableSpaceStatement.logFileGroupOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.max_size_oid")
    public static final SqlColumn<Long> maxSizeOid = mySqlCreateTableSpaceStatement.maxSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlCreateTableSpaceStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.node_group_oid")
    public static final SqlColumn<Long> nodeGroupOid = mySqlCreateTableSpaceStatement.nodeGroupOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    public static final class MySqlCreateTableSpaceStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> addDataFileOid = column("`add_data_file_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> autoExtentSizeOid = column("`auto_extent_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> engineOid = column("`engine_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> extentSizeOid = column("`extent_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fileBlockSizeOid = column("`file_block_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> initialSizeOid = column("`initial_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWait = column("`is_wait`", JDBCType.BIGINT);

        public final SqlColumn<Long> logFileGroupOid = column("`log_file_group_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> maxSizeOid = column("`max_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nodeGroupOid = column("`node_group_oid`", JDBCType.BIGINT);

        public MySqlCreateTableSpaceStatement() {
            super("my_sql_create_table_space_statement");
        }
    }
}