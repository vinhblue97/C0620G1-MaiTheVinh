package model.service.type_of_rent;

public class TypeOfRent {
    private String id;
    private String name;
    private String cost;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public TypeOfRent(String id, String name, String cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
