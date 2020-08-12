package models;

public class Room extends Service{
    private String freeService;

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String serviceName, double area, double rentCost, int numPeople, int rentHour, String freeService) {
        super(id, serviceName, area, rentCost, numPeople, rentHour);
        this.freeService = freeService;
    }

    @Override
    String showInfor() {
        return "Id: " + getId() + "\n" +
                "Service name: " + getServiceName() + "\n" +
                "Area: " + getArea() + "\n" +
                "Rent cost: " + getRentCost() +
                "Number of people: " + getNumPeople() + "\n" +
                "Rent type: " + getRentHour();

    }
}
