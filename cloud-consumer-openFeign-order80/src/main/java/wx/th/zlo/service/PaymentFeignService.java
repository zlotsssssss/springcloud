package wx.th.zlo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import wx.th.zlo.common.Result;

@Component
@FeignClient(value = "cloud-payment-service")
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
     Result get(@PathVariable(value="id") String id);

    @GetMapping("/payment/wait/{second}")
     Result waitSecond(@PathVariable("second")  Integer second);
}
