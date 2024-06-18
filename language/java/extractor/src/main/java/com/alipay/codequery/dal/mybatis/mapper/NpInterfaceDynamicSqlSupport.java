package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NpInterfaceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_interface")
    public static final NpInterface npInterface = new NpInterface();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_interface.element_hash_id")
    public static final SqlColumn<Long> elementHashId = npInterface.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_interface.name")
    public static final SqlColumn<String> name = npInterface.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_interface.qualified_name")
    public static final SqlColumn<String> qualifiedName = npInterface.qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_interface.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = npInterface.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_interface")
    public static final class NpInterface extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> qualifiedName = column("qualified_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public NpInterface() {
            super("np_interface");
        }
    }
}