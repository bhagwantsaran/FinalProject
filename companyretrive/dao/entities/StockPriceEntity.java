package com.example.companyretrive.dao.entities;

import java.sql.Time;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="stock")
public class StockPriceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "companyid")
    private long companyId;

    @Column(name = "companycode")
    private long companyCode;

    @Column(name = "stockexchange")
    private String stockExchange;

    @Column(name = "currentprice")
    private float currentPrice;
    
    @Column(name="date")
    private Date date;
    
    @Column(name="time")
    private Time time;
    
    
}
