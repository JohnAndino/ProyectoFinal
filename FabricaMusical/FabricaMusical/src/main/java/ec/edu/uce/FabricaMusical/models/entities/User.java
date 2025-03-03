package ec.edu.uce.FabricaMusical.models.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String dni;
    @Column(nullable = false)
    private String role; // "CUSTOMER" or "ADMIN"

    @Column(nullable = false)
    private String address; // "CUSTOMER" or "ADMIN"

    @Column(nullable = false)
    private String cellphone; // "CUSTOMER" or "ADMIN"


    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders = new ArrayList<>();

    public User() {
    }

    public User(String name, String email, String password, String dni, String role) {
    }

    public User(String dni,String name, String password,String cellphone,String email, String Address,String role ) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.dni = dni;
            this.role = role;
            this.address = Address;
            this.cellphone = cellphone;
        }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
            orders.add(order);
            order.setCustomer(this);
        }
        public void removeOrder(Order order) {
            orders.remove(order);
            order.setCustomer(null);
        }
    }