package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReferenceListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    public static final ReferenceList referenceList = new ReferenceList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.element_hash_id")
    public static final SqlColumn<Long> elementHashId = referenceList.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.location_hash_id")
    public static final SqlColumn<Long> locationHashId = referenceList.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = referenceList.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.debug_message")
    public static final SqlColumn<String> debugMessage = referenceList.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_list.role")
    public static final SqlColumn<String> role = referenceList.role;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    public static final class ReferenceList extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<String> role = column("role", JDBCType.VARCHAR);

        public ReferenceList() {
            super("reference_list");
        }
    }
}