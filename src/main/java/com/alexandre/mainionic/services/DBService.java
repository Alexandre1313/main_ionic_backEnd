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
		City c31 = new City(null, "Indaial", s27);
		City c32 = new City(null, "Gaspar", s27);
		City c33 = new City(null, "Itajaí", s27);
		City c34 = new City(null, "Belo Horizonte", s1);
		City c35 = new City(null, "Florianópolis", s27);
		City c36 = new City(null, "Curitiba", s26);
		City c37 = new City(null, "Mafra", s27);
		City c38 = new City(null, "Porto Alegre", s14);
		City c39 = new City(null, "Vacaria", s14);
		City c40 = new City(null, "Francisco Beltrão", s26);
		City c41 = new City(null, "São José dos Pinhais", s26);
		City c42 = new City(null, "Londrina", s26);
		City c43 = new City(null, "Pato Branco", s26);
		City c44 = new City(null, "Toledo", s26);
		City c45 = new City(null, "Cascavel", s26);
		City c46 = new City(null, "União da Vitória", s26);
		City c47 = new City(null, "Maringá", s26);
		City c48 = new City(null, "Ponta Grossa", s26);
		City c49 = new City(null, "Guaratuba", s26);
		City c50 = new City(null, "Paranaguá", s26);
		City c51 = new City(null, "Rodeio", s27);
		City c52 = new City(null, "Vidal Ramos", s27);
		City c53 = new City(null, "Imbuia", s27);
		City c54 = new City(null, "Uberlândia", s1);
		City c55 = new City(null, "Santos", s2);
		City c56 = new City(null, "São José do Rio Preto", s2);
		City c57 = new City(null, "Limeira", s2);
		City c58 = new City(null, "Santa Maria", s14);
		City c59 = new City(null, "Pelotas", s14);
		City c60 = new City(null, "Gravataí", s14);
		City c61 = new City(null, "Gramados", s14);
		City c62 = new City(null, "Guaporé", s14);
		City c63 = new City(null, "Mucajaí", s24);
		City c64 = new City(null, "Caracaraí", s24);
		City c65 = new City(null, "Pacaraima", s24);
		City c66 = new City(null, "Apiúna", s27);
		City c67 = new City(null, "Ascurra", s27);
		City c68 = new City(null, "Ibirama", s27);
		City c69 = new City(null, "Rio do Sul", s27);
		City c70 = new City(null, "São Miguel do Oeste", s27);
		City c71 = new City(null, "Juiz de Fora", s1);
		City c72 = new City(null, "Contagem", s1);
		City c73 = new City(null, "Montes Claros", s1);
		City c74 = new City(null, "Uberaba", s1);
		City c75 = new City(null, "Ribeirão das Neves", s1);
		City c76 = new City(null, "Betin", s1);
		City c77 = new City(null, "Sete Lagoas", s1);
		City c78 = new City(null, "Governador Valadares", s1);
		City c79 = new City(null, "Poços de Caldas", s1);
		City c80 = new City(null, "Patos de Minas", s1);
		City c81 = new City(null, "Pouso Alegre", s1);
		City c82 = new City(null, "Pomerode", s27);
				
		s27.getCities().addAll(Arrays.asList(c30, c29, c28, c1, c31, c32, c33, c35, c37, 
				                             c51, c52, c53, c66, c67, c68, c69, c70, c82));
		s26.getCities().addAll(Arrays.asList(c7, c36, c40, c41, c42, c43, c44, c45, c46, 
				                            c47, c48, c49, c50));
		s25.getCities().addAll(Arrays.asList(c23));
		s24.getCities().addAll(Arrays.asList(c24, c63, c64, c65));
		s23.getCities().addAll(Arrays.asList(c8));
		s22.getCities().addAll(Arrays.asList(c22));
		s21.getCities().addAll(Arrays.asList(c6));
		s20.getCities().addAll(Arrays.asList(c3));
		s19.getCities().addAll(Arrays.asList(c21));
		s18.getCities().addAll(Arrays.asList(c27));
		s17.getCities().addAll(Arrays.asList(c20));
		s16.getCities().addAll(Arrays.asList(c19));
		s15.getCities().addAll(Arrays.asList(c5));
		s14.getCities().addAll(Arrays.asList(c2, c38, c39, c58, c59, c60, c61, c62));
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
		s2.getCities().addAll(Arrays.asList(c4, c55, c56, c57));
		s1.getCities().addAll(Arrays.asList(c26, c34, c54, c71, c72, c73, c74, c75, 
				                            c76, c77, c78, c79, c80, c81));
				
		//Categories
		
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
	    Product p13 = new Product(null, "Aveia em Flocos", 10.95);
	    Product p14 = new Product(null, "Vela de Ignição", 77.95);
	    Product p15 = new Product(null, "Correia Dentada", 151.32);
	    Product p16 = new Product(null, "Bomba de Água", 300.58);
	    Product p17 = new Product(null, "Bomba de Óleo", 523.96);
	    Product p18 = new Product(null, "Tampa do Cárter", 452.36);
	    Product p19 = new Product(null, "Goiaba", 4.99);
	    Product p20 = new Product(null, "Banana", 2.99);
	    Product p21 = new Product(null, "Abacate", 1.50);
	    Product p22 = new Product(null, "Tangerina", 6.97);
	    Product p23 = new Product(null, "Cocô", 7.99);
	    Product p24 = new Product(null, "Ford Fusion 2.0", 150000.99);
	    Product p25 = new Product(null, "Fiat Palia Atractive 1.0", 60326.52);
	    Product p26 = new Product(null, "Corsa Sedan 1.8", 33635.21);
	    Product p27 = new Product(null, "Fiat Uno Atractive 1.4", 40563.96);
	    Product p28 = new Product(null, "Fusca", 20365.96);
	    Product p29 = new Product(null, "Camisa Couro Masculina", 597.99);
	    Product p30 = new Product(null, "Camisa Cirrê Masculina", 79.99);
	    Product p31 = new Product(null, "Jaqueta Couro Masculina", 799.99);
	    Product p32 = new Product(null, "Coca-Cola 2l", 9.99);
	    Product p33 = new Product(null, "Cerveja Skol Lata 350ml", 2.49);
	    Product p34 = new Product(null, "Água Mineral com gáz", 1.97);
	    Product p35 = new Product(null, "Vinho Tinto de Mesa Suave 1l", 9.99);
	    Product p36 = new Product(null, "Cerveja Kaiser 350ml", 2.79);
	    
	    cat1.getProducts().addAll(Arrays.asList(p1, p4, p10));
	    cat5.getProducts().addAll(Arrays.asList(p29, p30, p31));
	    cat38.getProducts().addAll(Arrays.asList(p11));
	    cat35.getProducts().addAll(Arrays.asList(p2, p3, p12, p13));	
	    cat19.getProducts().addAll(Arrays.asList(p8, p14, p15, p16, p17, p18));
	    cat18.getProducts().addAll(Arrays.asList(p7));
	    cat24.getProducts().addAll(Arrays.asList(p5));
	    cat37.getProducts().addAll(Arrays.asList(p9));
	    cat25.getProducts().addAll(Arrays.asList(p6));
	    cat36.getProducts().addAll(Arrays.asList(p19, p20, p21, p22, p23));
	    cat16.getProducts().addAll(Arrays.asList(p24, p25, p26, p27, p28));
	    cat14.getProducts().addAll(Arrays.asList(p32, p33, p34, p35, p36));
	    
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
	    p13.getCategories().addAll(Arrays.asList(cat35));
	    p14.getCategories().addAll(Arrays.asList(cat19));
	    p15.getCategories().addAll(Arrays.asList(cat19));
	    p16.getCategories().addAll(Arrays.asList(cat19));
	    p17.getCategories().addAll(Arrays.asList(cat19));
	    p18.getCategories().addAll(Arrays.asList(cat19));
	    p19.getCategories().addAll(Arrays.asList(cat36));
	    p20.getCategories().addAll(Arrays.asList(cat36));
	    p21.getCategories().addAll(Arrays.asList(cat36));
	    p22.getCategories().addAll(Arrays.asList(cat36));
	    p23.getCategories().addAll(Arrays.asList(cat36));
	    p24.getCategories().addAll(Arrays.asList(cat16));
	    p25.getCategories().addAll(Arrays.asList(cat16));
	    p26.getCategories().addAll(Arrays.asList(cat16));
	    p27.getCategories().addAll(Arrays.asList(cat16));
	    p28.getCategories().addAll(Arrays.asList(cat16));
	    p29.getCategories().addAll(Arrays.asList(cat5));
	    p30.getCategories().addAll(Arrays.asList(cat5));
	    p31.getCategories().addAll(Arrays.asList(cat5));
	    p32.getCategories().addAll(Arrays.asList(cat14));
	    p33.getCategories().addAll(Arrays.asList(cat14));
	    p34.getCategories().addAll(Arrays.asList(cat14));
	    p35.getCategories().addAll(Arrays.asList(cat14));
	    p36.getCategories().addAll(Arrays.asList(cat14));
	    
	    crep.saveAll(Arrays.asList(cat1, cat18, cat19, cat24,
	    		cat25, cat35, cat37, cat38, cat2, cat3, cat4, cat5, cat6, 
	    		cat7, cat8, cat9, cat10, cat11, cat12, cat13, cat14, cat15, 
	    		cat16, cat17, cat20, cat21, cat22, cat23, cat26, cat27, cat28, cat29, 
	    		cat30, cat31, cat32, cat33, cat34, cat36));
	    
	    prep.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6,
	    		p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, 
	    		p17, p18, p19, p20, p21, p22, p23, p24, p25, 
	    		p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36));
	    
	    srep.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, 
	    		s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, 
	    		s22, s23, s24, s25, s26, s27));
	    
	    cyrep.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, 
	    		c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, 
	    		c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32, c33, 
	    		c34, c35, c36, c37, c38, c39, c40, c41, c42, c43, c44, c45, 
	    		c46, c47, c48, c49, c50, c51, c52, c53, c54, c55, c56, c57, 
	    		c58, c59, c60, c61, c62, c63, c64, c65, c66, c67, c68, c69, 
	    		c70, c71, c72, c73, c74, c75, c76, c77, c78, c79, c80, c81, 
	    		c82));
	    
	    //Client Instance
	    
	    Client cli1 = new Client(null, "Alexandre Cordeiro", 
	    		"alexandre.13a@gmail.com", "68404337497", ClientType.PESSOAFISICA);
	    cli1.getPhones().addAll(Arrays.asList("(47)99728-5083", "(49)3323-5083"));
	    
	    Address ad1 = new Address(null, "Rua Macaé", "43", "Apto 4", "Fortaleza", 
	    		"89056-015", cli1, c1);
	    
	    Address ad2 = new Address(null, "Rua Prudentópolis", "4389", "Apto 40", 
	    		"Carijós", "89025-011", cli1, c3);
	    
	    cli1.getAddresses().addAll(Arrays.asList(ad1, ad2));
	    
	    Client cli2 = new Client(null, "Carlos Alberto Soares de Lima", 
	    		"pedromaresia@gmail.com", "26376246000156", ClientType.PESSOAJURIDICA);
	    cli1.getPhones().addAll(Arrays.asList("(47)99641-2563", "(49)5536-5412"));
	    
	    Address ad3 = new Address(null, "Rua São Paulo", "632", "Casa", "Tribess", 
	    		"89056-091", cli2, c13);
	    
	    Address ad4 = new Address(null, "Rua Vespasiano Lopes de Andrade", "43898", "Apto 401", 
	    		"Taquaras", "64589-011", cli2, c9);
	    
	    cli2.getAddresses().addAll(Arrays.asList(ad3, ad4));
	    
	    Client cli3 = new Client(null, "Maria das Dores Freitas de Souza", 
	    		"mariddfs@gmail.com", "74105672000106", ClientType.PESSOAJURIDICA);
	    cli3.getPhones().addAll(Arrays.asList("(47)99764-5926", "(88)5586-5874", 
	    		"(47)99728-5083", "(61)9965-8951"));
	    
	    Address ad5 = new Address(null, "Rua Tiguá", "6327", "Apto 301", "Ortolândia", 
	    		"46056-091", cli3, c33);
	    
	    Address ad6 = new Address(null, "Rua Inácio Francisco Beltrão", "5234", "Apto 902", 
	    		"Catanduvas", "45986-874", cli3, c7);
	    
	    Address ad7 = new Address(null, "Rua Maritacá", "89654", "Sobrado 1", 
	    		"Vila das Marianas", "45896-541", cli3, c4);
	    
	    Address ad8 = new Address(null, "Rua Araucária", "100", "Apto 785", 
	    		"Vila Grande", "85965-458", cli3, c23);
	    
	    Address ad9 = new Address(null, "Rua Rua Aristides Conselheiro Mafra", "48", "Apto 532", 
	    		"Mangabi", "34569-521", cli3, c17);
	    
	    cli3.getAddresses().addAll(Arrays.asList(ad5, ad6, ad7, ad8, ad9));
	    
	    
	    
	    
	    clirep.saveAll(Arrays.asList(cli1, cli2, cli3));
	    adrep.saveAll(Arrays.asList(ad1, ad2, ad3, ad4, ad5, ad6, ad7, ad8, ad9));
	    
	    //Order Items
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	    
	    Request req1 = new Request(null, sdf.parse("30/09/2017 10:32"), cli3, ad9);
	    Request req2 = new Request(null, sdf.parse("10/10/2017 19:35"), cli1, ad2);
	    
	    Payment pg1 = new CardPayment(null, PaymentStatus.QUITADO, req1, 7);
	    req1.setPayment(pg1);
	    
	    Payment pg2 = new PaymentWithTicket(null, PaymentStatus.PENDENTE, req2, 
	    		sdf.parse("20/10/2017 00:00"), null);
	    req2.setPayment(pg2);
	    
	    cli1.getRequests().addAll(Arrays.asList(req2));
	    cli3.getRequests().addAll(Arrays.asList(req1));
	    
	    reqrep.saveAll(Arrays.asList(req1, req2));
	    pyrep.saveAll(Arrays.asList(pg1, pg2));
	    
	    OrderItems oi1 = new OrderItems(req1, p1, 0.00, 1, p1.getPrice() );
	    OrderItems oi2 = new OrderItems(req1, p3, 0.00, 2, p3.getPrice() );
	    OrderItems oi3 = new OrderItems(req2, p7, 100.00, 1, p7.getPrice() );
	    
	    req1.getItems().addAll(Arrays.asList(oi1, oi2));
	    req2.getItems().addAll(Arrays.asList(oi3));
	    
	    p1.getItems().addAll(Arrays.asList(oi1));
	    p3.getItems().addAll(Arrays.asList(oi2));
	    p7.getItems().addAll(Arrays.asList(oi3));
	    
	    oirep.saveAll(Arrays.asList(oi1, oi2, oi3));
	    
	}
} 
