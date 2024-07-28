package ec.edu.uce.FabricaMusical.models.controllers;

import ec.edu.uce.FabricaMusical.models.entities.ProductSteps;
import ec.edu.uce.FabricaMusical.models.services.ProductStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-stages")
public class ProductStageController {

    @Autowired
    private ProductStageService productStageService;

    @GetMapping
    public List<ProductSteps> getAllProductStages() {
        return productStageService.getAllProductStages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductSteps> getProductStageById(@PathVariable Long id) {
        return productStageService.getProductStageById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ProductSteps createProductStage(@RequestBody ProductSteps productSteps) {
        return productStageService.createProductStage(productSteps);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductStage(@PathVariable Long id) {
        productStageService.deleteProductStage(id);
        return ResponseEntity.noContent().build();
    }
}
