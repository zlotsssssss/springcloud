package wx.th.zlo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import wx.th.zlo.common.Result;
import wx.th.zlo.service.PaymentFeignHystrixService;

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
public class HystrixController {
    @Autowired
    PaymentFeignHystrixService paymentFeignHystrixService;

    @GetMapping("/payment/hystrix/ok")
    public String ok(){
        return  paymentFeignHystrixService.ok();
    }


    @GetMapping("/payment/hystrix/timeout/{second}")
        @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
    })
    public String timeOut(@PathVariable("second") String second){
        return  paymentFeignHystrixService.timeOut(second);
    }
    /**
     * 超时访问，设置自身调用超时的峰值，峰值内正常运行，超过了峰值需要服务降级 自动调用fallbackMethod 指定的方法
     * <br/>
     * 超时异常或者运行异常 都会进行服务降级
     *
     * @param id
     * @return
     */
    public String paymentTimeOutFallbackMethod(@PathVariable("second") String second) {
        return "我是消费者80,对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
    }
}
