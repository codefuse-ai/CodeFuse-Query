
package com.alipay.codequery.properties.core;

import com.alipay.codequery.properties.model.Node;
import com.alipay.codequery.properties.model.Variable;


public class SignatureGenerator {

  /**
   * Generate signature for element except file, folder or program.
   * @param node
   * @return
   */
  public static String generate(Node node) {
    if (node == null) {
      return "null";
    }

    if (node instanceof Variable) {
      return String.format("%s:%s:(%d,%d)",
        node.getClass().getSimpleName(),
        node.printableText != null ? node.printableText : "NULL",
        ((Variable) node).beginIndex,
        node.parent.localLocation.endLineNumber
      );
    } else {
      return String.format("%s:%s:(%d,%d)",
        node.getClass().getSimpleName(),
        node.printableText != null ? node.printableText : "NULL",
        node.localLocation.startColumnNumber,
        node.localLocation.startLineNumber
      );
    }
  }
}
