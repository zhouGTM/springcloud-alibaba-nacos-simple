package com.zjtech.serviceconsumer.controller;

import com.zjtech.serviceconsumer.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //Nacos实时动态刷新配置
public class ConsumerController {

    @Autowired
    ProviderClient providerClient;

    @GetMapping("/hi-feign")
    public String hiFeign(){
        return providerClient.hi("feign");
    }

    @Value("${person.name}")
    private String commonName;

    @Value("${person.age}")
    private String age;

    @Value("${person.address}")
    private String address;

    @Value("${r.nac}")
    private String cnac;

    @Value("${r.ver}")
    private String ver;

    @GetMapping("/config")
    public String getValue(){
        return "小田野个人信息：" +  commonName + "\r" + age + "\r" + address + "\r" + cnac + "\r" + ver;
//        return "小田野个人信息：" +  commonName + "\r" + age + "\r" + address;
    }
}
