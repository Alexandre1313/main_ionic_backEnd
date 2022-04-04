package com.alexandre.mainionic.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.mainionic.domain.Category;
import com.alexandre.mainionic.domain.Product;
import com.alexandre.mainionic.repositories.CategoryRepository;
import com.alexandre.mainionic.repositories.ProductRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoryRepository crep;
	
	@Autowired
	private ProductRepository prep;
	
	public void instantiateDB() {
		
		//Category instantiates
		Category cat1 =  new Category(null, "Informática");
		//Category cat2 =  new Category(null, "Camping");
		//Category cat3 =  new Category(null, "Pesca");
		//Category cat4 =  new Category(null, "Calçados");
		//Category cat5 =  new Category(null, "Moda Masculina");
		//Category cat6 =  new Category(null, "Smartphones");
		//Category cat7 =  new Category(null, "Teclados Mecânicos");
		//Category cat8 =  new Category(null, "Moda Feminina");
		//Category cat9 =  new Category(null, "Brinquedos");
		//Category cat10 = new Category(null, "Jogos");
		//Category cat11 = new Category(null, "Cozinha");
		//Category cat12 = new Category(null, "Banho");
		//Category cat13 = new Category(null, "Praia");
		//Category cat14 = new Category(null, "Bebidas");
		//Category cat15 = new Category(null, "Livros");
		//Category cat16 = new Category(null, "Automóveis");
		//Category cat17 = new Category(null, "Pneus");
		Category cat18 = new Category(null, "Rodas");
		Category cat19 = new Category(null, "Motor");
		//Category cat20 = new Category(null, "Óleos Lubrificantes");
		//Category cat21 = new Category(null, "Combustíveis");
		//Category cat22 = new Category(null, "Tintas");
		//Category cat23 = new Category(null, "Motocicletas");
		Category cat24 = new Category(null, "Barcos");
		Category cat25 = new Category(null, "Baterias");
		//Category cat26 = new Category(null, "Alvenaria");
		//Category cat27 = new Category(null, "Fechaduras");
		//Category cat28 = new Category(null, "Portas");
		//Category cat29 = new Category(null, "Pisos");
		//Category cat30 = new Category(null, "Argamassas");
		//Category cat31 = new Category(null, "Cadernos");
		//Category cat32 = new Category(null, "Construção");
		//Category cat33 = new Category(null, "Biscoitos");
		//Category cat34 = new Category(null, "Massas");
		Category cat35 = new Category(null, "Cereais");
		//Category cat36 = new Category(null, "Frutas");
		Category cat37 = new Category(null, "Verduras");
		Category cat38 = new Category(null, "Laticínios");
				
	    Product p1 = new Product(null, "Computador", 2000.95);
	    Product p2 = new Product(null, "Feijão", 5.99);
	    Product p3 = new Product(null, "Lentilha", 18.98);
	    Product p4 = new Product(null, "Keyboard Mechanical Reddragon", 1563.25);
	    Product p5 = new Product(null, "Hélice sub aquática", 3000.95);
	    Product p6 = new Product(null, "Bateria Moura 400 ampéres", 423.95);
	    Product p7 = new Product(null, "Roda aro 17 liga-leve", 8336.95);
	    Product p8 = new Product(null, "Junta cabeçote Uno", 5.99);
	    Product p9 = new Product(null, "Alface roxa", 1.99);
	    Product p10 = new Product(null, "Mouse", 7.25);
	    Product p11 = new Product(null, "Leite Semi-desnatado", 3.95);
	    Product p12 = new Product(null, "Canjica", 7.95);
	    
	    cat1.getProducts().addAll(Arrays.asList(p1, p4, p10));
	    cat38.getProducts().addAll(Arrays.asList(p11));
	    cat35.getProducts().addAll(Arrays.asList(p2, p3, p12));	
	    cat19.getProducts().addAll(Arrays.asList(p8));
	    cat18.getProducts().addAll(Arrays.asList(p7));
	    cat24.getProducts().addAll(Arrays.asList(p5));
	    cat37.getProducts().addAll(Arrays.asList(p9));
	    cat25.getProducts().addAll(Arrays.asList(p6));
	    
	    p1.getCategories().addAll(Arrays.asList(cat1));
	    p2.getCategories().addAll(Arrays.asList(cat35));
	    p3.getCategories().addAll(Arrays.asList(cat35));
	    p4.getCategories().addAll(Arrays.asList(cat1));
	    p5.getCategories().addAll(Arrays.asList(cat24));
	    p6.getCategories().addAll(Arrays.asList(cat25));
	    p7.getCategories().addAll(Arrays.asList(cat18));
	    p8.getCategories().addAll(Arrays.asList(cat19));
	    p9.getCategories().addAll(Arrays.asList(cat37));
	    p10.getCategories().addAll(Arrays.asList(cat1));
	    p11.getCategories().addAll(Arrays.asList(cat38));
	    p12.getCategories().addAll(Arrays.asList(cat35));
	    
	    crep.saveAll(Arrays.asList(cat1, cat18, cat19, cat24,
	    		cat25, cat35, cat37, cat38));
	    prep.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6,
	    		p7, p8, p9, p10, p11, p12));
	}
} 
