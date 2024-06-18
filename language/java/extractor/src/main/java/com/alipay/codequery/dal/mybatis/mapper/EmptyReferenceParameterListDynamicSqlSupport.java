package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EmptyReferenceParameterListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    public static final EmptyReferenceParameterList emptyReferenceParameterList = new EmptyReferenceParameterList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: empty_reference_parameter_list.list_hash_id")
    public static final SqlColumn<Long> listHashId = emptyReferenceParameterList.listHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: empty_reference_parameter_list.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = emptyReferenceParameterList.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: empty_reference_parameter_list.debug_message")
    public static final SqlColumn<String> debugMessage = emptyReferenceParameterList.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: empty_reference_parameter_list.location_hash_id")
    public static final SqlColumn<Long> locationHashId = emptyReferenceParameterList.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    public static final class EmptyReferenceParameterList extends SqlTable {
        public final SqlColumn<Long> listHashId = column("list_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public EmptyReferenceParameterList() {
            super("empty_reference_parameter_list");
        }
    }
}