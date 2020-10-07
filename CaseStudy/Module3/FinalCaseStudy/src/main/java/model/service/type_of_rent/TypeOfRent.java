package model.service.type_of_service;

public class TypeOfService {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TypeOfService(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
