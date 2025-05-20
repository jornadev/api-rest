package com.jornadev.restapi.service;

import com.jornadev.restapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private final Map<Long, User> users = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong();

    public List<User> getAllUsers(){
        return new ArrayList<>(users.values());
    }

    public User createUser(User user) {
        long id = idCounter.getAndIncrement();
        user.setId(id);
        users.put(id, user);
        return user;
    }

    public User updateUser(Long id,User user) {
            user.setId(id);
            users.put(id, user);
            return user;
    }

    public void deleteUser(Long id) {
        users.remove(id);
    }
}

