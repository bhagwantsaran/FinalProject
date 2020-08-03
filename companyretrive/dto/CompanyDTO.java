package com.example.companyretrive.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {

	    private long id;
	
	    private String companyName;

	    private float turnover;

	    private String ceo;

	    private String bod;

	    private String lse;
	
	    private String sector;
	
	    private String briefWriteup;

	    private long stockCode;

}
