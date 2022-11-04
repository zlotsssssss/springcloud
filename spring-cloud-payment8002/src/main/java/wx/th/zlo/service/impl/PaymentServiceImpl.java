package wx.th.zlo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
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
}
