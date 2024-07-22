package uce.edu.ec.PersistenciaTiendaMusical.models.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "product_stages")
public class ProductStage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stage_id", nullable = false)
    private Stage stage;

    @Column(nullable = false)
    private int stageorder;

    public ProductStage() {
    }

    public ProductStage(Product product, Stage stage, int stageorder) {
        this.product = product;
        this.stage = stage;
        this.stageorder = stageorder;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public int getStageorder() {
        return stageorder;
    }

    public void setStageorder(int stageorder) {
        this.stageorder = stageorder;
    }
}

