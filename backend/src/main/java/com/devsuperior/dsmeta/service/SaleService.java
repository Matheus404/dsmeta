package com.devsuperior.dsmeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repository.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	SaleRepository saleRepository;
	
	public List<Sale> findSales() {
//		if (saleRepository.findAll().isEmpty()) {
//			System.out.println("Ainda não há nada cadastrado!");
//			return new ArrayList<Sale>();
//		}
		return saleRepository.findAll();
	}
}
