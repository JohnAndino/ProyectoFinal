package ec.edu.uce.FabricaMusical.models.interfaces.repository;

import ec.edu.uce.FabricaMusical.models.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
