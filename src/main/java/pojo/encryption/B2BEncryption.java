package pojo.encryption;

import pojo.api.B2B;
import utils.StringUtils;

/**
 * Created by jimin on 8/23/15.
 */
public class B2BEncryption extends B2B{
  public B2BEncryption(B2B b2B) {
    this.dealerId = b2B.getDealerId();
    this.titleId = StringUtils.encodeBase64(b2B.getTitleId());
    this.titleName = StringUtils.encodeBase64(b2B.getTitleName());
  }
}
