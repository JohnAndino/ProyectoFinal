package ec.edu.uce.FabricaMusical.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product_stages")
public class ProductSteps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stage_id", nullable = false)
    private Steps steps;

    @Column(nullable = false)
    private int stageorder;

    public ProductSteps() {
    }

    public ProductSteps(Product product, Steps steps, int stageorder) {
        this.product = product;
        this.steps = steps;
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

    public Steps getStage() {
        return steps;
    }

    public void setStage(Steps steps) {
        this.steps = steps;
    }

    public int getStageorder() {
        return stageorder;
    }

    public void setStageorder(int stageorder) {
        this.stageorder = stageorder;
    }
}

