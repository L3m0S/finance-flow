package com.lemori.finance_flow.Infrastructure.repositories.category;

import com.lemori.finance_flow.domain.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<User, Long> {
}
