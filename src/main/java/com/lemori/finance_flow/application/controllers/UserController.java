package com.lemori.finance_flow.application.controllers;

import com.lemori.finance_flow.application.dto.user.CreateUserRequestDTO;
import com.lemori.finance_flow.application.services.UserService;
import com.lemori.finance_flow.domain.models.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("")
    public ResponseEntity<User> createUser(@RequestBody CreateUserRequestDTO body) {
        User createdUser = this.userService.createUser(body);
        return ResponseEntity.ok().body(createdUser);
    };

}
