package microservice.frontapiclient.controller;


import lombok.RequiredArgsConstructor;
import microservice.frontapiclient.interfaces.OrderFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final OrderFeignClient orderFeignClient;

    public OrderController(OrderFeignClient orderFeignClient) {
        this.orderFeignClient = orderFeignClient;
    }

    @GetMapping
    public String getOrder() {
        return this.orderFeignClient.getOrder();
    }
}
