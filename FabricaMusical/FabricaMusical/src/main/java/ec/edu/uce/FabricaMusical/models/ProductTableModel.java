package ec.edu.uce.FabricaMusical.models;

import ec.edu.uce.FabricaMusical.models.entities.Product;
import ec.edu.uce.FabricaMusical.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;


import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.table.AbstractTableModel;
import java.util.List;


public class ProductTableModel extends AbstractTableModel {
    @Autowired
    private ProductService productService; // Inject ProductService

    private List<Product> products;
    private final String[] columnNames = {"Id", "Nombre", "Precio", "Material", "Color" };

    public ProductTableModel(ProductService productService) {
        this.productService = productService;
        this.products = fetchProducts();
    }

    // Fetch products from the database
    private List<Product> fetchProducts() {
        return productService.getAllProducts();
    }

    public Product getProductRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < products.size()) {
            return products.get(rowIndex);
        }
        return null; // Or throw an exception if you prefer
    }

    public void refreshData() {
        this.products = fetchProducts();
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return products.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Product product = products.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return product.getId();
            case 1:
                return product.getName(); // Assuming Product has a getName() method
            case 2:
                return BigDecimal.valueOf(product.getPrice()).setScale(2, RoundingMode.HALF_UP); // Format price
            case 3:
                return product.getMaterial(); // Assuming Product has a getMaterial() method
            case 4:
                return product.getColor(); // Assuming Product has a getColor() method
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
