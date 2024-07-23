package microservice.frontapiclient.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service")
public interface ProductFeignClient {
    @GetMapping("/api/v1/product")
    String getProduct();
}
