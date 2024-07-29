package uce.edu.ec.PersistenciaTiendaMusical.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.CreditCard;
import uce.edu.ec.PersistenciaTiendaMusical.services.CreditCardService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/credit-cards")
public class CreditCardController {

    @Autowired
    private CreditCardService creditCardService;

    @GetMapping
    public List<CreditCard> getAllCreditCards() {
        return creditCardService.getAllCreditCards();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CreditCard> getCreditCardById(@PathVariable int id) {
        return creditCardService.getCreditCardById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public CreditCard createCreditCard(@RequestBody CreditCard creditCard) {
        return creditCardService.createCreditCard(creditCard);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CreditCard> updateCreditCard(@PathVariable int id, @RequestBody CreditCard creditCard) {
        Optional<CreditCard> updatedCreditCard = creditCardService.updateCreditCard(id, creditCard);
        return updatedCreditCard.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCreditCard(@PathVariable int id) {
        creditCardService.deleteCreditCard(id);
        return ResponseEntity.noContent().build();
    }
}
