package wx.th.zlo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import wx.th.zlo.common.Result;
import wx.th.zlo.entity.PaymentEntity;

import javax.annotation.Resource;

/**
 * ClassName: OrderController
 * Description: TODO
 * Author: zlo
 * Date: 2022/11/1 23:09
 * Version: 1.0.0
 */
@RestController
public class OrderController {
   // public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";


    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/create")
    public Result<PaymentEntity> create( PaymentEntity payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, Result.class);
    }

    @GetMapping("/payment/get/{id}")
    public Result get(@PathVariable  String id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" +id, Result.class);
    }
}
