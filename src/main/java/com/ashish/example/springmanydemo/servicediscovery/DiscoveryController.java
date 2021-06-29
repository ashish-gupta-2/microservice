package com.ashish.example.springmanydemo.servicediscovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DiscoveryController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getmessage")
    public String getMessage(){
        return restTemplate.getForObject("http://config-client/cloudmessage",String.class);
    }

    @GetMapping("/micro-message")
    public String getMicroMessage(){
        return "Mirco-Messsage";
    }

}
