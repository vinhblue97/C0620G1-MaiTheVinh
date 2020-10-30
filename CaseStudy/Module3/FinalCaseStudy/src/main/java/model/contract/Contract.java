package model.contract;

public class Contract {
    public static int counter = 1;
    private int index_counter;
    private String id;
    private String employee;
    private String customer;
    private String service;
    private String begin_date;
    private String end_date;
    private String deposists;
    private String total_cost;

    public int getIndex_counter() {
        return index_counter;
    }

    public String getId() {
        return id;
    }

    public String getEmployee() {
        return employee;
    }

    public String getCustomer() {
        return customer;
    }

    public String getService() {
        return service;
    }

    public String getBegin_date() {
        return begin_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getDeposists() {
        return deposists;
    }

    public String getTotal_cost() {
        return total_cost;
    }

    public Contract(String id, String employee, String customer, String service, String begin_date,
                    String end_date, String deposists, String total_cost) {
        this.id = id;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
        this.begin_date = begin_date;
        this.end_date = end_date;
        this.deposists = deposists;
        this.total_cost = total_cost;
        this.index_counter = counter;
        counter++;
    }
}
