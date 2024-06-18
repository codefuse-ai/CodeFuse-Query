package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FloatingPointLiteralDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: floating_point_literal")
    public static final FloatingPointLiteral floatingPointLiteral = new FloatingPointLiteral();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: floating_point_literal.element_hash_id")
    public static final SqlColumn<Long> elementHashId = floatingPointLiteral.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: floating_point_literal.value")
    public static final SqlColumn<String> value = floatingPointLiteral.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: floating_point_literal")
    public static final class FloatingPointLiteral extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public FloatingPointLiteral() {
            super("floating_point_literal");
        }
    }
}