package ec.edu.uce.FabricaMusical.view.Gui;

import ec.edu.uce.FabricaMusical.models.entities.User;
import ec.edu.uce.FabricaMusical.services.ProductService;
import ec.edu.uce.FabricaMusical.services.UserService;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;


public class MainScreen extends javax.swing.JFrame {


   private UserService userService; // Inyección del UserService

    private ProductService productService;
    public MainScreen() {
        initComponents();

        // Configurar el botón "Login"
        jButtonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabelImage1 = new javax.swing.JLabel();
        jTextFEmail = new javax.swing.JTextField();
        jTextFPassword = new javax.swing.JTextField();
        jLabelEmailE = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1520, 720));

      /*  jTextFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFEmailActionPerformed(evt);
            }
        });*/

        /*jTextFPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFPasswordActionPerformed(evt);
            }
        });*/

        jLabel1.setText("E-mail");

        jLabel2.setText("Password");

        jButtonLogin.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(588, 588, 588)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonLogin)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFEmail)
                                                .addComponent(jLabelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelEmailE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextFPassword)
                                                .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jTextFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEmailE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButtonLogin)
                                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>


    private void jButtonLoginActionPerformed(ActionEvent evt) {
        String email = jTextFEmail.getText().trim();
        String password = jTextFPassword.getText().trim();

        // Validar usuario con el servicio UserService
        Optional<User> optionalUser = userService.getAllUsers().stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (user.getPassword().endsWith("adm")) {
                // Abrir AdminScreen
                AdminScreen adminScreen = new AdminScreen();
                adminScreen.setVisible(true);
                this.dispose(); // Cierra la pantalla actual
            } else {
                // Abrir UserScreen
                UserScreen userScreen = new UserScreen(productService);
                userScreen.setVisible(true);
                this.dispose(); // Cierra la pantalla actual
            }
        } else {
            // Mostrar mensaje de error si el usuario no se encuentra
            JOptionPane.showMessageDialog(this, "Invalid email or password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Otros métodos generados por el IDE (omitidos por brevedad)

    // Métodos generados por el IDE (omitidos por brevedad)

    // Variables declaration - do not modify
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEmailE;
    private javax.swing.JLabel jLabelImage1;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JTextField jTextFEmail;
    private javax.swing.JTextField jTextFPassword;
    // End of variables declaration

   /* public static void main(String[] args) {
        SpringApplication.run(MainScreen.class, args);
        java.awt.EventQueue.invokeLater(() -> {
            // Crear y mostrar la pantalla principal después de iniciar la aplicación Spring
            MainScreen mainScreen = new MainScreen();
            mainScreen.setVisible(true);
        });
    }*/
}
