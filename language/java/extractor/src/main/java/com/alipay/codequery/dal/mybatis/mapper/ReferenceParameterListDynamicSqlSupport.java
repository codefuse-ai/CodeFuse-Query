package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReferenceParameterListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    public static final ReferenceParameterList referenceParameterList = new ReferenceParameterList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.type_element_hash_id")
    public static final SqlColumn<Long> typeElementHashId = referenceParameterList.typeElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.list_hash_id")
    public static final SqlColumn<Long> listHashId = referenceParameterList.listHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.index_order")
    public static final SqlColumn<Integer> indexOrder = referenceParameterList.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = referenceParameterList.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.debug_message")
    public static final SqlColumn<String> debugMessage = referenceParameterList.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_parameter_list.location_hash_id")
    public static final SqlColumn<Long> locationHashId = referenceParameterList.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    public static final class ReferenceParameterList extends SqlTable {
        public final SqlColumn<Long> typeElementHashId = column("type_element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> listHashId = column("list_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public ReferenceParameterList() {
            super("reference_parameter_list");
        }
    }
}