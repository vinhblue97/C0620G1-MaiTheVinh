package model;


public class Customer {
    public static int index = 1;
    private int participleIndex;
    private String name;
    private String birthday;
    private Integer gender;
    private String identify_card;
    private String phone_number;
    private String email;
    private Integer type_of_customer_id;
    private String address;

    public int getParticipleIndex() {
        return participleIndex;
    }

    public void setParticipleIndex(int participleIndex) {
        this.participleIndex = participleIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdentify_card() {
        return identify_card;
    }

    public void setIdentify_card(String identify_card) {
        this.identify_card = identify_card;
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

    public Integer getType_of_customer_id() {
        return type_of_customer_id;
    }

    public void setType_of_customer_id(Integer type_of_customer_id) {
        this.type_of_customer_id = type_of_customer_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer() {

    }

    public Customer(String name, String birthday, Integer gender, String identify_card, String phone_number, String email, Integer type_of_customer_id, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.identify_card = identify_card;
        this.phone_number = phone_number;
        this.email = email;
        this.type_of_customer_id = type_of_customer_id;
        this.address = address;
        this.participleIndex = index;
        index++;
    }
}
