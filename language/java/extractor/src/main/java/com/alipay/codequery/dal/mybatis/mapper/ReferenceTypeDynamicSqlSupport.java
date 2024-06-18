package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReferenceTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    public static final ReferenceType referenceType = new ReferenceType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_type.oid")
    public static final SqlColumn<Long> oid = referenceType.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_type.name")
    public static final SqlColumn<String> name = referenceType.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_type.qualified_name")
    public static final SqlColumn<String> qualifiedName = referenceType.qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    public static final class ReferenceType extends SqlTable {
        public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> qualifiedName = column("qualified_name", JDBCType.VARCHAR);

        public ReferenceType() {
            super("reference_type");
        }
    }
}