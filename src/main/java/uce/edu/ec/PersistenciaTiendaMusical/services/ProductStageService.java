package uce.edu.ec.PersistenciaTiendaMusical.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.ProductStage;
import uce.edu.ec.PersistenciaTiendaMusical.repository.ProductStageRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductStageService {

    @Autowired
    private ProductStageRepository productStageRepository;

    public List<ProductStage> getAllProductStages() {
        return productStageRepository.findAll();
    }

    public Optional<ProductStage> getProductStageById(Long id) {
        return productStageRepository.findById(id);
    }

    public ProductStage createProductStage(ProductStage productStage) {
        return productStageRepository.save(productStage);
    }

    public void deleteProductStage(Long id) {
        productStageRepository.deleteById(id);
    }
}
