package ec.edu.uce.FabricaMusical.models.interfaces.repository;

import ec.edu.uce.FabricaMusical.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
