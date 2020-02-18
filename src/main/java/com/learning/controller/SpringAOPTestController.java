package com.learning.controller;

import com.learning.annotation.LogMethodExecution;
import com.learning.service.MockAopTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aop")
public class SpringAOPTestController {

    @Autowired
    private MockAopTestService mockAopTestService;

    @RequestMapping(value = "/marco")
    @LogMethodExecution
    public String marco() {
        return "polo";
    }

    @RequestMapping(value = "/test")
    @LogMethodExecution
    public String testAop() {
        return mockAopTestService.returnMessage();
    }
}
