package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.CustomerDto;
import org.example.entity.CustomerEntity;
import org.example.repository.CustomerRepository;
import org.example.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository customerRepository;
    ModelMapper modelMapper;
    @Override
    public void saveCustomerDetails(CustomerDto customerDto) {
        customerRepository.save(modelMapper.map(customerDto, CustomerEntity.class));

    }
}
