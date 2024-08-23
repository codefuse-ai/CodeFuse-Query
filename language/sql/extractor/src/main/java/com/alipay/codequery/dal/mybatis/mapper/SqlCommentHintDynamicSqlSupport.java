package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCommentHintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_comment_hint")
    public static final SqlCommentHint sqlCommentHint = new SqlCommentHint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_comment_hint.oid")
    public static final SqlColumn<Long> oid = sqlCommentHint.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_comment_hint.text")
    public static final SqlColumn<String> text = sqlCommentHint.text;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_comment_hint")
    public static final class SqlCommentHint extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> text = column("`text`", JDBCType.VARCHAR);

        public SqlCommentHint() {
            super("sql_comment_hint");
        }
    }
}