package uce.edu.ec.PersistenciaTiendaMusical.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.ProductStage;
import uce.edu.ec.PersistenciaTiendaMusical.services.ProductStageService;

import java.util.List;

@RestController
@RequestMapping("/product-stages")
public class ProductStageController {

    @Autowired
    private ProductStageService productStageService;

    @GetMapping
    public List<ProductStage> getAllProductStages() {
        return productStageService.getAllProductStages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductStage> getProductStageById(@PathVariable Long id) {
        return productStageService.getProductStageById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ProductStage createProductStage(@RequestBody ProductStage productStage) {
        return productStageService.createProductStage(productStage);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductStage(@PathVariable Long id) {
        productStageService.deleteProductStage(id);
        return ResponseEntity.noContent().build();
    }
}
