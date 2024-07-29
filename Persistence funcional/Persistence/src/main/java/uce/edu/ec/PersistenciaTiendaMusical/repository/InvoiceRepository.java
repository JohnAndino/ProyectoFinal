package uce.edu.ec.PersistenciaTiendaMusical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
