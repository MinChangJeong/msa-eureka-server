package microservice.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @GetMapping("/order")
    public String getOrder() {
        try {
            String ipAddress = InetAddress.getLocalHost().getHostAddress();
            return "order:[" + ipAddress + "]";
        } catch (UnknownHostException e) {
            return "order:[Unable to determine IP address]";
        }
    }
}
