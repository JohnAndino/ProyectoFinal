package uce.edu.ec.PersistenciaTiendaMusical.Gui;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import Controller.Controller;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
;

/**
 *
 * @author USUARIO
 */
public class UserScreen extends javax.swing.JFrame {

    private ProductTableModel productTableModel;
    private Controller controller = new Controller();

    public UserScreen() {
        initComponents();
        productTableModel = new ProductTableModel(new ArrayList<>());
        jTableShow.setModel(productTableModel);
        initializeProductTable();
        fillTable();
        calculateTotals();

        // Añadir ActionListeners a los radio botones
        jRadioBCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBCashActionPerformed(evt);
            }
        });
        jRadioBCreditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBCreditCActionPerformed(evt);
            }
        });

        // Añadir los radio botones al grupo
        buttonGroup1.add(jRadioBCash);
        buttonGroup1.add(jRadioBCreditC);
    }

    private void fillTable() {
        List<Product> products = controller.getProducts();
        productTableModel.setProducts(products);
        calculateTotals();
    }

    private void calculateTotals() {
        BigDecimal total = BigDecimal.ZERO;
        for (Product product : controller.getProducts()) {
            BigDecimal price = BigDecimal.valueOf(product.getPrice()).setScale(2, RoundingMode.HALF_UP);
            total = total.add(price.multiply(BigDecimal.valueOf(product.getAmount())));
        }
        total = total.setScale(2, RoundingMode.HALF_UP);
        jLabelTPrice.setText("Total: $" + total.toString());
    }

    private void initializeProductTable() {
        List<Product> products = controller.getProducts();
        ProductTableModel productTableModel = new ProductTableModel(products);
        jTableShow.setModel(productTableModel);
    }

    private void deleteSelectedProducts() {
        List<Product> selectedProducts = getSelectedProducts();

        for (Product product : selectedProducts) {
            controller.Delete(product);
        }

        updateProductTable(); // Actualizar la tabla para reflejar los cambios
    }

    private List<Product> getSelectedProducts() {
        int[] selectedRows = jTableShow.getSelectedRows();
        List<Product> selectedProducts = new ArrayList<>();

        for (int row : selectedRows) {
            Product product = (Product) jTableShow.getValueAt(row, -1); // Suponiendo que el producto está almacenado en la última columna
            selectedProducts.add(product);
        }

        return selectedProducts;
    }

    private void updateProductTable() {
        List<Product> allProducts = controller.getProducts();
        ProductTableModel tableModel = (ProductTableModel) jTableShow.getModel();
        tableModel.setProducts(allProducts);
    }

    private void jRadioBCashActionPerformed(java.awt.event.ActionEvent evt) {
        // Deshabilitar los campos de texto para tarjeta de crédito
        jTextFCreditCNumber.setText("");
        jTextFCreditCNumber.setEnabled(false);
        jTextFDuedate.setText("");
        jTextFDuedate.setEnabled(false);
        jTextFSecurityC.setText("");
        jTextFSecurityC.setEnabled(false);
    }

    private void jRadioBCreditCActionPerformed(java.awt.event.ActionEvent evt) {
        // Habilitar los campos de texto para tarjeta de crédito
        jTextFCreditCNumber.setEnabled(true);
        jTextFDuedate.setEnabled(true);
        jTextFSecurityC.setEnabled(true);
    }

    private void jButtonBAckActionPerformed(java.awt.event.ActionEvent evt) {
        new MainScreen().setVisible(true);
        this.dispose();
    }

    private void jButtonQuitPrdtcActionPerformed(java.awt.event.ActionEvent evt) {
        deleteSelectedProducts();
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
        jButtonReplacePrdct = new javax.swing.JButton();
        jButtonPay = new javax.swing.JButton();
        jButtonBAck = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableShow = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabelTPrice = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabelColour = new javax.swing.JLabel();
        jTextFColour = new javax.swing.JTextField();

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

        jLabelDuedate.setText("Fecha de Vencimiento");

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

        jButtonReplacePrdct.setText("Reemplazar Producto");
        jButtonReplacePrdct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReplacePrdctActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelTPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(45, 45, 45))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonBAck)
                                                .addGap(65, 65, 65)
                                                .addComponent(jButtonQuitPrdtc)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonPay)
                                                .addGap(23, 23, 23))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelPaymentM)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioBCash)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioBCreditC)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(jTextFDuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(268, 268, 268))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelSecurityC)
                                        .addComponent(jLabelCreditCNumber))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFCreditCNumber)
                                        .addComponent(jTextFSecurityC))
                                .addGap(265, 265, 265))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelColour)
                                        .addComponent(jLabelDuedate))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFColour, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                        .addComponent(jTextFDuedate))
                                .addGap(174, 174, 174))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonReplacePrdct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                                .addComponent(jButtonVerify)
                                .addGap(128, 128, 128))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabelDueDateE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabelCreditCNumberE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabelSecurityCodeE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabelPaymentM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadioBCash)
                                        .addComponent(jRadioBCreditC))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFDuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelDuedate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCreditCNumber)
                                        .addComponent(jTextFCreditCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSecurityC)
                                        .addComponent(jTextFSecurityC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(jLabelDueDateE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCreditCNumberE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabelSecurityCodeE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButtonVerify)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonReplacePrdct)
                                        .addComponent(jButtonQuitPrdtc))
                                .addGap(5, 5, 5)
                                .addComponent(jButtonPay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBAck)
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTPrice)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelColour)
                                        .addComponent(jTextFColour, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void jTextFDuedateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonVerifyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonReplacePrdctActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonPayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFCreditCNumberActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvoiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButtonBAck;
    private javax.swing.JButton jButtonPay;
    private javax.swing.JButton jButtonQuitPrdtc;
    private javax.swing.JButton jButtonReplacePrdct;
    private javax.swing.JButton jButtonVerify;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelColour;
    private javax.swing.JLabel jLabelCreditCNumber;
    private javax.swing.JLabel jLabelCreditCNumberE;
    private javax.swing.JLabel jLabelDueDateE;
    private javax.swing.JLabel jLabelDuedate;
    private javax.swing.JLabel jLabelPaymentM;
    private javax.swing.JLabel jLabelSecurityC;
    private javax.swing.JLabel jLabelSecurityCodeE;
    private javax.swing.JLabel jLabelTPrice;
    private javax.swing.JRadioButton jRadioBCash;
    private javax.swing.JRadioButton jRadioBCreditC;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProducts;
    private javax.swing.JTextField jTextFColour;
    private javax.swing.JTextField jTextFCreditCNumber;
    private javax.swing.JTextField jTextFDuedate;
    private javax.swing.JTextField jTextFSecurityC;
    // End of variables declaration
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import Controller.Controller;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import uce.edu.ec.pheladeria.Models.ConeIcCream;
import uce.edu.ec.pheladeria.Models.Product;
import uce.edu.ec.pheladeria.Models.ProductTableModel;

/**
 *
 * @author USUARIO
 */
public class UserScreen extends javax.swing.JFrame {

    private ProductTableModel productTableModel;
    private Controller controller = new Controller();

    public UserScreen() {
        initComponents();
        productTableModel = new ProductTableModel(new ArrayList<>());
        jTableShow.setModel(productTableModel);
        initializeProductTable();
        fillTable();
        calculateTotals();

        // Añadir ActionListeners a los radio botones
        jRadioBCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBCashActionPerformed(evt);
            }
        });
        jRadioBCreditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBCreditCActionPerformed(evt);
            }
        });

        // Añadir los radio botones al grupo
        buttonGroup1.add(jRadioBCash);
        buttonGroup1.add(jRadioBCreditC);
    }

    private void fillTable() {
        List<Product> products = controller.getProducts();
        productTableModel.setProducts(products);
        calculateTotals();
    }

    private void calculateTotals() {
        BigDecimal total = BigDecimal.ZERO;
        for (Product product : controller.getProducts()) {
            BigDecimal price = BigDecimal.valueOf(product.getPrice()).setScale(2, RoundingMode.HALF_UP);
            total = total.add(price.multiply(BigDecimal.valueOf(product.getAmount())));
        }
        total = total.setScale(2, RoundingMode.HALF_UP);
        jLabelTPrice.setText("Total: $" + total.toString());
    }

    private void initializeProductTable() {
        List<Product> products = controller.getProducts();
        ProductTableModel productTableModel = new ProductTableModel(products);
        jTableShow.setModel(productTableModel);
    }

    private void deleteSelectedProducts() {
        List<Product> selectedProducts = getSelectedProducts();

        for (Product product : selectedProducts) {
            controller.Delete(product);
        }

        updateProductTable(); // Actualizar la tabla para reflejar los cambios
    }

    private List<Product> getSelectedProducts() {
        int[] selectedRows = jTableShow.getSelectedRows();
        List<Product> selectedProducts = new ArrayList<>();

        for (int row : selectedRows) {
            Product product = (Product) jTableShow.getValueAt(row, -1); // Suponiendo que el producto está almacenado en la última columna
            selectedProducts.add(product);
        }

        return selectedProducts;
    }

    private void updateProductTable() {
        List<Product> allProducts = controller.getProducts();
        ProductTableModel tableModel = (ProductTableModel) jTableShow.getModel();
        tableModel.setProducts(allProducts);
    }

    private void jRadioBCashActionPerformed(java.awt.event.ActionEvent evt) {
        // Deshabilitar los campos de texto para tarjeta de crédito
        jTextFCreditCNumber.setText("");
        jTextFCreditCNumber.setEnabled(false);
        jTextFDuedate.setText("");
        jTextFDuedate.setEnabled(false);
        jTextFSecurityC.setText("");
        jTextFSecurityC.setEnabled(false);
    }

    private void jRadioBCreditCActionPerformed(java.awt.event.ActionEvent evt) {
        // Habilitar los campos de texto para tarjeta de crédito
        jTextFCreditCNumber.setEnabled(true);
        jTextFDuedate.setEnabled(true);
        jTextFSecurityC.setEnabled(true);
    }

    private void jButtonBAckActionPerformed(java.awt.event.ActionEvent evt) {
        new MainScreen().setVisible(true);
        this.dispose();
    }

    private void jButtonQuitPrdtcActionPerformed(java.awt.event.ActionEvent evt) {
        deleteSelectedProducts();
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
        jButtonReplacePrdct = new javax.swing.JButton();
        jButtonPay = new javax.swing.JButton();
        jButtonBAck = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableShow = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabelTPrice = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabelColour = new javax.swing.JLabel();
        jTextFColour = new javax.swing.JTextField();

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

        jLabelDuedate.setText("Fecha de Vencimiento");

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

        jButtonReplacePrdct.setText("Reemplazar Producto");
        jButtonReplacePrdct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReplacePrdctActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelTPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(45, 45, 45))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonBAck)
                                                .addGap(65, 65, 65)
                                                .addComponent(jButtonQuitPrdtc)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonPay)
                                                .addGap(23, 23, 23))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelPaymentM)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioBCash)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioBCreditC)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(jTextFDuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(268, 268, 268))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelSecurityC)
                                        .addComponent(jLabelCreditCNumber))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFCreditCNumber)
                                        .addComponent(jTextFSecurityC))
                                .addGap(265, 265, 265))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelColour)
                                        .addComponent(jLabelDuedate))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFColour, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                        .addComponent(jTextFDuedate))
                                .addGap(174, 174, 174))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonReplacePrdct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                                .addComponent(jButtonVerify)
                                .addGap(128, 128, 128))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabelDueDateE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabelCreditCNumberE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabelSecurityCodeE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabelPaymentM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadioBCash)
                                        .addComponent(jRadioBCreditC))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFDuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelDuedate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCreditCNumber)
                                        .addComponent(jTextFCreditCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSecurityC)
                                        .addComponent(jTextFSecurityC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(jLabelDueDateE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCreditCNumberE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabelSecurityCodeE, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButtonVerify)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonReplacePrdct)
                                        .addComponent(jButtonQuitPrdtc))
                                .addGap(5, 5, 5)
                                .addComponent(jButtonPay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBAck)
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTPrice)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelColour)
                                        .addComponent(jTextFColour, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void jTextFDuedateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonVerifyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonReplacePrdctActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonPayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFCreditCNumberActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvoiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButtonBAck;
    private javax.swing.JButton jButtonPay;
    private javax.swing.JButton jButtonQuitPrdtc;
    private javax.swing.JButton jButtonReplacePrdct;
    private javax.swing.JButton jButtonVerify;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelColour;
    private javax.swing.JLabel jLabelCreditCNumber;
    private javax.swing.JLabel jLabelCreditCNumberE;
    private javax.swing.JLabel jLabelDueDateE;
    private javax.swing.JLabel jLabelDuedate;
    private javax.swing.JLabel jLabelPaymentM;
    private javax.swing.JLabel jLabelSecurityC;
    private javax.swing.JLabel jLabelSecurityCodeE;
    private javax.swing.JLabel jLabelTPrice;
    private javax.swing.JRadioButton jRadioBCash;
    private javax.swing.JRadioButton jRadioBCreditC;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProducts;
    private javax.swing.JTextField jTextFColour;
    private javax.swing.JTextField jTextFCreditCNumber;
    private javax.swing.JTextField jTextFDuedate;
    private javax.swing.JTextField jTextFSecurityC;
    // End of variables declaration
}

