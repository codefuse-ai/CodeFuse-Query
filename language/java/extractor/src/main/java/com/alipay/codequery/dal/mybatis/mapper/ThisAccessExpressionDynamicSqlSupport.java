package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ThisAccessExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: this_access_expression")
    public static final ThisAccessExpression thisAccessExpression = new ThisAccessExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: this_access_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = thisAccessExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: this_access_expression")
    public static final class ThisAccessExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public ThisAccessExpression() {
            super("this_access_expression");
        }
    }
}