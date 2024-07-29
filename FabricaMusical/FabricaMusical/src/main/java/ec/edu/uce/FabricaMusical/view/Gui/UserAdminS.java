package ec.edu.uce.FabricaMusical.view.Gui;


import ec.edu.uce.FabricaMusical.models.UserTableModel;
import ec.edu.uce.FabricaMusical.models.entities.User;
import ec.edu.uce.FabricaMusical.services.UserService;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.JFrame;


public class UserAdminS extends javax.swing.JFrame {
    public UserService userService;
    private UserTableModel userTableModel;

    public UserAdminS(UserService userService) {

        this.userService = userService;
        initComponents();
        // Obtener las dimensiones de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Ajustar el tamaño del JFrame a la dimensión de la pantalla
        setSize(screenSize.width, screenSize.height);
        // Maximizar el JFrame para que ocupe toda la pantalla
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        refreshUserTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButtonBack = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        jTextFDni = new javax.swing.JTextField();
        jLabelDniE = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jTextFName = new javax.swing.JTextField();
        jLabelNameE = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelCellE = new javax.swing.JLabel();
        jTextFPhone = new javax.swing.JTextField();
        jLabelAdress = new javax.swing.JLabel();
        jTextFAddress = new javax.swing.JTextField();
        jLabelAdressE = new javax.swing.JLabel();
        jLabelEmali = new javax.swing.JLabel();
        jTextFEmail = new javax.swing.JTextField();
        jLabelmailE = new javax.swing.JLabel();
        jButtonCreate = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jLabelPword = new javax.swing.JLabel();
        jTextFPword = new javax.swing.JTextField();
        jLabelPassE = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonDlete = new javax.swing.JButton();
        jTextFErr = new javax.swing.JTextField();
        jButtonRead = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonBack.setText("Volver");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabelName.setText("Nombre");

        jLabelDni.setText("Número de Cédula");

        jLabelPhone.setText("Número de Teléfono");

        jTextFPhone.setVerifyInputWhenFocusTarget(false);

        jLabelAdress.setText("Dirrección");

        jTextFAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFAddressActionPerformed(evt);
            }
        });

        jLabelEmali.setText("E-mail");

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

        jLabelPword.setText("Contraseña");

        jTextFPword.setVerifyInputWhenFocusTarget(false);
        jTextFPword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFPwordActionPerformed(evt);
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

        jTable1.setModel(new UserTableModel(userService));
        jScrollPane1.setViewportView(jTable1);


        jButtonDlete.setText("Borrar");

        jButtonDlete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDleteActionPerformed(evt);
            }
        });

        jButtonRead.setText("Buscar");
        jButtonRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabelPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabelAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelPword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(48, 48, 48)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextFAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGap(3, 3, 3)
                                                                                        .addComponent(jLabelDniE, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jTextFDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jTextFPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCellE, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAdressE, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFPword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelNameE, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelPassE, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelmailE, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelEmali, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(86, 86, 86)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFErr, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(141, 141, 141))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonCreate)
                                                .addGap(180, 180, 180)
                                                .addComponent(jButtonEdit)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonRead)
                                                .addGap(48, 48, 48)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(132, 132, 132)
                                                .addComponent(jButtonDlete)
                                                .addGap(180, 180, 180)
                                                .addComponent(jButtonBack)))
                                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonBack)
                                                        .addComponent(jButtonCreate)
                                                        .addComponent(jButtonEdit)
                                                        .addComponent(jButtonDlete)
                                                        .addComponent(jButtonRead))
                                                .addGap(25, 25, 25))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelDniE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextFName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelNameE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabelPword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFPword))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelPassE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(23, 23, 23)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextFPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelCellE, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelAdressE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEmali, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFErr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jTextFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelmailE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75))))
        );

        jTextFPhone.getAccessibleContext().setAccessibleName("");
        jTextFAddress.getAccessibleContext().setAccessibleName("");
        jTextFPword.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>



    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
        // Regresar a la pantalla anterior
        dispose();
    }

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {
        User user = new User();
        user.setName(jTextFName.getText());
        user.setDni(jTextFDni.getText());
        user.setCellphone(jTextFPhone.getText());
        user.setAddress(jTextFAddress.getText());
        user.setEmail(jTextFEmail.getText());
        user.setPassword(jTextFPword.getText());
        String role = determineUserRole(jTextFPword.getText());
        user.setRole(role);
        userService.createUser(user);
        refreshUserTable();
        clearFields();
    }

    private void jButtonReadActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) { // Verificar que hay una fila seleccionada
            // Obtener el ID del usuario de la tabla
            Long userId = (Long) jTable1.getValueAt(selectedRow, 0); // Suponiendo que el ID está en la primera columna

            String dni = jTextFDni.getText();
            String name = jTextFName.getText();
            String password = new String(jTextFPword.getText()); // Obtener la contraseña de JPasswordField
            String cellphone = jTextFPhone.getText();
            String email = jTextFEmail.getText();
            String address = jTextFAddress.getText();
            String role = determineUserRole(password);

            // Crear un nuevo objeto User con los datos proporcionados
            User updatedUser = new User(dni, name, password, cellphone, email, address, role);

            // Actualizar el usuario en el servicio
            Optional<User> result = userService.updateUser(userId, updatedUser);

            if (result.isPresent()) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Usuario actualizado exitosamente.");
                refreshUserTable(); // Actualizar la tabla para reflejar los cambios
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No se pudo actualizar el usuario.");
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Por favor, seleccione un usuario para editar.");
        }
        clearFields();
    }

    private void jButtonDleteActionPerformed(java.awt.event.ActionEvent evt) {
        // Obtiene las filas seleccionadas de la tabla
        int[] selectedRows = jTable1.getSelectedRows();

        if (selectedRows.length > 0) { // Verifica si se han seleccionado filas
            List<Long> selectedUserIds = new ArrayList<>();

            // Itera sobre las filas seleccionadas para obtener los IDs de los usuarios
            for (int row : selectedRows) {
                Long userId = (Long) jTable1.getValueAt(row, 0); // Ajusta el índice de columna si es necesario
                selectedUserIds.add(userId);
            }

            // Elimina los usuarios usando sus IDs
            for (Long userId : selectedUserIds) {
                userService.deleteUser(userId);
            }

            // Actualiza la tabla para reflejar los cambios
            refreshUserTable();

            // Muestra un mensaje de éxito
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Usuarios eliminados con éxito.");
        } else {
            // Muestra un mensaje de advertencia si no se ha seleccionado ninguna fila
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Por favor, seleccione uno o más usuarios para eliminar.");
        }}


    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTextFAddressActionPerformed(java.awt.event.ActionEvent evt) {
        // Acción cuando se presiona Enter en el campo de dirección
    }
    private void jTextFPwordActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void clearFields() {
        jTextFName.setText("");
        jTextFDni.setText("");
        jTextFPhone.setText("");
        jTextFAddress.setText("");
        jTextFEmail.setText("");
        jTextFPword.setText("");
    }
    private void refreshUserTable() {
        // Actualiza el modelo de la tabla con los datos más recientes
        userTableModel = new UserTableModel(userService);
        jTable1.setModel(userTableModel);
    }

    private void deleteSelectedUsers() {
        // Obtiene los IDs de los usuarios seleccionados
        List<Long> selectedUserIds = getSelectedUserIds();

        // Elimina los usuarios usando sus IDs
        for (Long userId : selectedUserIds) {
            userService.deleteUser(userId);
        }

        // Actualiza la tabla para reflejar los cambios
        refreshUserTable();
    }

    private List<Long> getSelectedUserIds() {
        int[] selectedRows = jTable1.getSelectedRows();
        List<Long> selectedUserIds = new ArrayList<>();

        // Itera sobre las filas seleccionadas para obtener los IDs de los usuarios
        for (int row : selectedRows) {
            // Suponiendo que el ID del usuario está en la primera columna (ajusta el índice si es necesario)
            Long userId = (Long) jTable1.getValueAt(row, 0);
            selectedUserIds.add(userId);
        }

        return selectedUserIds;
    }

    private String determineUserRole(String password) {
        // Verificar si la contraseña tiene al menos 3 caracteres
        if (password.length() >= 3) {
            // Obtener los últimos 3 caracteres de la contraseña
            String lastThreeChars = password.substring(password.length() - 3);

            // Comparar los últimos 3 caracteres con "adm"
            if (lastThreeChars.equalsIgnoreCase("adm")) {
                return "Admin";
            }
        }

        // Si no cumple con la condición, el rol es "User"
        return "User";
    }

    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDlete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRead;
    private javax.swing.JLabel jLabelAdress;
    private javax.swing.JLabel jLabelAdressE;
    private javax.swing.JLabel jLabelCellE;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelDniE;
    private javax.swing.JLabel jLabelEmali;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNameE;
    private javax.swing.JLabel jLabelPassE;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelPword;
    private javax.swing.JLabel jLabelmailE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFAddress;
    private javax.swing.JTextField jTextFEmail;
    private javax.swing.JTextField jTextFDni;
    private javax.swing.JTextField jTextFName;
    private javax.swing.JTextField jTextFPhone;
    private javax.swing.JTextField jTextFPword;
    private javax.swing.JTextField jTextFErr;
}
