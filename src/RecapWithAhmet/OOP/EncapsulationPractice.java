package RecapWithAhmet.OOP;

public class EncapsulationPractice {
    private String name="Ahmet";
    int age = 31;
    private long creditCard=1234425454;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }
}
