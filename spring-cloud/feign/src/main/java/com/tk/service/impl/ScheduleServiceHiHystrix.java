package com.tk.service.impl;

import com.tk.service.ScheduleServiceHi;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHiHystrix implements ScheduleServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry! 网络异常，服务暂时无法访问。 请求的name为:" + name;
    }
}
