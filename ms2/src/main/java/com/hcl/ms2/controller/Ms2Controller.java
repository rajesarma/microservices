package com.hcl.ms2.controller;

import com.hcl.ms2.dto.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ms2Controller {

    @GetMapping("/data")
    public ResponseEntity<Message> getData() {
        Message message = new Message("Test", "Getting from MS2 Test Description");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
