package com.lemori.finance_flow.domain.models.interfaces;

public interface PasswordHasher {
    String hash(String password);
    boolean verify(String password, String hashedPassword);
}
