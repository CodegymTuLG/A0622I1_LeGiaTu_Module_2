package case_study.furama_project.models;

public class Customer extends Person {
    String customerType;
    String address;

    public Customer() {

    }

    public Customer(String customerType, String address) {
        super();
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, String birthDay, String sex, long personId, long phoneNumber, String email, String customerType, String address) {
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
}
