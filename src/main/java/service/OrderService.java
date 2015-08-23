package service;

import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import pojo.api.MobileOrder;
import pojo.api.OrderResult;
import pojo.internal.MainOrder;

import java.util.ArrayList;

/**
 * Created by jimin on 8/21/15.
 */
@Service("OrderService")
@Scope("prototype")
public class OrderService {

  private ArrayList<ExternalService> externalServices;

  private void addExternalService(ExternalService externalService) {
    this.externalServices.add(externalService);
  }

  @Async
  private void doExternalService() {
    for (ExternalService externalService : externalServices) {
      externalService.send();
    }
  }

  public OrderResult booking(MobileOrder mobileOrder) {
    OrderResult orderResult = null;

    MainOrder mainOrder =
        new MainOrder.MainOrderBuilder(mobileOrder.getCustomer().getCustomerId(), mobileOrder
            .getCustomer().getName(), mobileOrder.getProductId()).setB2b(mobileOrder.getB2B())
            .buildMainOrder();

    addExternalService(new MailService("company@mail.com", "customer@mail.com",
        "Something need " + "to notify customer"));
    addExternalService(new FaxService("0288889999", "0355556666", "Something  need to fax"));
    doExternalService();

    return orderResult;
  }

}
