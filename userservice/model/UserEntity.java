package com.example.userservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "username") 
    private String userName;
    
    @Column(name="password")
    private String password;
    
    @Column(name="usertype")
    private String userType;
    
    @Column(name="email")
    private String email;
    
    @Column(name="mobilenumber")
    private long mobileNumber;
    
    @Column(name="confirmed")
    private boolean confirmed;
    
    

}
