package case_study.furama_project.models;

public class Customer extends Person {
    String[] customerType = {"Diamond", "Platinium", "Gold", "Silver", "Member"};

    public Customer() {

    }

    public Customer(String[] customerType) {
        super();
        this.customerType = customerType;
    }

    public String[] getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String[] customerType) {
        this.customerType = customerType;
    }
}
