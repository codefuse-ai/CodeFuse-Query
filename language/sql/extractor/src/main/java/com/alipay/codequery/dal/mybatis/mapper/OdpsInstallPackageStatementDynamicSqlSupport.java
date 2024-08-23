package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsInstallPackageStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_install_package_statement")
    public static final OdpsInstallPackageStatement odpsInstallPackageStatement = new OdpsInstallPackageStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_install_package_statement.oid")
    public static final SqlColumn<Long> oid = odpsInstallPackageStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_install_package_statement.package_name_oid")
    public static final SqlColumn<Long> packageNameOid = odpsInstallPackageStatement.packageNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_install_package_statement")
    public static final class OdpsInstallPackageStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> packageNameOid = column("`package_name_oid`", JDBCType.BIGINT);

        public OdpsInstallPackageStatement() {
            super("odps_install_package_statement");
        }
    }
}