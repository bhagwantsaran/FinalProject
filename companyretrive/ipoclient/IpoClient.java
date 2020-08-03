package com.example.companyretrive.ipoclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.companyretrive.dto.IpoDTO;



@FeignClient("ipo-service")
public interface IpoClient {
	@RequestMapping(value = "companyipo/{company_name}", method = RequestMethod.GET)
	public IpoDTO getCompanyIpoDetails(@PathVariable String company_name) throws Exception;

}
