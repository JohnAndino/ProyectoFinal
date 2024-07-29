package uce.edu.ec.PersistenciaTiendaMusical.Gui;


import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.Invoice;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.InvoiceTableModel;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.UserTableModel;
import uce.edu.ec.PersistenciaTiendaMusical.services.InvoiceService;
import uce.edu.ec.PersistenciaTiendaMusical.services.UserService;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class InvoiceAdmin extends javax.swing.JFrame {

    public InvoiceService invoiceService;
    private InvoiceTableModel invoiceTableModel;
    public InvoiceAdmin(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
        initComponents();
        // Obtener las dimensiones de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Ajustar el tamaño del JFrame a la dimensión de la pantalla
        setSize(screenSize.width, screenSize.height);
        // Maximizar el JFrame para que ocupe toda la pantalla
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        refreshInvoiceTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabelId = new javax.swing.JLabel();
        jTextFId = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jTextFDate = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();
        jTextFTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabeldE = new javax.swing.JLabel();
        jLabelDateE = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonCreate = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonRead = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelTotalE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelId.setText("Id de la Orden");

        jTextFId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFIdActionPerformed(evt);
            }
        });

        jLabelDate.setText("Fecha");

        jTextFDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFDateActionPerformed(evt);
            }
        });

        jLabelTotal.setText("Total");

        jTextFTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFTotalActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setModel(new InvoiceTableModel(invoiceService));
        jScrollPane1.setViewportView(jTable1);


        jButtonCreate.setText("Guardar");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Editar");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonRead.setText("Buscar");
        jButtonRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Borrar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonBack.setText("Volver");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonCreate)
                                                .addGap(146, 146, 146)
                                                .addComponent(jButtonEdit)
                                                .addGap(146, 146, 146)
                                                .addComponent(jButtonRead)
                                                .addGap(146, 146, 146)
                                                .addComponent(jButtonDelete)
                                                .addGap(146, 146, 146)
                                                .addComponent(jButtonBack)
                                                .addContainerGap(259, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabelId, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabelDateE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabeldE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextFId, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                                        .addComponent(jTextFDate)
                                                        .addComponent(jTextFTotal)
                                                        .addComponent(jLabelTotalE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(71, 71, 71)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabeldE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelDateE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabelTotalE, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCreate)
                                        .addComponent(jButtonEdit)
                                        .addComponent(jButtonRead)
                                        .addComponent(jButtonDelete)
                                        .addComponent(jButtonBack))
                                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>

    private void jTextFIdActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFDateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFTotalActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {
        Invoice invoice = new Invoice();
        invoice.setId(Integer.parseInt(jTextFId.getText()));
        invoice.setDate(LocalDate.parse(jTextFDate.getText()));
        invoice.setTotal((float) Double.parseDouble(jTextFTotal.getText()));
        // Si tienes más campos en la factura, configúralos aquí.

        invoiceService.createInvoice(invoice);
        refreshInvoiceTable();
        clearFields();
    }


    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {

            int selectedRow = jTable1.getSelectedRow();

            if (selectedRow != -1) { // Verificar que hay una fila seleccionada
                // Obtener el ID de la factura de la tabla
                Long invoiceId = (Long) jTable1.getValueAt(selectedRow, 0); // Suponiendo que el ID está en la primera columna

                try {
                    // Obtener los datos actualizados de los campos de texto
                    String date = jTextFDate.getText();
                    float total = (float) Double.parseDouble(jTextFTotal.getText());

                    // Crear un nuevo objeto Invoice con los datos proporcionados
                    Invoice updatedInvoice = new Invoice();
                    updatedInvoice.setId(invoiceId);
                    updatedInvoice.setDate(LocalDate.parse(date));
                    updatedInvoice.setTotal(total);

                    // Actualizar la factura en el servicio
                    Optional<Invoice> result = invoiceService.updateInvoice(invoiceId, updatedInvoice);

                    if (result.isPresent()) {
                        javax.swing.JOptionPane.showMessageDialog(this,
                                "Factura actualizada exitosamente.");
                        refreshInvoiceTable(); // Actualizar la tabla para reflejar los cambios
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(this,
                                "No se pudo actualizar la factura.");
                    }
                } catch (NumberFormatException e) {
                    // Manejar error de formato de número
                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Error en el formato de número: " + e.getMessage());
                } catch (Exception e) {
                    // Manejar otros errores
                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Error: " + e.getMessage());
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Por favor, seleccione una factura para editar.");
            }
            clearFields();
        }


    private void jButtonReadActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {

            // Obtiene las filas seleccionadas de la tabla
            int[] selectedRows = jTable1.getSelectedRows();

            if (selectedRows.length > 0) { // Verifica si se han seleccionado filas
                List<Long> selectedInvoiceIds = new ArrayList<>();

                // Itera sobre las filas seleccionadas para obtener los IDs de las facturas
                for (int row : selectedRows) {
                    Long invoiceId = (Long) jTable1.getValueAt(row, 0); // Ajusta el índice de columna si es necesario
                    selectedInvoiceIds.add(invoiceId);
                }

                // Elimina las facturas usando sus IDs
                for (Long invoiceId : selectedInvoiceIds) {
                    invoiceService.deleteInvoice(invoiceId);
                }

                // Actualiza la tabla para reflejar los cambios
                refreshInvoiceTable();

                // Muestra un mensaje de éxito
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Facturas eliminadas con éxito.");
            } else {
                // Muestra un mensaje de advertencia si no se ha seleccionado ninguna fila
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Por favor, seleccione una o más facturas para eliminar.");
            }
        }
    

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void refreshInvoiceTable() {
        // Update the table model with the most recent data
        invoiceTableModel = new InvoiceTableModel(invoiceService);
        jTable1.setModel(invoiceTableModel);
    }

    private void deleteSelectedInvoices() {
        // Obtain the IDs of the selected invoices
        List<Long> selectedInvoiceIds = getSelectedInvoiceIds();

        // Delete the invoices using their IDs
        for (Long invoiceId : selectedInvoiceIds) {
            invoiceService.deleteInvoice(invoiceId);
        }

        // Update the table to reflect the changes
        refreshInvoiceTable();
    }

    private void clearFields() {
        jTextFDate.setText("");
        jTextFTotal.setText("");

    }

    private List<Long> getSelectedInvoiceIds() {
        int[] selectedRows = jTable1.getSelectedRows();
        List<Long> selectedInvoiceIds = new ArrayList<>();

        // Iterate over the selected rows to obtain the invoice IDs
        for (int row : selectedRows) {
            // Assuming the invoice ID is in the first column (adjust index if necessary)
            Long invoiceId = (Long) jTable1.getValueAt(row, 0);
            selectedInvoiceIds.add(invoiceId);
        }
        return selectedInvoiceIds;
    }



    // Variables declaration
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDateE;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelTotalE;
    private javax.swing.JLabel jLabeldE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFDate;
    private javax.swing.JTextField jTextFId;
    private javax.swing.JTextField jTextFTotal;
    // End of variables declaration
}
