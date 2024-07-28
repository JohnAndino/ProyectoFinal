package ec.edu.uce.FabricaMusical.view.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Main Screen
 */
public class MainScreen extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JButton loginButton;
    private JButton backButton;
    private JPanel titleBar;
    private JButton closeButton;
    private Point initialClick;

    public MainScreen() {
        initComponents();
    }

    private void initComponents() {
        // Initialize components
        emailField = new JTextField();
        passwordField = new JPasswordField();
        emailLabel = new JLabel("E-mail:");
        passwordLabel = new JLabel("Password:");
        loginButton = new JButton("Login");
        backButton = new JButton("Back");

        // Set custom font
        Font customFont = new Font("Times New Roman", Font.BOLD, 18);
        emailLabel.setFont(customFont);
        passwordLabel.setFont(customFont);
        emailField.setFont(customFont);
        passwordField.setFont(customFont);
        loginButton.setFont(customFont);
        backButton.setFont(customFont);

        // Set preferred size for text fields
        Dimension fieldSize = new Dimension(200, 30); // Width 200, Height 30
        emailField.setPreferredSize(fieldSize);
        passwordField.setPreferredSize(fieldSize);

        // Set colors for the labels
        emailLabel.setForeground(Color.WHITE);
        passwordLabel.setForeground(Color.WHITE);

        // Style buttons
        styleButton(loginButton);
        styleButton(backButton);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1400, 800));  // Adjusted size
        setUndecorated(true);  // Remove default title bar
        setTitle("");

        // Create a custom title bar
        titleBar = new JPanel();
        titleBar.setBackground(Color.BLACK);
        titleBar.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("");
        titleLabel.setForeground(Color.WHITE);
        titleBar.add(titleLabel, BorderLayout.WEST);

        closeButton = new JButton("X");
        closeButton.setForeground(Color.WHITE);
        closeButton.setBackground(Color.BLACK);
        closeButton.setBorderPainted(false);
        closeButton.setFocusPainted(false);
        closeButton.addActionListener(e -> System.exit(0));
        titleBar.add(closeButton, BorderLayout.EAST);

        titleBar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        titleBar.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                setLocation(X, Y);
            }
        });

        JPanel mainPanel = new JPanel(new GridBagLayout()) {
            private BufferedImage backgroundImage;
            private BufferedImage logoImage;

            {
                try {
                    backgroundImage = ImageIO.read(getClass().getResource("/images/fondo.jpg"));
                    logoImage = ImageIO.read(getClass().getResource("/images/logom.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    // Scale the background image to fit the panel
                    int width = getWidth();
                    int height = getHeight();
                    Image scaledImage = backgroundImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                    g.drawImage(scaledImage, 0, 0, this);
                }
                if (logoImage != null) {
                    int logoWidth = 130;  // Desired width of the logo
                    int logoHeight = 130; // Desired height of the logo
                    Image scaledLogo = logoImage.getScaledInstance(logoWidth, logoHeight, Image.SCALE_SMOOTH);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f)); // 80% transparency
                    g2d.drawImage(scaledLogo, 20, getHeight() - logoHeight - 20, this);
                    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f)); // Reset to full opacity
                }
            }
        };
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Black border

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Add email label and field
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(emailLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(emailField, gbc);

        // Add password label and field
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(passwordField, gbc);

        // Add login button
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(loginButton, gbc);

        // Add back button
        gbc.gridx = 1;
        gbc.gridy = 4;
        mainPanel.add(backButton, gbc);

        // Add the title bar and main panel to the frame
        add(titleBar, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null); // Center the frame

        // Set the JFrame background color to black
        getContentPane().setBackground(Color.BLACK);
    }

    private void styleButton(JButton button) {
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        button.setFocusPainted(false);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
}
