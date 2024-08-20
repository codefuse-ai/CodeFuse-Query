
package com.alipay.codequery.properties.core;

import com.alipay.codequery.properties.model.*;
import com.alipay.codequery.properties.util.SafeProperties;
import lombok.SneakyThrows;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.alipay.codequery.properties.storage.CorefStorage;

import java.io.*;
import java.io.File;
import java.util.List;


public class CorefExtractor{
  private static final Logger logger = LogManager.getLogger(CorefExtractor.class);

  private CorefStorage corefStorage;
  private File file;

  private com.alipay.codequery.properties.model.File propertiesFile;

  private final CorefURI corefURI;
  private String root;

  private SafeProperties safeProperties = new SafeProperties();

  /**
   * The constructor.
   * @param file
   * @param corefStorage
   * @param rootPath
   * @param corefURI
   */
  @SneakyThrows
  public CorefExtractor(File file, CorefStorage corefStorage, String rootPath, CorefURI corefURI) {
    this.corefStorage = corefStorage;
    this.file = file;
    this.root = rootPath;
    this.corefURI = corefURI;
    this.corefURI.setPath(file.getAbsolutePath().substring(root.length() + 1));
    this.propertiesFile = visitPropertiesFile(file);
  }

  /**
   * Get element oid except file or folder or program.
   * @param node
   * @return
   */
  public Long getOid(Node node) {
    if (node == null) {
      return -1L;
    }

    String signature = SignatureGenerator.generate(node);
    Long oid = corefURI.generateOid(signature);
    return oid;
  }

  /**
   * Parse the properties file.
   */
  public void parse() {
    try{
      InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
      safeProperties.load(inputStream);
      PropertiesContext propertiesContext = safeProperties.getContext();

      List<Node> commentOrEntrys = propertiesContext.getCommentOrEntrys();
      for (int index = 0; index < commentOrEntrys.size(); index++) {
        Node obj = commentOrEntrys.get(index);
        obj.oid = getOid(obj);
        obj.file = propertiesFile;

        if (obj instanceof PropertyEntry) {
          if (obj != null) {

            visitPropertyEntry((PropertyEntry) obj);

          }
        } else if (obj instanceof PropertyComment) {

          visitComment((PropertyComment) obj);

        } else {
          visitEmptyLine((EmptyLine) obj);
        }

      }
    }catch (IOException e){
      logger.error("Extraction failed, error message:{} on file {}", e.getMessage(), file.getAbsolutePath());
    }

  }

  private void visitPropertyEntry(PropertyEntry propertyEntry) {
    propertyEntry.location = calculateLocation(propertyEntry);
    String value = propertyEntry.getValue();
    if(value.contains("${") && (!value.contains("\'{")) && (!value.contains("\"{")))  {
      visitPropertyEntryVarialbe(propertyEntry);
    }
    corefStorage.storeEntry(propertyEntry.extractEntry());
  }

  private void visitPropertyEntryVarialbe(PropertyEntry propertyEntry) {
    String value = propertyEntry.getValue();
    int startIndex = value.indexOf("${");
    int endIndex = value.indexOf("}");
    String originalText = value.substring(startIndex, endIndex + 1);
    Variable variable = new Variable(originalText, startIndex);
    variable.parent = propertyEntry;
    variable.oid = getOid(variable);
    variable.name = value.substring(startIndex + 2, endIndex);
    corefStorage.storeEntryVariable(variable.extractVariable());
  }

  private com.alipay.codequery.properties.model.File visitPropertiesFile(File file) {
    propertiesFile = new com.alipay.codequery.properties.model.File(corefURI.generateFileOid());
    propertiesFile.name = file.getName();
    propertiesFile.relativePath = this.corefURI.getPath();

    // Save file's extension is 'properties' or 'properties.vm'
    if(file.getName().endsWith("properties")) {
      propertiesFile.extension = "properties";
    } else if(file.getName().endsWith("properties.vm")) {
      propertiesFile.extension = "properties.vm";
    }

    corefStorage.storeFile(propertiesFile.extractFile());
    if (CorefURI.fileMap.containsKey(file.getAbsolutePath())) {
      ContainerParent containerParent = new ContainerParent(propertiesFile.oid, CorefURI.fileMap.get(file.getAbsolutePath()));
      corefStorage.storeContainerParent(containerParent.extractContainerParent());
    }
    visitNumberOfLines();
    return propertiesFile;
  }

  private void visitComment(PropertyComment propertyComment) {
    propertyComment.location = calculateLocation(propertyComment);
    corefStorage.storeComment(propertyComment.extractComment());
  }

  private void visitEmptyLine(EmptyLine emptyLine) {
    emptyLine.location = calculateLocation(emptyLine);
    corefStorage.storeEmptyLine(emptyLine.extractEmptyLine());
  }

  private Location calculateLocation(Node node) {
    Location location = new Location(node.oid, node.file, node.localLocation);
    corefStorage.storeLocation(location.extractLocation());
    return location;
  }

  private void visitNumberOfLines() {
    PropertiesContext propertiesContext = safeProperties.getContext();
    Location.NumberOfLines numberOfLines = new Location.NumberOfLines(this.propertiesFile.oid);
    numberOfLines.numberOfLines = safeProperties.getSize();
    numberOfLines.numberOfCommentLines = propertiesContext.getComments().size();
    numberOfLines.numberOfCodeLines = safeProperties.getSize() - propertiesContext.getEmptyLines().size() - numberOfLines.numberOfCommentLines;
    corefStorage.storeNumberOfLines(numberOfLines.extractNumberOfLines());
  }

}
