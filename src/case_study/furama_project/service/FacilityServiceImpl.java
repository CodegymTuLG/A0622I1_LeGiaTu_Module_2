package case_study.furama_project.service;

import case_study.furama_project.models.*;

import java.util.*;

public class FacilityServiceImpl extends Facility implements FacilityService {
    static final Map<Facility, Integer> listFacility = new LinkedHashMap<Facility, Integer>();
    static final List<Villa> listVilla = new ArrayList<>();
    static final List<House> listHouse = new ArrayList<>();
    static final List<Room> listRoom = new ArrayList<>();

    static final String[] RENTTYPE = {"year", "month", "day", "hour"};

    public static boolean checkRentType(String input) {
        for (int i = 0; i < RENTTYPE.length - 1; i++) {
            if (input.equals(RENTTYPE[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add() {

    }

    @Override
    public void addNewHouse() {
        Scanner inputHouseInfo = new Scanner(System.in);
        System.out.println("Hãy nhập tên dịch vụ");
        String inputServiceName = inputHouseInfo.nextLine();
        System.out.println("Hãy nhập diện tích sử dụng");
        String inputUsableArea = inputHouseInfo.nextLine();
        System.out.println("Hãy nhập chi phí thuê");
        String inputPrice = inputHouseInfo.nextLine();
        System.out.println("Hãy nhập số lượng người tối đa");
        String inputMaxQuantity = inputHouseInfo.nextLine();
        System.out.println("Hãy nhập kiểu thuê");
        String inputRentType = inputHouseInfo.nextLine();
        while (!FacilityServiceImpl.checkRentType(inputRentType)) {
            inputRentType = inputHouseInfo.nextLine();
            System.out.println("Please try again!");
        }
        System.out.println("Hãy nhập tiêu chuẩn phòng");
        String inputRoomStandard = inputHouseInfo.nextLine();
        System.out.println("Hãy nhập số tầng");
        int inputFloorNumber = inputHouseInfo.nextInt();
        House house = new House(inputServiceName, inputUsableArea, inputPrice, inputMaxQuantity, inputRentType, inputRoomStandard, inputFloorNumber);
        listHouse.add(house);
    }

    @Override
    public void addNewVilla() {
        Scanner inputVillaInfo = new Scanner(System.in);
        System.out.println("Hãy nhập tên dịch vụ");
        String inputServiceName = inputVillaInfo.nextLine();
        System.out.println("Hãy nhập diện tích sử dụng");
        String inputUsableArea = inputVillaInfo.nextLine();
        System.out.println("Hãy nhập chi phí thuê");
        String inputPrice = inputVillaInfo.nextLine();
        System.out.println("Hãy nhập số lượng người tối đa");
        String inputMaxQuantity = inputVillaInfo.nextLine();
        System.out.println("Hãy nhập kiểu thuê");
        String inputRentType = inputVillaInfo.nextLine();
        while (!FacilityServiceImpl.checkRentType(inputRentType)) {
            inputRentType = inputVillaInfo.nextLine();
            System.out.println("Please try again!");
        }
        System.out.println("Hãy nhập tiêu chuẩn phòng");
        String inputRoomStandard = inputVillaInfo.nextLine();
        System.out.println("Hãy nhập diện tích hồ bơi");
        String inputPoolArea = inputVillaInfo.nextLine();
        System.out.println("Hãy nhập số tầng");
        int inputFloorNumber = inputVillaInfo.nextInt();
        Villa villa = new Villa(inputServiceName, inputUsableArea, inputPrice, inputMaxQuantity, inputRentType, inputRoomStandard, inputPoolArea, inputFloorNumber);
        listVilla.add(villa);
    }

    @Override
    public void addNewRoom() {
        Scanner inputRoomInfo = new Scanner(System.in);
        System.out.println("Hãy nhập tên dịch vụ");
        String inputServiceName = inputRoomInfo.nextLine();
        System.out.println("Hãy nhập diện tích sử dụng");
        String inputUsableArea = inputRoomInfo.nextLine();
        System.out.println("Hãy nhập chi phí thuê");
        String inputPrice = inputRoomInfo.nextLine();
        System.out.println("Hãy nhập số lượng người tối đa");
        String inputMaxQuantity = inputRoomInfo.nextLine();
        System.out.println("Hãy nhập kiểu thuê");
        String inputRentType = inputRoomInfo.nextLine();
        while (!FacilityServiceImpl.checkRentType(inputRentType)) {
            inputRentType = inputRoomInfo.nextLine();
            System.out.println("Please try again!");
        }
        System.out.println("Hãy nhập tiêu chuẩn phòng");
        String inputFreeService = inputRoomInfo.nextLine();

        Room room = new Room(inputServiceName, inputUsableArea, inputPrice, inputMaxQuantity, inputRentType, inputFreeService);
        listRoom.add(room);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void show() {
        Set<Facility> facilitys = listFacility.keySet();
        for (Facility facility : facilitys) {
            System.out.println("Facility: " + facility + " | Số lần: " + listFacility.get(facility));
        }
    }
}
