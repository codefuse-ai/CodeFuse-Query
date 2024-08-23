package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleCreateDatabaseDbLinkStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    public static final OracleCreateDatabaseDbLinkStatement oracleCreateDatabaseDbLinkStatement = new OracleCreateDatabaseDbLinkStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.oid")
    public static final SqlColumn<Long> oid = oracleCreateDatabaseDbLinkStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.authenticated_password")
    public static final SqlColumn<String> authenticatedPassword = oracleCreateDatabaseDbLinkStatement.authenticatedPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.authenticated_user_oid")
    public static final SqlColumn<Long> authenticatedUserOid = oracleCreateDatabaseDbLinkStatement.authenticatedUserOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.is_public")
    public static final SqlColumn<Integer> isPublic = oracleCreateDatabaseDbLinkStatement.isPublic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.is_shared")
    public static final SqlColumn<Integer> isShared = oracleCreateDatabaseDbLinkStatement.isShared;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.name_oid")
    public static final SqlColumn<Long> nameOid = oracleCreateDatabaseDbLinkStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.password")
    public static final SqlColumn<String> password = oracleCreateDatabaseDbLinkStatement.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.user_oid")
    public static final SqlColumn<Long> userOid = oracleCreateDatabaseDbLinkStatement.userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.using_oid")
    public static final SqlColumn<Long> usingOid = oracleCreateDatabaseDbLinkStatement.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    public static final class OracleCreateDatabaseDbLinkStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> authenticatedPassword = column("`authenticated_password`", JDBCType.VARCHAR);

        public final SqlColumn<Long> authenticatedUserOid = column("`authenticated_user_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPublic = column("`is_public`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isShared = column("`is_shared`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> password = column("`password`", JDBCType.VARCHAR);

        public final SqlColumn<Long> userOid = column("`user_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public OracleCreateDatabaseDbLinkStatement() {
            super("oracle_create_database_db_link_statement");
        }
    }
}