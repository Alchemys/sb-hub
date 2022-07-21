package com.townsendsoftware.sbhub.controller;

import com.townsendsoftware.sbhub.protos.FibonacciResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.townsendsoftware.sbhub.fibs.components.FibsCalculator;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class SbHubRestApiController {

    private FibsCalculator fibsCalculator;
    private Gson gson = new GsonBuilder()
        .setPrettyPrinting()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .create();

    @Autowired
    public void SbHubRestApiController(FibsCalculator fibsCalculator) {
        this.fibsCalculator = fibsCalculator;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @RequestMapping(path="/fibs", produces="application/json")
    public ResponseEntity<String> calculateFibs(
        @RequestParam(value = "seed0", defaultValue = "0") Long seqSeed0,
        @RequestParam(value = "seed1", defaultValue = "1") Long seqSeed1,
        @RequestParam(value = "iterations", defaultValue = "25") Integer iterations) {
        
        FibonacciResponse calcResponse = fibsCalculator.generateSequence(seqSeed0, seqSeed1, iterations);
        log.info("Response: [{}]", calcResponse);

        // TODO: Extract messages and return a 40x response if the level is ERROR
        try {
            return ResponseEntity.ok().body(JsonFormat.printer().print(calcResponse));
        } catch (InvalidProtocolBufferException e) {
            log.error("InvalidProtocolBufferException encountered attempting to serialize response: [{}]", calcResponse);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{error: \"Internal conversion failure\"}");
        }
    }

}