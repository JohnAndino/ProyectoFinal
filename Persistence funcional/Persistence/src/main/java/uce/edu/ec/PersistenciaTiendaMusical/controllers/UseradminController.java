package uce.edu.ec.PersistenciaTiendaMusical.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.User;
import uce.edu.ec.PersistenciaTiendaMusical.services.UserService;

import java.util.List;
import java.util.Optional;

@Controller
public class UseradminController {

    @Autowired
    private UserService userService;

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public Optional<User> getUserById(Long id) {
        return userService.getUserById(id);
    }

    public User createUser(User user) {
        return userService.createUser(user);
    }

    public Optional<User> updateUser(Long id, User user) {
        return userService.updateUser(id, user);
    }

    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }

    public boolean exist(String dni) {
        List<User> users = userService.getAllUsers(); // Obtener la lista de usuarios actualizada
        for (User user : users) {
            if (user.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }
}
