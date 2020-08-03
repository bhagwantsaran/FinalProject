package com.example.userservice.shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseEntity {
    private String userName;
    
    private String userType;
    
    private String email;
    
    private long mobileNumber;
    
    private boolean confirmed;
}
