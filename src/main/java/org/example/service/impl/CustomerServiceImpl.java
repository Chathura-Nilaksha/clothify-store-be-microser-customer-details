package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.CustomerDto;
import org.example.entity.CustomerEntity;
import org.example.repository.CustomerRepository;
import org.example.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

//@EnableJpaRepositories
@RequiredArgsConstructor
@Service
@Lazy
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    ModelMapper modelMapper;
    @Override
    public ResponseEntity<String> saveCustomerDetails(CustomerDto customerDto) {
        customerRepository.save(modelMapper.map(customerDto, CustomerEntity.class));
        return ResponseEntity.ok("Details saved. Thank You.");
    }


}
//ResponseEntity<Boolean>
//(Objects.nonNull(department.getDepartmentName())
//if (Objects.nonNull(department.getDepartmentCode())
//            && !"".equalsIgnoreCase(
//                department.getDepartmentCode()))
