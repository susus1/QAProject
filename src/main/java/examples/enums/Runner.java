package examples.enums;

public class Runner {

    public static void main(String[] args) {
        for(Drink_Size d : Drink_Size.values()) {
            System.out.printf("The price per 100ml of a %s drink is £ %f%n", d, d.pricePer100Ml());
        }
    }
}