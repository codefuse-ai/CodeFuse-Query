
package com.alipay.codequery.properties.util;

import com.alipay.codequery.properties.model.Location;
import com.alipay.codequery.properties.model.PropertiesContext;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;


public class SafeProperties extends Properties {
  private static final long serialVersionUID = 5011694856722313621L;

  private static final String keyValueSeparators = "=: \t\r\n\f";

  private static final String strictKeyValueSeparators = "=:";

  private static final String specialSaveChars = "=: \t\r\n\f#!";

  private static final String whiteSpaceChars = " \t\r\n\f";

  private PropertiesContext context = new PropertiesContext();

  /**
   * Get the PropertiesContext value.
   * @return
   */
  public PropertiesContext getContext() {
    return context;
  }

  private int size = 0;

  /**
   * Get size value.
   */
  public int getSize() {
    return size;
  }

  /**
   * Override the load method.
   * @param inStream   the input stream.
   * @throws IOException
   */
  public synchronized void load(InputStream inStream) throws IOException {

    BufferedReader in;

    in = new BufferedReader(new InputStreamReader(inStream, "UTF-8"));

    int count = 0;
    while (true) {
      Location.LocalLocation localLocation = new Location.LocalLocation();
      count++;
      // Get next line
      String line = in.readLine();
      // intract property/comment string
      String intactLine = line;
      if (line == null) {
        return;
      }

      if (line.length() > 0) {
        // Find start of key
        int len = line.length();
        int keyStart;
        for (keyStart = 0; keyStart < len; keyStart++) {
          if (whiteSpaceChars.indexOf(line.charAt(keyStart)) == -1) {
            break;
          }
        }

        // Blank lines are ignored
        if (keyStart == len) {
          continue;
        }

        // Continue lines that end in slashes if they are not comments
        char firstChar = line.charAt(keyStart);

        localLocation.startLineNumber = count;
        localLocation.startColumnNumber = keyStart + 1;
        localLocation.endLineNumber = count;
        localLocation.endColumnNumber = line.length();

        if ((firstChar != '#') && (firstChar != '!')) {
          while (continueLine(line)) {
            count ++;
            String nextLine = in.readLine();
            localLocation.endLineNumber = count;
            localLocation.endColumnNumber = nextLine.length();
            intactLine = intactLine + "\n" + nextLine;
            if (nextLine == null) {
              nextLine = "";
            }

            String loppedLine = line.substring(0, len - 1);
            // Advance beyond whitespace on new line
            int startIndex;
            for (startIndex = 0; startIndex < nextLine.length(); startIndex++) {
              if (whiteSpaceChars.indexOf(nextLine.charAt(startIndex)) == -1) {
                break;
              }
            }

            nextLine = nextLine.substring(startIndex, nextLine.length());
            line = new String(loppedLine + nextLine);
            len = line.length();
          }

          // Find separation between key and value
          int separatorIndex;
          for (separatorIndex = keyStart; separatorIndex < len; separatorIndex++) {
            char currentChar = line.charAt(separatorIndex);
            if (currentChar == '\\') {
              separatorIndex++;
            }
            else if (keyValueSeparators.indexOf(currentChar) != -1) {
              break;
            }

          }

          // Skip over whitespace after key if any
          int valueIndex;
          for (valueIndex = separatorIndex; valueIndex < len; valueIndex++) {
            if (whiteSpaceChars.indexOf(line.charAt(valueIndex)) == -1) {
              break;
            }

          }


          // Skip over one non whitespace key value separators if any
          if (valueIndex < len) {
            if (strictKeyValueSeparators.indexOf(line.charAt(valueIndex)) != -1) {
              valueIndex++;
            }
          }


          // Skip over white space after other separators if any
          while (valueIndex < len) {
            if (whiteSpaceChars.indexOf(line.charAt(valueIndex)) == -1) {
              break;
            }

            valueIndex++;
          }
          String key = line.substring(keyStart, separatorIndex);
          String value = (separatorIndex < len) ? line.substring(valueIndex, len) : "";

          // Convert then store key and value
          key = loadConvert(key);
          value = loadConvert(value);
          //memorize the property also with the whole string
          put(key, value, line, localLocation);
        } else {
          //memorize the comment string
          context.addCommentLine(intactLine, localLocation);
        }
      } else {
        //memorize the string even the string is empty
        localLocation.startLineNumber = localLocation.endLineNumber = count;
        localLocation.startColumnNumber = localLocation.endColumnNumber = 0;
        context.addEmptyLine(intactLine, localLocation);
      }
      size = count;
    }
  }

