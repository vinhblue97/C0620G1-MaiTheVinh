package model.customer;

public class Customer {
    public static int counter = 1;
    private int index_counter;
    private String id;
    private String identify_card;
    private String name;
    private String birthDay;
    private String gender;
    private String phone_number;
    private String email;
    private String type_of_customer_id;
    private String address;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
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

    public String getIdentify_card() {
        return identify_card;
    }

    public void setIdentify_card(String identify_card) {
        this.identify_card = identify_card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getType_of_customer_id() {
        return type_of_customer_id;
    }

    public void setType_of_customer_id(String type_of_customer_id) {
        this.type_of_customer_id = type_of_customer_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String id, String identify_card, String name, String birthDay, String gender, String phone_number,
                    String email, String type_of_customer_id, String address) {
        this.id = id;
        this.identify_card = identify_card;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.phone_number = phone_number;
        this.email = email;
        this.type_of_customer_id = type_of_customer_id;
        this.address = address;
        index_counter = counter;
        counter++;
    }
}
