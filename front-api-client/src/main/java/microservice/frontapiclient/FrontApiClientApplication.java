package microservice.frontapiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FrontApiClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontApiClientApplication.class, args);
    }

}
