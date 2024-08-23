package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableSetCommentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_set_comment")
    public static final SqlAlterTableSetComment sqlAlterTableSetComment = new SqlAlterTableSetComment();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_set_comment.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableSetComment.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_set_comment.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlAlterTableSetComment.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_set_comment")
    public static final class SqlAlterTableSetComment extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public SqlAlterTableSetComment() {
            super("sql_alter_table_set_comment");
        }
    }
}