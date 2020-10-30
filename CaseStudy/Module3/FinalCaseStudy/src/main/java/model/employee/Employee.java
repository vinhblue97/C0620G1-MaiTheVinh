package model.employee;

public class Employee {
    public static int counter = 1;
    private int index_counter;
    private String id;
    private String last_name;
    private String middle_name;
    private String first_name;
    private String position_id;
    private String level_id;
    private String office_id;
    private String birth_day;
    private String identify_card;
    private String salary;
    private String phone_number;
    private String email;
    private String address;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    public int getIndex_counter() {
        return index_counter;
    }

    public void setIndex_counter(int index_counter) {
        this.index_counter = index_counter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPosition_id() {
        return position_id;
    }

    public void setPosition_id(String position_id) {
        this.position_id = position_id;
    }

    public String getLevel_id() {
        return level_id;
    }

    public void setLevel_id(String level_id) {
        this.level_id = level_id;
    }

    public String getOffice_id() {
        return office_id;
    }

    public void setOffice_id(String office_id) {
        this.office_id = office_id;
    }

    public String getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }

    public String getIdentify_card() {
        return identify_card;
    }

    public void setIdentify_card(String identify_card) {
        this.identify_card = identify_card;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(String id, String last_name, String middle_name, String first_name, String position_id,
                    String level_id, String office_id, String birth_day, String identify_card, String salary,
                    String phone_number, String email, String address) {
        this.id = id;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.first_name = first_name;
        this.position_id = position_id;
        this.level_id = level_id;
        this.office_id = office_id;
        this.birth_day = birth_day;
        this.identify_card = identify_card;
        this.salary = salary;
        this.phone_number = phone_number;
        this.email = email;
        this.address = address;
        this.index_counter = counter;
        counter++;
    }
}
