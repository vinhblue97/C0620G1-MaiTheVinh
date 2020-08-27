package models;

public class House extends Services {
    public static int numHouse = 0;
    private int numHouseTemp;
    private  String houseId;
    private int numFloor;

    public House(String houseId, String serviceName, double usesArea, double rentCost, int maxPeople, int rentHour, int rentDay, int rentMonth, int rentYear, int numFloor) {
        super(serviceName, usesArea, rentCost, maxPeople, rentHour, rentDay, rentMonth, rentYear);
        this.numFloor = numFloor;
        this.numHouseTemp = ++numHouse;
        this.houseId = houseId;
    }

    public String getHouseId() {
        return houseId;
    }

    public int getNumHouseTemp() {
        return numHouseTemp;
    }

    public int getNumFloor() {
        return numFloor;
    }

    @Override
    public String showInfor() {
        return "House ID: " + numHouseTemp + "\n" +
                "Name: " + serviceName + "\n" +
                "Area: " + usesArea + "\n" +
                "Renting cost: " + rentCost + "\n" +
                "Maximun People: " + maxPeople + "\n" +
                "Type of Renting: " + rentHour + "(h) " + rentDay + "(days) " + rentMonth + "(months) " + rentYear + "(years)\n" +
                "Amount of Floor: " + numFloor;
    }
}

