package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DoubleLiteralDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: double_literal")
    public static final DoubleLiteral doubleLiteral = new DoubleLiteral();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: double_literal.element_hash_id")
    public static final SqlColumn<Long> elementHashId = doubleLiteral.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: double_literal.value")
    public static final SqlColumn<String> value = doubleLiteral.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: double_literal")
    public static final class DoubleLiteral extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public DoubleLiteral() {
            super("double_literal");
        }
    }
}