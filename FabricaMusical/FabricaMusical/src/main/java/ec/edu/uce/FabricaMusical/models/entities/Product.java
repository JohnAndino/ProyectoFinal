package ec.edu.uce.FabricaMusical.models.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String material;

    @Column(nullable = false)
    private String color;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductSteps> stages = new ArrayList<>();

    public Product() {
    }

    public Product(String name, String description, double price, String material, String color) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.material = material;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public List<ProductSteps> getStages() {
        return stages;
    }

    public void setStages(List<ProductSteps> stages) {
        this.stages = stages;
    }

    public void addStage(ProductSteps stage) {
        stages.add(stage);
        stage.setProduct(this);
    }

    public void removeStage(ProductSteps stage) {
        stages.remove(stage);
        stage.setProduct(null);
    }
}

