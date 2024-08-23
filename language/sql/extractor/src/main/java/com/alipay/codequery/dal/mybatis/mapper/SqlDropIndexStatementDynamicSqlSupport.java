package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropIndexStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    public static final SqlDropIndexStatement sqlDropIndexStatement = new SqlDropIndexStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropIndexStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.algorithm_oid")
    public static final SqlColumn<Long> algorithmOid = sqlDropIndexStatement.algorithmOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.index_name_oid")
    public static final SqlColumn<Long> indexNameOid = sqlDropIndexStatement.indexNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropIndexStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.lock_option_oid")
    public static final SqlColumn<Long> lockOptionOid = sqlDropIndexStatement.lockOptionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.table_name_oid")
    public static final SqlColumn<Long> tableNameOid = sqlDropIndexStatement.tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    public static final class SqlDropIndexStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> algorithmOid = column("`algorithm_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexNameOid = column("`index_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> lockOptionOid = column("`lock_option_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableNameOid = column("`table_name_oid`", JDBCType.BIGINT);

        public SqlDropIndexStatement() {
            super("sql_drop_index_statement");
        }
    }
}