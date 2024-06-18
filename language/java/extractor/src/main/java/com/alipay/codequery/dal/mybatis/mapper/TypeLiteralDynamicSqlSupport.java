package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TypeLiteralDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    public static final TypeLiteral typeLiteral = new TypeLiteral();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_literal.element_hash_id")
    public static final SqlColumn<Long> elementHashId = typeLiteral.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_literal.type_element_hash_id")
    public static final SqlColumn<Long> typeElementHashId = typeLiteral.typeElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_literal.type_hash_id")
    public static final SqlColumn<Long> typeHashId = typeLiteral.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    public static final class TypeLiteral extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> typeElementHashId = column("type_element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public TypeLiteral() {
            super("type_literal");
        }
    }
}