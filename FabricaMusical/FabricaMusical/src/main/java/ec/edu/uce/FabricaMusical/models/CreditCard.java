package ec.edu.uce.FabricaMusical.models;

import ec.edu.uce.FabricaMusical.models.entities.User;
import jakarta.persistence.*;

@Entity
@Table(name = "credit_cards")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Cambiado de 'Userid' a 'User'

    @Column(name = "card_number", nullable = false)
    private String cardNumber;

    @Column(name = "due_date", nullable = false)
    private String dueDate;

    @Column(name = "security_code", nullable = false)
    private String securityCode;

    public CreditCard() {
    }

    public CreditCard(User user, String cardNumber, String dueDate, String securityCode) {
        this.user = user;
        this.cardNumber = cardNumber;
        this.dueDate = dueDate;
        this.securityCode = securityCode;
    }

    public CreditCard(int id, User user, String cardNumber, String dueDate, String securityCode) {
        this.id = id;
        this.user = user;
        this.cardNumber = cardNumber;
        this.dueDate = dueDate;
        this.securityCode = securityCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "id=" + id +
                ", user=" + user +
                ", cardNumber='" + cardNumber + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", securityCode='" + securityCode + '\'' +
                '}';
    }
}
