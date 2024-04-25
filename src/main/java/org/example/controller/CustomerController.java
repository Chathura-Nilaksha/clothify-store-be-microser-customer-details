package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.CustomerDto;
import org.example.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {
    final CustomerService customerService ;
    @PostMapping("/save-details")
    public void saveCustomerDetails(@RequestBody CustomerDto customerDto){
        customerService.saveCustomerDetails(customerDto);
    }


}
