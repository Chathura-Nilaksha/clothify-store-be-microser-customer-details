package org.example.service;

import org.springframework.http.ResponseEntity;

public interface LoginService {

    void saveLoginDetails(String email, String password);

    ResponseEntity loginValidation(String email, String password);
}
