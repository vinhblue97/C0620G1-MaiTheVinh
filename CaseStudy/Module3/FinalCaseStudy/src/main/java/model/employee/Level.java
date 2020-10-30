package model.employee;

public class Level {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Level(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
