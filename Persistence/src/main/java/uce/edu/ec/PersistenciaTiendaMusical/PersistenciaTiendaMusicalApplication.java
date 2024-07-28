package uce.edu.ec.PersistenciaTiendaMusical;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.*;
import uce.edu.ec.PersistenciaTiendaMusical.services.InvoiceService;
import uce.edu.ec.PersistenciaTiendaMusical.services.OrderService;
import uce.edu.ec.PersistenciaTiendaMusical.services.ProductService;
import uce.edu.ec.PersistenciaTiendaMusical.services.UserService;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class PersistenciaTiendaMusicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersistenciaTiendaMusicalApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(OrderService orderService, UserService userService, ProductService productService, InvoiceService invoiceService) {
		return (args) -> {
			// Crear un cliente
			User customer = new User("1755191390","Mateo",  "jami2002","0361245871","jami@gmail.com","quito" ,"ADMIN");
			userService.createUser(customer);

			// Crear productos
			Product product1 = new Product("Guitarra", 100.0, "madera", "cafe");
			Product product2 = new Product("Flauta", 10.0, "plastico", "crema");
			productService.createProduct(product1);
			productService.createProduct(product2);

			// Crear las listas de productos y cantidades
			List<Product> products = List.of(product1, product2);
			List<Integer> quantities = List.of(1, 2);

			// Crear la orden
			// Nota: Puedes ajustar la creación de la orden según la lógica de tu aplicación
			Order order = new Order(customer, LocalDate.now(), "Pending");
			for (int i = 0; i < products.size(); i++) {
				OrderProduct orderProduct = new OrderProduct(order, products.get(i), quantities.get(i));
				order.addProduct(orderProduct);
			}
			orderService.createOrder(order);

			//Invoice invoice = Invoice();
		};
	}
}
