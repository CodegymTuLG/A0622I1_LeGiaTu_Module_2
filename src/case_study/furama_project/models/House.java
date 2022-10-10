package case_study.furama_project.models;

public class House extends Facility {
    private String roomStandard;
    private int floorNumber;

    public House() {

    }

    public House(String roomStandard, int poolArea, int floorNumber) {
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

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
