
package com.alipay.codequery.properties.model;


import java.util.ArrayList;
import java.util.List;


public class PropertiesContext {

  private List<Node> commentOrEntrys = new ArrayList();

  private List<PropertyComment> comments = new ArrayList();

  private List<EmptyLine> emptyLines = new ArrayList();

  /**
   * Get all elements.
   * @return
   */
  public List<Node> getCommentOrEntrys() {
    return commentOrEntrys;
  }

  /**
   * Get the list of comment elements.
   * @return
   */
  public List<PropertyComment> getComments() {
    return comments;
  }

  /**
   * Get the list of empty line elements.
   * @return
   */
  public List<EmptyLine> getEmptyLines() {
    return emptyLines;
  }

  /**
   * Add comment element to commentOrEntrys list.
   * @param line
   * @param localLocation
   */
  public void addCommentLine(String line, Location.LocalLocation localLocation) {
    PropertyComment propertyComment = new PropertyComment(line, localLocation);
    comments.add(propertyComment);
    commentOrEntrys.add(propertyComment);
  }

  /**
   * Add empty line element to commentOrEntrys list.
   * @param line
   * @param localLocation
   */
  public void addEmptyLine(String line, Location.LocalLocation localLocation) {
    EmptyLine emptyLine = new EmptyLine(line, localLocation);
    emptyLines.add(emptyLine);
    commentOrEntrys.add(emptyLine);
  }

  /**
   * Add entry element to commentOrEntrys list.
   * @param pe
   */
  public void putOrUpdate(PropertyEntry pe) {
    remove(pe.getKey());
    commentOrEntrys.add(pe);
  }

  /**
   *
   * @param key
   * @param value
   * @param line
   * @param localLocation
   */
  public void putOrUpdate(String key, String value, String line, Location.LocalLocation localLocation) {
    PropertyEntry pe = new PropertyEntry(key, value, line, localLocation);
    remove(key);
    commentOrEntrys.add(pe);
  }

  /**
   *
   * @param key
   * @param value
   */
  public void putOrUpdate(String key, String value) {
    PropertyEntry pe = new PropertyEntry(key, value);
    int index = remove(key);
    commentOrEntrys.add(index,pe);
  }

  /**
   * Remove entry by key value.
   * @param key
   * @return
   */
  public int remove(String key) {
    for (int index = 0; index < commentOrEntrys.size(); index++) {
      Object obj = commentOrEntrys.get(index);
      if (obj instanceof PropertyEntry) {
        if (obj != null) {
          if (key.equals(((PropertyEntry) obj).getKey())) {
            commentOrEntrys.remove(obj);
            return index;
          }
        }
      }
    }
    return commentOrEntrys.size();
  }
}
