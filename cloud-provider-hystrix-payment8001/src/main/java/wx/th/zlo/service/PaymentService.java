package wx.th.zlo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.PathVariable;
import wx.th.zlo.entity.PaymentEntity;

public interface PaymentService extends IService<PaymentEntity> {

     String ok();

     String timeOut(@PathVariable String second) throws InterruptedException;

}
