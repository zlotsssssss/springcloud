package wx.th.zlo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import wx.th.zlo.common.Result;
import wx.th.zlo.entity.PaymentEntity;
import wx.th.zlo.service.PaymentService;

/**
 * ClassName: PaymentController
 * Description: TODO
 * Author: zlo
 * Date: 2022/11/1 22:45
 * Version: 1.0.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public Result create(@RequestBody PaymentEntity paymentEntity){
        boolean save = paymentService.save(paymentEntity);
        if(save){
            return Result.success("保存成功",serverPort);
        }else{
            return Result.fail("保存失败");
        }
    }
    @GetMapping("/payment/get/{id}")
    public Result get(@PathVariable  String id){
        PaymentEntity entity = paymentService.getById(id);
        if(entity != null){
            return Result.success(entity,serverPort);
        }else{
            return Result.success("查询失败");
        }
    }

    @GetMapping("/payment/wait/{second}")
    public Result wait(@PathVariable  Integer second) throws InterruptedException {
        Thread.sleep(second*1000);
        return Result.success("ok");
    }
}