  /*
   * Converts encoded &#92;uxxxx to unicode chars and changes special saved
   * chars to their original forms
   */
  private String loadConvert(String theString) {
    char aChar;
    int len = theString.length();
    StringBuffer outBuffer = new StringBuffer(len);

    for (int x = 0; x < len;) {
      aChar = theString.charAt(x++);
      if (aChar == '\\') {
        aChar = theString.charAt(x++);
        if (aChar == 'u') {
          // Read the xxxx
          int value = 0;
          for (int i = 0; i < 4; i++) {
            aChar = theString.charAt(x++);
            switch (aChar) {
              case '0':
              case '1':
              case '2':
              case '3':
              case '4':
              case '5':
              case '6':
              case '7':
              case '8':
              case '9':
                value = (value << 4) + aChar - '0';
                break;
              case 'a':
              case 'b':
              case 'c':
              case 'd':
              case 'e':
              case 'f':
                value = (value << 4) + 10 + aChar - 'a';
                break;
              case 'A':
              case 'B':
              case 'C':
              case 'D':
              case 'E':
              case 'F':
                value = (value << 4) + 10 + aChar - 'A';
                break;
              default:
                throw new IllegalArgumentException("Malformed \\uxxxx encoding.");
            }
          }
          outBuffer.append((char) value);
        } else {
          if (aChar == 't') {
            outBuffer.append('\t'); /* ibm@7211 */
          } else if (aChar == 'r') {
            outBuffer.append('\r'); /* ibm@7211 */
          } else if (aChar == 'n') {
            /*
             * ibm@8897 do not convert a \n to a line.separator
             * because on some platforms line.separator is a String
             * of "\r\n". When a Properties class is saved as a file
             * (store()) and then restored (load()) the restored
             * input MUST be the same as the output (so that
             * Properties.equals() works).
             *
             */
            outBuffer.append('\n'); /* ibm@8897 ibm@7211 */
          } else if (aChar == 'f') {
            outBuffer.append('\f'); /* ibm@7211 */
          } else {
            /* ibm@7211 */
            outBuffer.append(aChar); /* ibm@7211 */
          }

        }
      } else {
        outBuffer.append(aChar);
      }
    }
    return outBuffer.toString();
  }

  /**
   * Override the store method.
   * @param out      an output stream.
   * @param header   a description of the property list.
   * @throws IOException
   */
  public synchronized void store(OutputStream out, String header) throws IOException {
    BufferedWriter awriter;
    awriter = new BufferedWriter(new OutputStreamWriter(out, "8859_1"));
    if (header != null) {
      writeln(awriter, "#" + header);
    }
    List entrys = context.getCommentOrEntrys();
    for (Iterator iter = entrys.iterator(); iter.hasNext();) {
      Object obj = iter.next();
      if (obj.toString() != null) {
        writeln(awriter, obj.toString());
      }
    }
    awriter.flush();
  }

  private static void writeln(BufferedWriter bw, String s) throws IOException {
    bw.write(s);
    bw.newLine();
  }

  private boolean continueLine(String line) {
    int slashCount = 0;
    int index = line.length() - 1;
    while ((index >= 0) && (line.charAt(index--) == '\\')) {
      slashCount++;
    }
    return (slashCount % 2 == 1);
  }

  /*
   * Converts unicodes to encoded &#92;uxxxx and writes out any of the
   * characters in specialSaveChars with a preceding slash
   */
  public static String saveConvert(String theString, boolean escapeSpace) {
    int len = theString.length();
    StringBuffer outBuffer = new StringBuffer(len * 2);

    for (int x = 0; x < len; x++) {
      char aChar = theString.charAt(x);
      switch (aChar) {
        case ' ':
          if (x == 0 || escapeSpace) {
            outBuffer.append('\\');
          }
          outBuffer.append(' ');
          break;
        case '\\':
          outBuffer.append('\\');
          outBuffer.append('\\');
          break;
        case '\t':
          outBuffer.append('\\');
          outBuffer.append('t');
          break;
        case '\n':
          outBuffer.append('\\');
          outBuffer.append('n');
          break;
        case '\r':
          outBuffer.append('\\');
          outBuffer.append('r');
          break;
        case '\f':
          outBuffer.append('\\');
          outBuffer.append('f');
          break;
        default:
          if ((aChar < 0x0020) || (aChar > 0x007e)) {
            outBuffer.append('\\');
            outBuffer.append('u');
            outBuffer.append(toHex((aChar >> 12) & 0xF));
            outBuffer.append(toHex((aChar >> 8) & 0xF));
            outBuffer.append(toHex((aChar >> 4) & 0xF));
            outBuffer.append(toHex(aChar & 0xF));
          } else {
            if (specialSaveChars.indexOf(aChar) != -1) {
              outBuffer.append('\\');
            }
            outBuffer.append(aChar);
          }
      }
    }
    return outBuffer.toString();
  }

  /**
   * Convert a nibble to a hex character
   *
   * @param nibble
   *            the nibble to convert.
   */
  private static char toHex(int nibble) {
    return hexDigit[(nibble & 0xF)];
  }

  /** A table of hex digits */
  private static final char[] hexDigit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
    'F' };

  /**
   * Override the put method.
   * @param key key with which the specified value is to be associated
   * @param value value to be associated with the specified key
   * @return
   */
  public synchronized Object put(Object key, Object value) {
    context.putOrUpdate(key.toString(), value.toString());
    return super.put(key, value);
  }

  /**
   * Override the put method.
   * @param key
   * @param value
   * @param line
   * @param localLocation
   * @return
   */
  public synchronized Object put(Object key, Object value, String line, Location.LocalLocation localLocation) {
    context.putOrUpdate(key.toString(), value.toString(), line, localLocation);
    return super.put(key, value);
  }

  /**
   * Override the remove method.
   * @param key   the key that needs to be removed
   * @return
   */
  public synchronized Object remove(Object key) {
    context.remove(key.toString());
    return super.remove(key);
  }

}
