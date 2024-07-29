package uce.edu.ec.PersistenciaTiendaMusical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByPassword(String password);
}
