package com.bilgeadam.example.service;

import com.bilgeadam.example.dao.IUserDAO;
import com.bilgeadam.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    private String helloService="Hello Service";

    @Autowired
    private final IUserDAO userDAO;

    public UserService(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }


    public String getHelloService() {
        return helloService;
    }

    @Override
    public void kaydet(User user) {

        if (user!=null&&user.getUserName()!=null){
            userDAO.kaydet(user);
        }

    }


}
