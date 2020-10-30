package model.service;

public class Villa extends Service {
    private int index;
    private String standard_room;
    private String description_other_convenience;
    private String pool_area;

    public int getIndex() {
        return index;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public String getDescription_other_convenience() {
        return description_other_convenience;
    }

    public String getPool_area() {
        return pool_area;
    }


    public Villa(String id, String name, String area, String cost, String floor, String max_people,
                 String type_of_service_id, String type_rent_id, String standard_room,
                 String description_other_convenience, String pool_area) {
        super(id, name, area, cost, floor, max_people, type_of_service_id, type_rent_id);
        this.standard_room = standard_room;
        this.description_other_convenience = description_other_convenience;
        this.pool_area = pool_area;
        index = Service.counter;
        Service.counter++;
    }
}
