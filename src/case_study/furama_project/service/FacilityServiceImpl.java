package case_study.furama_project.service;

import case_study.furama_project.controllers.FuramaController;
import case_study.furama_project.models.*;
import case_study.furama_project.utils.CheckRegex;
import case_study.furama_project.utils.CheckRequire;
import case_study.furama_project.utils.ReadAndWrite;

import java.util.*;


public class FacilityServiceImpl extends Facility implements FacilityService {
    String filepathVilla = "E:\\Study\\CodegymStudyMaterials\\module_02\\src\\case_study\\furama_project\\data\\villa.csv";
    String filepathHouse = "E:\\Study\\CodegymStudyMaterials\\module_02\\src\\case_study\\furama_project\\data\\house.csv";
    String filepathRoom = "E:\\Study\\CodegymStudyMaterials\\module_02\\src\\case_study\\furama_project\\data\\room.csv";
    static final Map<Facility, Integer> listFacility = new LinkedHashMap<Facility, Integer>();
    Scanner scanner = new Scanner(System.in);
    CheckRegex checkRegex = new CheckRegex();
    CheckRequire checkRequire = new CheckRequire();
    List<Villa> listVilla = new ArrayList<>();
    List<House> listHouse = new ArrayList<>();
    List<Room> listRoom = new ArrayList<>();
    final String VILLASERVICECODE_REGEX = "(SVVL)[-]\\d{4}$";
    final String HOUSESERVICECODE_REGEX = "(SVHO)[-]\\d{4}$";
    final String ROOMSERVICECODE_REGEX = "(SVRO)[-]\\d{4}$";
    final String SERVICENAME_REGEX = "[A-Z][a-z]{2,}$";
    final String FLOOR_REGEX = "[0-9]+$";
    final String RENTTYPE_REGEX = "Year|Month|Day|Hour$";
    final String STANDARD_REGEX = "[A-Z][a-z]{2,}$";
    final String AREA_REGEX = "([3-9][0-9])|([1-9]\\d{3}\\d*)";

