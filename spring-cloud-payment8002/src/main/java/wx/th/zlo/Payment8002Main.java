package wx.th.zlo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: Payment8001Main
 * Description: TODO
 * Author: zlo
 * Date: 2022/11/1 22:27
 * Version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8002Main {
    public static void main(String[] args) {
        SpringApplication.run(Payment8002Main.class,args);
    }
}
