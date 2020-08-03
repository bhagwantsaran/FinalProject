package com.example.companyretrive.dao.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="company")
public class CompanyEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    @Column(name = "cname")
	    private String companyName;

	    @Column(name = "turnover")
	    private float turnover;

	    @Column(name = "ceo")
	    private String ceo;

	    @Column(name = "bod")
	    private String bod;
	    
	    //lse=Listed in stock exchange
	    @Column(name="lse")
	    private String lse;
	    
	    @Column(name="sector")
	    private String sector;
	    
	    @Column(name="brief_writeup")
	    private String briefWriteup;
	    
	    @Column(name="stock_code")
	    private long stockCode;
	    

}
