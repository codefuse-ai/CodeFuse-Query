package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterTableAlterFullTextIndexDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    public static final MySqlAlterTableAlterFullTextIndex mySqlAlterTableAlterFullTextIndex = new MySqlAlterTableAlterFullTextIndex();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.oid")
    public static final SqlColumn<Long> oid = mySqlAlterTableAlterFullTextIndex.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.analyzer_name_oid")
    public static final SqlColumn<Long> analyzerNameOid = mySqlAlterTableAlterFullTextIndex.analyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.analyzer_type")
    public static final SqlColumn<String> analyzerType = mySqlAlterTableAlterFullTextIndex.analyzerType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_full_text_index.index_name_oid")
    public static final SqlColumn<Long> indexNameOid = mySqlAlterTableAlterFullTextIndex.indexNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    public static final class MySqlAlterTableAlterFullTextIndex extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> analyzerNameOid = column("`analyzer_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> analyzerType = column("`analyzer_type`", JDBCType.VARCHAR);

        public final SqlColumn<Long> indexNameOid = column("`index_name_oid`", JDBCType.BIGINT);

        public MySqlAlterTableAlterFullTextIndex() {
            super("my_sql_alter_table_alter_full_text_index");
        }
    }
}