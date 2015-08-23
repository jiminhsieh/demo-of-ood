package pojo.encryption;

import pojo.api.XmlOrder;

/**
 * Created by jimin on 8/20/15.
 */
public class XmlOrderEncryption extends XmlOrder{
  /**
   * XML parser can not deal instance with construcor.
   * @param origin
   * @return
   */
  public XmlOrderEncryption init(XmlOrder origin) {

    return this;
  }
}
