package com.example.companyretrive.controller;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.companyretrive.dto.CompanyDTO;
import com.example.companyretrive.dto.IpoDTO;
import com.example.companyretrive.dto.StockPriceDTO;
import com.example.companyretrive.service.CompanyService;



@RestController
public class CompanyController {
	   @Autowired
	    private CompanyService companyService;

	   
	    @RequestMapping(value = "/company/{companyId}", method = RequestMethod.GET)
	    public CompanyDTO getCompany(@PathVariable long companyId) throws Exception {
	    	
	        CompanyDTO companyDTO= companyService.getCompany(companyId);
	       // System.out.println(companyDTO.getCompany_name());
	        return companyDTO;
	    }
	    @RequestMapping(value = "/stockprice/{companyId}&{fromDate}&{toDate}", method = RequestMethod.GET)
	    public Iterable<StockPriceDTO> getStockPrice(@PathVariable long companyId,Date fromDate,Date toDate)throws Exception
	    {
	    	Iterable<StockPriceDTO> stockPriceDTO=companyService.getStockPrice(companyId,fromDate,toDate);
	    	return stockPriceDTO;
	    }
	    @RequestMapping(value = "/matchingcompany/{pattern}", method = RequestMethod.GET)
	    public Iterable<CompanyDTO> getMatchingCompanies(@PathVariable("pattern") String pattern)throws Exception
	    {
	    	Iterable<CompanyDTO> companyDTO=companyService.getMatchingCompanies(pattern);
	    	return companyDTO;
	    }
	    @RequestMapping(value="/companyipo/{company_name}",method = RequestMethod.GET)
	    public  IpoDTO getCompanyIpoDetails(@PathVariable String company_name) throws Exception
	    {
	    	IpoDTO ipoDTO=companyService.getCompanyIpoDetails(company_name);
	    	return ipoDTO;
	    }
}