    @Override
    public void add() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Hãy nhập mã dịch vụ");
        String serviceCode = "";
        serviceCode = checkRegex.checkValidate(serviceCode, VILLASERVICECODE_REGEX, "Hãy nhập lại theo định dạng SVVL-{4 số} !");
        System.out.println("Hãy nhập tên dịch vụ");
        String serviceName = "";
        serviceName = checkRegex.checkValidate(serviceName, SERVICENAME_REGEX, "Hãy nhập tên dịch vụ với chữ cái đầu viết hoa!");
        System.out.println("Hãy nhập diện tích sử dụng (đơn vị mét vuông)");
        String usableArea = "";
        usableArea = checkRegex.checkValidate(usableArea, AREA_REGEX, "Hãy nhập diện tích là số và lớn hơn 30 !");
        System.out.println("Hãy nhập chi phí thuê (hãy nhập kiểu số nguyên)");
        int price = 0;
        price = checkRequire.isNotEmptyInt("Không được bỏ trống");
        System.out.println("Hãy nhập số lượng người tối đa (hãy nhập kiểu số nguyên)");
        int maxQuantity = 0;
        maxQuantity = checkRequire.isNotEmptyInt("Không được bỏ trống");
        System.out.println("Hãy nhập kiểu thuê");
        String rentType = "";
        rentType = checkRegex.checkValidate(rentType, RENTTYPE_REGEX, "Hãy nhập bằng chữ như 1 trong 4 lựa chọn sau Year, Month, Day, Hour(chữ cái đầu viết hoa)");
        System.out.println("Hãy nhập tiêu chuẩn phòng");
        String roomStandard = "";
        roomStandard = checkRegex.checkValidate(roomStandard, STANDARD_REGEX, "Hãy nhập với chữ cái đầu viết hoa");
        System.out.println("Hãy nhập diện tích hồ bơi (đơn vị mét vuông)");
        String poolArea  = "";
        usableArea = checkRegex.checkValidate(usableArea, AREA_REGEX, "Hãy nhập diện tích là số và lớn hơn 30 !");
        String floorNumber = "";
        floorNumber =  checkRegex.checkValidate(serviceName, FLOOR_REGEX, "Hãy nhập số nguyên!");
        Villa villa = new Villa(serviceName, usableArea, price, maxQuantity, rentType, roomStandard, poolArea, floorNumber);
        listFacility.put(villa, 0);
        System.out.println("Đã thêm villa thành công!");
        listVilla.add(villa);
        ReadAndWrite.write(villa.getInfo(), filepathVilla);
    }

    @Override
    public void addNewHouse() {
        System.out.println("Hãy nhập mã dịch vụ");
        String serviceCode = "";
        serviceCode = checkRegex.checkValidate(serviceCode, HOUSESERVICECODE_REGEX, "Hãy nhập lại theo định dạng SVHO-{4 số} !");
        System.out.println("Hãy nhập tên dịch vụ");
        String serviceName = "";
        serviceName = checkRegex.checkValidate(serviceName, SERVICENAME_REGEX, "Hãy nhập tên dịch vụ với chữ cái đầu viết hoa!");
        System.out.println("Hãy nhập diện tích sử dụng (đơn vị mét vuông)");
        String usableArea = "";
        usableArea = checkRegex.checkValidate(usableArea, AREA_REGEX, "Hãy nhập diện tích là số và lớn hơn 30 !");
        System.out.println("Hãy nhập chi phí thuê (hãy nhập kiểu số nguyên)");
        int price  = 0;
        price = checkRequire.isNotEmptyInt("Không được bỏ trống");
        System.out.println("Hãy nhập số lượng người tối đa (hãy nhập kiểu số nguyên)");
        int maxQuantity = 0;
        maxQuantity = checkRequire.isNotEmptyInt("Không được bỏ trống");
        System.out.println("Hãy nhập kiểu thuê (Year, Month, Day, Hour)");
        String rentType = "";
        rentType = checkRegex.checkValidate(rentType, RENTTYPE_REGEX, "Hãy nhập bằng chữ như 1 trong 4 lựa chọn sau Year, Month, Day, Hour(chữ cái đầu viết hoa)");
        System.out.println("Hãy nhập tiêu chuẩn phòng");
        String roomStandard = "";
        roomStandard = checkRegex.checkValidate(roomStandard, STANDARD_REGEX, "Hãy nhập với chữ cái đầu viết hoa");
        System.out.println("Hãy nhập số tầng");
        String floorNumber = "";
        floorNumber =  checkRegex.checkValidate(floorNumber, FLOOR_REGEX, "Hãy nhập số nguyên!");
        House house = new House(serviceName, usableArea, price, maxQuantity, rentType, roomStandard,  floorNumber);
        listFacility.put(house, 0);
        System.out.println("Đã thêm house thành công!");
        listHouse.add(house);
        ReadAndWrite.write(house.getInfo(), filepathHouse);
    }

    @Override
    public void addNewRoom() {
        System.out.println("Hãy nhập mã dịch vụ");
        String serviceCode = "";
        serviceCode = checkRegex.checkValidate(serviceCode, ROOMSERVICECODE_REGEX, "Hãy nhập lại theo định dạng SVRO-{4 số} !");
        System.out.println("Hãy nhập tên dịch vụ");
        String serviceName = "";
        serviceName = checkRegex.checkValidate(serviceName, SERVICENAME_REGEX, "Hãy nhập tên dịch vụ với chữ cái đầu viết hoa!");
        System.out.println("Hãy nhập diện tích sử dụng (đơn vị mét vuông)");
        String usableArea = "";
        usableArea = checkRegex.checkValidate(usableArea, AREA_REGEX, "Hãy nhập diện tích là số và lớn hơn 30 !");
        System.out.println("Hãy nhập chi phí thuê (hãy nhập kiểu số nguyên)");
        int price  = 0;
        price = checkRequire.isNotEmptyInt("Không được bỏ trống");
        System.out.println("Hãy nhập số lượng người tối đa (hãy nhập kiểu số nguyên)");
        int maxQuantity = 0;
        maxQuantity = checkRequire.isNotEmptyInt("Không được bỏ trống");
        System.out.println("Hãy nhập kiểu thuê (Year, Month, Day, Hour)");
        String rentType = "";
        System.out.println("Hãy nhập dịch vụ miễn phí đi kèm");
        String freeService = scanner.nextLine();
        Room room = new Room(serviceName, usableArea, price, maxQuantity, rentType, freeService);
        listFacility.put(room, 0);
        System.out.println("Đã thêm room thành công!");
        listRoom.add(room);
        ReadAndWrite.write(room.getInfo(), filepathRoom);
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
