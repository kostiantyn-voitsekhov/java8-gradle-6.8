package com.java8gradle.service;

import com.java8gradle.repo.HElloWorldRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    private final HElloWorldRepo repo;

    public HelloWorldService(HElloWorldRepo repo) {
        this.repo = repo;
    }

    public ResponseEntity<String> findHelloWorld() {
        return ResponseEntity.ok(repo.getHelloRold());
    }
}
