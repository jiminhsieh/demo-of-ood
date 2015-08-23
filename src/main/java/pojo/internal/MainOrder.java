package pojo.internal;

import pojo.api.B2B;
import service.CpuFactory;

/**
 * Created by jimin on 8/23/15.
 */
public class MainOrder {

  private String customerId;
  private String customerName;
  private String productId;
  private String dealerId;
  private String titleId;
  private String titleName;

  private MainOrder(String customerId, String customerName, String productId, String dealerId,
                    String titleId, String titleName) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.productId = productId;
    this.dealerId = dealerId;
    this.titleId = titleId;
    this.titleName = titleName;
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getDealerId() {
    return dealerId;
  }

  public String getTitleId() {
    return titleId;
  }

  public String getTitleName() {
    return titleName;
  }

  public String getProductId() {
    return productId;
  }


  public static class MainOrderBuilder {
    private String customerId;
    private String customerName;
    private String productId;
    private String dealerId;
    private String titleId;
    private String titleName;

    public MainOrderBuilder(String customerId, String customerName, String productId) {
      this.customerId = customerId;
      this.customerName = customerName;
      this.productId = productId;
    }

    public MainOrderBuilder setCustomer(String customerId, String customerName) {
      this.customerId = customerId;
      this.customerName = customerName;
      return this;
    }

    public MainOrderBuilder setB2b(B2B b2B) {
      this.dealerId = b2B.getDealerId();
      this.titleId = b2B.getTitleId();
      this.titleName = b2B.getTitleName();
      return this;
    }

    public MainOrder buildMainOrder() {
      return new MainOrder(customerId, customerName, productId, dealerId, titleId, titleName);
    }
  }
}
