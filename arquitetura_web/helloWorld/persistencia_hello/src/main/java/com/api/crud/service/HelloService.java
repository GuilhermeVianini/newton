package com.api.crud.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getHello(String name) {
        return String.format("Hello %s!", name);
    }
}
