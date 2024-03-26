package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private String firstName;
    private String lastName;
    private String PhoneNumber;
    private String whatsappNumber;
    private String addressLine1;
    private String addressLine2;
    private String country;
    private Date dateOfBirth;
    private String email;
    private String password;


}
