package com.rfagundes.financial;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rfagundes.financial.domain.Categoria;
import com.rfagundes.financial.domain.ContaBancaria;
import com.rfagundes.financial.repositories.CategoriaRepository;
import com.rfagundes.financial.repositories.ContaBancariaRepository;

@SpringBootApplication
public class FinancialApplication implements CommandLineRunner {

	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ContaBancariaRepository cbRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(FinancialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		 Categoria cat1 = new Categoria(null, "cdb", "conta investimento cdb");
		 
		 ContaBancaria cb1 = new ContaBancaria(null, "Investimento", "774-9", 200.00 , cat1);
		
		 cat1.getContaBancaria().addAll(Arrays.asList(cb1));
		 
		 this.categoriaRepository.saveAll(Arrays.asList(cat1));
		 this.cbRepository.saveAll(Arrays.asList(cb1));
	}

}
