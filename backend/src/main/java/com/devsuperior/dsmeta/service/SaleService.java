package com.devsuperior.dsmeta.service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repository.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	SaleRepository saleRepository;
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
//		if (saleRepository.findAll().isEmpty()) {
//			System.out.println("Ainda não há nada cadastrado!");
//			return new ArrayList<Sale>(); Vf611!@zy4%Ivq$l
//		}
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		
		return saleRepository.findSales(min, max, pageable);
	}
}
