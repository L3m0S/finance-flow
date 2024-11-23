package com.lemori.finance_flow.Infrastructure.repositories.security;

import com.lemori.finance_flow.domain.models.interfaces.PasswordHasher;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BCryptPasswordHasher implements PasswordHasher {

    private final PasswordEncoder encoder;

    @Override
    public String hash(String password) {
        return encoder.encode(password);
    }

    @Override
    public boolean verify(String password, String hashedPassword) {
        return encoder.matches(password, hashedPassword);
    }
}
