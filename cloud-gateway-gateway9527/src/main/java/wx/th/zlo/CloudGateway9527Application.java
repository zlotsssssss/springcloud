package wx.th.zlo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: CloudGateway9527Application
 * Description: TODO
 * Author: zlo
 * Date: 2022/11/27 10:48
 * Version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGateway9527Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudGateway9527Application.class, args);
        System.out.println("启动成功");
    }
}
