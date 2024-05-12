package org.example.service.impl;

import org.example.dto.LoginDto;
import org.example.entity.LoginEntity;
import org.example.repository.LoginRepository;
import org.example.service.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

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
        loginRepository.findByEmail(email);
        loginRepository.findBy
        return null;
    }
}
