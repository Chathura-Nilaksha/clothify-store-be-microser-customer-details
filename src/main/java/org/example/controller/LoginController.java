package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.LoginDto;
import org.example.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;
    public ResponseEntity loginValidation(@RequestBody LoginDto loginDto){

        return loginService.loginValidation(loginDto.getEmail(), loginDto.getPassword());
    }

}
