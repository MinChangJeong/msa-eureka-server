package microservice.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @GetMapping
    public String getProduct() {
        try {
            String ipAddress = InetAddress.getLocalHost().getHostAddress();
            return "product:[" + ipAddress + "]";
        } catch (UnknownHostException e) {
            return "product:[Unable to determine IP address]";
        }
    }
}
