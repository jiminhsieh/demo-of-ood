package pojo.api;

/**
 * Created by jimin on 8/20/15.
 */
public class Customer {
  protected String customerId;
  protected String name;
  protected String personalId;
  protected String phone;
  protected String email;

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPersonalId() {
    return personalId;
  }

  public void setPersonalId(String personalId) {
    this.personalId = personalId;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
