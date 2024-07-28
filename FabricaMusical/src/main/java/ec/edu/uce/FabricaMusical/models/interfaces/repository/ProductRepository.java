package ec.edu.uce.FabricaMusical.models.interfaces.repository;

import ec.edu.uce.FabricaMusical.models.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}