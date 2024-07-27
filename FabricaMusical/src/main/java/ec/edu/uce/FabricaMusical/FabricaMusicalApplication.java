package ec.edu.uce.FabricaMusical;

import ec.edu.uce.FabricaMusical.controller.Container;
import ec.edu.uce.FabricaMusical.models.*;
import ec.edu.uce.FabricaMusical.models.interfaces.NotificationService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class FabricaMusicalApplication {

	public static void main(String[] args) {
		try {
			NotificationService notificationService = new EmailNotificationService();
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

}
