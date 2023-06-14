package encapsulation;

public class Coffee {
    private String kind;
    private String size;
    private Double price;

    public String getKind() {
        return kind;
    }

    public String getSize() {
        return size;
    }

    public Double getPrice() {
        return price;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
