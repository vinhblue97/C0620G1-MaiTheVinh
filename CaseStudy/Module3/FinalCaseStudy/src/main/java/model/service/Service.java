package model.service;

public abstract class Service {
    public static int counter = 1;
    private String id;
    private String name;
    private String area;
    private String floor;
    private String max_people;
    private String cost;
    private String type_of_service_id;
    private String type_rent_id;
    private String massage = "";
    private String karaoke = "";
    private String food = "";
    private String drink = "";
    private String rent_car = "";

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }

    public String getCost() {
        return cost;
    }

    public String getFloor() {
        return floor;
    }

    public String getMax_people() {
        return max_people;
    }

    public String getType_of_service_id() {
        return type_of_service_id;
    }

    public String getType_rent_id() {
        return type_rent_id;
    }

    public String getMassage() {
        return massage;
    }

    public String getKaraoke() {
        return karaoke;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public String getRent_car() {
        return rent_car;
    }


    public Service(String id, String name, String area, String cost, String floor, String max_people,
                   String type_of_service_id, String type_rent_id) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.floor = floor;
        this.max_people = max_people;
        this.type_of_service_id = type_of_service_id;
        this.type_rent_id = type_rent_id;
        this.massage = massage;
        this.karaoke = karaoke;
        this.food = food;
        this.drink = drink;
        this.rent_car = rent_car;
    }
}
