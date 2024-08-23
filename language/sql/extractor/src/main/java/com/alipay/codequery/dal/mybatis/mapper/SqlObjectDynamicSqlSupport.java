package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlObjectDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    public static final SqlObject sqlObject = new SqlObject();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.oid")
    public static final SqlColumn<Long> oid = sqlObject.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.parent_oid")
    public static final SqlColumn<Long> parentOid = sqlObject.parentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.location_oid")
    public static final SqlColumn<Long> locationOid = sqlObject.locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.node_type")
    public static final SqlColumn<String> nodeType = sqlObject.nodeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.index_in_parent")
    public static final SqlColumn<Integer> indexInParent = sqlObject.indexInParent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.after_comments_direct")
    public static final SqlColumn<String> afterCommentsDirect = sqlObject.afterCommentsDirect;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.before_comments_direct")
    public static final SqlColumn<String> beforeCommentsDirect = sqlObject.beforeCommentsDirect;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.db_type")
    public static final SqlColumn<String> dbType = sqlObject.dbType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.debug_message")
    public static final SqlColumn<String> debugMessage = sqlObject.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    public static final class SqlObject extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> parentOid = column("`parent_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> locationOid = column("`location_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> nodeType = column("`node_type`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> indexInParent = column("`index_in_parent`", JDBCType.BIGINT);

        public final SqlColumn<String> afterCommentsDirect = column("`after_comments_direct`", JDBCType.VARCHAR);

        public final SqlColumn<String> beforeCommentsDirect = column("`before_comments_direct`", JDBCType.VARCHAR);

        public final SqlColumn<String> dbType = column("`db_type`", JDBCType.VARCHAR);

        public final SqlColumn<String> debugMessage = column("`debug_message`", JDBCType.VARCHAR);

        public SqlObject() {
            super("sql_object");
        }
    }
}