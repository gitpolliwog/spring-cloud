package com.tk.service;

import com.tk.service.impl.ScheduleServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "client-test", fallback = ScheduleServiceHiHystrix.class)
@Component
public interface ScheduleServiceHi {

    @RequestMapping(value = "/haveatry", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
