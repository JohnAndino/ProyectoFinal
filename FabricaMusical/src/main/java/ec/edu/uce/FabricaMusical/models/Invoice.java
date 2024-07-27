package ec.edu.uce.FabricaMusical.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {
    private long id;
    private Order orderId;
    private LocalDate date;
    private float total;

    public Invoice(long id, Order orderId, LocalDate date, float total) {
        this.id = id;
        this.orderId = orderId;
        this.date = date;
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}
