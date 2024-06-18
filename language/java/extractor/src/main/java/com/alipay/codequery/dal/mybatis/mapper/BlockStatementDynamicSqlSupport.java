package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BlockStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: block_statement")
    public static final BlockStatement blockStatement = new BlockStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: block_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = blockStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: block_statement.code_block_hash_id")
    public static final SqlColumn<Long> codeBlockHashId = blockStatement.codeBlockHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: block_statement")
    public static final class BlockStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> codeBlockHashId = column("code_block_hash_id", JDBCType.BIGINT);

        public BlockStatement() {
            super("block_statement");
        }
    }
}