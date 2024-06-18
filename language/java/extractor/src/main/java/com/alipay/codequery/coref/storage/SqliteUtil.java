package com.alipay.codequery.coref.storage;

import com.alipay.codequery.coref.util.CmdUtils;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import lombok.extern.log4j.Log4j2;

import java.io.File;
import java.sql.*;
import java.util.*;

@Log4j2
public class SqliteUtil {
    private static Connection connect(String filePath) {
        Connection conn = null;
        try {
            String url = String.format("jdbc:sqlite:%s", filePath);
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public static void importSqlite(String dir, String targetFilePath) {
        File dirFile = new File(dir);
        File[] files = dirFile.listFiles();
        for (File sliceDir : files) {
            importSqliteSlice(sliceDir, targetFilePath);
        }
    }

    public static void importSqlite(Collection<File> fileList, String targetFilePath) {
        for (File sliceDir : fileList) {
            importSqliteSlice(sliceDir, targetFilePath);
        }
    }

    private static void importSqliteSlice(File dir, String targetFilePath) {
        List<String> blackList = new ArrayList<>();
        blackList.add("primitive");
        blackList.add("sql_master");
        Set<String> tableNameList = new HashSet<>(getTableNameList(targetFilePath));
        String insertSqlFormat = "insert into %s select * from toMerge.%s;";
        StringBuilder insertSqlBuilder = new StringBuilder();
        for (String table : tableNameList) {
            if (blackList.contains(table)) {
                continue;
            }
            String insertSql = String.format(insertSqlFormat, table, table);
            insertSqlBuilder.append(insertSql);
        }

        /**
         *  调用sqlite原生attach命令，将每个表的数据合并到最终db的表中。
         *
         *  举例一个命令如下：
         *    attach coref_src.db as toMerge;
         *    BEGIN;
         *    insert into table1 select * from toMerge.table1;
         *    insert into table2 select * from toMerge.table2;
         *    ...
         *    COMMIT;
         *    detach toMerge;
         */
        String sql = "attach '%s' as toMerge;\n" +
            "BEGIN;\n" +
            "%s \n" +
            "COMMIT;\n" +
            "detach toMerge;\n";
        sql = String.format(sql, dir.getAbsolutePath(), insertSqlBuilder.toString());
        log.trace("Attach sql:\n" + sql);

        try {
            Connection conn = connect(targetFilePath);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static List<String> getTableNameList(String targetFilePath) {
        String sql = "select tbl_name from sqlite_master";
        List<String> tableNameList = new ArrayList<>();
        try (Connection conn = connect(targetFilePath);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                tableNameList.add(rs.getString("tbl_name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tableNameList;
    }

    public static void importCSV(String dir, String targetSqlitePath) {
        File dirFile = new File(dir);
        File[] files = dirFile.listFiles(File::isDirectory);
        for (File sliceDir : files) {
            importCsvSlice(sliceDir, targetSqlitePath);
        }
    }

    private static void importCsvSlice(File dir, String targetSqlitePath) {
        File[] files = dir.listFiles();
        for (File tableFile : files) {
            if (tableFile.getName().endsWith(".csv")) {
                importCsvToTable(tableFile, targetSqlitePath);
            }
        }

    }

    private static void importCsvToTable(File csvFile, String targetSqlitePath) {
        String filePath = csvFile.getAbsolutePath();
        String tableName = csvFile.getName().replace(".csv", "");
        String dotImportClause = String.format(".import %s %s --csv", filePath, tableName);

        String[] cmd = {
            "sqlite3",
            targetSqlitePath,
            dotImportClause
        };
        CmdUtils.runExternalCommand(cmd);
    }

    public static void compare(String file1, String file2) {
        Map<String, Long> map1 = getTableStats(file1);
        Map<String, Long> map2 = getTableStats(file2);
        System.out.printf("db1: %s%n", file1);
        System.out.printf("db2: %s%n", file2);
        System.out.printf("db1 db2 tables: %s, %s%n", map1.size(), map2.size());

        MapDifference<String, Long> diff = Maps.difference(map1, map2);
        String statStr = String.format("same, different: %s, %s", diff.entriesInCommon().size(), diff.entriesDiffering().size());
        System.out.println(statStr);

        Map<String, MapDifference.ValueDifference<Long>> entriesDiffering = diff.entriesDiffering();

        for (Map.Entry<String, MapDifference.ValueDifference<Long>> entry : entriesDiffering.entrySet()) {
            String tableName = entry.getKey();
            Long val1 = entry.getValue().leftValue();
            Long val2 = entry.getValue().rightValue();
            String outString = String.format("%s (%s, %s)", tableName, val1, val2);
            System.out.println(outString);
        }
    }

    private static Long getTableCount(String table, Connection connection) {
        String sql = String.format("select count(*) from %s", table);
        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);
            String countStr = resultSet.getString(1);
            return Long.parseLong(countStr);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    // counts the uniquer values of a specified column in a table.
    private static Long getTableDistinctCountByColumn(String table, String column, Connection connection) {
        String sql = String.format("select count(distinct(%s)) from %s", column, table);
        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);
            String countStr = resultSet.getString(1);
            return Long.parseLong(countStr);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    // check the uniqueness of a specified column in a table.
    public static boolean isUniqueColumn(String table, String column, String filePath) {
        Connection connection = connect(filePath);
        Long tableCount = getTableCount(table, connection);
        Long columnCount = getTableDistinctCountByColumn(table, column, connection);
        return tableCount.equals(columnCount);
    }

    public static Map<String, Long> getTableStats(String filePath) {
        List<String> tables1 = getTableNameList(filePath);
        Connection connection1 = connect(filePath);
        Map<String, Long> map1 = new HashMap<>();
        for (String table : tables1) {
            Long tableCount = getTableCount(table, connection1);
            map1.put(table, tableCount);
        }
        return map1;
    }
    //select specified column values of a table.
    public static List<String> getRecordValue(String table, String column, String filePath) {
        Connection connection = connect(filePath);
        String sql = String.format("select %s from %s", column, table);
        List<String> result = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                result.add(resultSet.getString(column));
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

}
