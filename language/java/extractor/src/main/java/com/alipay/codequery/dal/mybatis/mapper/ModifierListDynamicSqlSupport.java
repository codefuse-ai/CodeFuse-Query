package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ModifierListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier_list")
    public static final ModifierList modifierList = new ModifierList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: modifier_list.element_hash_id")
    public static final SqlColumn<Long> elementHashId = modifierList.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: modifier_list.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = modifierList.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: modifier_list.location_hash_id")
    public static final SqlColumn<Long> locationHashId = modifierList.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier_list")
    public static final class ModifierList extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public ModifierList() {
            super("modifier_list");
        }
    }
}