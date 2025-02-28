package com.example.tdd.service;

import com.example.tdd.model.User;
import com.example.tdd.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;

class UserServiceTest {
    
    private final UserRepository userRepository = Mockito.mock(UserRepository.class);
    private final UserService userService = new UserService(userRepository);

    @Test
    void testCreateUser() {
        User user = new User(1L, "John Doe", "john@example.com");

        Mockito.when(userRepository.save(user)).thenReturn(user);

        User createdUser = userService.createUser(user);
        assertNotNull(createdUser);
        assertEquals("John Doe", createdUser.getName());
    }

    @Test
    void testFindUserById() {
        User user = new User(1L, "John Doe", "john@example.com");

        Mockito.when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        User foundUser = userService.getUserById(1L);
        assertNotNull(foundUser);
        assertEquals("John Doe", foundUser.getName());
    }
}
