package com.kitty.onlinshoppingapp.service;
import com.kitty.onlinshoppingapp.repository.AuthorityRepository;
import com.kitty.onlinshoppingapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class RegisterService {
    private UserRepository userRepository;
    private AuthorityRepository authorityRepository;

    @Autowired
    public RegisterService(UserRepository userRepository, AuthorityRepository authorityRepository){
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
    }
}
