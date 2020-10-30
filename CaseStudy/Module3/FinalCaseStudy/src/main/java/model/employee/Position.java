package model.employee;

public class Position {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Position(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
