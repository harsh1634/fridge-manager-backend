package com.fridgeapp.service;

import com.fridgeapp.dto.UserCreateRequest;
import com.fridgeapp.entity.User;
import com.fridgeapp.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User save(UserCreateRequest userInfo) {
        User newUser = User.builder()
                .username(userInfo.getUsername())
                .passwordHash(passwordEncoder.encode(userInfo.getPassword()))
                .email(userInfo.getEmail())
                .build();
        return userRepository.save(newUser);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}