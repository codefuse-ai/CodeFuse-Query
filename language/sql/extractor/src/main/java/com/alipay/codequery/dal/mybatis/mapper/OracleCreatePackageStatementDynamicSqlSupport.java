package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleCreatePackageStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_package_statement")
    public static final OracleCreatePackageStatement oracleCreatePackageStatement = new OracleCreatePackageStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_package_statement.oid")
    public static final SqlColumn<Long> oid = oracleCreatePackageStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_package_statement.is_body")
    public static final SqlColumn<Integer> isBody = oracleCreatePackageStatement.isBody;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_package_statement.is_or_replace")
    public static final SqlColumn<Integer> isOrReplace = oracleCreatePackageStatement.isOrReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_package_statement.name_oid")
    public static final SqlColumn<Long> nameOid = oracleCreatePackageStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_package_statement")
    public static final class OracleCreatePackageStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBody = column("`is_body`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOrReplace = column("`is_or_replace`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public OracleCreatePackageStatement() {
            super("oracle_create_package_statement");
        }
    }
}