package pojo.encryption;

import pojo.api.MobileOrder;

/**
 * Created by jimin on 8/20/15.
 */
public class MobileOrderEncryption extends MobileOrder{
  public MobileOrderEncryption(MobileOrder origin){
    this.productId = origin.getProductId();
    this.price = origin.getPrice();
    this.qty = origin.getQty();
    this.b2B = new B2BEncryption(origin.getB2B());
    this.customer = new CustomerEncryption(origin.getCustomer());
  }
}
