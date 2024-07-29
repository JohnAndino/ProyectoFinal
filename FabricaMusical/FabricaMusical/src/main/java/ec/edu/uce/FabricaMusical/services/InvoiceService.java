package ec.edu.uce.FabricaMusical.services;

import ec.edu.uce.FabricaMusical.models.entities.Invoice;
import ec.edu.uce.FabricaMusical.interfaces.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

    public Optional<Invoice> updateInvoice(Long id, Invoice invoice) {
        if (invoiceRepository.existsById(id)) {
            invoice.setId(id);
            return Optional.of(invoiceRepository.save(invoice));
        }
        return Optional.empty();
    }

    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);
    }
}
