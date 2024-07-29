package ec.edu.uce.FabricaMusical.interfaces.repository;

import ec.edu.uce.FabricaMusical.enums.Steps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StageRepository extends JpaRepository<Steps, Long> {
}
