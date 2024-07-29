package ec.edu.uce.FabricaMusical.interfaces.repository;

import ec.edu.uce.FabricaMusical.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}