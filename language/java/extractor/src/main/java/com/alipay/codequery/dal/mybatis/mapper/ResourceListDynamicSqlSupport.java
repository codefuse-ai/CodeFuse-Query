package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ResourceListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: resource_list")
    public static final ResourceList resourceList = new ResourceList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: resource_list.element_hash_id")
    public static final SqlColumn<Long> elementHashId = resourceList.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: resource_list.debug_message")
    public static final SqlColumn<String> debugMessage = resourceList.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: resource_list.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = resourceList.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: resource_list.location_hash_id")
    public static final SqlColumn<Long> locationHashId = resourceList.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: resource_list")
    public static final class ResourceList extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public ResourceList() {
            super("resource_list");
        }
    }
}