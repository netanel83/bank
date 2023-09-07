package com.bank.controller;

import com.bank.entity.MessageResult;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/queue")
public class QueueController {
    private static final Logger Logger = LoggerFactory.getLogger(QueueController.class);
    @GetMapping("/test")
    public ResponseEntity<MessageResult> test(@RequestParam String name){
        Logger.info("in class " + QueueController.class);
        MessageResult result = MessageResult.success();
        String data = "queue test for " + name ;
        result.setData(data);
        return  ResponseEntity.ok(result);
    }
}
