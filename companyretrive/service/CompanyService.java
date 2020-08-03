package com.example.companyretrive.service;


import java.sql.Date;

import com.example.companyretrive.dao.entities.CompanyEntity;
import com.example.companyretrive.dto.CompanyDTO;
import com.example.companyretrive.dto.IpoDTO;
import com.example.companyretrive.dto.StockPriceDTO;


public interface CompanyService {

   CompanyDTO getCompany(long companyId) throws Exception;
   Iterable<CompanyDTO> getMatchingCompanies(String pattern)throws Exception;
   IpoDTO getCompanyIpoDetails(String company_name)throws Exception; 
   Iterable<StockPriceDTO> getStockPrice(long companyId, Date fromDate, Date toDate);
}
