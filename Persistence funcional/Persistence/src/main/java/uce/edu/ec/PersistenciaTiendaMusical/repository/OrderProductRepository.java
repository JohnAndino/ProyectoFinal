package uce.edu.ec.PersistenciaTiendaMusical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
}
