package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.CustomerDto;
import org.example.service.CustomerService;
import org.example.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
//@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {
    final CustomerService customerService ;
    final LoginService loginService;
    @PostMapping("/save-details") //Using this for save & update customer details
    public ResponseEntity<String> saveCustomerDetails(@RequestBody CustomerDto customerDto){
        loginService.saveLoginDetails(customerDto.getEmail(), customerDto.getPassword());
        return customerService.saveCustomerDetails(customerDto);
    }
    @PostMapping("/log-in-validation")
    public ResponseEntity<String> logInValidation(String email, String password){
        return customerService.logInValidation(email, password);
    }
//    @PostMapping("/change-password") //change password
//    public ResponseEntity<String> changePassword(String email){
//
//    }


}
