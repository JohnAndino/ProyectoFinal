package uce.edu.ec.PersistenciaTiendaMusical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}