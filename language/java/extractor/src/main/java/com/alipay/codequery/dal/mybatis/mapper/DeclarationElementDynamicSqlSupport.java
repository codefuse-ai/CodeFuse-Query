package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DeclarationElementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    public static final DeclarationElement declarationElement = new DeclarationElement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.element_hash_id")
    public static final SqlColumn<Long> elementHashId = declarationElement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.index_order")
    public static final SqlColumn<Integer> indexOrder = declarationElement.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: declaration_element.declaration_statement_hash_id")
    public static final SqlColumn<Long> declarationStatementHashId = declarationElement.declarationStatementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    public static final class DeclarationElement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public final SqlColumn<Long> declarationStatementHashId = column("declaration_statement_hash_id", JDBCType.BIGINT);

        public DeclarationElement() {
            super("declaration_element");
        }
    }
}