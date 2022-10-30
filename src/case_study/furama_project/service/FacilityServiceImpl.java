package case_study.furama_project.service;

import case_study.furama_project.controllers.FuramaController;
import case_study.furama_project.models.*;
import case_study.furama_project.utils.CheckRegex;

import java.util.*;


public class FacilityServiceImpl extends Facility implements FacilityService {
    static final Map<Facility, Integer> listFacility = new LinkedHashMap<Facility, Integer>();
    CheckRegex checkRegex = new CheckRegex();
    Scanner scanner = new Scanner(System.in);
    static final String[] RENTTYPE = {"year", "month", "day", "hour"};
    final String VILLASERVICECODE_REGEX = "(SVVL)[-]\\d{4}$";
    final String HOUSESERVICECODE_REGEX = "(SVHO)[-]\\d{4}$";
    final String ROOMSERVICECODE_REGEX = "(SVRO)[-]\\d{4}$";
    final String SERVICENAME_REGEX = "[A-Z][a-z]{2,}$";
    final String FLOOR_REGEX = "[0-9]+$";
    final String RENTTYPE_REGEX = "Year|Month|Day|Hour$";
    final String STANDARD_REGEX = "[A-Z][a-z]{2,}$";

    public static boolean checkRentType(String input) {
        for (int i = 0; i < RENTTYPE.length - 1; i++) {
            if (input.equals(RENTTYPE[i])) {
                return true;
            }
        }
        return false;
    }

    public static void backMenu(String input) {
        if (input.equals("back") | input.equals("cancel") | input.equals("thoát")) {
            FuramaController.displayFacilityMenu();
        }
    }


    @Override
    public void add() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Hãy nhập mã dịch vụ");
        String serviceCode = "";
        backMenu(checkRegex.checkValidate(serviceCode, VILLASERVICECODE_REGEX, "Hãy nhập lại!"));
        System.out.println("Hãy nhập tên dịch vụ");
        String serviceName = "";
        backMenu(checkRegex.checkValidate(serviceName, SERVICENAME_REGEX, "Hãy nhập lại!"));
        System.out.println("Hãy nhập diện tích sử dụng");
        String usableArea = scanner.nextLine();
        System.out.println("Hãy nhập chi phí thuê");
        String price = scanner.nextLine();
        System.out.println("Hãy nhập số lượng người tối đa");
        String maxQuantity = scanner.nextLine();
        System.out.println("Hãy nhập kiểu thuê");
        String rentType = "";
        backMenu(checkRegex.checkValidate(rentType, RENTTYPE_REGEX, "Hãy nhập lại!"));
        System.out.println("Hãy nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        System.out.println("Hãy nhập diện tích hồ bơi");
        String poolArea = scanner.nextLine();
        System.out.println("Hãy nhập số tầng");
        String floorNumber = "";
        backMenu(checkRegex.checkValidate(serviceName, FLOOR_REGEX, "Hãy nhập lại!"));
        Villa villa = new Villa(serviceName, usableArea, price, maxQuantity, rentType, roomStandard, poolArea, floorNumber);
        listFacility.put(villa, 0);
        System.out.println("Đã thêm villa thành công!");
    }

    @Override
    public void addNewHouse() {

        System.out.println("Hãy nhập mã dịch vụ");
        String serviceCode = "";
        backMenu(checkRegex.checkValidate(serviceCode, HOUSESERVICECODE_REGEX, "Hãy nhập lại!"));
        System.out.println("Hãy nhập tên dịch vụ");
        String serviceName = "";
        backMenu(checkRegex.checkValidate(serviceName, SERVICENAME_REGEX, "Hãy nhập lại!"));
        System.out.println("Hãy nhập diện tích sử dụng");
        String usableArea = scanner.nextLine();
        System.out.println("Hãy nhập chi phí thuê");
        String price = scanner.nextLine();
        System.out.println("Hãy nhập số lượng người tối đa");
        String maxQuantity = scanner.nextLine();
        System.out.println("Hãy nhập kiểu thuê");
        String rentType = scanner.nextLine();
        backMenu(checkRegex.checkValidate(rentType, RENTTYPE_REGEX, "Hãy nhập lại!"));
        System.out.println("Hãy nhập tiêu chuẩn phòng");
        String roomStandard = "";
        backMenu(checkRegex.checkValidate(roomStandard, STANDARD_REGEX, "Hãy nhập lại!"));
        System.out.println("Hãy nhập số tầng");
        String floorNumber = scanner.nextLine();
        backMenu(checkRegex.checkValidate(serviceName, FLOOR_REGEX, "Hãy nhập lại!"));
        House house = new House(serviceName, usableArea, price, maxQuantity, rentType, roomStandard, floorNumber);
        listFacility.put(house, 0);
        System.out.println("Đã thêm house thành công!");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Hãy nhập mã dịch vụ");
        String serviceCode = "";
        backMenu(checkRegex.checkValidate(serviceCode, ROOMSERVICECODE_REGEX, "Hãy nhập lại!"));
        System.out.println("Hãy nhập tên dịch vụ");
        String serviceName = "";
        backMenu(checkRegex.checkValidate(serviceName, SERVICENAME_REGEX, "Hãy nhập lại!"));
        System.out.println("Hãy nhập diện tích sử dụng");
        String usableArea = scanner.nextLine();
        System.out.println("Hãy nhập chi phí thuê");
        String price = scanner.nextLine();
        System.out.println("Hãy nhập số lượng người tối đa");
        String maxQuantity = scanner.nextLine();
        System.out.println("Hãy nhập kiểu thuê");
        String rentType = "";
        backMenu(checkRegex.checkValidate(rentType, RENTTYPE_REGEX, "Hãy nhập lại!"));
        System.out.println("Hãy nhập dịch vụ miễn phí đi kèm");
        String freeService = scanner.nextLine();
        Room room = new Room(serviceName, usableArea, price, maxQuantity, rentType, freeService);
        listFacility.put(room, 0);
        System.out.println("Đã thêm room thành công!");
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
            System.out.println("Facility: " + facility.toString() + " | Số lần: " + listFacility.get(facility));
        }
    }
}
