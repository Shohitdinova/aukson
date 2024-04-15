package com.example.game_aukson.user;
import com.example.game_aukson.user.entity.User;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User login(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(Long id, User newUser) {
        newUser.setId(id);
        return userRepository.save(newUser);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


}
