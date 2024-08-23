package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    public static final MySqlKey mySqlKey = new MySqlKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.oid")
    public static final SqlColumn<Long> oid = mySqlKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.index_type")
    public static final SqlColumn<String> indexType = mySqlKey.indexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.is_has_constraint")
    public static final SqlColumn<Integer> isHasConstraint = mySqlKey.isHasConstraint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_key.key_block_size_oid")
    public static final SqlColumn<Long> keyBlockSizeOid = mySqlKey.keyBlockSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    public static final class MySqlKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> indexType = column("`index_type`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isHasConstraint = column("`is_has_constraint`", JDBCType.BIGINT);

        public final SqlColumn<Long> keyBlockSizeOid = column("`key_block_size_oid`", JDBCType.BIGINT);

        public MySqlKey() {
            super("my_sql_key");
        }
    }
}