package wx.th.zlo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * ClassName: HystrixMain8001
 * Description: TODO
 * Author: zlo
 * Date: 2022/11/6 16:33
 * Version: 1.0.0
 */
@SpringBootApplication
@EnableCircuitBreaker
public class HystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixMain8001.class,args);
    }
}
