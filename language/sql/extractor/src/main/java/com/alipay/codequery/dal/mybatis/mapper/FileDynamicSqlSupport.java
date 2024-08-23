package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FileDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public static final File file = new File();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.oid")
    public static final SqlColumn<Long> oid = file.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.relative_path")
    public static final SqlColumn<String> relativePath = file.relativePath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.extension")
    public static final SqlColumn<String> extension = file.extension;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.name")
    public static final SqlColumn<String> name = file.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.corpus_oid")
    public static final SqlColumn<Long> corpusOid = file.corpusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public static final class File extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> relativePath = column("`relative_path`", JDBCType.VARCHAR);

        public final SqlColumn<String> extension = column("`extension`", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<Long> corpusOid = column("`corpus_oid`", JDBCType.BIGINT);

        public File() {
            super("file");
        }
    }
}