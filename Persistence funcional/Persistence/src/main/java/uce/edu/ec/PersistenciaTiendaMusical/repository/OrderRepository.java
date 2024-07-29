package uce.edu.ec.PersistenciaTiendaMusical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
