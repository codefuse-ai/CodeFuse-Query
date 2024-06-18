package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReturnStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: return_statement")
    public static final ReturnStatement returnStatement = new ReturnStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: return_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = returnStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: return_statement.return_expression_hash_id")
    public static final SqlColumn<Long> returnExpressionHashId = returnStatement.returnExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: return_statement")
    public static final class ReturnStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> returnExpressionHashId = column("return_expression_hash_id", JDBCType.BIGINT);

        public ReturnStatement() {
            super("return_statement");
        }
    }
}