package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NullLiteralDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: null_literal")
    public static final NullLiteral nullLiteral = new NullLiteral();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: null_literal.element_hash_id")
    public static final SqlColumn<Long> elementHashId = nullLiteral.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: null_literal.value")
    public static final SqlColumn<String> value = nullLiteral.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: null_literal")
    public static final class NullLiteral extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public NullLiteral() {
            super("null_literal");
        }
    }
}