package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BooleanLiteralDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: boolean_literal")
    public static final BooleanLiteral booleanLiteral = new BooleanLiteral();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: boolean_literal.element_hash_id")
    public static final SqlColumn<Long> elementHashId = booleanLiteral.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: boolean_literal.value")
    public static final SqlColumn<String> value = booleanLiteral.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: boolean_literal")
    public static final class BooleanLiteral extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public BooleanLiteral() {
            super("boolean_literal");
        }
    }
}