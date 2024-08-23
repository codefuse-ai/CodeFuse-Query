package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterViewStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    public static final SqlAlterViewStatement sqlAlterViewStatement = new SqlAlterViewStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterViewStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.algorithm")
    public static final SqlColumn<String> algorithm = sqlAlterViewStatement.algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlAlterViewStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.definer_oid")
    public static final SqlColumn<Long> definerOid = sqlAlterViewStatement.definerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_force")
    public static final SqlColumn<Integer> isForce = sqlAlterViewStatement.isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = sqlAlterViewStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_cascaded")
    public static final SqlColumn<Integer> isWithCascaded = sqlAlterViewStatement.isWithCascaded;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_check_option")
    public static final SqlColumn<Integer> isWithCheckOption = sqlAlterViewStatement.isWithCheckOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_local")
    public static final SqlColumn<Integer> isWithLocal = sqlAlterViewStatement.isWithLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_read_only")
    public static final SqlColumn<Integer> isWithReadOnly = sqlAlterViewStatement.isWithReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterViewStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.schema")
    public static final SqlColumn<String> schema = sqlAlterViewStatement.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.sql_security")
    public static final SqlColumn<String> sqlSecurity = sqlAlterViewStatement.sqlSecurity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.sub_query_oid")
    public static final SqlColumn<Long> subQueryOid = sqlAlterViewStatement.subQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlAlterViewStatement.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    public static final class SqlAlterViewStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> algorithm = column("`algorithm`", JDBCType.VARCHAR);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> definerOid = column("`definer_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForce = column("`is_force`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithCascaded = column("`is_with_cascaded`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithCheckOption = column("`is_with_check_option`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithLocal = column("`is_with_local`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithReadOnly = column("`is_with_read_only`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public final SqlColumn<String> sqlSecurity = column("`sql_security`", JDBCType.VARCHAR);

        public final SqlColumn<Long> subQueryOid = column("`sub_query_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public SqlAlterViewStatement() {
            super("sql_alter_view_statement");
        }
    }
}