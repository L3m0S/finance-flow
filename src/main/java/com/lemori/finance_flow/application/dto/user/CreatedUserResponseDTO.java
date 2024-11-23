package com.lemori.finance_flow.application.dto.user;

public record CreatedUserResponseDTO(
        Long id,
        String email,
        String password,
        String name
) {
}
