package models;

public class Room extends Services {
    private String freeService;
    public Room(String serviceName, double usesArea, double rentCost, int maxPeople, int rentHour, int rentDay, int rentMonth, int rentYear) {
        super(serviceName, usesArea, rentCost, maxPeople, rentHour, rentDay, rentMonth, rentYear);
    }
    @Override
    public String showInfor(){
        return "Name: "+serviceName+"\n" +
                "Area"+ usesArea+"\n" +
                "Renting cost: "+rentCost+"\n" +
                "Maximun People: "+maxPeople+"\n" +
                "Type of Renting: "+ rentHour+"(h) "+rentDay+"(days) "+rentMonth+"(months) "+rentYear+"(years)\n";
    }
}
