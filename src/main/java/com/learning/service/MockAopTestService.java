package com.learning.service;

import com.learning.annotation.LogMethodExecution;
import org.springframework.stereotype.Service;

@Service
public class MockAopTestService {

    @LogMethodExecution
    public String returnMessage() {
        return "Spring AOP example";
    }
}
