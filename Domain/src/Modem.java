public class Modem {
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;

    public Modem(Double price) {
        this.price = price;
    }
}
