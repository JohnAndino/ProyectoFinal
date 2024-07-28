package ec.edu.uce.FabricaMusical;

import ec.edu.uce.FabricaMusical.controller.Container;
import ec.edu.uce.FabricaMusical.models.*;
import ec.edu.uce.FabricaMusical.models.entities.Order;
import ec.edu.uce.FabricaMusical.models.entities.OrderProduct;
import ec.edu.uce.FabricaMusical.models.entities.ProductEntity;
import ec.edu.uce.FabricaMusical.models.entities.User;
import ec.edu.uce.FabricaMusical.models.interfaces.Notify;
import ec.edu.uce.FabricaMusical.models.services.OrderService;
import ec.edu.uce.FabricaMusical.models.services.ProductService;
import ec.edu.uce.FabricaMusical.models.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"ec.edu.uce.FabricaMusical.view", "resources"})
public class FabricaMusicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(FabricaMusicalApplication.class, args);

		try {
			Notify notificationService = new EmailNotify();
			Container container = new Container(notificationService);
			ProductFactory productFactory = new ProductFactory(container, "src/main/resources/productConfig.json");

			// Crear y agregar productos al contenedor usando la fábrica
			productFactory.createProducts();

			// Mostrar productos
			container.showProduct();

			// Iniciar fabricación de un producto
			Product guitarra = container.getProducts().get(0);
			container.startFabrication(guitarra);
			Product saxo = container.getProducts().get(1);
			container.startFabrication(saxo);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*@Bean()
	public CommandLineRunner demo(OrderService orderService, UserService userService, ProductService productService) {
		return (args) -> {
			// Crear un cliente
			User customer = new User("Mateo", "jami@gmail.com", "jami2002", "1755191390","ADMIN");
			userService.createUser(customer);

			// Crear productos
			ProductEntity product1 = new ProductEntity("Guitarra", "guitarra acustica", 100.0, "madera", "cafe");
			ProductEntity product2 = new ProductEntity("Flauta", "flauta pequeña", 10.0, "plastico", "crema");
			productService.createProduct(product1);
			productService.createProduct(product2);

			// Crear las listas de productos y cantidades
			List<ProductEntity> products = List.of(product1, product2);
			List<Integer> quantities = List.of(1, 2);

			// Crear la orden
			// Nota: Puedes ajustar la creación de la orden según la lógica de tu aplicación
			Order order = new Order(customer, LocalDate.now(), "Pending");
			for (int i = 0; i < products.size(); i++) {
				OrderProduct orderProduct = new OrderProduct(order, products.get(i), quantities.get(i));
				order.addProduct(orderProduct);
			}
			orderService.createOrder(order);
		};
	}

	 */

}
