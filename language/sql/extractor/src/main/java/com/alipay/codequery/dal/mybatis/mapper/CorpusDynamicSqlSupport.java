package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CorpusDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: corpus")
    public static final Corpus corpus = new Corpus();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: corpus.oid")
    public static final SqlColumn<Long> oid = corpus.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: corpus.debug_message")
    public static final SqlColumn<String> debugMessage = corpus.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: corpus")
    public static final class Corpus extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("`debug_message`", JDBCType.VARCHAR);

        public Corpus() {
            super("corpus");
        }
    }
}