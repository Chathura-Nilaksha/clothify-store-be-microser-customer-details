package org.example.service.impl;

import org.example.dto.LoginDto;
import org.example.entity.LoginEntity;
import org.example.repository.LoginRepository;
import org.example.service.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
        loginDto.setEmail(password);
        loginRepository.save(modelMapper.map(loginDto, LoginEntity.class));
    }
}
