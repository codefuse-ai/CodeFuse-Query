package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowVariantsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_variants_statement")
    public static final SqlShowVariantsStatement sqlShowVariantsStatement = new SqlShowVariantsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_variants_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowVariantsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_variants_statement.is_global")
    public static final SqlColumn<Integer> isGlobal = sqlShowVariantsStatement.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_variants_statement.is_session")
    public static final SqlColumn<Integer> isSession = sqlShowVariantsStatement.isSession;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_variants_statement.like_oid")
    public static final SqlColumn<Long> likeOid = sqlShowVariantsStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_variants_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlShowVariantsStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_variants_statement")
    public static final class SqlShowVariantsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGlobal = column("`is_global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSession = column("`is_session`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlShowVariantsStatement() {
            super("sql_show_variants_statement");
        }
    }
}