package com.alexandre.mainionic.services;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.mainionic.domain.Address;
import com.alexandre.mainionic.domain.CardPayment;
import com.alexandre.mainionic.domain.Category;
import com.alexandre.mainionic.domain.City;
import com.alexandre.mainionic.domain.Client;
import com.alexandre.mainionic.domain.OrderItems;
import com.alexandre.mainionic.domain.Payment;
import com.alexandre.mainionic.domain.PaymentWithTicket;
import com.alexandre.mainionic.domain.Product;
import com.alexandre.mainionic.domain.Request;
import com.alexandre.mainionic.domain.State;
import com.alexandre.mainionic.domain.enums.ClientType;
import com.alexandre.mainionic.domain.enums.PaymentStatus;
import com.alexandre.mainionic.repositories.AddressRepository;
import com.alexandre.mainionic.repositories.CategoryRepository;
import com.alexandre.mainionic.repositories.CityRepository;
import com.alexandre.mainionic.repositories.ClientRepository;
import com.alexandre.mainionic.repositories.OrderItemsRepository;
import com.alexandre.mainionic.repositories.PaymentRepository;
import com.alexandre.mainionic.repositories.ProductRepository;
import com.alexandre.mainionic.repositories.RequestRepository;
import com.alexandre.mainionic.repositories.StateRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoryRepository crep;
	
	@Autowired
	private ProductRepository prep;
	
	@Autowired
	private StateRepository srep;
	
	@Autowired
	private CityRepository cyrep;
	
	@Autowired
	private AddressRepository adrep;
	
	@Autowired
	private ClientRepository clirep;
	
	@Autowired
	private RequestRepository reqrep;
	
	@Autowired
	private PaymentRepository pyrep;
	
	@Autowired
	private OrderItemsRepository oirep;
	
	
	public void instantiateDB() throws ParseException {
		
		//States
		
		State s1 = new State(null, "Minas Gerais", "MG");
		State s2 = new State(null, "São Paulo", "SP");
		State s3 = new State(null, "Distrito Federal", "DF");
		State s4 = new State(null, "Sergipe", "SE");
		State s5 = new State(null, "Alagoas", "AL");
		State s6 = new State(null, "Paraíba", "PB");
		State s7 = new State(null, "Pernambuco", "PE");
		State s8 = new State(null, "Espirito Santo", "ES");
		State s9 = new State(null, "Mato Grosso", "MT");
		State s10 = new State(null, "Mato Grosso do Sul", "MS");
		State s11 = new State(null, "Maranhão", "MA");
		State s12 = new State(null, "Ceará", "CE");
		State s13 = new State(null, "Rio Grande do Norte", "RN");
		State s14 = new State(null, "Rio Grande do Sul", "RS");
		State s15 = new State(null, "Acre", "AC");
		State s16 = new State(null, "Goiás", "GO");
		State s17 = new State(null, "Tocantins", "TO");
		State s18 = new State(null, "Bahia", "BA");
		State s19 = new State(null, "Piauí", "PI");
		State s20 = new State(null, "Rio de Janeiro", "RJ");
		State s21 = new State(null, "Rondônia", "RO");
		State s22 = new State(null, "Amazonas", "AM");
		State s23 = new State(null, "Amapá", "AP");
		State s24 = new State(null, "Rorraima", "RR");
		State s25 = new State(null, "Pará", "PA");
		State s26 = new State(null, "Paraná", "PR");
		State s27 = new State(null, "Santa Catarina", "SC");
		
		//Cities
		
		City c1 = new City(null, "Blumenau", s27);
		City c2 = new City(null, "Bagé", s14);
		City c3 = new City(null, "Rio de Janeiro", s20);
		City c4 = new City(null, "São Paulo", s2);
		City c5 = new City(null, "Rio Branco", s15);
		City c6 = new City(null, "Porto Velho", s21);
		City c7 = new City(null, "Guarapuava", s26);
		City c8 = new City(null, "Macapá", s23);
		City c9 = new City(null, "Aracajú", s4);
		City c10 = new City(null, "Maceió", s5);
		City c11 = new City(null, "João Pessoa", s6);
		City c12 = new City(null, "Recife", s7);
		City c13 = new City(null, "Cuiabá", s9);
		City c14 = new City(null, "Campo Grande", s10);
		City c15 = new City(null, "Vitória", s8);
		City c16 = new City(null, "São Luiz", s11);
		City c17 = new City(null, "Fortaleza", s12);
		City c18 = new City(null, "Natal", s13);
		City c19 = new City(null, "Goiânia", s16);
		City c20 = new City(null, "Palmas", s17);
		City c21 = new City(null, "Teresina", s19);
		City c22 = new City(null, "Manaus", s22);
		City c23 = new City(null, "Belém", s25);
		City c24 = new City(null, "Boa Vista", s24);
		City c25 = new City(null, "Brasília", s3);
		City c26 = new City(null, "Alterosa", s1);
		City c27 = new City(null, "Feira de Santana", s18);
		City c28 = new City(null, "Ilhota", s27);
		City c29 = new City(null, "Lages", s27);
		City c30 = new City(null, "Doutor Pedrinho", s27);
		
		s27.getCities().addAll(Arrays.asList(c30, c29, c28, c1));
		s26.getCities().addAll(Arrays.asList(c7));
		s25.getCities().addAll(Arrays.asList(c23));
		s24.getCities().addAll(Arrays.asList(c24));
		s23.getCities().addAll(Arrays.asList(c8));
		s22.getCities().addAll(Arrays.asList(c22));
		s21.getCities().addAll(Arrays.asList(c6));
		s20.getCities().addAll(Arrays.asList(c3));
		s19.getCities().addAll(Arrays.asList(c21));
		s18.getCities().addAll(Arrays.asList(c27));
		s17.getCities().addAll(Arrays.asList(c20));
		s16.getCities().addAll(Arrays.asList(c19));
		s15.getCities().addAll(Arrays.asList(c5));
		s14.getCities().addAll(Arrays.asList(c2));
		s13.getCities().addAll(Arrays.asList(c18));
		s12.getCities().addAll(Arrays.asList(c17));
		s11.getCities().addAll(Arrays.asList(c16));
		s10.getCities().addAll(Arrays.asList(c14));
		s9.getCities().addAll(Arrays.asList(c13));
		s8.getCities().addAll(Arrays.asList(c15));
		s7.getCities().addAll(Arrays.asList(c12));
		s6.getCities().addAll(Arrays.asList(c11));
		s5.getCities().addAll(Arrays.asList(c10));
		s4.getCities().addAll(Arrays.asList(c9));
		s3.getCities().addAll(Arrays.asList(c25));
		s2.getCities().addAll(Arrays.asList(c4));
		s1.getCities().addAll(Arrays.asList(c26));
				
		//Categories
		
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
		
		//Products
		
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
	    
	    srep.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, 
	    		s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, 
	    		s22, s23, s24, s25, s26, s27));
	    
	    cyrep.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, 
	    		c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, 
	    		c22, c23, c24, c25, c26, c27, c28, c29, c30));
	    
	    Client cli1 = new Client(null, "Alexandre Cordeiro", 
	    		"alexandre.13a@gmail.com", "000.612.689.84", ClientType.PESSOAFISICA);
	    cli1.getPhones().addAll(Arrays.asList("(47)99728-5083", "(49)3323-5083"));
	    
	    Address ad1 = new Address(null, "Rua Macaé", "43", "Apto 4", "Fortaleza", 
	    		"89056-015", cli1, c1);
	    
	    Address ad2 = new Address(null, "Rua Prudentópolis", "4389", "Apto 40", 
	    		"Carijós", "89025-011", cli1, c3);
	    
	    cli1.getAddresses().addAll(Arrays.asList(ad1, ad2));
	    
	    clirep.saveAll(Arrays.asList(cli1));
	    adrep.saveAll(Arrays.asList(ad1, ad2));
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	    
	    Request req1 = new Request(null, sdf.parse("30/09/2017 10:32"), cli1, ad1);
	    Request req2 = new Request(null, sdf.parse("10/10/2017 19:35"), cli1, ad2);
	    
	    Payment pg1 = new CardPayment(null, PaymentStatus.QUITADO, req1, 7);
	    req1.setPayment(pg1);
	    
	    Payment pg2 = new PaymentWithTicket(null, PaymentStatus.PENDENTE, req2, 
	    		sdf.parse("20/10/2017 00:00"), null);
	    req2.setPayment(pg2);
	    
	    cli1.getRequests().addAll(Arrays.asList(req1, req2));
	    
	    reqrep.saveAll(Arrays.asList(req1, req2));
	    pyrep.saveAll(Arrays.asList(pg1, pg2));
	    
	    OrderItems oi1 = new OrderItems(req1, p1, 0.00, 1, 2000.00 );
	    OrderItems oi2 = new OrderItems(req1, p3, 0.00, 2, 80.00 );
	    OrderItems oi3 = new OrderItems(req2, p7, 100.00, 1, 800.00 );
	    
	    req1.getItems().addAll(Arrays.asList(oi1, oi2));
	    req2.getItems().addAll(Arrays.asList(oi3));
	    
	    p1.getItems().addAll(Arrays.asList(oi1));
	    p3.getItems().addAll(Arrays.asList(oi2));
	    p7.getItems().addAll(Arrays.asList(oi3));
	    
	    oirep.saveAll(Arrays.asList(oi1, oi2, oi3));
	    
	}
} 
