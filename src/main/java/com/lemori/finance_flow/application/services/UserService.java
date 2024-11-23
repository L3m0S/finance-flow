package com.lemori.finance_flow.application.services;

import com.lemori.finance_flow.Infrastructure.repositories.user.UserRepository;
import com.lemori.finance_flow.application.dto.user.CreateUserRequestDTO;
import com.lemori.finance_flow.domain.exceptions.user.UserEmailAlreadyRegisteredException;
import com.lemori.finance_flow.domain.models.interfaces.PasswordHasher;
import com.lemori.finance_flow.domain.models.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    private final PasswordHasher passwordHasher;

    public User createUser(CreateUserRequestDTO userDTO) {

        if (userRepository.findByEmail(userDTO.email()).isPresent()) {
            throw new UserEmailAlreadyRegisteredException("Email already registered!");
        }

        User user = new User();
        user.setName(userDTO.name());
        user.setEmail(userDTO.email());
        user.setPassword(passwordHasher.hash(userDTO.password()));

        return userRepository.save(user);
    }
}
