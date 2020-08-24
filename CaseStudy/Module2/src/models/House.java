package models;

public class House extends Services {
    private static int numHouse = 0;
    private int houseID;
    private int numFloor;

    public House(String serviceName, double usesArea, double rentCost, int maxPeople, int rentHour, int rentDay, int rentMonth, int rentYear, int numFloor) {
        super(serviceName, usesArea, rentCost, maxPeople, rentHour, rentDay, rentMonth, rentYear);
        this.numFloor = numFloor;
        this.houseID = ++numHouse;
    }

    public int getHouseID() {
        return houseID;
    }

    public int getNumFloor() {
        return numFloor;
    }

    @Override
        public String showInfor(){
            return "Name: "+serviceName+"\n" +
                    "Area"+ usesArea+"\n" +
                    "Renting cost: "+rentCost+"\n" +
                    "Maximun People: "+maxPeople+"\n" +
                    "Type of Renting: "+ rentHour+"(h) "+rentDay+"(days) "+rentMonth+"(months) "+rentYear+"(years)\n" +
                    "Amount of Floor: "+numFloor;
        }
    }

