package model.employee;

public class Office {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Office(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
