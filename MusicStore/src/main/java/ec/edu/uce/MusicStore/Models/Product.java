package ec.edu.uce.MusicStore.Models;

import java.math.BigDecimal;

public class Product {
    private long id;
    private String name;
    private String description;
    private Float price;
    private String Type;
    private String Color;

    public Product(String name, String description, String type, Float price,String Color ) {
        this.name = name;
        this.description = description;
        Type = type;
        this.price = price;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", Type='" + Type + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}
