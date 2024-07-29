package ec.edu.uce.FabricaMusical.services;

import ec.edu.uce.FabricaMusical.enums.Steps;
import ec.edu.uce.FabricaMusical.interfaces.repository.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StageService {

    @Autowired
    private StageRepository stageRepository;

    public List<Steps> getAllStages() {
        return stageRepository.findAll();
    }

    public Optional<Steps> getStageById(Long id) {
        return stageRepository.findById(id);
    }

    public Steps createStage(Steps steps) {
        return stageRepository.save(steps);
    }

    public void deleteStage(Long id) {
        stageRepository.deleteById(id);
    }
}
