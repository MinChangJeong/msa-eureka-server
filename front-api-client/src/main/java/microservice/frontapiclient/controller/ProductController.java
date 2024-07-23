package microservice.frontapiclient.controller;


import microservice.frontapiclient.interfaces.ProductFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductFeignClient productFeignClient;

    public ProductController(ProductFeignClient productFeignClient) {
        this.productFeignClient = productFeignClient;
    }

    @GetMapping
    public String getProduct() {
        return this.productFeignClient.getProduct();
    }
}
