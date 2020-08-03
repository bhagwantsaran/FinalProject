package com.example.companyretrive.dto;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockPriceDTO {

	    private long companyId;

	    private long companyCode;

	    private String stockExchange;

	    private String currentPrice;

	    private Date date;

	    private Time time;
	    
	    
	
}
