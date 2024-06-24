package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EmptyStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_statement")
    public static final EmptyStatement emptyStatement = new EmptyStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: empty_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = emptyStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_statement")
    public static final class EmptyStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public EmptyStatement() {
            super("empty_statement");
        }
    }
}