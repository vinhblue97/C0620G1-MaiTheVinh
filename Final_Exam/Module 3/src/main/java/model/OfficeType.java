package model;

public class OfficeType {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public OfficeType(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
