package ec.edu.uce.FabricaMusical.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private long id;
    private User customer;
    private LocalDate date;
    private String status; // "Pending", "In Process", "Completed"
    private List<OrderProduct> products = new ArrayList<>();

    public Order(User customer, LocalDate date, String status, List<OrderProduct> products) {
        this.customer = customer;
        this.date = date;
        this.status = status;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<OrderProduct> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProduct> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", products=" + products +
                '}';
    }
}
