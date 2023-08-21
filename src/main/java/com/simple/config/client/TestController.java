package com.simple.config.client;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final MyConfig myConfig;

    @RequestMapping("/")
    public ResponseEntity index() {
        return null;
    }

    @GetMapping("/config")
    public ResponseEntity<String> config() {
        System.out.println(myConfig);
        return ResponseEntity.ok(myConfig.toString());
    }
}
