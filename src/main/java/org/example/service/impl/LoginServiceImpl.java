package org.example.service.impl;

import org.example.dto.LoginDto;
import org.example.entity.LoginEntity;
import org.example.repository.LoginRepository;
import org.example.service.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginRepository loginRepository;
    ModelMapper modelMapper;
    LoginDto loginDto;
    @Override
    public void saveLoginDetails(String email, String password) {
        loginDto = new LoginDto();
        loginDto.setEmail(email);
        loginDto.setPassword(password);
        loginRepository.save(modelMapper.map(loginDto, LoginEntity.class));
    }
    @Override
    public ResponseEntity loginValidation(String email, String password) {
        LoginEntity entityByEmail = loginRepository.findByEmail(email);
        if(Objects.equals(entityByEmail.getEmail(), email)){
            return entityByEmail.getPassword()==password ?
                    ResponseEntity.ok("Email and Password are correct"):
                    ResponseEntity.ofNullable("Password is incorrect. " +
                                            "Please enter the correct Password") ;
        }else {
            return ResponseEntity.ofNullable("Your email does not have an account");
        }
    }
}
