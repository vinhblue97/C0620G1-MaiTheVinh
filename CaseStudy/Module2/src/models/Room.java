package models;

public class Room extends Services {
    private static int numRoom = 0;
    private int roomID = 1;
    private String freeService;

    public int getRoomID() {
        return roomID;
    }

    public String getFreeService() {
        return freeService;
    }

    public Room(String serviceName, double usesArea, double rentCost, int maxPeople, int rentHour, int rentDay, int rentMonth, int rentYear) {
        super(serviceName, usesArea, rentCost, maxPeople, rentHour, rentDay, rentMonth, rentYear);
        this.roomID = ++numRoom;
    }

    @Override
    public String showInfor() {
        return "Name: " + serviceName + "\n" +
                "Area" + usesArea + "\n" +
                "Renting cost: " + rentCost + "\n" +
                "Maximun People: " + maxPeople + "\n" +
                "Type of Renting: " + rentHour + "(h) " + rentDay + "(days) " + rentMonth + "(months) " + rentYear + "(years)\n";
    }
}
