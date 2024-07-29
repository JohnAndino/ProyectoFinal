package ec.edu.uce.FabricaMusical.models;

import ec.edu.uce.FabricaMusical.models.entities.Invoice;
import ec.edu.uce.FabricaMusical.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;


import javax.swing.table.AbstractTableModel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;


public class InvoiceTableModel extends AbstractTableModel {

    @Autowired
    private InvoiceService invoiceService; // Inject InvoiceService

    private List<Invoice> invoices;
    private final String[] columnNames = { "Id", "Fecha", "Total" };

    public InvoiceTableModel(InvoiceService invoiceService) {
        this.invoiceService = invoiceService; // Initialize with data

        this.invoices = invoiceService.getAllInvoices();
    }



    public Invoice getInvoiceRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < invoices.size()) {
            return invoices.get(rowIndex);
        }
        return null; // Or throw an exception if you prefer
    }

    public void refreshData() {
        this.invoices = invoiceService.getAllInvoices();
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice invoice = invoices.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return invoice.getId(); // Assuming Invoice has a getId() method
            case 1:
                return invoice.getDate(); // Assuming Invoice has a getDate() method
            case 2:
                return BigDecimal.valueOf(invoice.getTotal()).setScale(2, RoundingMode.HALF_UP); // Format total
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
