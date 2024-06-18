package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CommentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: comment")
    public static final Comment comment = new Comment();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: comment.element_hash_id")
    public static final SqlColumn<Long> elementHashId = comment.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: comment.text")
    public static final SqlColumn<String> text = comment.text;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: comment.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = comment.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: comment.location_hash_id")
    public static final SqlColumn<Long> locationHashId = comment.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: comment.comment_type")
    public static final SqlColumn<String> commentType = comment.commentType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: comment")
    public static final class Comment extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> text = column("text", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> commentType = column("comment_type", JDBCType.VARCHAR);

        public Comment() {
            super("comment");
        }
    }
}