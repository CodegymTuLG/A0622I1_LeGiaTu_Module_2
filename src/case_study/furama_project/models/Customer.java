package case_study.furama_project.models;

public class Customer extends Person {
    String customerType;
    String address;

    public Customer() {

    }

    public Customer(int id, String name, String birthDay, String sex, String personId, String phoneNumber, String email, String customerType, String address) {
        super();
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", sex='" + sex + '\'' +
                ", personId='" + personId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                "customerType='" + customerType + '\'' +
                ", address='" + address +
                '}';
    }

    public String getInfo() {
        return id +
                "," + name +
                "," + birthDay +
                "," + sex +
                "," + personId +
                "," + phoneNumber +
                "," + email +
                "," + customerType +
                "," + address;
    }
}
