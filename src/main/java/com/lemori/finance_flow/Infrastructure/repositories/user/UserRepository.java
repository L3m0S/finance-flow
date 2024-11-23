package com.lemori.finance_flow.Infrastructure.repositories.user;

import com.lemori.finance_flow.domain.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
