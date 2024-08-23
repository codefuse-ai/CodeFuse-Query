
package com.alipay.codequery.coref.sql.storage;

import org.apache.commons.io.IOUtils;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tk.mybatis.mapper.entity.Config;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.stream.Stream;


public class SqliteStorageFacade implements StorageFacade {

    public static final Logger logger = LogManager.getLogger(SqliteStorageFacade.class);

    private final SqlSessionFactory sqlSessionFactory;

    private final MapperHelper mapperHelper;

    private int batchSize = 2000;

    private final Map<Class, Set<Object>> cacheManager = Collections.synchronizedMap(new HashMap<>());

    private final String mapperPackage = "com.alipay.codequery.dal.mybatis.mapper";

    public SqliteStorageFacade(String dbDir, String dbFileName) throws IOException {
        createDBFileAndConstructSchema(dbDir, dbFileName);

        // init the mapper
        Config config = new Config();
        config.setIDENTITY("sqlite");
        config.setEnableMethodAnnotation(true);
        config.setNotEmpty(true);
        config.setCheckExampleEntityClass(true);
        config.setUseSimpleType(true);
        config.setEnumAsSimpleType(true);
        config.setWrapKeyword("`{0}`");
        mapperHelper = new MapperHelper();
        mapperHelper.setConfig(config);

        Properties properties = new Properties();
        properties.setProperty("driver", "org.sqlite.JDBC");
        properties.setProperty("url", "jdbc:sqlite:" + Paths.get(dbDir, dbFileName));
        properties.setProperty("username", "");
        properties.setProperty("password", "");

        DataSourceFactory factory = new PooledDataSourceFactory();
        DataSource dataSource = factory.getDataSource();
        factory.setProperties(properties);
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMappers(mapperPackage);

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        SqlSession session = sqlSessionFactory.openSession(false);
        mapperHelper.processConfiguration(session.getConfiguration());
        session.commit();
        session.close();
    }

    private void createDBFileAndConstructSchema(String dbDir, String corefDbName) throws IOException {
        Path destPath = Paths.get(dbDir, corefDbName);
        if (destPath.toFile().exists()) {
            try {
                Files.delete(destPath);
            } catch (IOException e) {
                logger.error("Cannot delete previously existed database file: {}, with exception: {}", destPath, e);
                throw e;
            }
        }

        // Open a connection and create tables indicated in dbschema.sql
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + destPath);
             Statement stmt = conn.createStatement()
        ) {
            InputStream in = this.getClass().getClassLoader().getResourceAsStream("dbschema.sql");
            assert in != null;
            String sql = IOUtils.toString(in, StandardCharsets.UTF_8);

            stmt.executeUpdate(sql);
            logger.info("Created tables in given database {}...", destPath);
        } catch (SQLException e) {
            logger.error("Cannot connect to the database file or create tables to it: {}, with exception: {}", destPath, e);
        }
    }

    private void insert(java.lang.Class mapperClass, Object object) {
        Set<Object> objectList = cacheManager.computeIfAbsent(mapperClass, k -> Collections.synchronizedSet(new HashSet<>()));
        objectList.add(object);
    }

    @Override
    public void commit() {
        SqlSession session = sqlSessionFactory.openSession(false);
        cacheManager.forEach((mapperClass, value) -> {
            List<Object> doList = new ArrayList<>(value);
            Object mapper = session.getMapper(mapperClass);
            try {
                // MENTION: here we use reflect to reduce the coding work, but make sense while the dal change.
                java.lang.reflect.Method method = mapper.getClass().getMethod("insertMultiple", Collection.class);
                // we must limit the batch insert size to avoid blob over-size crash
                Stream.iterate(0, n -> n + 1).limit(doList.size() / batchSize + 1)
                        .forEach(idx -> {
                                    int startIndex = idx * batchSize;
                                    int endIndex = Integer.min(startIndex + batchSize, doList.size());
                                    if (startIndex >= doList.size()) {
                                        return;
                                    }
                                    List<Object> subList = doList.subList(startIndex, endIndex);
                                    if (!subList.isEmpty()) {
                                        try {
                                            method.invoke(mapper, subList);
                                            session.commit();
                                        } catch (IllegalAccessException | InvocationTargetException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                        );
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        });
        session.close();
        cacheManager.clear();
    }

    @Override
    public <T extends Serializable> void store(T object) {
        try {
            String modelName = object.getClass().getSimpleName();
            Class<?> mapperClass = Class.forName(mapperPackage + "." + modelName + "Mapper");
            insert(mapperClass, object);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}