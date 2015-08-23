package service;

import pojo.api.MobileOrder;
import pojo.api.XmlOrder;
import pojo.encryption.MobileOrderEncryption;
import pojo.encryption.XmlOrderEncryption;
import pojo.encryption.XmlOrderEncryption;
/**
 * Created by jimin on 8/20/15.
 */
public class EncryptionFactory {
  public <E> E produceEncryption(E order) {
    E encryption = null;
    switch (order.getClass().getName()) {
      case "pojo.api.XmlOrder":
        encryption = (E) new XmlOrderEncryption().init((XmlOrder) order);
        break;
      case "pojo.api.MobileOrder":
        encryption = (E) new MobileOrderEncryption((MobileOrder) order);
        break;
      default:
        break;
    }
    return order;
  }
}
