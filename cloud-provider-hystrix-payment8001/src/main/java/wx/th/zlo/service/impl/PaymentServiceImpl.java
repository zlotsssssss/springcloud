package wx.th.zlo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import wx.th.zlo.entity.PaymentEntity;
import wx.th.zlo.mapper.PaymentMapper;
import wx.th.zlo.service.PaymentService;

/**
 * ClassName: PaymentServiceImpl
 * Description: TODO
 * Author: zlo
 * Date: 2022/11/1 22:39
 * Version: 1.0.0
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, PaymentEntity> implements PaymentService {
    @Override
    @HystrixCommand(fallbackMethod = "errorFallback",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String timeOut(String second) throws InterruptedException {
        Thread.sleep(1000 * Long.parseLong(second));
        return "线程池："+Thread.currentThread().getName() +" false";
    }
    @Override
    public String ok(){
        return "线程池："+Thread.currentThread().getName() +" ok";
    }
    public String errorFallback(String second){
        return "服务降级了";
    }
}
