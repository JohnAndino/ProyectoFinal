package uce.edu.ec.PersistenciaTiendaMusical.models.entidades;

import org.springframework.beans.factory.annotation.Autowired;
import uce.edu.ec.PersistenciaTiendaMusical.services.UserService;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class UserTableModel extends AbstractTableModel {

    @Autowired
    private UserService userService;

    private List<User> users;
    private final String[] columnNames = { "Id", "Dni", "Nombre", "Contraseña", "Celular", "Email", "Dirección", "Rol" };

    public UserTableModel(UserService userService) {
        this.userService = userService;
        this.users = userService.getAllUsers();
    }

    public User getUserRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < users.size()) {
            return users.get(rowIndex);
        }
        return null; // O lanzar una excepción según tu preferencia
    }

    public void refreshUsers() {
        this.users = userService.getAllUsers();
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return users.size();
    }
    public long getUserIdAtRow(int rowIndex) {
        User user = users.get(rowIndex);
        return user.getId(); // Asegúrate de que User tenga el método getId()
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User user = users.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return user.getId();
            case 1:
                return user.getDni();
            case 2:
                return user.getName();
            case 3:
                return user.getPassword();
            case 4:
                return user.getCellphone();
            case 5:
                return user.getEmail();
            case 6:
                return user.getAddress();
            case 7:
                return user.getRole();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
