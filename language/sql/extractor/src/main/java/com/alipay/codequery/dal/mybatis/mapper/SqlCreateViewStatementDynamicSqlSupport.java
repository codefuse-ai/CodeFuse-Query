package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateViewStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_view_statement")
    public static final SqlCreateViewStatement sqlCreateViewStatement = new SqlCreateViewStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateViewStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.algorithm")
    public static final SqlColumn<String> algorithm = sqlCreateViewStatement.algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlCreateViewStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.definer_oid")
    public static final SqlColumn<Long> definerOid = sqlCreateViewStatement.definerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.is_force")
    public static final SqlColumn<Integer> isForce = sqlCreateViewStatement.isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = sqlCreateViewStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.is_on_cluster")
    public static final SqlColumn<Integer> isOnCluster = sqlCreateViewStatement.isOnCluster;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.is_or_replace")
    public static final SqlColumn<Integer> isOrReplace = sqlCreateViewStatement.isOrReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.is_with_cascaded")
    public static final SqlColumn<Integer> isWithCascaded = sqlCreateViewStatement.isWithCascaded;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.is_with_check_option")
    public static final SqlColumn<Integer> isWithCheckOption = sqlCreateViewStatement.isWithCheckOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.is_with_local")
    public static final SqlColumn<Integer> isWithLocal = sqlCreateViewStatement.isWithLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.is_with_read_only")
    public static final SqlColumn<Integer> isWithReadOnly = sqlCreateViewStatement.isWithReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateViewStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.returns_data_type_oid")
    public static final SqlColumn<Long> returnsDataTypeOid = sqlCreateViewStatement.returnsDataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.returns_oid")
    public static final SqlColumn<Long> returnsOid = sqlCreateViewStatement.returnsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.schema")
    public static final SqlColumn<String> schema = sqlCreateViewStatement.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.script_oid")
    public static final SqlColumn<Long> scriptOid = sqlCreateViewStatement.scriptOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.sql_security")
    public static final SqlColumn<String> sqlSecurity = sqlCreateViewStatement.sqlSecurity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.sub_query_oid")
    public static final SqlColumn<Long> subQueryOid = sqlCreateViewStatement.subQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlCreateViewStatement.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_view_statement.to_oid")
    public static final SqlColumn<Long> toOid = sqlCreateViewStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_view_statement")
    public static final class SqlCreateViewStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> algorithm = column("`algorithm`", JDBCType.VARCHAR);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> definerOid = column("`definer_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForce = column("`is_force`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnCluster = column("`is_on_cluster`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOrReplace = column("`is_or_replace`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithCascaded = column("`is_with_cascaded`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithCheckOption = column("`is_with_check_option`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithLocal = column("`is_with_local`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithReadOnly = column("`is_with_read_only`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> returnsDataTypeOid = column("`returns_data_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> returnsOid = column("`returns_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public final SqlColumn<Long> scriptOid = column("`script_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> sqlSecurity = column("`sql_security`", JDBCType.VARCHAR);

        public final SqlColumn<Long> subQueryOid = column("`sub_query_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public SqlCreateViewStatement() {
            super("sql_create_view_statement");
        }
    }
}