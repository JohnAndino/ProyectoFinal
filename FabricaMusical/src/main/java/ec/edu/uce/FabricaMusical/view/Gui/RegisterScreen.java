package ec.edu.uce.FabricaMusical.view.Gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class RegisterScreen extends JFrame {

    Dimension screenSize;
    Controller controller = new Controller();

    public RegisterScreen() {
        initComponents();
        // Obtain screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Adjust JFrame size to screen dimension
        setSize(screenSize.width, screenSize.height);
        // Maximize JFrame to occupy the entire screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
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
        jLabelPword = new javax.swing.JLabel();
        jTextFPword = new javax.swing.JTextField();
        jLabelPassE = new javax.swing.JLabel();
        jTextFErr = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonBack.setText("Volver");
        jButtonBack.addActionListener(evt -> jButtonBackActionPerformed(evt));

        jLabelName.setText("Nombre");

        jLabelDni.setText("Número de Cédula");

        jTextFName.addActionListener(evt -> jTextFNameActionPerformed(evt));

        jLabelPhone.setText("Número de Teléfono");

        jTextFPhone.addActionListener(evt -> jTextFPhoneActionPerformed(evt));

        jLabelAdress.setText("Dirección");

        jTextFAddress.addActionListener(evt -> jTextFAddressActionPerformed(evt));

        jLabelEmali.setText("E-mail");

        jTextFEmail.addActionListener(evt -> jTextFEmailActionPerformed(evt));

        jButtonCreate.setText("Guardar");
        jButtonCreate.addActionListener(evt -> jButtonCreateActionPerformed(evt));

        jLabelPword.setText("Contraseña");

        jTextFPword.addActionListener(evt -> jTextFPwordActionPerformed(evt));

        jTextFErr.addActionListener(evt -> jTextFErrActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelDni, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                        .addComponent(jLabelPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                        .addComponent(jLabelAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelPword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jTextFPword, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabelNameE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabelPassE, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelmailE, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelEmali, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(86, 86, 86)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFErr, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(141, 141, 141)
                                .addComponent(jButtonBack)
                                .addContainerGap(264, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButtonCreate)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(jLabelAdressE, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelEmali, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelmailE, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jTextFErr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonBack)
                                        .addComponent(jButtonCreate))
                                .addContainerGap())
        );

        pack();
    }

    private void jTextFErrActionPerformed(java.awt.event.ActionEvent evt) {
        // Placeholder for action
    }

    private void jTextFPwordActionPerformed(java.awt.event.ActionEvent evt) {
        // Placeholder for action
    }

    private void jTextFNameActionPerformed(java.awt.event.ActionEvent evt) {
        // Placeholder for action
    }

    private void jTextFAddressActionPerformed(java.awt.event.ActionEvent evt) {
        // Placeholder for action
    }

    private void jTextFPhoneActionPerformed(java.awt.event.ActionEvent evt) {
        // Placeholder for action
    }

    private void jTextFEmailActionPerformed(java.awt.event.ActionEvent evt) {
        // Placeholder for action
    }

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
        // Back button logic
    }

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {
        User user = new User();
        boolean validate = true;

        if (jTextFDni.getText().isEmpty()) {
            jLabelDniE.setText("Ingrese el campo del dni");
            validate = false;
        }
        if (jTextFName.getText().isEmpty()) {
            jLabelNameE.setText("Ingrese el campo del Nombre");
            validate = false;
        }
        if (jTextFPword.getText().isEmpty()) {
            jLabelPassE.setText("Ingrese el campo de la Contraseña");
            validate = false;
        }
        if (jTextFPhone.getText().isEmpty()) {
            jLabelCellE.setText("Ingrese el campo del Numero de celular");
            validate = false;
        }
        if (jTextFAddress.getText().isEmpty()) {
            jLabelAdressE.setText("Ingrese el campo de la Direccion");
            validate = false;
        }
        if (jTextFEmail.getText().isEmpty()) {
            jLabelmailE.setText("Ingrese el campo del Correo");
            validate = false;
        }

        if (validate) {
            user.setDni(jTextFDni.getText());
            user.setName(jTextFName.getText());
            user.setPassword(jTextFPword.getText());
            user.setCellnumber(jTextFPhone.getText());
            user.setAddress(jTextFAddress.getText());
            user.setMail(jTextFEmail.getText());
            boolean ex = controller.exist(jTextFDni.getText());
            if (!ex) {
                controller.insertUser(user);
                dispose();
            } else {
                jTextFErr.setText("Este usuario ya existe");
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            RegisterScreen frame = new RegisterScreen();
            frame.setVisible(true);
        });
    }

    // Variables declaration
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCreate;
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
    private javax.swing.JTextField jTextFAddress;
    private javax.swing.JTextField jTextFDni;
    private javax.swing.JTextField jTextFEmail;
    private javax.swing.JTextField jTextFErr;
    private javax.swing.JTextField jTextFName;
    private javax.swing.JTextField jTextFPhone;
    private javax.swing.JTextField jTextFPword;
}
