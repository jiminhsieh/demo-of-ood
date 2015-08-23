package pojo.encryption;

import pojo.api.Customer;
import utils.StringUtils;

/**
 * Created by jimin on 8/21/15.
 */
public class CustomerEncryption extends Customer {
  public CustomerEncryption(Customer origin) {
    this.name = StringUtils.encodeBase64(origin.getName());
    this.personalId = StringUtils.encodeBase64(origin.getPersonalId());
    this.phone = StringUtils.encodeBase64(origin.getPhone());
    this.email = StringUtils.encodeBase64(origin.getEmail());
  }
}
