package com.hcl.ms1.service;

import com.hcl.ms1.dto.Message;
import com.hcl.ms1.repository.Ms2ServiceProxy;
import com.hcl.ms1.repository.Ms3ServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Ms1Service {

    private Ms1ServiceFallBack ms2ServiceProxy;
    private Ms3ServiceProxy ms3ServiceProxy;

    @Autowired
    Ms1Service(final Ms1ServiceFallBack ms2ServiceProxy, Ms3ServiceProxy ms3ServiceProxy) {
        this.ms2ServiceProxy = ms2ServiceProxy;
        this.ms3ServiceProxy = ms3ServiceProxy;
    }

    public Message getData() {
        Message message = ms2ServiceProxy.getData();
        return message;
    }

    public Message getThirdData() {
        ResponseEntity<Message> response = ms3ServiceProxy.getData();
        Message message = response.getBody();
        return message;
    }
}
