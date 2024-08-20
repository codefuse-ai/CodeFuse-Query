
package com.alipay.codequery.properties.core;

import com.alipay.codequery.properties.util.HashUtil;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Data
public class CorefURI {

  private static String URI_TEMPLATE = "coref://%s?path=%s#%s";

  private String signature;
  private String corpus;
  private String path;

  /**
   * Store all the containing info between file and folder.
   */
  public static final Map<String, Long> fileMap = new ConcurrentHashMap<>();

  /**
   * Constructor.
   * @param corpus
   */
  public CorefURI(String corpus) {
    this.corpus = corpus;
  }

  /**
   * Get the string format.
   * @return
   */
  public String toString() {
    return generate(corpus, path, signature);
  }

  /**
   * Generate URI for coref element.
   * @param corpus
   * @param path
   * @param signature
   * @return
   */
  public static String generate(String corpus, String path, String signature) {
    if(StringUtils.isBlank(corpus)
      || StringUtils.isBlank(path)
      || StringUtils.isBlank(signature)) {
      throw new RuntimeException("blank corpus or path or signature");
    }

    return String.format(URI_TEMPLATE, corpus, path, signature);
  }

  /**
   * Generate corpus oid.
   * @return
   */
  public Long generateCorpusOid() {
    return CorefURI.generateCorpusOid(corpus);
  }

  /**
   * Generate corpus oid by given corpus.
   * @param corpus
   * @return
   */
  public static Long generateCorpusOid(String corpus) {
    return HashUtil.hashString(String.format("coref://%s", corpus));
  }

  /**
   * Generate oid by given signature.
   * @param signature
   * @return
   */
  public Long generateOid(String signature) {
    return HashUtil.hashString(generate(corpus, path, signature));
  }

  /**
   * Generate file oid.
   * @return
   */
  public Long generateFileOid() {
    return HashUtil.hashString(String.format("coref://%s?path=%s", corpus, path));
  }
}
