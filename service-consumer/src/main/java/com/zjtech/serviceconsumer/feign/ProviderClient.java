package com.zjtech.serviceconsumer.feign;

import com.zjtech.serviceconsumer.vo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider")
public interface ProviderClient {

//    @GetMapping("/hi")
//    String hi(@RequestParam(value = "name", defaultValue = "cg", required = false) String name);

    @RequestMapping("/get/user")
    User getUserInfo(@RequestParam(value = "uid", defaultValue = "0", required = false) int uid);
}
