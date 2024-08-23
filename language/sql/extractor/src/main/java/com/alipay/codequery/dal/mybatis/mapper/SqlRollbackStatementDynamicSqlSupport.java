package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlRollbackStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_rollback_statement")
    public static final SqlRollbackStatement sqlRollbackStatement = new SqlRollbackStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.oid")
    public static final SqlColumn<Long> oid = sqlRollbackStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.chain")
    public static final SqlColumn<Integer> chain = sqlRollbackStatement.chain;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.force_oid")
    public static final SqlColumn<Long> forceOid = sqlRollbackStatement.forceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.release")
    public static final SqlColumn<Integer> release = sqlRollbackStatement.release;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.to_oid")
    public static final SqlColumn<Long> toOid = sqlRollbackStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_rollback_statement")
    public static final class SqlRollbackStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> chain = column("`chain`", JDBCType.BIGINT);

        public final SqlColumn<Long> forceOid = column("`force_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> release = column("`release`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public SqlRollbackStatement() {
            super("sql_rollback_statement");
        }
    }
}