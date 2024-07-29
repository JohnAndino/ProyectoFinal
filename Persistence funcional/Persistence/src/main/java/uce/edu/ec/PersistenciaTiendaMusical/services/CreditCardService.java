package uce.edu.ec.PersistenciaTiendaMusical.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.ec.PersistenciaTiendaMusical.models.entidades.CreditCard;
import uce.edu.ec.PersistenciaTiendaMusical.repository.CreditCardRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    public List<CreditCard> getAllCreditCards() {
        return creditCardRepository.findAll();
    }

    public Optional<CreditCard> getCreditCardById(int id) {
        return creditCardRepository.findById(id);
    }

    public CreditCard createCreditCard(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);
    }

    public Optional<CreditCard> updateCreditCard(int id, CreditCard creditCard) {
        if (creditCardRepository.existsById(id)) {
            creditCard.setId(id);
            return Optional.of(creditCardRepository.save(creditCard));
        }
        return Optional.empty();
    }

    public void deleteCreditCard(int id) {
        creditCardRepository.deleteById(id);
    }
}
