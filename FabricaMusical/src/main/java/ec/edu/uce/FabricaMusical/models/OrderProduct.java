package ec.edu.uce.FabricaMusical.models;

public class OrderProduct {
    private long id;
    private Order orderId;
    private Product product;
    private int quantity;

    public OrderProduct(long id, Order orderId, Product product, int quantity) {
        this.id = id;
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
