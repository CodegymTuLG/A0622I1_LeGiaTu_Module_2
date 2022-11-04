package case_study.furama_project.models;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String serviceName, String usableArea, int price, int maxQuantity, String rentType, String freeService) {
        super();
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }

    public String getInfo() {
        return getServiceName()+
                "," + getUsableArea() +
                "," + getPrice() +
                "," + getMaxQuantity() +
                "," + getRentType() +
                "," + freeService;
    }
}
