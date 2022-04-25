package com.webservice.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.webservice.demo.entities.Order;
import com.webservice.demo.entities.Product;
import com.webservice.demo.entities.Category;
import com.webservice.demo.entities.User;
import com.webservice.demo.entities.enums.OrderStatus;
import com.webservice.demo.repositories.OrderRepository;
import com.webservice.demo.repositories.CategoryRepository;
import com.webservice.demo.repositories.ProductRepository;
import com.webservice.demo.repositories.UserRepository;
import com.webservice.demo.repositories.OrderRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;


	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Jennifer Rodrigues", "jennifer@gmail.com", "55989876655", "123456");
		User u2 = new User(null, "Naomy Moura", "naomy@gmail.com", "55989875433", "123456"); 
		userRepository.saveAll(Arrays.asList(u1,u2));
		Category cat1 = new Category(null, "Cama");
		Category cat2 = new Category(null, "Mesa");
		Category cat3 = new Category(null, "Banho");
		
		Product p1 = new Product(null, "Cama", "Cama estilosa.", 90.5, "");
		Product p2 = new Product(null, "Telefone", "Telefone antigo.", 2190.0, "");
		Product p3 = new Product(null, "Computador", "Computador mediano.", 1250.0, "");
		Product p4 = new Product(null, "Refrigerador", "Refrigerador duas portas.", 1200.0, "");
		Product p5 = new Product(null, "Mesa", "Mesa de vidro.", 100.99, "");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		
		
		Order o1 = new Order(null, Instant.parse("2022-02-20T19:53:07Z"), OrderStatus.PAID,u1);
		Order o2 = new Order(null, Instant.parse("2022-03-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2022-04-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
		
	}
}
