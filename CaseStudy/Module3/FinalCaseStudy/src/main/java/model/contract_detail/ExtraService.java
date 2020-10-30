package model.contract_detail;

public class ExtraService {
    private String id;
    private String name;
    private String cost;
    private String unit;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public String getUnit() {
        return unit;
    }

    public ExtraService(String id, String name, String cost, String unit) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.unit = unit;
    }
}
