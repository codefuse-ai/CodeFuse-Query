
package com.alipay.codequery.properties.storage;

import com.alipay.codequery.properties.dal.mybatis.domain.*;
import com.alipay.codequery.properties.dal.mybatis.mapper.*;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.entity.Config;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import javax.sql.DataSource;
import java.io.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;


public class CorefStorage {

  private final SqlSession session;

  /**
   * The path of the folder which contains the db file.
   */
  public String dbDir;

  /**
   * Db connection method.
   * @param dbDir
   * @throws IOException
   */
  public CorefStorage(String dbDir) throws IOException {
    this.dbDir = dbDir.endsWith(File.separator) ? dbDir : dbDir + File.separator;
    Properties properties = new Properties();
    properties.setProperty("driver", "org.sqlite.JDBC");
    copyDBFiles(dbDir);

    properties.setProperty("url", "jdbc:sqlite:" + this.dbDir + "coref_properties_src.db");
    properties.setProperty("username", "");
    properties.setProperty("password", "");
    DataSourceFactory factory = new PooledDataSourceFactory();
    DataSource dataSource = factory.getDataSource();
    factory.setProperties(properties);
    TransactionFactory transactionFactory = new JdbcTransactionFactory();
    Environment environment = new Environment("development", transactionFactory, dataSource);
    Configuration configuration = new Configuration(environment);
    configuration.addMappers("com.alipay.codequery.properties.dal.mybatis.mapper");
    MapperHelper mapperHelper = new MapperHelper();
    Config config = new Config();
    config.setIDENTITY("MYSQL");
    config.setEnableMethodAnnotation(true);
    config.setNotEmpty(true);
    config.setCheckExampleEntityClass(true);
    config.setUseSimpleType(true);
    config.setEnumAsSimpleType(true);
    config.setWrapKeyword("`{0}`");
    mapperHelper.setConfig(config);

    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
    session = sqlSessionFactory.openSession();
    mapperHelper.processConfiguration(session.getConfiguration());

  }

  private void copyDBFiles(String dbDir) throws IOException {
    Path dir = Files.createDirectories(Paths.get(dbDir));
    Path destPath = Paths.get(dir.toFile() + File.separator + "coref_properties_src.db");
    if (destPath.toFile().exists()) {
      Files.delete(destPath);
    }
    File destFile = Files.createFile(destPath).toFile();
    InputStream in = this.getClass().getClassLoader().getResourceAsStream("coref_properties_src.db");

    OutputStream os = new FileOutputStream(destFile);
    int bytesRead = 0;
    byte[] buffer = new byte[8192];
    while ((bytesRead = in.read(buffer, 0, 8192)) != -1) {
      os.write(buffer, 0, bytesRead);
    }
    os.close();
    in.close();
  }

  private void insert(Class mapperClass, Object object) {
    BaseMapper mapper = (BaseMapper) session.getMapper(mapperClass);
    mapper.insert(object);
  }

  /**
   * Save coref file records.
   * @param file
   */
  public void storeFile(com.alipay.codequery.properties.dal.mybatis.domain.File file) {
    insert(FileMapper.class, file);
  }

  /**
   * Save folder records.
   * @param folder
   */
  public void storeFolder(Folder folder) {
    insert(FolderMapper.class, folder);
  }

  /**
   * Save container parent records.
   * @param containerParent
   */
  public void storeContainerParent(ContainerParent containerParent) {
    insert(ContainerParentMapper.class, containerParent);
  }

  /**
   * Save entry records.
   * @param entry
   */
  public void storeEntry(Entry entry) {
    insert(EntryMapper.class, entry);
  }

  /**
   * Save entry variable records
   * @param variable
   */
  public void storeEntryVariable(Variable variable) {
    insert(VariableMapper.class, variable);
  }

  /**
   * Save comment records.
   * @param comment
   */
  public void storeComment(Comment comment) {
    insert(CommentMapper.class, comment);
  }

  /**
   * Save empty line records.
   * @param emptyLine
   */
  public void storeEmptyLine(EmptyLine emptyLine) {
    insert(EmptyLineMapper.class, emptyLine);
  }

  /**
   * Save location records.
   * @param location
   */
  public void storeLocation(Location location) {
    insert(LocationMapper.class, location);
  }

  /**
   * Save program records.
   * @param program
   */
  public void storeProgram(Program program) {
    insert(ProgramMapper.class, program);
  }

  /**
   * Save numberofline records.
   * @param numberOfLines
   */
  public void storeNumberOfLines(NumberOfLines numberOfLines) {
    insert(NumberOfLinesMapper.class, numberOfLines);
  }

  /**
   * Commit db session.
   */
  public void store() {
    session.commit();
  }
}
