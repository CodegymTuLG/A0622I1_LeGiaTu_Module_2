package case_study.furama_project.models;

public abstract class Facility {
    private String serviceName;
    private int usableArea;
    private String price;
    private int maxQuantity;
    private String[] rentType = {"year", "month", "day", "hour"};

    public Facility() {
    }

    public Facility(String serviceName, int usableArea, String price) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.price = price;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public String[] getRentType() {
        return rentType;
    }

    public void setRentType(String[] rentType) {
        this.rentType = rentType;
    }
}
