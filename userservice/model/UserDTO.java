package com.example.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
 
    private String userName;
    
    private String password;
    
    private String userType;
    
    private String email;
    
    private long mobileNumber;
    
    private boolean confirmed;
}
