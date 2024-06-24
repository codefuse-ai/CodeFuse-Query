package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PrimitiveDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: primitive")
    public static final Primitive primitive = new Primitive();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: primitive.oid")
    public static final SqlColumn<Integer> oid = primitive.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: primitive.name")
    public static final SqlColumn<String> name = primitive.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: primitive")
    public static final class Primitive extends SqlTable {
        public final SqlColumn<Integer> oid = column("oid", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public Primitive() {
            super("primitive");
        }
    }
}