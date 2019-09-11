package com.hcl.ms1.controller;

import com.hcl.ms1.dto.Message;
import com.hcl.ms1.service.Ms1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ms1Controller {
    private Ms1Service ms1Service;

    @Autowired
    Ms1Controller(final Ms1Service ms1Service) {
        this.ms1Service = ms1Service;
    }

    @GetMapping("/ms-1/get-data")
    public ResponseEntity<Message> getData() {
        Message message = ms1Service.getData();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/ms-1/get-data3")
    public ResponseEntity<Message> getThirdData() {
        Message message = ms1Service.getData();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
