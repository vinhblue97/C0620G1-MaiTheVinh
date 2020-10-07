package model.customer;

public class CustomerType {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CustomerType(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
