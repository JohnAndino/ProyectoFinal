package ec.edu.uce.FabricaMusical.models.interfaces.repository;

import ec.edu.uce.FabricaMusical.models.entities.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
}
