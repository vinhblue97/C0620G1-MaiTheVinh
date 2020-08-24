package models;

public class Villa extends Services {
    private static int numVilla = 0;
    private int villaID;
    private double poolArea;
    private int numFloor;

    public int getVillaID() {
        return villaID;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public Villa(String serviceName, double usesArea, double rentCost, int maxPeople, int rentHour, int rentDay, int rentMonth, int rentYear, double poolArea, int numFloor) {
        super(serviceName, usesArea, rentCost, maxPeople, rentHour, rentDay, rentMonth, rentYear);
        this.poolArea = poolArea;
        this.numFloor = numFloor;
        this.villaID = ++numVilla;
    }

    @Override
    public String showInfor() {
        return "Name: " + serviceName + "\n" +
                "Area" + usesArea + "\n" +
                "Renting cost: " + rentCost + "\n" +
                "Maximun People: " + maxPeople + "\n" +
                "Type of Renting: " + rentHour + "(h) " + rentDay + "(days) " + rentMonth + "(months) " + rentYear + "(years)\n" +
                "Pool's Area" + poolArea + "\n" +
                "Amount of Floor: " + numFloor;
    }
}
