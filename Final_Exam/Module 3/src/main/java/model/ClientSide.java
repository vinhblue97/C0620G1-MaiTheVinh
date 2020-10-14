package model;

public class Client {
    public static int counter = 1;
    private String index_counter;
    private String id;
    private String name;
    private String price;
    private String quantity;
    private String color;
    private String description;
    private String category_id;


    public String getIndex_counter() {
        return index_counter;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory_id() {
        return category_id;
    }

    public Client(String id, String name, String price, String quantity, String color, String description, String category_id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.description = description;
        this.category_id = category_id;
        this.index_counter = String.valueOf(counter);
        counter++;
    }
}
