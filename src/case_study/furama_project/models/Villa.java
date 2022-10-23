package case_study.furama_project.models;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private int floorNumber;

    public Villa() {

    }

    public Villa(String serviceName, String usableArea, String price, String maxQuantity, String rentType, String roomStandard, String poolArea, int floorNumber) {
        super();
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

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
