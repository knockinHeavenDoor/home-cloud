package com.home.api.schedual;

import model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import util.NoPagingResponse;

@FeignClient(value = "user")
@Service
public interface SchedualUser {

    @RequestMapping(value = "/api/login",method = RequestMethod.GET)
    NoPagingResponse login(@RequestParam("username") String username, @RequestParam("password") String password);

    @RequestMapping(value = "/api/account",method = RequestMethod.POST)
    NoPagingResponse register(@RequestBody User user);
}
