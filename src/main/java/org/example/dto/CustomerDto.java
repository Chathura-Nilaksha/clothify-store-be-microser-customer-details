package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private Integer customerCode; // when registering this does nt receive any input from FE.But when update this received some input
    private String firstName;
    private String lastName;
    private String phoneNumber1;
    private String phoneNumber2;   // op
    private String whatsappNumber; // op
    private String email;
    private String password;
    private String addressLine1;
    private String addressLine2; // op
    private String city;
    private String district;
    private Integer yearOfBirth;
    private String gender;
}
