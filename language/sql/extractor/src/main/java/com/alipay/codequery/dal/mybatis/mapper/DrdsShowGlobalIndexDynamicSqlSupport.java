package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DrdsShowGlobalIndexDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_global_index")
    public static final DrdsShowGlobalIndex drdsShowGlobalIndex = new DrdsShowGlobalIndex();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_global_index.oid")
    public static final SqlColumn<Long> oid = drdsShowGlobalIndex.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_global_index.table_name_oid")
    public static final SqlColumn<Long> tableNameOid = drdsShowGlobalIndex.tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_global_index")
    public static final class DrdsShowGlobalIndex extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableNameOid = column("`table_name_oid`", JDBCType.BIGINT);

        public DrdsShowGlobalIndex() {
            super("drds_show_global_index");
        }
    }
}