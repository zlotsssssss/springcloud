package wx.th.zlo.service;

import org.springframework.stereotype.Component;

/**
 * ClassName: PaymentFeignHystrixServiceImp
 * Description: TODO
 * Author: zlo
 * Date: 2022/11/16 22:03
 * Version: 1.0.0
 */
@Component
public class PaymentFeignHystrixServiceImp implements PaymentFeignHystrixService {
    @Override
    public String ok() {
        return "服务宕机了";
    }

    @Override
    public String timeOut(String second) {
        return "服务宕机了";
    }
}
