package console;

public enum DrinkSize {
    SMALL(1.99, 350),
    MEDIUM(2.99, 470),
    LARGE(3.99, 560);

    private final double price;
    private final int volume;

    DrinkSize(double price, int volume) {
        this.price = price;
        this.volume = volume;
    }
    
    public double pricePer100Ml() {
        return price / (volume / 100);
    }

    public double multipleDrinkPrice(int numberOrdered) {
        return price * numberOrdered;
    }
    
}