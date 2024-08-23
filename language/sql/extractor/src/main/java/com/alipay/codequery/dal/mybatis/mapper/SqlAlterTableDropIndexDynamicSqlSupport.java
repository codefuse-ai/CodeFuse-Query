package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDropIndexDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_index")
    public static final SqlAlterTableDropIndex sqlAlterTableDropIndex = new SqlAlterTableDropIndex();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_index.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDropIndex.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_index.index_name_oid")
    public static final SqlColumn<Long> indexNameOid = sqlAlterTableDropIndex.indexNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_index")
    public static final class SqlAlterTableDropIndex extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexNameOid = column("`index_name_oid`", JDBCType.BIGINT);

        public SqlAlterTableDropIndex() {
            super("sql_alter_table_drop_index");
        }
    }
}