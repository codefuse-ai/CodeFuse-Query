package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SuperAccessExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_access_expression")
    public static final SuperAccessExpression superAccessExpression = new SuperAccessExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: super_access_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = superAccessExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_access_expression")
    public static final class SuperAccessExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public SuperAccessExpression() {
            super("super_access_expression");
        }
    }
}