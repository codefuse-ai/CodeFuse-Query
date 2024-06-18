package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SynchronizedStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    public static final SynchronizedStatement synchronizedStatement = new SynchronizedStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = synchronizedStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.lock_expression_hash_id")
    public static final SqlColumn<Long> lockExpressionHashId = synchronizedStatement.lockExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: synchronized_statement.body_declaration_hash_id")
    public static final SqlColumn<Long> bodyDeclarationHashId = synchronizedStatement.bodyDeclarationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    public static final class SynchronizedStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> lockExpressionHashId = column("lock_expression_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> bodyDeclarationHashId = column("body_declaration_hash_id", JDBCType.BIGINT);

        public SynchronizedStatement() {
            super("synchronized_statement");
        }
    }
}