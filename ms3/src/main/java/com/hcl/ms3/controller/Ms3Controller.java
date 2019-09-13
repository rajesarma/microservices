package com.hcl.ms3.controller;

import com.hcl.ms3.dto.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Ms3Controller {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/data3")
    public ResponseEntity<Message> getData(HttpServletRequest request) {

        logger.info(String.format("Post Filter: %s request to %s", request.getMethod(), request.getRequestURL().toString()));


        Message message = new Message("Test", "Getting from MS3 Third Test Description");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
