package ec.edu.uce.FabricaMusical.models.interfaces.repository;

import ec.edu.uce.FabricaMusical.models.enums.Steps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StageRepository extends JpaRepository<Steps, Long> {
}
