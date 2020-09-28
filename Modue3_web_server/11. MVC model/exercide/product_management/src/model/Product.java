package model;

public class Product {
    private Integer id;
    private String name;
    private String cost;
    private String description;
    private String producer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Product() {
     }

    public Product(Integer id, String name, String cost, String description, String producer) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.producer = producer;
    }
}
