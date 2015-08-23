package pojo.api;

/**
 * Created by jimin on 8/20/15.
 */
public class MobileOrder{

  protected String productId;
  protected int price;
  protected int qty;
  protected Customer customer;
  protected B2B b2B;

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public B2B getB2B() {
    return b2B;
  }

  public void setB2B(B2B b2B) {
    this.b2B = b2B;
  }
}
