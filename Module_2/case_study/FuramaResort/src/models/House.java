package models;

public class House extends Service {
    private int standard;
    private String convenience;
    private int numFloor;

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getConvenience() {
        return convenience;
    }

    public void setConvenience(String convenience) {
        this.convenience = convenience;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }

    public House(String id, String serviceName, double area, double rentCost, int numPeople, int rentHour, int standard, String convenience, int numFloor) {
        super(id, serviceName, area, rentCost, numPeople, rentHour);
        this.standard = standard;
        this.convenience = convenience;
        this.numFloor = numFloor;
    }

    @Override
    String showInfor() {
        return "Id: " + getId() + "\n" +
                "Service name: " + getServiceName() + "\n" +
                "Area: " + getArea() + "\n" +
                "Rent cost: " + getRentCost() +
                "Number of people: " + getNumPeople() + "\n" +
                "Rent type: " + getRentHour() + "\n" +
                "Standard: " + getStandard() + "\n" +
                "Convenience: " + getConvenience() + "\n" +
                "Number of floor: " + getNumFloor();
    }
}
