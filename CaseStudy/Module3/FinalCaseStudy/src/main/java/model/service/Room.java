package model.service;

public class Room extends Service {
    private int index;
    private String extra_service;

    public int getIndex() {
        return index;
    }

    public String getExtra_service() {
        return extra_service;
    }

    public Room(String id, String name, String area, String cost, String floor, String max_people,
                String type_of_service_id, String type_rent_id) {
        super(id, name, area, cost, floor, max_people, type_of_service_id, type_rent_id);
        index = Service.counter;
        Service.counter++;

    }
}
