package wx.th.zlo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: Order80Main
 * Description: TODO
 * Author: zlo
 * Date: 2022/11/1 23:06
 * Version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Order80Main {
    public static void main(String[] args) {
        SpringApplication.run(Order80Main.class,args);
    }
}
