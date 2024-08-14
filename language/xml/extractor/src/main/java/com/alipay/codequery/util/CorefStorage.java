package com.alipay.codequery.util;

import com.alipay.codequery.dal.mybatis.domain.*;
import com.alipay.codequery.dal.mybatis.mapper.*;
import com.alipay.codequery.model.*;
import com.alipay.codequery.model.XmlNamespaceModel;
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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;


public class CorefStorage {

    private final SqlSession session;
    public String dbDir;

    public CorefStorage(String dbDir) throws IOException {
        this.dbDir = dbDir.endsWith(File.separator) ? dbDir : dbDir + File.separator;
        Properties properties = new Properties();
        properties.setProperty("driver", "org.sqlite.JDBC");
        copyDBFiles(dbDir);

        properties.setProperty("url", "jdbc:sqlite:" + this.dbDir + "coref_xml_src.db");
        properties.setProperty("username", "");
        properties.setProperty("password", "");
        DataSourceFactory factory = new PooledDataSourceFactory();
        DataSource dataSource = factory.getDataSource();
        factory.setProperties(properties);
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMappers("com.alipay.codequery.dal.mybatis.mapper");
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
        Path destPath = Paths.get(dir.toFile() + File.separator + "coref_xml_src.db");
        if (destPath.toFile().exists()) {
            Files.delete(destPath);
        }
        File destFile = Files.createFile(destPath).toFile();
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("coref_xml_src.db");

        OutputStream os = new FileOutputStream(destFile);
        int bytesRead = 0;
        byte[] buffer = new byte[8192];
        while ((bytesRead = in.read(buffer, 0, 8192)) != -1) {
            os.write(buffer, 0, bytesRead);
        }
        os.close();
        in.close();
    }

    public void addFile(XmlFile xmlFile) {
        insert(XmlFileMapper.class, xmlFile);
    }

    public void addElement(XmlElementModel elementModel) {

        insert(XmlElementMapper.class, elementModel.extractElement());
        insertLocation(elementModel.extractLocation());
        insert(XmlElementNameMapper.class, elementModel.extractElementName());
        if (elementModel.extractElementPrefix() != null) {
            insert(XmlElementPrefixMapper.class, elementModel.extractElementPrefix());
        }

        for (XmlAttributeModel attribute : elementModel.getAttributes()) {
            insert(XmlAttributeMapper.class, attribute.extractAttr());
        }

        for (XmlNamespaceModel xmlNamespaceModel : elementModel.getNsList()) {
            insert(XmlNamespaceMapper.class, xmlNamespaceModel.extractNs());
            insert(XmlHasNamespaceMapper.class, xmlNamespaceModel.getXmlHasNamespace().extractXmlHasNameSpace());
        }

    }

    public void addComment(XmlCommentModel xmlCommentModel) {
        insert(XmlCommentMapper.class, xmlCommentModel.extractXmlComment());
        insertLocation(xmlCommentModel.extractLocation());
    }

    public void addCharacter(XmlCharacterModel character) {
        insert(XmlCharacterMapper.class, character.extractCharacter());
        insertLocation(character.extractLocation());
    }

    public void addDTD(XmlDTDModel dtd) {
        insert(XmlDtdMapper.class, dtd.extractXmlDtd());
        insertLocation(dtd.extractLocation());
    }

    public void addXmlEncoding(XmlDeclarationModel encoding) {
        insert(XmlEncodingMapper.class, encoding.extraceXmlEncoding());

    }

    private void insert(Class mapperClass, Object object) {
        BaseMapper mapper = (BaseMapper) session.getMapper(mapperClass);
        mapper.insert(object);
    }

    public void store() {
        session.commit();
    }

    private void insertLocation(XmlLocation location) {
        insert(XmlLocationMapper.class, location);
    }

}
