package observer.exercise;

public class Stock {
    private int id;
    private float price;

    public Stock(int id, float price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
