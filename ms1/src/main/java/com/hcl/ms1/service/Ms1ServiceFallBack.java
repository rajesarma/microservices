package com.hcl.ms1.service;

import com.hcl.ms1.dto.Message;
import com.hcl.ms1.repository.Ms2ServiceProxy;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Ms1ServiceFallBack {

    private Ms2ServiceProxy ms2ServiceProxy;

    @Autowired
    Ms1ServiceFallBack(final Ms2ServiceProxy ms2ServiceProxy) {
        this.ms2ServiceProxy = ms2ServiceProxy;
    }

    @HystrixCommand(fallbackMethod = "getData_FallBack")
    public Message getData() {
        ResponseEntity<Message> response = ms2ServiceProxy.getData();
        Message message = response.getBody();
        return message;
    }

    public Message getData_FallBack() {
        Message message = Message.of("FallBack", "Ms2 Service is Down");
        return message;
    }
}
