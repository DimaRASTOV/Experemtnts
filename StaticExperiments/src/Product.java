public class Product {

    private final String name;
    private final int price;
    private static int count;
    private static int totalPrice;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        count = count +1;
        totalPrice = totalPrice + price;
    }

    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public static int getCount() {
        return count;
    }
    public static double getAveragePrice() {
        return (double) totalPrice / count;
    }




}