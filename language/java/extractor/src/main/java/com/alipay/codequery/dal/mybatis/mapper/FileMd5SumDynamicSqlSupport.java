package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FileMd5SumDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_md5_sum")
    public static final FileMd5Sum fileMd5Sum = new FileMd5Sum();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file_md5_sum.file_hash_id")
    public static final SqlColumn<Long> fileHashId = fileMd5Sum.fileHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file_md5_sum.value")
    public static final SqlColumn<String> value = fileMd5Sum.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_md5_sum")
    public static final class FileMd5Sum extends SqlTable {
        public final SqlColumn<Long> fileHashId = column("file_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public FileMd5Sum() {
            super("file_md5_sum");
        }
    }
}