package ec.edu.uce.FabricaMusical.interfaces.repository;

import ec.edu.uce.FabricaMusical.models.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
