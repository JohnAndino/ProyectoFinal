package uce.edu.ec.PersistenciaTiendaMusical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {
}
