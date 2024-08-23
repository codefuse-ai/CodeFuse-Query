package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlInsertStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    public static final SqlInsertStatement sqlInsertStatement = new SqlInsertStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.oid")
    public static final SqlColumn<Long> oid = sqlInsertStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.is_after_semi")
    public static final SqlColumn<Integer> isAfterSemi = sqlInsertStatement.isAfterSemi;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.is_upsert")
    public static final SqlColumn<Integer> isUpsert = sqlInsertStatement.isUpsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.with_oid")
    public static final SqlColumn<Long> withOid = sqlInsertStatement.withOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    public static final class SqlInsertStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAfterSemi = column("`is_after_semi`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUpsert = column("`is_upsert`", JDBCType.BIGINT);

        public final SqlColumn<Long> withOid = column("`with_oid`", JDBCType.BIGINT);

        public SqlInsertStatement() {
            super("sql_insert_statement");
        }
    }
}