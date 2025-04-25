public class Products {
    private int Id;
    private String name = "";
    private double price = 0.0;

    public Products(int Id, String name, double price) {
        this.Id = Id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public double getPrice() {
        return price;
    }
}
