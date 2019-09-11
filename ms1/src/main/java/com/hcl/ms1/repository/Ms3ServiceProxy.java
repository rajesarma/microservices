package com.hcl.ms1.repository;

import com.hcl.ms1.dto.Message;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
@FeignClient("ms3")
@RibbonClient("ms3")
public interface Ms3ServiceProxy {

    @GetMapping("/data3")
    public ResponseEntity<Message> getData();
}
