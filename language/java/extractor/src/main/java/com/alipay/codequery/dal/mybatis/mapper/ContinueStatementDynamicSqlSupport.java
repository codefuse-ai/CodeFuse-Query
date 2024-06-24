package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ContinueStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: continue_statement")
    public static final ContinueStatement continueStatement = new ContinueStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: continue_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = continueStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: continue_statement.continued_statement_hash_id")
    public static final SqlColumn<Long> continuedStatementHashId = continueStatement.continuedStatementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: continue_statement")
    public static final class ContinueStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> continuedStatementHashId = column("continued_statement_hash_id", JDBCType.BIGINT);

        public ContinueStatement() {
            super("continue_statement");
        }
    }
}