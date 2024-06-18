package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NpMethodDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_method")
    public static final NpMethod npMethod = new NpMethod();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_method.element_hash_id")
    public static final SqlColumn<Long> elementHashId = npMethod.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_method.name")
    public static final SqlColumn<String> name = npMethod.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_method.signature")
    public static final SqlColumn<String> signature = npMethod.signature;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_method.type_hash_id")
    public static final SqlColumn<Long> typeHashId = npMethod.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_method.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = npMethod.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_method")
    public static final class NpMethod extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> signature = column("signature", JDBCType.VARCHAR);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public NpMethod() {
            super("np_method");
        }
    }
}