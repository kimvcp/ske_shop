package shop;

public class Product {
    private int id;
    private double price;
    private String name;

    public Product() {}

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price must be positive value");
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ "+
                "\"id\": "+id+","+
                "\"name\": \""+name+"\","+
                "\"price\": "+id+","+
                "}";
    }

}