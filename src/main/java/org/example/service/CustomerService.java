package org.example.service;

import org.example.dto.CustomerDto;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
    ResponseEntity<String> saveCustomerDetails(CustomerDto customerDto);


}
