package case_study.furama_project.models;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String floorNumber;

    public Villa() {

    }

    public Villa(String serviceName, String usableArea, String price, String maxQuantity, String rentType, String roomStandard, String poolArea, String floorNumber) {
        super(serviceName, usableArea, price, maxQuantity, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", floorNumber=" + floorNumber +
                '}';
    }
}
