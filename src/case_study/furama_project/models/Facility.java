package case_study.furama_project.models;

public abstract class Facility {
    private String serviceName;
    private String usableArea;
    private String price;
    private String maxQuantity;
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceName, String usableArea, String price, String maxQuantity, String rentType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.price = price;
        this.maxQuantity = maxQuantity;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(String maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "serviceName='" + serviceName + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", price='" + price + '\'' +
                ", maxQuantity='" + maxQuantity + '\'' +
                ", rentType=' , " + rentType;
    }

}
