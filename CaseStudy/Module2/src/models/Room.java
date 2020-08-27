package models;

public class Room extends Services {
    public static int numRoom = 0;
    private int numRoomTemp = 0;
    private  String roomId;
    private String freeService;

    public int getNumRoomTemp() {
        return numRoomTemp;
    }

    public String getFreeService() {
        return freeService;
    }

    public Room(String roomId,String serviceName, double usesArea, double rentCost, int maxPeople, int rentHour, int rentDay, int rentMonth, int rentYear) {
        super(serviceName, usesArea, rentCost, maxPeople, rentHour, rentDay, rentMonth, rentYear);
        this.numRoomTemp = ++numRoom;
        this.roomId = roomId;
    }

    public String getRoomId() {
        return roomId;
    }

    @Override
    public String showInfor() {
        return "Room ID:" + numRoomTemp + "\n" +
                "Name: " + serviceName + "\n" +
                "Area: " + usesArea + "\n" +
                "Renting cost: " + rentCost + "\n" +
                "Maximun People: " + maxPeople + "\n" +
                "Type of Renting: " + rentHour + "(h) " + rentDay + "(days) " + rentMonth + "(months) " + rentYear + "(years)\n";
    }
}
