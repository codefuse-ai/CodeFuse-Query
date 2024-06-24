package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NameStringDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    public static final NameString nameString = new NameString();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = nameString.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.name_element_hash_id")
    public static final SqlColumn<Long> nameElementHashId = nameString.nameElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: name_string.value_element_hash_id")
    public static final SqlColumn<Long> valueElementHashId = nameString.valueElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    public static final class NameString extends SqlTable {
        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> nameElementHashId = column("name_element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> valueElementHashId = column("value_element_hash_id", JDBCType.BIGINT);

        public NameString() {
            super("name_string");
        }
    }
}