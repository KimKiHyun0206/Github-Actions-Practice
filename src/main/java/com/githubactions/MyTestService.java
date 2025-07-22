package com.githubactions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyTestService {

    public void sayHello() {
        log.info("[MyTestService] sayHello");
    }

    public void error(){
        error...
    }
}