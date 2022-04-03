package com.alexandre.mainionic.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.mainionic.domain.Category;
import com.alexandre.mainionic.repositories.CategoryRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoryRepository repo;
	
	public void instantiateDB() {
		
		//Category instantiates
		Category cat1 =  new Category(null, "Informática");
		Category cat2 =  new Category(null, "Camping");
		Category cat3 =  new Category(null, "Pesca");
		Category cat4 =  new Category(null, "Calçados");
		Category cat5 =  new Category(null, "Moda Masculina");
		Category cat6 =  new Category(null, "Smartphones");
		Category cat7 =  new Category(null, "Teclados Mecânicos");
		Category cat8 =  new Category(null, "Moda Feminina");
		Category cat9 =  new Category(null, "Brinquedos");
		Category cat10 = new Category(null, "Jogos");
		Category cat11 = new Category(null, "Cozinha");
		Category cat12 = new Category(null, "Banho");
		Category cat13 = new Category(null, "Praia");
		Category cat14 = new Category(null, "Bebidas");
		Category cat15 = new Category(null, "Livros");
		Category cat16 = new Category(null, "Automóveis");
		Category cat17 = new Category(null, "Pneus");
		Category cat18 = new Category(null, "Rodas");
		Category cat19 = new Category(null, "Motor");
		Category cat20 = new Category(null, "Óleos Lubrificantes");
		Category cat21 = new Category(null, "Combustíveis");
		Category cat22 = new Category(null, "Tintas");
		Category cat23 = new Category(null, "Motocicletas");
		Category cat24 = new Category(null, "Barcos");
		Category cat25 = new Category(null, "Baterias");
		Category cat26 = new Category(null, "Alvenaria");
		Category cat27 = new Category(null, "Fechaduras");
		Category cat28 = new Category(null, "Portas");
		Category cat29 = new Category(null, "Pisos");
		Category cat30 = new Category(null, "Argamassas");
		Category cat31 = new Category(null, "Cadernos");
		Category cat32 = new Category(null, "Construção");
		Category cat33 = new Category(null, "Biscoitos");
		Category cat34 = new Category(null, "Massas");
		Category cat35 = new Category(null, "Cereais");
		Category cat36 = new Category(null, "Frutas");
		Category cat37 = new Category(null, "Verduras");
		Category cat38 = new Category(null, "Laticínios");
		
		repo.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, 
				cat8, cat9, cat10, cat11, cat12, cat13, cat14, cat15, cat16, cat17, 
				cat18, cat19, cat20, cat21, cat22, cat23, cat24, cat25, cat26, cat27, 
				cat28, cat29, cat30, cat31, cat32, cat33, cat34, cat35, cat36, cat37, 
				cat38));		
	}
}
