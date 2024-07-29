package uce.edu.ec.PersistenciaTiendaMusical.Gui;


import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.Product;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.ProductTableModel;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.UserTableModel;
import uce.edu.ec.PersistenciaTiendaMusical.services.ProductService;
import uce.edu.ec.PersistenciaTiendaMusical.services.UserService;

import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class UserScreen extends javax.swing.JFrame {

    private ProductTableModel productTableModel;

    public ProductService productService;


    public UserScreen(ProductService productService) {
        this.productService = productService;
        initComponents();

        calculateTotals();
        // Obtener las dimensiones de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Ajustar el tamaño del JFrame a la dimensión de la pantalla
        setSize(screenSize.width, screenSize.height);
        // Maximizar el JFrame para que ocupe toda la pantalla
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        refreshProductTable();

        // Add ActionListeners to radio buttons
        jRadioBCash.addActionListener(evt -> jRadioBCashActionPerformed(evt));
        jRadioBCreditC.addActionListener(evt -> jRadioBCreditCActionPerformed(evt));

        // Add radio buttons to the button group
        buttonGroup1.add(jRadioBCash);
        buttonGroup1.add(jRadioBCreditC);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelPaymentM = new javax.swing.JLabel();
        jRadioBCash = new javax.swing.JRadioButton();
        jRadioBCreditC = new javax.swing.JRadioButton();
        jLabelDuedate = new javax.swing.JLabel();
        jTextFDuedate = new javax.swing.JTextField();
        jLabelCreditCNumber = new javax.swing.JLabel();
        jLabelCreditCNumberE = new javax.swing.JLabel();
        jTextFCreditCNumber = new javax.swing.JTextField();
        jLabelDueDateE = new javax.swing.JLabel();
        jLabelSecurityC = new javax.swing.JLabel();
        jTextFSecurityC = new javax.swing.JTextField();
        jLabelSecurityCodeE = new javax.swing.JLabel();
        jButtonVerify = new javax.swing.JButton();
        jButtonQuitPrdtc = new javax.swing.JButton();
        jButtonPay = new javax.swing.JButton();
        jButtonBAck = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableShow = new javax.swing.JTable();
        jLabelTPrice = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabelColour = new javax.swing.JLabel();
        jTextFColour = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelPaymentM.setText("Metodo de Pago");

        jRadioBCash.setText("Efectivo");
        jRadioBCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBCashActionPerformed(evt);
            }
        });

        jRadioBCreditC.setText("Tarjeta De Crédito");
        jRadioBCreditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBCreditCActionPerformed(evt);
            }
        });

        jLabelDuedate.setText("fecha de Vencimiento");

        jTextFDuedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFDuedateActionPerformed(evt);
            }
        });

        jLabelCreditCNumber.setText("Número de Tarjeta");

        jTextFCreditCNumber.setVerifyInputWhenFocusTarget(false);

        jLabelSecurityC.setText("Código de Seguridad");

        jButtonVerify.setText("Verificar");
        jButtonVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerifyActionPerformed(evt);
            }
        });

        jButtonQuitPrdtc.setText("Quitar Producto");
        jButtonQuitPrdtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitPrdtcActionPerformed(evt);
            }
        });

        jButtonPay.setText("Realizar Pago");
        jButtonPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPayActionPerformed(evt);
            }
        });

        jButtonBAck.setText("Volver");
        jButtonBAck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBAckActionPerformed(evt);
            }
        });

        jTableShow.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane2.setViewportView(jTableShow);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Escoje el instrumento que deseas comprar");

        jLabelColour.setText("Color");

        jTextFColour.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelPaymentM, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jRadioBCash)
                                                                                .addGap(110, 110, 110)
                                                                                .addComponent(jRadioBCreditC))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jLabelCreditCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabelDuedate, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                                                                        .addComponent(jLabelSecurityC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(16, 16, 16)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(jTextFCreditCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jTextFDuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabelCreditCNumberE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabelDueDateE, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(jLabelSecurityCodeE, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jTextFSecurityC, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButtonVerify)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButtonQuitPrdtc, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(77, 77, 77)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(244, 244, 244)
                                                                .addComponent(jButtonPay)
                                                                .addGap(158, 158, 158)
                                                                .addComponent(jButtonBAck))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelTPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(239, 239, 239))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(644, 644, 644)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelColour, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFColour, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(601, 601, 601))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelSecurityC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFSecurityC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelSecurityCodeE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(80, 80, 80))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(166, 166, 166)
                                                                .addComponent(jLabelPaymentM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jRadioBCash)
                                                                                        .addComponent(jRadioBCreditC))
                                                                                .addGap(34, 34, 34)
                                                                                .addComponent(jLabelCreditCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jTextFCreditCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelCreditCNumberE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelDuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFDuedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelDueDateE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(41, 41, 41)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabelColour, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextFColour, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(203, 203, 203)
                                                                                                .addComponent(jLabelTPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(84, 84, 84)
                                                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonQuitPrdtc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonPay)
                                        .addComponent(jButtonVerify)
                                        .addComponent(jButtonBAck))
                                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>

        private void calculateTotals() {
        BigDecimal total = BigDecimal.ZERO;
        for (Product product : productService.getAllProducts()) {
            // Usa solo el precio del producto
            BigDecimal price = BigDecimal.valueOf(product.getPrice()).setScale(2, RoundingMode.HALF_UP);
            total = total.add(price);
        }
        total = total.setScale(2, RoundingMode.HALF_UP);
        jLabelTPrice.setText("Total: $" + total.toString());
    }


    private void refreshUserTable() {
        // Actualiza el modelo de la tabla con los datos más recientes
        productTableModel = new ProductTableModel(productService);
        jTableShow.setModel(productTableModel);
    }

  /*  private void initializeProductTable() {
        List<Product> products = controller.getProducts();
        ProductTableModel productTableModel = new ProductTableModel(products);
        jTableShow.setModel(productTableModel);
    }*/

    private void refreshProductTable() {
        // Actualiza el modelo de la tabla con los datos más recientes
        productTableModel = new ProductTableModel(productService);
        jTableShow.setModel(productTableModel);
    }

    private void deleteSelectedProducts() {
        // Obtiene los IDs de los productos seleccionados
        List<Long> selectedProductIds = getSelectedProductIds();

        // Elimina los productos usando sus IDs
        for (Long productId : selectedProductIds) {
            productService.deleteProduct(productId);
        }

        // Actualiza la tabla para reflejar los cambios
        refreshProductTable();
    }

    private List<Long> getSelectedProductIds() {
        int[] selectedRows =  jTableShow.getSelectedRows();
        List<Long> selectedProductIds = new ArrayList<>();

        // Itera sobre las filas seleccionadas para obtener los IDs de los productos
        for (int row : selectedRows) {
            // Suponiendo que el ID del producto está en la primera columna (ajusta el índice si es necesario)
            Long productId = (Long)  jTableShow.getValueAt(row, 0);
            selectedProductIds.add(productId);
        }

        return selectedProductIds;
    }

    private void jRadioBCashActionPerformed(java.awt.event.ActionEvent evt) {
        // Disable credit card fields
        jTextFCreditCNumber.setText("");
        jTextFCreditCNumber.setEnabled(false);
        jTextFDuedate.setText("");
        jTextFDuedate.setEnabled(false);
        jTextFSecurityC.setText("");
        jTextFSecurityC.setEnabled(false);
    }

    private void jRadioBCreditCActionPerformed(java.awt.event.ActionEvent evt) {
        // Enable credit card fields
        jTextFCreditCNumber.setEnabled(true);
        jTextFDuedate.setEnabled(true);
        jTextFSecurityC.setEnabled(true);
    }

    private void jTextFDuedateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here
    }

    private void jButtonVerifyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here
    }

    private void jButtonBAckActionPerformed(java.awt.event.ActionEvent evt) {
        new MainScreen().setVisible(true);
        this.dispose();
    }


    private void jButtonQuitPrdtcActionPerformed(java.awt.event.ActionEvent evt) {
        // Obtiene las filas seleccionadas de la tabla
        int[] selectedRows = jTableShow.getSelectedRows();

        if (selectedRows.length > 0) { // Verifica si se han seleccionado filas
            List<Long> selectedProductIds = new ArrayList<>();

            // Itera sobre las filas seleccionadas para obtener los IDs de los productos
            for (int row : selectedRows) {
                // Obtén el valor de la celda como String
                Object cellValue = jTableShow.getValueAt(row, 0);
                if (cellValue != null) {
                    try {
                        // Convierte el String a Long
                        Long productId = null;
                        if (cellValue instanceof Number) {
                            productId = ((Number) cellValue).longValue();
                        } else {
                            productId = Long.parseLong(cellValue.toString());
                        }
                        selectedProductIds.add(productId);
                    } catch (NumberFormatException e) {
                        // Maneja el error si el String no se puede convertir a Long
                        javax.swing.JOptionPane.showMessageDialog(this,
                                "Error al convertir el ID del producto en la fila " + row + ". Valor: " + cellValue,
                                "Error de formato",
                                javax.swing.JOptionPane.ERROR_MESSAGE);
                        return; // Sal de la función si hay un error
                    }
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Valor nulo encontrado en la fila " + row + ".",
                            "Error",
                            javax.swing.JOptionPane.ERROR_MESSAGE);
                    return; // Sal de la función si hay un valor nulo
                }
            }

            // Elimina los productos usando sus IDs
            for (Long productId : selectedProductIds) {
                productService.deleteProduct(productId);
            }

            // Actualiza la tabla para reflejar los cambios
            refreshProductTable();

            // Muestra un mensaje de éxito
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Productos eliminados con éxito.");
        } else {
            // Muestra un mensaje de advertencia si no se ha seleccionado ninguna fila
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Por favor, seleccione uno o más productos para eliminar.");
        }
    }



    private void jButtonPayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here
    }


   /*public static void main(String args[]) {
        // Set the Nimbus look and feel
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(() -> new UserScreen().setVisible(true));
    }*/

    // Variables declaration
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBAck;
    private javax.swing.JButton jButtonPay;
    private javax.swing.JButton jButtonQuitPrdtc;
    private javax.swing.JButton jButtonVerify;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelColour;
    private javax.swing.JLabel jLabelDuedate;
    private javax.swing.JLabel jLabelPaymentM;
    private javax.swing.JLabel jLabelCreditCNumber;
    private javax.swing.JLabel jLabelCreditCNumberE;
    private javax.swing.JLabel jLabelDueDateE;
    private javax.swing.JLabel jLabelSecurityC;
    private javax.swing.JLabel jLabelSecurityCodeE;
    private javax.swing.JLabel jLabelTPrice;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableShow;
    private javax.swing.JRadioButton jRadioBCash;
    private javax.swing.JRadioButton jRadioBCreditC;
    private javax.swing.JTextField jTextFColour;
    private javax.swing.JTextField jTextFCreditCNumber;
    private javax.swing.JTextField jTextFDuedate;
    private javax.swing.JTextField jTextFSecurityC;
    // End of variables declaration
}
