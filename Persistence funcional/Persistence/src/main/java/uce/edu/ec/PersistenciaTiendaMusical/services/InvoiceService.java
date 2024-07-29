package uce.edu.ec.PersistenciaTiendaMusical.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.Invoice;
import uce.edu.ec.PersistenciaTiendaMusical.repository.InvoiceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Optional<Invoice> getInvoiceById(Long id) {
        return invoiceRepository.findById(id);
    }

    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);
    }

    public Optional<Invoice> updateInvoice(Long id, Invoice updatedInvoice) {
        return invoiceRepository.findById(id).map(existingInvoice -> {
            // Actualizar los campos de la factura existente con los nuevos valores
            existingInvoice.setDate(updatedInvoice.getDate());
            existingInvoice.setTotal(updatedInvoice.getTotal());
            // Otros campos que necesiten ser actualizados
            return invoiceRepository.save(existingInvoice);
        });
    }
}
