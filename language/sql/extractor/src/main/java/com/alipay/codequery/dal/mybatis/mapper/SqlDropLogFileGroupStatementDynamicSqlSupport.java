package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropLogFileGroupStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_log_file_group_statement")
    public static final SqlDropLogFileGroupStatement sqlDropLogFileGroupStatement = new SqlDropLogFileGroupStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_log_file_group_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropLogFileGroupStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_log_file_group_statement.engine_oid")
    public static final SqlColumn<Long> engineOid = sqlDropLogFileGroupStatement.engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_log_file_group_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropLogFileGroupStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_log_file_group_statement")
    public static final class SqlDropLogFileGroupStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> engineOid = column("`engine_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlDropLogFileGroupStatement() {
            super("sql_drop_log_file_group_statement");
        }
    }
}