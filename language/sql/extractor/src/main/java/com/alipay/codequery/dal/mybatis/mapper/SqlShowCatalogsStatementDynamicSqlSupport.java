package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowCatalogsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_catalogs_statement")
    public static final SqlShowCatalogsStatement sqlShowCatalogsStatement = new SqlShowCatalogsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_catalogs_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowCatalogsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_catalogs_statement.like_oid")
    public static final SqlColumn<Long> likeOid = sqlShowCatalogsStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_catalogs_statement")
    public static final class SqlShowCatalogsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public SqlShowCatalogsStatement() {
            super("sql_show_catalogs_statement");
        }
    }
}