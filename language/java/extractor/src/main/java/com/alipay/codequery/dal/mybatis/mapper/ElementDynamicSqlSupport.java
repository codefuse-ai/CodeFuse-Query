package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ElementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    public static final Element element = new Element();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: element.element_hash_id")
    public static final SqlColumn<Long> elementHashId = element.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: element.type")
    public static final SqlColumn<String> type = element.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: element.parent_id")
    public static final SqlColumn<Long> parentId = element.parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: element.parent_type")
    public static final SqlColumn<String> parentType = element.parentType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    public static final class Element extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("type", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentId = column("parent_id", JDBCType.BIGINT);

        public final SqlColumn<String> parentType = column("parent_type", JDBCType.VARCHAR);

        public Element() {
            super("element");
        }
    }
}