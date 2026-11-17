
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class DriverController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/drivers")
    public String getDrivers() {

        return "Driver Service is running on port: " + port;
    }

    @GetMapping("/status")
    public String getStatus() {

        return "Driver Service is active on port: " + port;
    }

    @GetMapping("/welcome")
    public String welcome() {

        return "Welcome to Driver Service. Instance: " + port;
    }
}
