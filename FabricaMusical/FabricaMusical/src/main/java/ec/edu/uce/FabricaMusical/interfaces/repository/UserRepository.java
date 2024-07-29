package ec.edu.uce.FabricaMusical.interfaces.repository;

import ec.edu.uce.FabricaMusical.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
