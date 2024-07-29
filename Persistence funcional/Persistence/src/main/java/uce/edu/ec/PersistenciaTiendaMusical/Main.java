package uce.edu.ec.PersistenciaTiendaMusical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uce.edu.ec.PersistenciaTiendaMusical.Gui.RegisterScreen;

import java.awt.*;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private RegisterScreen registerScreen;

    public static void main(String[] args) {

        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {

    }
}
