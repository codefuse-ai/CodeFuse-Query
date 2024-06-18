package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StringLiteralDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: string_literal")
    public static final StringLiteral stringLiteral = new StringLiteral();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: string_literal.element_hash_id")
    public static final SqlColumn<Long> elementHashId = stringLiteral.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: string_literal.value")
    public static final SqlColumn<String> value = stringLiteral.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: string_literal")
    public static final class StringLiteral extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public StringLiteral() {
            super("string_literal");
        }
    }
}