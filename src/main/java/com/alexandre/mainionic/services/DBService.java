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

		// States

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

		// Cities

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
		City c83 = new City(null, "Acrelandia", s15);
		City c84 = new City(null, "Assis Brasil", s15);
		City c85 = new City(null, "Brasileia", s15);
		City c86 = new City(null, "Bujari", s15);
		City c87 = new City(null, "Capixaba", s15);
		City c88 = new City(null, "Cruzeiro do Sul", s15);
		City c89 = new City(null, "Epitaciolandia", s15);
		City c90 = new City(null, "Feijo", s15);
		City c91 = new City(null, "Jordao", s15);
		City c92 = new City(null, "Mancio Lima", s15);
		City c93 = new City(null, "Manoel Urbano", s15);
		City c94 = new City(null, "Marechal Thaumaturgo", s15);
		City c95 = new City(null, "Placido de Castro", s15);
		City c96 = new City(null, "Porto Acre", s15);
		City c97 = new City(null, "Porto Walter", s15);
		City c98 = new City(null, "Xapuri", s15);
		City c99 = new City(null, "Rodrigues Alves", s15);
		City c100 = new City(null, "Santa Rosa", s15);
		City c101 = new City(null, "Sena Madureira", s15);
		City c102 = new City(null, "Senador Guiomard", s15);
		City c103 = new City(null, "Tarauaca", s15);
		City c104 = new City(null, "Alvaraes", s22);
		City c105 = new City(null, "Amatari", s22);
		City c106 = new City(null, "Amatura", s22);
		City c107 = new City(null, "Anama", s22);
		City c108 = new City(null, "Anori", s22);
		City c109 = new City(null, "Apui", s22);
		City c110 = new City(null, "Ariau", s22);
		City c111 = new City(null, "Atalaia do Norte", s22);
		City c112 = new City(null, "Augusto Montenegro", s22);
		City c113 = new City(null, "Autazes", s22);
		City c114 = new City(null, "Axinim", s22);
		City c115 = new City(null, "Badajos", s22);
		City c116 = new City(null, "Balbina", s22);
		City c117 = new City(null, "Barcelos", s22);
		City c118 = new City(null, "Barreirinha", s22);
		City c119 = new City(null, "Benjamin Constant", s22);
		City c120 = new City(null, "Beruri", s22);
		City c121 = new City(null, "Boa Vista do Ramos", s22);
		City c122 = new City(null, "Boca do Acre", s22);
		City c123 = new City(null, "Borba", s22);
		City c124 = new City(null, "Caapiranga", s22);
		City c125 = new City(null, "Cameta", s22);
		City c126 = new City(null, "Canuma", s22);
		City c127 = new City(null, "Canutama", s22);
		City c128 = new City(null, "Carauari", s22);
		City c129 = new City(null, "Careiro", s22);
		City c130 = new City(null, "Careiro da Varzea", s22);
		City c131 = new City(null, "Carvoeiro", s22);
		City c132 = new City(null, "Coari", s22);
		City c133 = new City(null, "Codajas", s22);
		City c134 = new City(null, "Cucui", s22);
		City c135 = new City(null, "Eirunepe", s22);
		City c136 = new City(null, "Envira", s22);
		City c137 = new City(null, "Floriano Peixoto", s22);
		City c138 = new City(null, "Fonte Boa", s22);
		City c139 = new City(null, "Freguesia do Andira", s22);
		City c140 = new City(null, "Guajara", s22);
		City c141 = new City(null, "Humaita", s22);
		City c142 = new City(null, "Iauarete", s22);
		City c143 = new City(null, "Icana", s22);
		City c144 = new City(null, "Ipixuna", s22);
		City c145 = new City(null, "Iranduba", s22);
		City c146 = new City(null, "Itacoatiara", s22);
		City c147 = new City(null, "Itamarati", s22);
		City c148 = new City(null, "Itapiranga", s22);
		City c149 = new City(null, "Japura", s22);
		City c150 = new City(null, "Jurua", s22);
		City c151 = new City(null, "Jutai", s22);
		City c152 = new City(null, "Labrea", s22);
		City c153 = new City(null, "Lago Preto", s22);
		City c154 = new City(null, "Manacapuru", s22);
		City c155 = new City(null, "Manaquiri", s22);
		City c156 = new City(null, "Vila Pitinga", s22);
		City c157 = new City(null, "Manicore", s22);
		City c158 = new City(null, "Maraa", s22);
		City c159 = new City(null, "Massauari", s22);
		City c160 = new City(null, "Maues", s22);
		City c161 = new City(null, "Mocambo", s22);
		City c162 = new City(null, "Moura", s22);
		City c163 = new City(null, "Murutinga", s22);
		City c164 = new City(null, "Nhamunda", s22);
		City c165 = new City(null, "Nova Olinda do Norte", s22);
		City c166 = new City(null, "Novo Airao", s22);
		City c167 = new City(null, "Novo Aripuana", s22);
		City c168 = new City(null, "Osorio da Fonseca", s22);
		City c169 = new City(null, "Parintins", s22);
		City c170 = new City(null, "Pauini", s22);
		City c171 = new City(null, "Pedras", s22);
		City c172 = new City(null, "Presidente Figueiredo", s22);
		City c173 = new City(null, "Repartimento", s22);
		City c174 = new City(null, "Rio Preto da Eva", s22);
		City c175 = new City(null, "Santa Isabel do Rio Negro", s22);
		City c176 = new City(null, "Santa Rita", s22);
		City c177 = new City(null, "Santo Antonio do Ica", s22);
		City c178 = new City(null, "Sao Felipe", s22);
		City c179 = new City(null, "Sao Gabriel da Cachoeira", s22);
		City c180 = new City(null, "Sao Paulo de Olivenca", s22);
		City c181 = new City(null, "Sao Sebastiao do Uatuma", s22);
		City c182 = new City(null, "Silves", s22);
		City c183 = new City(null, "Tabatinga", s22);
		City c184 = new City(null, "Tapaua", s22);
		City c185 = new City(null, "Tefe", s22);
		City c186 = new City(null, "Tonantins", s22);
		City c187 = new City(null, "Uarini", s22);
		City c188 = new City(null, "Urucara", s22);
		City c189 = new City(null, "Urucurituba", s22);
		City c190 = new City(null, "Abacate da Pedreira", s23);
		City c191 = new City(null, "Agua Branca do Amapari", s23);
		City c192 = new City(null, "Amapa", s23);
		City c193 = new City(null, "Amapari", s23);
		City c194 = new City(null, "Ambe", s23);
		City c195 = new City(null, "Aporema", s23);
		City c196 = new City(null, "Ariri", s23);
		City c197 = new City(null, "Bailique", s23);
		City c198 = new City(null, "Boca do Jari", s23);
		City c199 = new City(null, "Calcoene", s23);
		City c200 = new City(null, "Cantanzal", s23);
		City c201 = new City(null, "Carmo", s23);
		City c202 = new City(null, "Clevelandia do Norte", s23);
		City c203 = new City(null, "Corre Agua", s23);
		City c204 = new City(null, "Cunani", s23);
		City c205 = new City(null, "Curiau", s23);
		City c206 = new City(null, "Cutias", s23);
		City c207 = new City(null, "Fazendinha", s23);
		City c208 = new City(null, "Ferreira Gomes", s23);
		City c209 = new City(null, "Fortaleza (AP)", s23);
		City c210 = new City(null, "Gaivota", s23);		
		City c211 = new City(null, "Igarape do Lago", s23);
		City c212 = new City(null, "Ilha de Santana", s23);
		City c213 = new City(null, "Inaja", s23);
		City c214 = new City(null, "Itaubal", s23);
		City c215 = new City(null, "Laranjal do Jari", s23);
		City c216 = new City(null, "Livramento do Pacui", s23);
		City c217 = new City(null, "Lourenco", s23);
		City c218 = new City(null, "Mazagao", s23);
		City c219 = new City(null, "Mazagao Velho", s23);
		City c220 = new City(null, "Oiapoque", s23);
		City c221 = new City(null, "Paredao", s23);
		City c222 = new City(null, "Porto Grande", s23);
		City c223 = new City(null, "Pracuuba", s23);
		City c224 = new City(null, "Santa Luzia do Pacui", s23);
		City c225 = new City(null, "Santa Maria (AP)", s23);
		City c226 = new City(null, "Santana", s23);
		City c227 = new City(null, "Sao Joaquim do Pacui", s23);
		City c228 = new City(null, "Sao Sebastiao do Livramento", s23);
		City c229 = new City(null, "Sao Tome", s23);
		City c230 = new City(null, "Serra do Navio", s23);
		City c231 = new City(null, "Sucuriju", s23);
		City c232 = new City(null, "Tartarugalzinho", s23);
		City c233 = new City(null, "Vila Velha", s23);
		City c234 = new City(null, "Vitoria do Jari", s23);
		City c235 = new City(null, "Gurupora", s23);
		City c236 = new City(null, "Abadia", s18);
		City c237 = new City(null, "Abaira", s18);
		City c238 = new City(null, "Abare", s18);
		City c239 = new City(null, "Abelhas", s18);
		City c240 = new City(null, "Abobora", s18);
		City c241 = new City(null, "Abrantes", s18);
		City c242 = new City(null, "Acajutiba", s18);
		City c243 = new City(null, "Acu da Torre", s18);
		City c244 = new City(null, "Acudina", s18);
		City c245 = new City(null, "Acupe", s18);
		City c246 = new City(null, "Adustina", s18);
		City c247 = new City(null, "Afligidos", s18);
		City c248 = new City(null, "Afranio Peixoto", s18);
		City c249 = new City(null, "Agua Doce", s18);
		City c250 = new City(null, "Agua Fria", s18);
		City c251 = new City(null, "Aguas do Paulista", s18);
		City c252 = new City(null, "Aiquara", s18);
		City c253 = new City(null, "Alagoinhas", s18);
		City c254 = new City(null, "Alcobaca", s18);
		City c255 = new City(null, "Alegre", s18);
		City c256 = new City(null, "Algodao", s18);
		City c257 = new City(null, "Algodoes", s18);
		City c258 = new City(null, "Almadina", s18);
		City c259 = new City(null, "Alto Bonito", s18);
		City c260 = new City(null, "Amado Bahia", s18);
		City c261 = new City(null, "Amaniu", s18);
		City c262 = new City(null, "Amargosa", s18);
		City c263 = new City(null, "Amelia Rodrigues", s18);
		City c264 = new City(null, "America Dourada", s18);
		City c265 = new City(null, "Americo Alves", s18);
		City c266 = new City(null, "Anage", s18);
		City c267 = new City(null, "Andarai", s18);
		City c268 = new City(null, "Andorinha", s18);
		City c269 = new City(null, "Angical", s18);
		City c270 = new City(null, "Angico", s18);
		City c271 = new City(null, "Anguera", s18);
		City c272 = new City(null, "Antas", s18);
		City c273 = new City(null, "Antonio Cardoso", s18);
		City c274 = new City(null, "Antonio Goncalves", s18);
		City c275 = new City(null, "Apora", s18);
		City c276 = new City(null, "Apuarema", s18);
		City c277 = new City(null, "Aracas", s18);
		City c278 = new City(null, "Aracatu", s18);
		City c279 = new City(null, "Araci", s18);
		City c280 = new City(null, "Aramari", s18);
		City c281 = new City(null, "Arapiranga", s18);
		City c282 = new City(null, "Arataca", s18);
		City c283 = new City(null, "Aratuipe", s18);
		City c284 = new City(null, "Areias", s18);
		City c285 = new City(null, "Arembepe", s18);
		City c286 = new City(null, "Argoim", s18);
		City c287 = new City(null, "Argolo", s18);
		City c288 = new City(null, "Aribice", s18);
		City c289 = new City(null, "Aritagua", s18);
		City c290 = new City(null, "Aurelino Leal", s18);
		City c291 = new City(null, "Baianopolis", s18);
		City c292 = new City(null, "Baixa do Palmeira", s18);
		City c293 = new City(null, "Baixa Grande", s18);
		City c294 = new City(null, "Baixao", s18);
		City c295 = new City(null, "Baixinha", s18);
		City c296 = new City(null, "Baluarte", s18);
		City c297 = new City(null, "Banco Central", s18);
		City c298 = new City(null, "Banco da Vitoria", s18);
		City c299 = new City(null, "Bandeira do Almada", s18);
		City c300 = new City(null, "Bandeira do Colonia", s18);
		City c301 = new City(null, "Bandiacu", s18);
		City c302 = new City(null, "Banzae", s18);
		City c303 = new City(null, "Baraunas", s18);
		City c304 = new City(null, "Barcelos do Sul", s18);
		City c305 = new City(null, "Barra", s18);
		City c306 = new City(null, "Barra da Estiva", s18);
		City c307 = new City(null, "Barra do Choca", s18);
		City c308 = new City(null, "Barra do Jacuipe", s18);
		City c309 = new City(null, "Barra do Mendes", s18);
		City c310 = new City(null, "Barra do Pojuca", s18);
		City c311 = new City(null, "Barra do Rocha", s18);
		City c312 = new City(null, "Barra do Tarrachil", s18);
		City c313 = new City(null, "Barracas", s18);
		City c314 = new City(null, "Barreiras", s18);
		City c315 = new City(null, "Barro Alto", s18);
		City c316 = new City(null, "Barro Preto", s18);
		City c317 = new City(null, "Barro Vermelho", s18);
		City c318 = new City(null, "Barrocas", s18);
		City c319 = new City(null, "Bastiao", s18);
		City c320 = new City(null, "Bate Pe", s18);
		City c321 = new City(null, "Batinga", s18);
		City c322 = new City(null, "Bela Flor", s18);
		City c323 = new City(null, "Belem da Cachoeira", s18);
		City c324 = new City(null, "Belmonte", s18);
		City c325 = new City(null, "Belo Campo", s18);
		City c326 = new City(null, "Bem-bom", s18);
		City c327 = new City(null, "Bendego", s18);
		City c328 = new City(null, "Bento Simoes", s18);
		City c329 = new City(null, "Biritinga", s18);
		City c330 = new City(null, "Boa Espera", s18);
		City c331 = new City(null, "Boa Nova", s18);
		City c332 = new City(null, "Boa Uniao", s18);
		City c333 = new City(null, "Boa Vista do Lagamar", s18);
		City c334 = new City(null, "Boa Vista do Tupim", s18);	
		City c335 = new City(null, "Boacu", s18);
		City c336 = new City(null, "Boca do Corrego", s18);
		City c337 = new City(null, "Bom Jesus da Lapa", s18);
		City c338 = new City(null, "Bom Jesus da Serra", s18);
		City c339 = new City(null, "Bom Sossego", s18);
		City c340 = new City(null, "Bonfim da Feira", s18);
		City c341 = new City(null, "Boninal", s18);
		City c342 = new City(null, "Bonito", s18);
		City c343 = new City(null, "Boquira", s18);
		City c344 = new City(null, "Botupora", s18);
		City c345 = new City(null, "Botuquara", s18);
		City c346 = new City(null, "Brejinho das Ametistas", s18);
		City c347 = new City(null, "Brejo da Serra", s18);
		City c348 = new City(null, "Brejo Luiza de Brito", s18);
		City c349 = new City(null, "Brejo Novo", s18);
		City c350 = new City(null, "Brejoes", s18);
		City c351 = new City(null, "Brejolandia", s18);
		City c352 = new City(null, "Brotas de Macaubas", s18);
		City c353 = new City(null, "Brumado", s18);
		City c354 = new City(null, "Bucuituba", s18);
		City c355 = new City(null, "Buerarema", s18);
		City c356 = new City(null, "Buracica", s18);
		City c357 = new City(null, "Buranhem", s18);
		City c358 = new City(null, "Buril", s18);
		City c359 = new City(null, "Buris de Abrantes", s18);
		City c360 = new City(null, "Buritirama", s18);
		City c361 = new City(null, "Alto Alegre", s24);
		City c362 = new City(null, "Amajari", s24);
		City c363 = new City(null, "Bonfim", s24);
		City c364 = new City(null, "Canta", s24);
		City c365 = new City(null, "Caroebe", s24);
		City c366 = new City(null, "Iracema", s24);
		City c367 = new City(null, "Normandia", s24);
		City c368 = new City(null, "Rorainopolis", s24);
		City c369 = new City(null, "Sao Joao da Baliza", s24);
		City c370 = new City(null, "Sao Luiz (RR)", s24);
		City c371 = new City(null, "Uiramuta", s24);
		City c372 = new City(null, "Altos Verdes", s4);
		City c373 = new City(null, "Amparo de Sao Francisco", s4);
		City c374 = new City(null, "Aquidaba", s4);
		City c375 = new City(null, "Umbauba", s4);
		City c376 = new City(null, "Araua", s4);
		City c377 = new City(null, "Areia Branca", s4);
		City c378 = new City(null, "Barra dos Coqueiros", s4);
		City c379 = new City(null, "Barracas (SE)", s4);
		City c380 = new City(null, "Boquim", s4);
		City c381 = new City(null, "Brejo Grande", s4);
		City c382 = new City(null, "Campo do Brito", s4);
		City c383 = new City(null, "Canhoba", s4);
		City c384 = new City(null, "Caninde de Sao Francisco", s4);
		City c385 = new City(null, "Capela", s4);
		City c386 = new City(null, "Carira", s4);
		City c387 = new City(null, "Carmopolis", s4);
		City c388 = new City(null, "Cedro de Sao Joao", s4);
		City c389 = new City(null, "Cristinapolis", s4);
		City c390 = new City(null, "Cumbe", s4);
		City c391 = new City(null, "Divina Pastora", s4);
		City c392 = new City(null, "Estancia", s4);
		City c393 = new City(null, "Feira Nova", s4);
		City c394 = new City(null, "Frei Paulo", s4);
		City c395 = new City(null, "Gararu", s4);
		City c396 = new City(null, "General Maynard", s4);
		City c397 = new City(null, "Graccho Cardoso", s4);
		City c398 = new City(null, "Ilha das Flores", s4);
		City c399 = new City(null, "Indiaroba", s4);
		City c400 = new City(null, "Itabaiana", s4);
		City c401 = new City(null, "Itabaianinha", s4);
		City c402 = new City(null, "Itabi", s4);
		City c403 = new City(null, "Itaporanga D", s4);
		City c404 = new City(null, "Japaratuba", s4);
		City c405 = new City(null, "Japoata", s4);
		City c406 = new City(null, "Lagarto", s4);
		City c407 = new City(null, "Lagoa Funda", s4);
		City c408 = new City(null, "Laranjeiras", s4);
		City c409 = new City(null, "Macambira", s4);
		City c410 = new City(null, "Malhada dos Bois", s4);
		City c411 = new City(null, "Malhador", s4);
		City c412 = new City(null, "Maruim", s4);
		City c413 = new City(null, "Miranda", s4);
		City c414 = new City(null, "Moita Bonita", s4);
		City c415 = new City(null, "Monte Alegre de Sergipe", s4);
		City c416 = new City(null, "Mosqueiro", s4);
		City c417 = new City(null, "Muribeca", s4);
		City c418 = new City(null, "Neopolis", s4);
		City c419 = new City(null, "Nossa Senhora Aparecida", s4);
		City c420 = new City(null, "Nossa Senhora da Gloria", s4);
		City c421 = new City(null, "Nossa Senhora das Dores", s4);
		City c422 = new City(null, "Nossa Senhora de Lourdes", s4);
		City c423 = new City(null, "Nossa Senhora do Socorro", s4);
		City c424 = new City(null, "Pacatuba", s4);
		City c425 = new City(null, "Palmares", s4);
		City c426 = new City(null, "Pedra Mole", s4);
		City c427 = new City(null, "Pedras (SE)", s4);
		City c428 = new City(null, "Pedrinhas", s4);
		City c429 = new City(null, "Pinhao", s4);
		City c430 = new City(null, "Pirambu", s4);
		City c431 = new City(null, "Poco Redondo", s4);
		City c432 = new City(null, "Poco Verde", s4);
		City c433 = new City(null, "Porto da Folha", s4);
		City c434 = new City(null, "Propria", s4);
		City c435 = new City(null, "Riachao do Dantas", s4);
		City c436 = new City(null, "Riachuelo", s4);
		City c437 = new City(null, "Ribeiropolis", s4);
		City c438 = new City(null, "Rosario do Catete", s4);
		City c439 = new City(null, "Salgado", s4);
		City c440 = new City(null, "Samambaia", s4);
		City c441 = new City(null, "Santa Luzia do Itanhy", s4);
		City c442 = new City(null, "Santa Rosa de Lima", s4);
		City c443 = new City(null, "Santana do Sao Francisco", s4);
		City c444 = new City(null, "Santo Amaro das Brotas", s4);
		City c445 = new City(null, "Sao Cristovao", s4);
		City c446 = new City(null, "Sao Domingos", s4);
		City c447 = new City(null, "Sao Francisco", s4);
		City c448 = new City(null, "Sao Jose", s4);
		City c449 = new City(null, "Sao Mateus da Palestina", s4);
		City c450 = new City(null, "Sao Miguel do Aleixo", s4);
		City c451 = new City(null, "Simao Dias", s4);
		City c452 = new City(null, "Siriri", s4);
		City c453 = new City(null, "Telha", s4);
		City c454 = new City(null, "Tobias Barreto", s4);
		City c455 = new City(null, "Tomar do Geru", s4);
		City c456 = new City(null, "Agua Branca", s6);
		City c457 = new City(null, "Aguiar", s6);
		City c458 = new City(null, "Alagoa Grande", s6);
		City c459 = new City(null, "Alagoa Nova", s6);
		City c460 = new City(null, "Alagoinha", s6);
		City c461 = new City(null, "Alcantil", s6);
		City c462 = new City(null, "Algodao de Jandaira", s6);
		City c463 = new City(null, "Alhandra", s6);
		City c464 = new City(null, "Amparo", s6);
		City c465 = new City(null, "Aparecida", s6);
		City c466 = new City(null, "Aracagi", s6);
		City c467 = new City(null, "Arara", s6);
		City c468 = new City(null, "Araruna", s6);
		City c469 = new City(null, "Areia", s6);
		City c470 = new City(null, "Areia de Baraunas", s6);
		City c471 = new City(null, "Areial", s6);
		City c472 = new City(null, "Areias (PB)", s6);
		City c473 = new City(null, "Aroeiras", s6);
		City c474 = new City(null, "Assis Chateaubriand", s6);
		City c475 = new City(null, "Assuncao", s6);
		City c476 = new City(null, "Baia da Traicao", s6);
		City c477 = new City(null, "Balancos", s6);
		City c478 = new City(null, "Bananeiras", s6);
		City c479 = new City(null, "Barauna", s6);
		City c480 = new City(null, "Barra de Santa Rosa", s6);
		City c481 = new City(null, "Barra de Santana", s6);
		City c482 = new City(null, "Barra de Sao Miguel", s6);
		City c483 = new City(null, "Barra do Camaratuba", s6);
		City c484 = new City(null, "Bayeux", s6);
		City c485 = new City(null, "Belem (PB)", s6);
		City c486 = new City(null, "Belem do Brejo do Cruz", s6);
		City c487 = new City(null, "Bernardino Batista", s6);
		City c488 = new City(null, "Boa Ventura", s6);
		City c489 = new City(null, "Boa Vista (PB)", s6);
		City c490 = new City(null, "Bom Jesus", s6);
		City c491 = new City(null, "Bom Sucesso", s6);
		City c492 = new City(null, "Bonito de Santa Fe", s6);
		City c493 = new City(null, "Boqueirao", s6);
		City c494 = new City(null, "Borborema", s6);
		City c495 = new City(null, "Brejo do Cruz", s6);
		City c496 = new City(null, "Brejo dos Santos", s6);
		City c497 = new City(null, "Caapora", s6);
		City c498 = new City(null, "Cabaceiras", s6);
		City c499 = new City(null, "Cabedelo", s6);
		City c500 = new City(null, "Cachoeira", s6);
		City c501 = new City(null, "Cachoeira dos Indios", s6);
		City c502 = new City(null, "Cachoeirinha", s6);
		City c503 = new City(null, "Cacimba de Areia", s6);
		City c504 = new City(null, "Cacimba de Dentro", s6);
		City c505 = new City(null, "Cacimbas", s6);
		City c506 = new City(null, "Caicara", s6);
		City c507 = new City(null, "Cajazeiras", s6);
		City c508 = new City(null, "Cajazeirinhas", s6);
		City c509 = new City(null, "Caldas Brandao", s6);
		City c510 = new City(null, "Camalau", s6);
		City c511 = new City(null, "Campina Grande", s6);
		City c512 = new City(null, "Campo Alegre", s6);
		City c513 = new City(null, "Campo Grande (PB)", s6);
		City c514 = new City(null, "Camurupim", s6);
		City c515 = new City(null, "Capim", s6);
		City c516 = new City(null, "Caraubas", s6);
		City c517 = new City(null, "Cardoso", s6);
		City c518 = new City(null, "Carrapateira", s6);
		City c519 = new City(null, "Casinha do Homem", s6);
		City c520 = new City(null, "Casserengue", s6);
		City c521 = new City(null, "Catingueira", s6);
		City c522 = new City(null, "Catole", s6);
		City c523 = new City(null, "Catole do Rocha", s6);
		City c524 = new City(null, "Caturite", s6);
		City c525 = new City(null, "Cepilho", s6);
		City c526 = new City(null, "Conceicao", s6);
		City c527 = new City(null, "Condado", s6);
		City c528 = new City(null, "Conde", s6);
		City c529 = new City(null, "Congo", s6);
		City c530 = new City(null, "Coremas", s6);
		City c531 = new City(null, "Coronel Maia", s6);
		City c532 = new City(null, "Coxixola", s6);
		City c533 = new City(null, "Cruz do Espirito Santo", s6);
		City c534 = new City(null, "4Cubati", s6);
		City c535 = new City(null, "Cuite", s6);
		City c536 = new City(null, "Cuite de Mamanguape", s6);
		City c537 = new City(null, "Cuitegi", s6);
		City c538 = new City(null, "Cupissura", s6);
		City c539 = new City(null, "Curral de Cima", s6);
		City c540 = new City(null, "Curral Velho", s6);
		City c541 = new City(null, "Damiao", s6);
		City c542 = new City(null, "Desterro", s6);
		City c543 = new City(null, "Diamante", s6);
		City c544 = new City(null, "Dona Ines", s6);
		City c545 = new City(null, "Duas Estradas", s6);
		City c546 = new City(null, "Emas", s6);
		City c547 = new City(null, "Engenheiro Avidos", s6);
		City c548 = new City(null, "Esperanca", s6);
		City c549 = new City(null, "Fagundes", s6);
		City c550 = new City(null, "Fatima", s6);
		City c551 = new City(null, "Fazenda Nova", s6);
		City c552 = new City(null, "Forte Velho", s6);
		City c553 = new City(null, "Frei Martinho", s6);
		City c554 = new City(null, "Gado Bravo", s6);
		City c555 = new City(null, "Galante", s6);
		City c556 = new City(null, "Guarabira", s6);
		City c557 = new City(null, "Guarita", s6);
		City c558 = new City(null, "Gurinhem", s6);
		City c559 = new City(null, "Gurjao", s6);
		City c560 = new City(null, "Ibiara", s6);
		City c561 = new City(null, "Igaracy", s6);
		City c562 = new City(null, "Imaculada", s6);
		City c563 = new City(null, "Inga", s6);
		City c564 = new City(null, "Itabaiana (PB)", s6);
		City c565 = new City(null, "Itajubatiba", s6);
		City c566 = new City(null, "Itaporanga", s6);
		City c567 = new City(null, "Itapororoca", s6);
		City c568 = new City(null, "Itatuba", s6);
		City c569 = new City(null, "Jacarau", s6);
		City c570 = new City(null, "Jerico", s6);
		City c571 = new City(null, "Juarez Tavora", s6);
		City c572 = new City(null, "4Juazeirinho", s6);
		City c573 = new City(null, "Junco do Serido", s6);
		City c574 = new City(null, "4Juripiranga", s6);
		City c575 = new City(null, "4Juru", s6);
		City c576 = new City(null, "Lagoa", s6);
		City c577 = new City(null, "Lagoa de Dentro", s6);
		City c578 = new City(null, "Lagoa Seca", s6);
		City c579 = new City(null, "4Lastro", s6);
		City c580 = new City(null, "Lerolandia", s6);
		City c581 = new City(null, "Livramento", s6);
		City c582 = new City(null, "Logradouro", s6);
		City c583 = new City(null, "Lucena", s6);
		City c584 = new City(null, "Mae D'agua", s6);
		City c585 = new City(null, "Maia", s6);
		City c586 = new City(null, "Malta", s6);
		City c587 = new City(null, "Mamanguape", s6);
		City c588 = new City(null, "Manaira", s6);
		City c589 = new City(null, "4Marcacao", s6);
		City c590 = new City(null, "Mari", s6);
		City c591 = new City(null, "Marizopolis", s6);
		City c592 = new City(null, "Massaranduba", s6);
		City c593 = new City(null, "Mata Limpa", s6);
		City c594 = new City(null, "Mata Virgem", s6);
		City c595 = new City(null, "Mataraca", s6);
		City c596 = new City(null, "Matinhas", s6);
		City c597 = new City(null, "Mato Grosso", s6);
		City c598 = new City(null, "Matureia", s6);
		City c599 = new City(null, "Melo", s6);
		City c600 = new City(null, "Mogeiro", s6);
		City c601 = new City(null, "Montadas", s6);
		City c602 = new City(null, "Monte Horebe", s6);
		City c603 = new City(null, "Monteiro", s6);
		City c604 = new City(null, "Montevideo", s6);
		City c605 = new City(null, "Mulungu", s6);
		City c606 = new City(null, "Muquem", s6);
		City c607 = new City(null, "Natuba", s6);
		City c608 = new City(null, "Nazare", s6);
		City c609 = new City(null, "Nazarezinho", s6);
		City c610 = new City(null, "Nossa Senhora do Livramento", s6);
		City c611 = new City(null, "Nova Floresta", s6);
		City c612 = new City(null, "Nova Olinda", s6);
		City c613 = new City(null, "Nova Palmeira", s6);
		City c614 = new City(null, "Vista Serrana", s6);
		City c615 = new City(null, "Zabele", s6);
		City c616 = new City(null, "Odilandia", s6);
		City c617 = new City(null, "Olho D'agua", s6);;
		City c618 = new City(null, "Olivedos", s6);
		City c619 = new City(null, "Ouro Velho", s6);
		City c620 = new City(null, "Parari", s6);
		City c621 = new City(null, "Passagem", s6);
		City c622 = new City(null, "Patos", s6);
		City c623 = new City(null, "Paulista", s6);
		City c624 = new City(null, "Pedra Branca", s6);
		City c625 = new City(null, "Pedra Lavrada", s6);
		City c626 = new City(null, "Pedras de Fogo", s6);
		City c627 = new City(null, "Pedro Regis", s6);
		City c628 = new City(null, "Pelo Sinal", s6);
		City c629 = new City(null, "Pereiros", s6);
		City c630 = new City(null, "Pianco", s6);
		City c631 = new City(null, "Picui", s6);
		City c632 = new City(null, "Pilar", s6);
		City c633 = new City(null, "Piloes", s6);
		City c634 = new City(null, "Piloezinhos", s6);
		City c635 = new City(null, "Pindurao", s6);
		City c636 = new City(null, "Pio X", s6);
		City c637 = new City(null, "Piraua", s6);
		City c638 = new City(null, "Pirpirituba", s6);
		City c639 = new City(null, "Pitanga de Estrada", s6);
		City c640 = new City(null, "Pitimbu", s6);
		City c641 = new City(null, "Pocinhos", s6);
		City c642 = new City(null, "Poco Dantas", s6);
		City c643 = new City(null, "Poco de Jose de Moura", s6);
		City c644 = new City(null, "Pombal", s6);
		City c645 = new City(null, "Porteirinha de Pedra", s6);
		City c646 = new City(null, "Prata", s6);
		City c647 = new City(null, "Princesa Isabel", s6);
		City c648 = new City(null, "Puxinana", s6);
		City c649 = new City(null, "Queimadas", s6);
		City c650 = new City(null, "Quixaba", s6);
		City c651 = new City(null, "Remigio", s6);
		City c652 = new City(null, "Riachao", s6);
		City c653 = new City(null, "Riachao do Poco", s6);
		City c654 = new City(null, "Riacho de Santo Antonio", s6);
		City c655 = new City(null, "Riacho dos Cavalos", s6);
		City c656 = new City(null, "4Ribeira", s6);
		City c657 = new City(null, "Rio Tinto", s6);
		City c658 = new City(null, "Rua Nova", s6);
		City c659 = new City(null, "Salema", s6);
		City c660 = new City(null, "Salgadinho", s6);
		City c661 = new City(null, "Salgado de Sao Felix", s6);
		City c662 = new City(null, "Santa Cecilia de Umbuzeiro", s6);
		City c663 = new City(null, "Santa Cruz", s6);
		City c664 = new City(null, "Santa Gertrudes", s6);
		City c665 = new City(null, "Santa Helena", s6);
		City c666 = new City(null, "Santa Ines", s6);
		City c667 = new City(null, "Santa Luzia", s6);
		City c668 = new City(null, "Santa Luzia do Cariri", s6);
		City c669 = new City(null, "Santa Maria (PB)", s6);
		City c670 = new City(null, "Santa Rita (PB)", s6);
		City c671 = new City(null, "Santa Teresinha", s6);
		City c672 = new City(null, "Santa Terezinha", s6);
		City c673 = new City(null, "Santana de Mangueira", s6);
		City c674 = new City(null, "Santana dos Garrotes", s6);
		City c675 = new City(null, "Santarem", s6);
		City c676 = new City(null, "Santo Andre", s6);
		City c677 = new City(null, "Sao Bento", s6);
		City c678 = new City(null, "Sao Bento de Pombal", s6);
		City c679 = new City(null, "Sao Domingos de Pombal", s6);
		City c680 = new City(null, "Sao Domingos do Cariri", s6);
		City c681 = new City(null, "Sao Francisco (PB)", s6);
		City c682 = new City(null, "Sao Goncalo", s6);
		City c683 = new City(null, "Sao Joao Bosco", s6);
		City c684 = new City(null, "Sao Joao do Cariri", s6);
		City c685 = new City(null, "Sao Joao do Rio do Peixe", s6);
		City c686 = new City(null, "Sao Joao do Tigre", s6);
		City c687 = new City(null, "Sao Jose da Lagoa Tapada", s6);
		City c688 = new City(null, "Sao Jose da Mata", s6);
		City c689 = new City(null, "Sao Jose de Caiana", s6);
		City c690 = new City(null, "Sao Jose de Espinharas", s6);
		City c691 = new City(null, "Sao Jose de Marimbas", s6);
		City c692 = new City(null, "Sao Jose de Piranhas", s6);
		City c693 = new City(null, "Sao Jose de Princesa", s6);
		City c694 = new City(null, "Sao Jose do Bonfim", s6);
		City c695 = new City(null, "Sao Jose do Brejo do Cruz", s6);
		City c696 = new City(null, "Sao Jose do Sabugi", s6);
		City c697 = new City(null, "Sao Jose dos Cordeiros", s6);
		City c698 = new City(null, "5Sao Jose dos Ramos", s6);
		City c699 = new City(null, "Sao Mamede", s6);
		City c700 = new City(null, "Sao Miguel de Taipu", s6);
		City c701 = new City(null, "Sao Pedro", s6);
		City c702 = new City(null, "Sao Sebastiao de Lagoa de Roca", s6);
		City c703 = new City(null, "Sao Sebastiao do Umbuzeiro", s6);
		City c704 = new City(null, "Sape", s6);
		City c705 = new City(null, "Serido", s6);
		City c706 = new City(null, "Serido/sao Vicente do Serido", s6);
		City c707 = new City(null, "Serra Branca", s6);
		City c708 = new City(null, "Serra da Raiz", s6);
		City c709 = new City(null, "Serra Grande", s6);
		City c710 = new City(null, "Serra Redonda", s6);
		City c711 = new City(null, "Serraria", s6);
		City c712 = new City(null, "Sertaozinho", s6);
		City c713 = new City(null, "Sobrado", s6);
		City c714 = new City(null, "Solanea", s6);
		City c715 = new City(null, "Soledade", s6);
		City c716 = new City(null, "Sossego", s6);
		City c717 = new City(null, "Sousa", s6);
		City c718 = new City(null, "Sucuru", s6);
		City c719 = new City(null, "Sume", s6);
		City c720 = new City(null, "Tacima", s6);
		City c721 = new City(null, "Tambau", s6);
		City c722 = new City(null, "Tambauzinho", s6);
		City c723 = new City(null, "Taperoa", s6);
		City c724 = new City(null, "Tavares", s6);
		City c725 = new City(null, "Teixeira", s6);
		City c726 = new City(null, "Tenorio", s6);
		City c727 = new City(null, "Triunfo", s6);
		City c728 = new City(null, "Uirauna", s6);
		City c729 = new City(null, "Umari", s6);
		City c730 = new City(null, "Umbuzeiro", s6);
		City c731 = new City(null, "Varzea", s6);
		City c732 = new City(null, "Varzea Comprida", s6);
		City c733 = new City(null, "Varzea Nova", s6);
		City c734 = new City(null, "Vazante", s6);
		City c735 = new City(null, "Vieiropolis", s6);
		

		s27.getCities().addAll(Arrays.asList(c30, c29, c28, c1, c31, c32, c33, c35, c37, c51, 
				                             c52, c53, c66, c67, c68, c69, c70, c82));
		s26.getCities().addAll(Arrays.asList(c7, c36, c40, c41, c42, c43, c44, c45, c46, c47,
				                             c48, c49, c50));
		s25.getCities().addAll(Arrays.asList(c23));
		s24.getCities().addAll(Arrays.asList(c24, c63, c64, c65, c361, c362, c363, c364, c365, 
				                             c366, c367, c368, c369, c370, c371));
		s23.getCities().addAll(Arrays.asList(c8, c190, c191, c192, c193, c194, c195, c196,
				                             c197, c198, c199, c200, c201, c202, c203, c204,
				                             c205, c206, c207, c208, c209, c210, c211, c212, 
				                             c213, c214, c215, c216, c217, c218, c219, c220,
				                             c221, c222, c223, c224, c225, c225, c226, c227, 
				                             c228, c229, c230, c231, c232, c233, c234, c235));
		s22.getCities().addAll(Arrays.asList(c22, c104, c105, c106, c107, c108, c109, c117,
				                             c110, c111, c112, c113, c114, c115, c116, c118, 
				                             c119, c120, c121, c122, c123, c124, c125, c126,
				                             c127, c128, c129, c130, c131, c132, c133, c134, 
				                             c135, c136, c137, c138, c139, c141, c140, c142, 
				                             c143, c144, c145, c146, c147, c148, c149, c150, 
				                             c151, c152, c153, c154, c155, c156, c157, c158, 
				                             c159, c160, c161, c162, c163, c164, c165, c166, 
				                             c167, c168, c169, c170, c171, c172, c173, c174, 
				                             c175, c176, c177, c178, c179, c180, c181, c182, 
				                             c183, c184, c185, c186, c187, c188, c189));
		s21.getCities().addAll(Arrays.asList(c6));
		s20.getCities().addAll(Arrays.asList(c3));
		s19.getCities().addAll(Arrays.asList(c21));
		s18.getCities().addAll(Arrays.asList(c27, c236, c237, c238, c239, c240, c241, c242, c243, 
				                             c244, c245, c246, c247, c248, c249, c250, c251, c252, 
				                             c253, c254, c255, c256, c257, c258, c259, c260, c261, 
				                             c262, c263, c264, c265, c266, c267, c268, c269, c260, 
				                             c261, c262, c263, c264, c265, c266, c267, c268, c269, 
				                             c270, c271, c272, c273, c274, c275, c276, c277, c278, 
				                             c279, c280, c281, c282, c283, c284, c285, c286, c287, 
				                             c288, c289, c290, c291, c292, c293, c294, c295, c296, 
				                             c297, c298, c299, c300, c301, c302, c303, c304, c305, 
				                             c306, c307, c308, c309, c310, c311, c312, c313, c314, 
				                             c315, c316, c317, c318, c319, c320, c321, c322, c323,
				                             c324, c325, c326, c327, c328, c329, c330, c331, c332, 
				                             c333, c334, c335, c336, c337, c338, c339, c340, c341, 
				                             c345, c346, c347, c348, c349, c342, c343, c344, c350, 
				                             c351, c352, c353, c354, c355, c356, c357, c358, c359, 
				                             c360));
		s17.getCities().addAll(Arrays.asList(c20));
		s16.getCities().addAll(Arrays.asList(c19));
		s15.getCities().addAll(Arrays.asList(c5, c83, c84, c85, c86, c87, c88, c89, c90, c91,
				                             c92, c93, c94, c95, c96, c97, c98, c99, c100, 
				                             c101, c102, c103));
		s14.getCities().addAll(Arrays.asList(c2, c38, c39, c58, c59, c60, c61, c62));
		s13.getCities().addAll(Arrays.asList(c18));
		s12.getCities().addAll(Arrays.asList(c17));
		s11.getCities().addAll(Arrays.asList(c16));
		s10.getCities().addAll(Arrays.asList(c14));
		s9.getCities().addAll(Arrays.asList(c13));
		s8.getCities().addAll(Arrays.asList(c15));
		s7.getCities().addAll(Arrays.asList(c12));
		s6.getCities().addAll(Arrays.asList(c11, c456, c457, c458, c459, c460, c461, c462, c463, 				                           c464, c465, c466, c467, c468, c469, c470, c471, c472, 				                           c473, c474, c475, c476, c477, c478, c479, c480, c481, 				                           c482, c483, c484, c485, c486, c487, c488, c489, c490, 				                           c491, c492, c493, c494, c495, c496, c497, c498, c499, 				                           c500, c501, c502, c503, c504, c505, c506, c507, c508, 				                           c509, c510, c511, c512, c513, c514, c515, c516, c517, 				                           c518, c519, c520, c521, c522, c523, c524, c525, c526, 			                           c527, c528, c529, c530, c531, c532, c533, c534, c535, 				                           c536, c537, c538, c539, c540, c541, c542, c543, c544, 				                           c545, c546, c547, c548, c549, c550, c551, c552, c553, 				                           c554, c555, c556, c557, c558, c559, c560, c561, c562, 
				                           c563, c564, c565, c566, c567, c568, c569, c570, c571, 
				                           c572, c573, c574, c575, c576, c577, c578, c579, c580, 
				                           c581, c582, c583, c584, c585, c586, c587, c588, c589, 
				                           c590, c591, c592, c593, c594, c595, c596, c597, c598, 
				                           c599, c600, c601, c602, c603, c604, c605, c606, c607, 
				                           c608, c609, c610, c611, c612, c613, c614, c615, c616, 
				                           c617, c618, c619, c620, c621, c622, c623, c624, c625, 
				                           c626, c627, c628, c629, c630, c631, c632, c633, c634, 
				                           c635, c636, c637, c638, c639, c640, c641, c642, c643, 
				                           c644, c645, c646, c647, c648, c649, c650, c651, c652, 
				                           c653, c654, c655, c656, c657, c658, c659, c660, c661, 
				                           c662, c663, c664, c665, c666, c667, c668, c669, c670, 
				                           c671, c672, c673, c674, c675, c676, c677, c678, c679, 
				                           c680, c681, c682, c683, c684, c685, c686, c687, c688, 
				                           c689, c690, c691, c692, c693, c694, c695, c696, c697, 
				                           c698, c699, c700, c701, c702, c703, c704, c705, c706, 
				                           c707, c708, c709, c710, c711, c712, c713, c714, c715, 
				                           c716, c717, c718, c719, c720, c721, c722, c723, c724, 
				                           c725, c726, c727, c728, c729, c730, c731, c732, c733, 
				                           c734, c735));
		s5.getCities().addAll(Arrays.asList(c10));
		s4.getCities().addAll(Arrays.asList(c9, c371, c372, c373, c374, c375, c376, c377, c378,
				                            c379, c380, c381, c382, c383, c384, c385, c386, c387, 
				                            c388, c389, c390, c391, c392, c393, c394, c395, c396, 
				                            c397, c398, c399, c400, c401, c402, c403, c404, c405, 
				                            c406, c407, c408, c409, c410, c411, c412, c413, c414, 
				                            c415, c416, c417, c418, c419, c420, c421, c422, c423, 
				                            c424, c425, c426, c427, c428, c429, c430, c431, c432, 
				                            c433, c434, c435, c436, c437, c438, c439, c440, c441, 
				                            c442, c443, c444, c445, c446, c447, c448, c449, c450, 
				                            c451, c452, c453, c454, c455));
		s3.getCities().addAll(Arrays.asList(c25));
		s2.getCities().addAll(Arrays.asList(c4, c55, c56, c57));
		s1.getCities().addAll(Arrays.asList(c26, c34, c54, c71, c72, c73, c74, c75, c76, c77,
				                            c78, c79, c80, c81));

		// Categories

		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Camping");
		Category cat3 = new Category(null, "Pesca");
		Category cat4 = new Category(null, "Calçados");
		Category cat5 = new Category(null, "Moda Masculina");
		Category cat6 = new Category(null, "Smartphones");
		Category cat7 = new Category(null, "Teclados Mecânicos");
		Category cat8 = new Category(null, "Moda Feminina");
		Category cat9 = new Category(null, "Brinquedos");
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

		// Products

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

		crep.saveAll(Arrays.asList(cat1, cat18, cat19, cat24, cat25, cat35, cat37, cat38, cat2, cat3, cat4, cat5, cat6,
				cat7, cat8, cat9, cat10, cat11, cat12, cat13, cat14, cat15, cat16, cat17, cat20, cat21, cat22, cat23,
				cat26, cat27, cat28, cat29, cat30, cat31, cat32, cat33, cat34, cat36));

		prep.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19,
				p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36));

		srep.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19,
				s20, s21, s22, s23, s24, s25, s26, s27));

		cyrep.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, 
				c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, 
				c27, c28, c29, c30, c31, c32, c33, c34, c35, c36, c37, c38, c39, c40, 
				c41, c42, c43, c44, c45, c46, c47, c48, c49, c50, c51, c52, c53, c54, 
				c55, c56, c57, c58, c59, c60, c61, c62, c63, c64, c65, c66, c67, c68, 
				c69, c70, c71, c72, c73, c74, c75, c76, c77, c78, c79, c80, c81, c82, 
				c83, c84, c85, c86, c87, c88, c89, c90, c91, c92, c93, c94, c95, c96, 
				c97, c98, c99, c100, c101, c102, c103, c104, c105, c106, c107, c108, 
				c109, c117, c110, c111, c112, c113, c114, c115, c116, c118, c119, c120, 
				c121, c122, c123, c124, c125, c126, c127, c128, c129, c130, c131, c132, 
				c133, c134, c135, c136, c137, c138, c139, c141, c140, c142, c143, c144, 
				c145, c146, c147, c148, c149, c150, c151, c152,	c153, c154, c155, c156, 
				c157, c158, c159, c160, c161, c162, c163, c164, c165, c166, c167, c168, 
				c169, c170, c171, c172, c173, c174, c175, c176, c177, c178, c179, c180, 
				c181, c182, c183, c184, c185, c186,	c187, c188, c189, c190, c191, c192, 
				c193, c194, c195, c196, c197, c198, c199, c200, c201, c202, c203, c204,
                c205, c206, c207, c208, c209, c210, c211, c212, c213, c214, c215, c216, 
                c217, c218, c219, c220, c221, c222, c223, c224, c225, c225, c226, c227, 
                c228, c229, c230, c231, c232, c233, c234, c235, c236, c237, c238, c239, 
                c240, c241, c242, c243, c244, c245, c246, c247, c248, c249, c250, c251, 
                c252, c253, c254, c255, c256, c257, c258, c259, c260, c261, c262, c263, 
                c264, c265, c266, c267, c268, c269, c260, c261, c262, c263, c264, c265, 
                c266, c267, c268, c269, c270, c271, c272, c273, c274, c275, c276, c277, 
                c278, c279, c280, c281, c282, c283, c284, c285, c286, c287, c288, c289, 
                c290, c291, c292, c293, c294, c295, c296, c297, c298, c299, c300, c301, 
                c302, c303, c304, c305, c306, c307, c308, c309, c310, c311, c312, c313, 
                c314, c315, c316, c317, c318, c319, c320, c321, c322, c323, c324, c325, 
                c326, c327, c328, c329, c330, c331, c332, c333, c334, c335, c336, c337, 
                c338, c339, c340, c341, c345, c346, c347, c348, c349, c342, c343, c344, 
                c350, c351, c352, c353, c354, c355, c356, c357, c358, c359, c360, c361, 
                c362, c363, c364, c365, c366, c367, c368, c369, c370, c371, c371, c372, 
                c373, c374, c375, c376, c377, c378, c379, c380, c381, c382, c383, c384, 
                c385, c386, c387, c388, c389, c390, c391, c392, c393, c394, c395, c396, 
                c397, c398, c399, c400, c401, c402, c403, c404, c405, c406, c407, c408, 
                c409, c410, c411, c412, c413, c414, c415, c416, c417, c418, c419, c420, 
                c421, c422, c423, c424, c425, c426, c427, c428, c429, c430, c431, c432, 
                c433, c434, c435, c436, c437, c438, c439, c440, c441, c442, c443, c444, 
                c445, c446, c447, c448, c449, c450, c451, c452, c453, c454, c455, c456, 
                c457, c458, c459, c460, c461, c462, c463, c464, c465, c466, c467, c468, 
                c469, c470, c471, c472, c473, c474, c475, c476, c477, c478, c479, c480, 
                c481, c482, c483, c484, c485, c486, c487, c488, c489, c490, c491, c492, 
                c493, c494, c495, c496, c497, c498, c499, c500, c501, c502, c503, c504, 
                c505, c506, c507, c508, c509, c510, c511, c512, c513, c514, c515, c516, 
                c517, c518, c519, c520, c521, c522, c523, c524, c525, c526, c527, c528, 
                c529, c530, c531, c532, c533, c534, c535, c536, c537, c538, c539, c540, 
                c541, c542, c543, c544, c545, c546, c547, c548, c549, c550, c551, c552, 
                c553, c554, c555, c556, c557, c558, c559, c560, c561, c562, c563, c564, 
                c565, c566, c567, c568, c569, c570, c571, c572, c573, c574, c575, c576, 
                c577, c578, c579, c580, c581, c582, c583, c584, c585, c586, c587, c588, 
                c589, c590, c591, c592, c593, c594, c595, c596, c597, c598, c599, c600, 
                c601, c602, c603, c604, c605, c606, c607, c608, c609, c610, c611, c612, 
                c613, c614, c615, c616, c617, c618, c619, c620, c621, c622, c623, c624, 
                c625, c626, c627, c628, c629, c630, c631, c632, c633, c634, c635, c636, 
                c637, c638, c639, c640, c641, c642, c643, c644, c645, c646, c647, c648, 
                c649, c650, c651, c652, c653, c654, c655, c656, c657, c658, c659, c660, 
                c661, c662, c663, c664, c665, c666, c667, c668, c669, c670, c671, c672, 
                c673, c674, c675, c676, c677, c678, c679, c680, c681, c682, c683, c684, 
                c685, c686, c687, c688, c689, c690, c691, c692, c693, c694, c695, c696, 
                c697, c698, c699, c700, c701, c702, c703, c704, c705, c706, c707, c708, 
                c709, c710, c711, c712, c713, c714, c715, c716, c717, c718, c719, c720, 
                c721, c722, c723, c724, c725, c726, c727, c728, c729, c730, c731, c732, 
                c733, c734, c735));

		// Client Instance

		Client cli1 = new Client(null, "Alexandre Cordeiro", "alexandre.13a@gmail.com", "68404337497",
				ClientType.PESSOAFISICA);
		cli1.getPhones().addAll(Arrays.asList("(47)99728-5083", "(49)3323-5083"));

		Address ad1 = new Address(null, "Rua Macaé", "43", "Apto 4", "Fortaleza", "89056-015", cli1, c1);

		Address ad2 = new Address(null, "Rua Prudentópolis", "4389", "Apto 40", "Carijós", "89025-011", cli1, c3);

		cli1.getAddresses().addAll(Arrays.asList(ad1, ad2));

		Client cli2 = new Client(null, "Carlos Alberto Soares de Lima", "pedromaresia@gmail.com", "26376246000156",
				ClientType.PESSOAJURIDICA);
		cli1.getPhones().addAll(Arrays.asList("(47)99641-2563", "(49)5536-5412"));

		Address ad3 = new Address(null, "Rua São Paulo", "632", "Casa", "Tribess", "89056-091", cli2, c13);

		Address ad4 = new Address(null, "Rua Vespasiano Lopes de Andrade", "43898", "Apto 401", "Taquaras", "64589-011",
				cli2, c9);

		cli2.getAddresses().addAll(Arrays.asList(ad3, ad4));

		Client cli3 = new Client(null, "Maria das Dores Freitas de Souza", "mariddfs@gmail.com", "74105672000106",
				ClientType.PESSOAJURIDICA);
		cli3.getPhones().addAll(Arrays.asList("(47)99764-5926", "(88)5586-5874", "(47)99728-5083", "(61)9965-8951"));

		Address ad5 = new Address(null, "Rua Tiguá", "6327", "Apto 301", "Ortolândia", "46056-091", cli3, c33);

		Address ad6 = new Address(null, "Rua Inácio Francisco Beltrão", "5234", "Apto 902", "Catanduvas", "45986-874",
				cli3, c7);

		Address ad7 = new Address(null, "Rua Maritacá", "89654", "Sobrado 1", "Vila das Marianas", "45896-541", cli3,
				c4);

		Address ad8 = new Address(null, "Rua Araucária", "100", "Apto 785", "Vila Grande", "85965-458", cli3, c23);

		Address ad9 = new Address(null, "Rua Rua Aristides Conselheiro Mafra", "48", "Apto 532", "Mangabi", "34569-521",
				cli3, c17);

		cli3.getAddresses().addAll(Arrays.asList(ad5, ad6, ad7, ad8, ad9));

		clirep.saveAll(Arrays.asList(cli1, cli2, cli3));
		adrep.saveAll(Arrays.asList(ad1, ad2, ad3, ad4, ad5, ad6, ad7, ad8, ad9));

		// Order Items

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		Request req1 = new Request(null, sdf.parse("30/09/2017 10:32"), cli3, ad9);
		Request req2 = new Request(null, sdf.parse("10/10/2017 19:35"), cli1, ad2);

		Payment pg1 = new CardPayment(null, PaymentStatus.QUITADO, req1, 7);
		req1.setPayment(pg1);

		Payment pg2 = new PaymentWithTicket(null, PaymentStatus.PENDENTE, req2, sdf.parse("20/10/2017 00:00"), null);
		req2.setPayment(pg2);

		cli1.getRequests().addAll(Arrays.asList(req2));
		cli3.getRequests().addAll(Arrays.asList(req1));

		reqrep.saveAll(Arrays.asList(req1, req2));
		pyrep.saveAll(Arrays.asList(pg1, pg2));

		OrderItems oi1 = new OrderItems(req1, p1, 0.00, 1, p1.getPrice());
		OrderItems oi2 = new OrderItems(req1, p3, 0.00, 2, p3.getPrice());
		OrderItems oi3 = new OrderItems(req2, p7, 100.00, 1, p7.getPrice());

		req1.getItems().addAll(Arrays.asList(oi1, oi2));
		req2.getItems().addAll(Arrays.asList(oi3));

		p1.getItems().addAll(Arrays.asList(oi1));
		p3.getItems().addAll(Arrays.asList(oi2));
		p7.getItems().addAll(Arrays.asList(oi3));

		oirep.saveAll(Arrays.asList(oi1, oi2, oi3));

	}
}
