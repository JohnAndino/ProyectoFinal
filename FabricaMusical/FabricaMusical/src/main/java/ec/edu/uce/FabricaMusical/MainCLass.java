package ec.edu.uce.FabricaMusical;

import ec.edu.uce.FabricaMusical.services.InvoiceService;
import ec.edu.uce.FabricaMusical.services.ProductService;
import ec.edu.uce.FabricaMusical.services.UserService;
import ec.edu.uce.FabricaMusical.view.Gui.InvoiceAdmin;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.swing.*;

@SpringBootApplication
public class MainCLass {

	@Autowired
	private UserService userService;
	@Autowired
	private InvoiceService invoiceService;
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(MainCLass.class, args);
	}

	@PostConstruct
	public void init() {

		// Lanzar la interfaz gráfica Swing en el Event Dispatch Thread
		SwingUtilities.invokeLater(() -> {
			InvoiceAdmin screen = new InvoiceAdmin(invoiceService);
			//	UserScreen screen = new UserScreen(productService);
			//	UserAdminS screen = new UserAdminS(userService);
			//	MainScreen screen = new MainScreen();
			screen.setVisible(true);
		});
	}
}