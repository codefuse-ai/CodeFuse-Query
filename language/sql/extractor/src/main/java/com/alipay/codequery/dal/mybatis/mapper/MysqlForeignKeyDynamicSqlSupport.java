package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlForeignKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    public static final MysqlForeignKey mysqlForeignKey = new MysqlForeignKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.oid")
    public static final SqlColumn<Long> oid = mysqlForeignKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.index_name_oid")
    public static final SqlColumn<Long> indexNameOid = mysqlForeignKey.indexNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.is_has_constraint")
    public static final SqlColumn<Integer> isHasConstraint = mysqlForeignKey.isHasConstraint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.on_delete")
    public static final SqlColumn<String> onDelete = mysqlForeignKey.onDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.on_update")
    public static final SqlColumn<String> onUpdate = mysqlForeignKey.onUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.reference_match")
    public static final SqlColumn<String> referenceMatch = mysqlForeignKey.referenceMatch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    public static final class MysqlForeignKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexNameOid = column("`index_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isHasConstraint = column("`is_has_constraint`", JDBCType.BIGINT);

        public final SqlColumn<String> onDelete = column("`on_delete`", JDBCType.VARCHAR);

        public final SqlColumn<String> onUpdate = column("`on_update`", JDBCType.VARCHAR);

        public final SqlColumn<String> referenceMatch = column("`reference_match`", JDBCType.VARCHAR);

        public MysqlForeignKey() {
            super("mysql_foreign_key");
        }
    }
}