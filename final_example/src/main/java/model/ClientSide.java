package model;

public class ClientSide {
    public static int counter = 1;
    private String index_counter;
    private String areaId;
    private String area;
    private String status;
    private String floors;
    private String officeType;
    private String description;
    private String rentPrice;
    private String beginDate;
    private String endDate;


    public String getIndex_counter() {
        return index_counter;
    }

    public String getAreaId() {
        return areaId;
    }

    public String getArea() {
        return area;
    }

    public String getStatus() {
        return status;
    }

    public String getFloors() {
        return floors;
    }

    public String getOfficeType() {
        return officeType;
    }

    public String getDescription() {
        return description;
    }

    public String getRentPrice() {
        return rentPrice;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public ClientSide(String areaId, String area, String status, String floors, String officeType, String description,
                      String rentPrice, String beginDate, String endDate) {
        this.areaId = areaId;
        this.area = area;
        this.status = status;
        this.floors = floors;
        this.officeType = officeType;
        this.description = description;
        this.rentPrice = rentPrice;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.index_counter += counter;
        counter++;
    }
}
