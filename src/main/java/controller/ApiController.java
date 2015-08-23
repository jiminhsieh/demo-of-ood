package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.api.MobileOrder;
import pojo.api.OrderResult;
import service.OrderService;

/**
 * Created by jimin on 8/20/15.
 */
@Controller
public class ApiController {

  @Autowired
  OrderService orderService;

  @RequestMapping
  public OrderResult booking(MobileOrder mobileOrder){
    OrderResult orderResult = orderService.booking(mobileOrder);

    return orderResult;
  }
}
