package com.hcl.ms1.repository;

import com.hcl.ms1.dto.Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
@FeignClient("ms2")
public interface Ms2ServiceProxy {

    @GetMapping("/data")
    public ResponseEntity<Message> getData();
}
