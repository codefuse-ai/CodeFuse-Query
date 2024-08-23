package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCloneTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_clone_table_statement")
    public static final SqlCloneTableStatement sqlCloneTableStatement = new SqlCloneTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.oid")
    public static final SqlColumn<Long> oid = sqlCloneTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.from_oid")
    public static final SqlColumn<Long> fromOid = sqlCloneTableStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.is_if_exists_ignore")
    public static final SqlColumn<Integer> isIfExistsIgnore = sqlCloneTableStatement.isIfExistsIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.is_if_exists_overwrite")
    public static final SqlColumn<Integer> isIfExistsOverwrite = sqlCloneTableStatement.isIfExistsOverwrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.to_name_oid")
    public static final SqlColumn<Long> toNameOid = sqlCloneTableStatement.toNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_clone_table_statement.to_oid")
    public static final SqlColumn<Long> toOid = sqlCloneTableStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_clone_table_statement")
    public static final class SqlCloneTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExistsIgnore = column("`is_if_exists_ignore`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExistsOverwrite = column("`is_if_exists_overwrite`", JDBCType.BIGINT);

        public final SqlColumn<Long> toNameOid = column("`to_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public SqlCloneTableStatement() {
            super("sql_clone_table_statement");
        }
    }
}