package ec.edu.uce.FabricaMusical.interfaces.repository;

import ec.edu.uce.FabricaMusical.models.entities.ProductSteps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStageRepository extends JpaRepository<ProductSteps, Long> {
}
