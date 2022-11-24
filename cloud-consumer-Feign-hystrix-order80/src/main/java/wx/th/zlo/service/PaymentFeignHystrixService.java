package wx.th.zlo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import wx.th.zlo.common.Result;

@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFeignHystrixServiceImp.class)
public interface PaymentFeignHystrixService {
    @GetMapping("/payment/hystrix/ok")
    public String ok();

    @GetMapping("/payment/hystrix/timeout/{second}")
    public String timeOut(@PathVariable("second") String second);
}
