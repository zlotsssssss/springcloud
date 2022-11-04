package wx.th.zlo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: BeanConfig
 * Description: TODO
 * Author: zlo
 * Date: 2022/11/1 23:07
 * Version: 1.0.0
 */
@Configuration
public class BeanConfig {
    @Bean
    @LoadBalanced //让这个RestTemplate在请求时拥有客户端负载均衡的能力  //将此注解注释掉，使用自己的轮询算法不使用默认的
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
