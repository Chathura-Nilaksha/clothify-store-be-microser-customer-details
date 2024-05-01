package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.CustomerDto;
import org.example.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor

public class CustomerController {
    final CustomerService customerService ;
    @PostMapping("/save-details") //Using this for save & update customer details
    public ResponseEntity<String> saveCustomerDetails(@RequestBody CustomerDto customerDto){
        return customerService.saveCustomerDetails(customerDto);
    }
    @PostMapping("/log-in-validation")
    public ResponseEntity<String> logInValidation(String email, String password){
        return customerService.logInValidation(email, password);
    }


}
