package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InterfaceInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    public static final InterfaceInfo interfaceInfo = new InterfaceInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.element_hash_id")
    public static final SqlColumn<Long> elementHashId = interfaceInfo.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.qualified_name")
    public static final SqlColumn<String> qualifiedName = interfaceInfo.qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.identifier_hash_id")
    public static final SqlColumn<Long> identifierHashId = interfaceInfo.identifierHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.location_hash_id")
    public static final SqlColumn<Long> locationHashId = interfaceInfo.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: interface.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = interfaceInfo.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    public static final class InterfaceInfo extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> qualifiedName = column("qualified_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> identifierHashId = column("identifier_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public InterfaceInfo() {
            super("interface");
        }
    }
}