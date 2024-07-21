package uce.edu.ec.PersistenciaTiendaMusical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
