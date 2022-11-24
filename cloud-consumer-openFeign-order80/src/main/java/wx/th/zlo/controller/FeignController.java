package wx.th.zlo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import wx.th.zlo.common.Result;
import wx.th.zlo.service.PaymentFeignService;

import javax.annotation.Resource;

/**
 * ClassName: FeignController
 * Description: TODO
 * Author: zlo
 * Date: 2022/11/4 21:19
 * Version: 1.0.0
 */
@RestController
@Slf4j
public class FeignController {
    @Resource
    PaymentFeignService paymentFeignService;

    @GetMapping("/payment/get/{id}")
    public Result get(@PathVariable String id){
        return  paymentFeignService.get(id);
    }

    @GetMapping("/payment/wait/{second}")
    public Result wait(@PathVariable  Integer second)  {
        return paymentFeignService.waitSecond(3);
    }
}
