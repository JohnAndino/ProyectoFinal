package ec.edu.uce.FabricaMusical.models;

import ec.edu.uce.FabricaMusical.models.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService {
    @Override
    public void notifyClient(Product product) {
        System.out.println("Notificando al cliente que el producto " + product.getName() + " ha sido fabricado.");
    }
}
