package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LongLiteralDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: long_literal")
    public static final LongLiteral longLiteral = new LongLiteral();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: long_literal.element_hash_id")
    public static final SqlColumn<Long> elementHashId = longLiteral.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: long_literal.value")
    public static final SqlColumn<String> value = longLiteral.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: long_literal")
    public static final class LongLiteral extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public LongLiteral() {
            super("long_literal");
        }
    }
}