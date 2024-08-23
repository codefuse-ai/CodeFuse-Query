package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlUniqueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_unique")
    public static final SqlUnique sqlUnique = new SqlUnique();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_unique.oid")
    public static final SqlColumn<Long> oid = sqlUnique.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_unique.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlUnique.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_unique.index_definition_oid")
    public static final SqlColumn<Long> indexDefinitionOid = sqlUnique.indexDefinitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_unique.name_oid")
    public static final SqlColumn<Long> nameOid = sqlUnique.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_unique")
    public static final class SqlUnique extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexDefinitionOid = column("`index_definition_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlUnique() {
            super("sql_unique");
        }
    }
}