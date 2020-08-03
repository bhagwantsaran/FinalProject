package com.example.companyretrive.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.companyretrive.dao.CompanyRepository;
import com.example.companyretrive.dao.entities.CompanyEntity;
import com.example.companyretrive.dao.entities.StockPriceEntity;
import com.example.companyretrive.dto.CompanyDTO;
import com.example.companyretrive.dto.IpoDTO;
import com.example.companyretrive.dto.StockPriceDTO;
import com.example.companyretrive.ipoclient.IpoClient;



@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private IpoClient ipoClient;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyServiceImpl.class);

    @Override
    public CompanyDTO getCompany(long companyId) throws Exception {
        LOGGER.info("Fetching Order details for OrderId: {}", companyId);
        CompanyEntity companyEntity = companyRepository.findById(companyId);
        CompanyDTO companyDTO = null;
        System.out.println(companyEntity);

        	ModelMapper mapper=new ModelMapper();
    	    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    	    
            companyDTO = mapper.map(companyEntity,CompanyDTO.class);
            System.out.println(companyEntity);
    	    System.out.println(companyDTO);
            //LOGGER.info("yes Fetching Order details for OrderId: {}", companyId,companyDTO.getCompany_name());
       

        return companyDTO;
    }
    @Override
    public Iterable<CompanyDTO> getMatchingCompanies(String pattern)throws Exception
    {
    	List <CompanyDTO> list=new ArrayList<>();
    	Iterable<CompanyEntity> companyEntity=companyRepository.findByCompanyNameContaining(pattern);
    	ModelMapper mapper=new ModelMapper();
	    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	    for(CompanyEntity entity : companyEntity) {
	    	
	    	CompanyDTO cdt=mapper.map(entity,CompanyDTO.class);
	    	list.add(cdt);
	    	
	    }
	    Iterable<CompanyDTO> companyDTO=list;
	    return companyDTO;
    	
    }
    @Override
    public IpoDTO getCompanyIpoDetails(String company_name) throws Exception
    {
    	return ipoClient.getCompanyIpoDetails(company_name);
    }
	@Override
	public Iterable<StockPriceDTO> getStockPrice(long companyId, Date fromDate, Date toDate) {
    	List <StockPriceDTO> list=new ArrayList<>();
//    	Iterable<StockPriceEntity> stockPriceEntity=companyRepository.findStockPrice(companyId,fromDate,toDate,"BSE");
//    	ModelMapper mapper=new ModelMapper();
//	    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//	    for(StockPriceEntity entity : stockPriceEntity) {
//	    	
//	    	StockPriceDTO sdt=mapper.map(entity,StockPriceDTO.class);
//	    	list.add(sdt);
//	    	
//	    }
	    Iterable<StockPriceDTO> stockPriceDTO=list;
	    return stockPriceDTO;
	}
    
}
