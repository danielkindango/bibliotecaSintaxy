package com.Sintaxy.biblitecaSintaxy.service;

import com.Sintaxy.biblitecaSintaxy.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<com.Sintaxy.biblitecaSintaxy.model.User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return (User) userRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public User save(User user) {

        return null;
    }
}
