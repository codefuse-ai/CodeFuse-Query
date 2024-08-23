package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlEventScheduleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    public static final MySqlEventSchedule mySqlEventSchedule = new MySqlEventSchedule();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.oid")
    public static final SqlColumn<Long> oid = mySqlEventSchedule.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.at_oid")
    public static final SqlColumn<Long> atOid = mySqlEventSchedule.atOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.ends_oid")
    public static final SqlColumn<Long> endsOid = mySqlEventSchedule.endsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.every_oid")
    public static final SqlColumn<Long> everyOid = mySqlEventSchedule.everyOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.starts_oid")
    public static final SqlColumn<Long> startsOid = mySqlEventSchedule.startsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    public static final class MySqlEventSchedule extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> atOid = column("`at_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> endsOid = column("`ends_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> everyOid = column("`every_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> startsOid = column("`starts_oid`", JDBCType.BIGINT);

        public MySqlEventSchedule() {
            super("my_sql_event_schedule");
        }
    }
}