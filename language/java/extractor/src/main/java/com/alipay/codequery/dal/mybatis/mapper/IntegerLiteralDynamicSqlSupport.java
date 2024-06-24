package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IntegerLiteralDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: integer_literal")
    public static final IntegerLiteral integerLiteral = new IntegerLiteral();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: integer_literal.element_hash_id")
    public static final SqlColumn<Long> elementHashId = integerLiteral.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: integer_literal.value")
    public static final SqlColumn<String> value = integerLiteral.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: integer_literal")
    public static final class IntegerLiteral extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public IntegerLiteral() {
            super("integer_literal");
        }
    }
}