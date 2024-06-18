package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CodeBlockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: code_block")
    public static final CodeBlock codeBlock = new CodeBlock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.element_hash_id")
    public static final SqlColumn<Long> elementHashId = codeBlock.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.number_of_statement")
    public static final SqlColumn<Integer> numberOfStatement = codeBlock.numberOfStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = codeBlock.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.is_empty")
    public static final SqlColumn<Integer> isEmpty = codeBlock.isEmpty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.location_hash_id")
    public static final SqlColumn<Long> locationHashId = codeBlock.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: code_block.debug_message")
    public static final SqlColumn<String> debugMessage = codeBlock.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: code_block")
    public static final class CodeBlock extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> numberOfStatement = column("number_of_statement", JDBCType.INTEGER);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> isEmpty = column("is_empty", JDBCType.INTEGER);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public CodeBlock() {
            super("code_block");
        }
    }
}