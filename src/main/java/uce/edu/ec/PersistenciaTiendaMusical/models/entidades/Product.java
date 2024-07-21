package uce.edu.ec.PersistenciaTiendaMusical.models.entidades;

import jakarta.persistence.*;
import java.math.BigDecimal;
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
    private BigDecimal price;

    @Column(nullable = false)
    private String material;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductStage> stages = new ArrayList<>();

    public Product() {
    }

    public Product(String name, String description, BigDecimal price, String material) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.material = material;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public List<ProductStage> getStages() {
        return stages;
    }

    public void setStages(List<ProductStage> stages) {
        this.stages = stages;
    }

    public void addStage(ProductStage stage) {
        stages.add(stage);
        stage.setProduct(this);
    }

    public void removeStage(ProductStage stage) {
        stages.remove(stage);
        stage.setProduct(null);
    }
}

