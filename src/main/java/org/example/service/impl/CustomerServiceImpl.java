package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.CustomerDto;
import org.example.entity.CustomerEntity;
import org.example.repository.CustomerRepository;
import org.example.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

//@EnableJpaRepositories
@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    ModelMapper modelMapper;
    @Override
    public ResponseEntity<String> saveCustomerDetails(CustomerDto customerDto) {
        customerRepository.save(modelMapper.map(customerDto, CustomerEntity.class));
        return ResponseEntity.ok("Details saved. Thank You.");
    }

    @Override
    public ResponseEntity<String> logInValidation(String email, String password) {
        if(email.equalsIgnoreCase(customerRepository.existsByEmail(email))){
            return Objects.equals(password, customerRepository.findByEmail(email).getPassword()) ? ResponseEntity.ok("You can login"):
                                        ResponseEntity.ok("Incorrect Password");
        }else{
            return ResponseEntity.ok("Email is incorrect. Check & reenter the correct Email please.");
        }
    }
}
//ResponseEntity<Boolean>
//(Objects.nonNull(department.getDepartmentName())
//if (Objects.nonNull(department.getDepartmentCode())
//            && !"".equalsIgnoreCase(
//                department.getDepartmentCode()))
