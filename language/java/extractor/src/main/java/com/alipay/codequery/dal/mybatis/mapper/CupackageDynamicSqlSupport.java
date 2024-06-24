package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CupackageDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    public static final Cupackage cupackage = new Cupackage();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cupackage.file_hash_id")
    public static final SqlColumn<Long> fileHashId = cupackage.fileHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cupackage.package_hash_id")
    public static final SqlColumn<Long> packageHashId = cupackage.packageHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    public static final class Cupackage extends SqlTable {
        public final SqlColumn<Long> fileHashId = column("file_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> packageHashId = column("package_hash_id", JDBCType.BIGINT);

        public Cupackage() {
            super("cupackage");
        }
    }
}