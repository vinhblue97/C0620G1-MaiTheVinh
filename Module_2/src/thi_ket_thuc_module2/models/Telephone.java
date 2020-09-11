package thi_ket_thuc_module2.models;

public class Telephone {
    private static int num = 0;
    private int id;
    private String numberPhone;
    private String type;
    private String userName;
    private String gender;
    private String address;
    private String birthday;
    private String email;

    public int getId() {
        return id;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public String getUserName() {
        return userName;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Telephone(String numberPhone, String type, String userName, String gender, String address, String birthday, String email) {
        this.numberPhone = numberPhone;
        this.type = type;
        this.userName = userName;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
        num++;
        this.id = num;
    }

    @Override
    public String toString() {
        return "Number Phone: " + this.numberPhone + "\n" +
                "Type:" + this.type + "\n" +
                "Name: " + this.userName + "\n" +
                "Gender:" + this.gender + "\n" +
                "Address:" + this.address;
    }


}
