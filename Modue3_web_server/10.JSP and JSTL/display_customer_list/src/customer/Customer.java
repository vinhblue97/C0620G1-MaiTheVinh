package customer;

public class Customer {
    private String name;
    private String birthDay;
    private String address;
    private String imgPath;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Customer(String name, String birthDay, String address, String imgPath){
        this.name=name;
        this.birthDay = birthDay;
        this.address=address;
        this.imgPath=imgPath;
    }
}
