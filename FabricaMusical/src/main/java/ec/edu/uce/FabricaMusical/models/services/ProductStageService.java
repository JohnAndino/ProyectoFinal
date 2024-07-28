package ec.edu.uce.FabricaMusical.models.services;

import ec.edu.uce.FabricaMusical.models.entities.ProductSteps;
import ec.edu.uce.FabricaMusical.models.interfaces.repository.ProductStageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductStageService {

    @Autowired
    private ProductStageRepository productStageRepository;

    public List<ProductSteps> getAllProductStages() {
        return productStageRepository.findAll();
    }

    public Optional<ProductSteps> getProductStageById(Long id) {
        return productStageRepository.findById(id);
    }

    public ProductSteps createProductStage(ProductSteps productSteps) {
        return productStageRepository.save(productSteps);
    }

    public void deleteProductStage(Long id) {
        productStageRepository.deleteById(id);
    }
}
