package utils;

import org.apache.commons.lang3.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;

/**
 * Created by jimin on 8/21/15.
 */
public class StringUtils {

  private static final String DEFAULT_ENCODING = "UTF-8";
  private static BASE64Encoder base64Encoder = new BASE64Encoder();
  final static Logger logger = LoggerFactory.getLogger(StringUtils.class);

  public static String encodeBase64(String origin) {
    try {
      return org.apache.commons.lang3.StringUtils.isNotBlank(origin) ? base64Encoder.encode
          (origin.getBytes(DEFAULT_ENCODING)) : null;
    } catch (UnsupportedEncodingException e) {
      logger.warn("*** Fail to encode ***");
      e.printStackTrace();
    }
    return null;
  }
}
