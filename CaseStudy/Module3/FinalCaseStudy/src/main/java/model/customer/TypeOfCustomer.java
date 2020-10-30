package model.customer;

public class TypeOfCustomer {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TypeOfCustomer(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
