package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PackageStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    public static final PackageStatement packageStatement = new PackageStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: package_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = packageStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: package_statement.qualified_name")
    public static final SqlColumn<String> qualifiedName = packageStatement.qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: package_statement.location_hash_id")
    public static final SqlColumn<Long> locationHashId = packageStatement.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: package_statement.package_hash_id")
    public static final SqlColumn<Long> packageHashId = packageStatement.packageHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: package_statement.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = packageStatement.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    public static final class PackageStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> qualifiedName = column("qualified_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> packageHashId = column("package_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public PackageStatement() {
            super("package_statement");
        }
    }
}