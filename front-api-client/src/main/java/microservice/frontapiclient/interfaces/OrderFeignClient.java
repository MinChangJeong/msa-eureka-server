package microservice.frontapiclient.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order-service")
public interface OrderFeignClient {
    @GetMapping("/api/v1/order")
    String getOrder();
}
