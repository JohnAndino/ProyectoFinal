package uce.edu.ec.PersistenciaTiendaMusical;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uce.edu.ec.PersistenciaTiendaMusical.Gui.InvoiceAdmin;
import uce.edu.ec.PersistenciaTiendaMusical.Gui.UserAdminS;
import uce.edu.ec.PersistenciaTiendaMusical.services.InvoiceService;
import uce.edu.ec.PersistenciaTiendaMusical.services.UserService;

import javax.swing.*;

@SpringBootApplication
public class PersistenciaTiendaMusicalApplication {

	@Autowired
	private UserService userService;
	@Autowired
private InvoiceService invoiceService;
	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(PersistenciaTiendaMusicalApplication.class, args);
	}

	@PostConstruct
	public void init() {

		// Lanzar la interfaz gráfica Swing en el Event Dispatch Thread
		SwingUtilities.invokeLater(() -> {
			InvoiceAdmin screen = new InvoiceAdmin(invoiceService);
			//UserAdminS screen = new UserAdminS(userService);
			screen.setVisible(true);
		});
	}

	/*@Bean
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

	 */
}
