package com.bilgeadam.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    private String helloService="Hello Service";

    public String getHelloService() {
        return helloService;
    }
}
