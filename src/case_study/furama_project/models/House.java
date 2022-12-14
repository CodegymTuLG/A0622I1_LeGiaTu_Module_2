package case_study.furama_project.models;

public class House extends Facility {
    private String roomStandard;
    private String floorNumber;

    public House() {

    }

    public House(String serviceName, String usableArea, int price, int maxQuantity, String rentType, String roomStandard, String floorNumber) {
        super();
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\''+
                ", floorNumber=" + floorNumber +
                '}';
    }

    public String getInfo() {
        return getServiceName()+
                "," + getUsableArea() +
                "," + getPrice() +
                "," + getMaxQuantity() +
                "," + getRentType() +
                "," + roomStandard +
                "," + floorNumber;
    }
}
