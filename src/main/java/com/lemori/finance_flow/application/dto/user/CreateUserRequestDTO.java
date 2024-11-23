package com.lemori.finance_flow.application.dto.user;

public record CreateUserRequestDTO(
        String email,
        String password,
        String name
) {
}
