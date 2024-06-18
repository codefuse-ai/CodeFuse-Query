package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BreakStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: break_statement")
    public static final BreakStatement breakStatement = new BreakStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: break_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = breakStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: break_statement.exited_statement_hash_id")
    public static final SqlColumn<Long> exitedStatementHashId = breakStatement.exitedStatementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: break_statement")
    public static final class BreakStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> exitedStatementHashId = column("exited_statement_hash_id", JDBCType.BIGINT);

        public BreakStatement() {
            super("break_statement");
        }
    }
}