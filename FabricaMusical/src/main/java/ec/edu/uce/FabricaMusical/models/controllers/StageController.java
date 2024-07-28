package ec.edu.uce.FabricaMusical.models.controllers;

import ec.edu.uce.FabricaMusical.models.enums.Steps;
import ec.edu.uce.FabricaMusical.models.services.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stages")
public class StageController {

    @Autowired
    private StageService stageService;

    @GetMapping
    public List<Steps> getAllStages() {
        return stageService.getAllStages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Steps> getStageById(@PathVariable Long id) {
        return stageService.getStageById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Steps createStage(@RequestBody Steps steps) {
        return stageService.createStage(steps);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStage(@PathVariable Long id) {
        stageService.deleteStage(id);
        return ResponseEntity.noContent().build();
    }
}
