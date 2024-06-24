package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NumberOfLinesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: number_of_lines")
    public static final NumberOfLines numberOfLines = new NumberOfLines();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.element_hash_id")
    public static final SqlColumn<Long> elementHashId = numberOfLines.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_total_lines")
    public static final SqlColumn<Integer> numberOfTotalLines = numberOfLines.numberOfTotalLines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_valid_lines")
    public static final SqlColumn<Integer> numberOfValidLines = numberOfLines.numberOfValidLines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: number_of_lines.number_of_comment_lines")
    public static final SqlColumn<Integer> numberOfCommentLines = numberOfLines.numberOfCommentLines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: number_of_lines")
    public static final class NumberOfLines extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> numberOfTotalLines = column("number_of_total_lines", JDBCType.INTEGER);

        public final SqlColumn<Integer> numberOfValidLines = column("number_of_valid_lines", JDBCType.INTEGER);

        public final SqlColumn<Integer> numberOfCommentLines = column("number_of_comment_lines", JDBCType.INTEGER);

        public NumberOfLines() {
            super("number_of_lines");
        }
    }
}