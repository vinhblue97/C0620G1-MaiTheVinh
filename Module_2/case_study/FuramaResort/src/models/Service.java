package models;

public abstract class Service {
    private String id;
    private String serviceName;
    private double area;
    private double rentCost;
    private int numPeople;
    private int rentHour;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public int getRentHour() {
        return rentHour;
    }

    public void setRentHour(int rentHour) {
        this.rentHour = rentHour;
    }


    public Service(String id, String serviceName, double area, double feeRent, int numPeople, int rentHour) {
        this.id = id;
        this.serviceName = serviceName;
        this.area = area;
        this.rentCost = rentCost;
        this.numPeople = numPeople;
        this.rentHour = rentHour;
    }

    abstract String showInfor();
}
