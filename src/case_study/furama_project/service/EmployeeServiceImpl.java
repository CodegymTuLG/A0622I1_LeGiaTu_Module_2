package case_study.furama_project.service;

import case_study.furama_project.models.Employee;
import case_study.furama_project.utils.CheckBirthDay;
import case_study.furama_project.utils.CheckRegex;
import case_study.furama_project.utils.CheckRequire;
import case_study.furama_project.utils.ReadAndWrite;

import java.util.*;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    String filepath = "E:\\Study\\CodegymStudyMaterials\\module_02\\src\\case_study\\furama_project\\data\\employee.csv";
    Scanner scanner = new Scanner(System.in);
    CheckRegex checkRegex = new CheckRegex();
    CheckBirthDay checkBirthDay = new CheckBirthDay();
    List<Employee> listEmployee = new ArrayList<>();
    final String YEAR_REGEX = "[0-9]{4}";
    final String MONTH_REGEX = "(0[1-9]|1[0-2])";
    final String DAY_REGEX = "(0[1-9]|1[0-9]|2[0-9]|3[0-1])";
    final String DAYTIME_REGEX = DAY_REGEX + "/" + MONTH_REGEX + "/" + YEAR_REGEX;
    final String PHONENUMBER_REGEX = "[0-9]{9,13}";

    @Override
    public void add() {
        System.out.println("Hãy input thông tin của Employee");
        System.out.println("Name:");
        String name = CheckRequire.isNotEmptyString("Không được bỏ trống");
        System.out.println("BirthDay (dd/MM/yyyy):");
        String birthDay = "";
        birthDay = checkBirthDay.checkValidate(birthDay, DAYTIME_REGEX, "Hãy nhập lại ngày tháng năm sinh theo định đạng dd/MM/yyyy !");
        System.out.println("Sex:");
        String sex = "";
        boolean sexTrueValue = false;
        while (!sexTrueValue) {
            System.out.println("1.Nam");
            System.out.println("2.Nữ");
            System.out.println("3.Khác");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    sex = "Nam";
                    sexTrueValue = true;
                    break;
                case 2:
                    sex = "Nữ";
                    sexTrueValue = true;
                    break;
                case 3:
                    sex = "khác";
                    sexTrueValue = true;
                    break;
                default:
                    System.out.println("hãy nhập lại đúng các lựa chọn yêu cầu");
            }
        }
        System.out.println("PersonId:");
        String personId = CheckRequire.isNotEmptyString("Không được bỏ trống");
        System.out.println("Phone Number:");
        String phoneNumber = "";
        phoneNumber = checkRegex.checkValidate(phoneNumber, PHONENUMBER_REGEX, "Hãy nhập lại số điện thoại là kiểu số có chiều dài từ 9 đến 13 ký tự!");
        System.out.println("Email:");
        String email = CheckRequire.isNotEmptyString("Không được bỏ trống");
        System.out.println("Academic Level:");
        String academicLevel = "";
        boolean academicLevelTrueValue = false;
        while (!academicLevelTrueValue) {
            System.out.println("1.Trung cấp");
            System.out.println("2.Cao đẳng");
            System.out.println("3.Đại học");
            System.out.println("4.Sau đại học");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    academicLevel = "Trung cấp";
                    System.out.println("Academic Level: Trung cấp");
                    academicLevelTrueValue = true;
                    break;
                case 2:
                    academicLevel = "Cao đẳng";
                    System.out.println("Academic Level: Cao đẳng");
                    academicLevelTrueValue = true;
                    break;
                case 3:
                    academicLevel = "Đại học";
                    System.out.println("Academic Level: Đại học");
                    academicLevelTrueValue = true;
                    break;
                case 4:
                    academicLevel = "Sau đại học";
                    System.out.println("Academic Level: Sau đại học");
                    academicLevelTrueValue = true;
                    break;
                default:
                    System.out.println("hãy nhập lại đúng các lựa chọn yêu cầu");
            }
        }
        System.out.println("Position:");
        String position = "";
        boolean positionLevelTrueValue = false;
        while (!positionLevelTrueValue) {
            System.out.println("1.Lễ tân");
            System.out.println("2.Phục vụ");
            System.out.println("3.Chuyên viên");
            System.out.println("4.Giám sát");
            System.out.println("5.Quản lý");
            System.out.println("6.Giám đốc");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    position = "Lễ tân";
                    positionLevelTrueValue = true;
                    break;
                case 2:
                    position = "Phục vụ";
                    positionLevelTrueValue = true;
                    break;
                case 3:
                    position = "Chuyên viên";
                    positionLevelTrueValue = true;
                    break;
                case 4:
                    position = "Giám sát";
                    positionLevelTrueValue = true;
                    break;
                case 5:
                    position = "Quản lý";
                    positionLevelTrueValue = true;
                    break;
                case 6:
                    position = "Giám đốc";
                    positionLevelTrueValue = true;
                    break;
                default:
                    System.out.println("hãy nhập lại đúng các lựa chọn yêu cầu");
            }
        }
        System.out.println("Salary(Number):");
        int salary = CheckRequire.isNotEmptyInt("Không được bỏ trống");
        Employee newEmployee = new Employee(listEmployee.size() + 1, name, birthDay, sex, personId, phoneNumber, email, academicLevel, position, salary);
        listEmployee.add(newEmployee);
        ReadAndWrite.write(newEmployee.getInfo(), filepath);
        System.out.println("Đã thêm thành công!");
    }

    @Override
    public void edit() {
        loadDataFromFile();
        System.out.println("Enter id do you want to edit");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listEmployee.size(); i++) {
            if (id == listEmployee.get(i).getId()) {
                String name = listEmployee.get(i).getName();
                String birthDay = listEmployee.get(i).getBirthDay();
                String sex = listEmployee.get(i).getSex();
                String personId = listEmployee.get(i).getPersonId();
                String phoneNumber = listEmployee.get(i).getPhoneNumber();
                String email = listEmployee.get(i).getEmail();
                String academicLevel = listEmployee.get(i).getAcademicLevel();
                String position = listEmployee.get(i).getPosition();
                int salary = listEmployee.get(i).getSalary();
                System.out.println("Hãy input thông tin của Employee có ID là " + id);
                boolean editDone = false;
                while (!editDone) {
                    System.out.println("bạn muốn sửa giá trị nào");
                    System.out.println("1. Name");
                    System.out.println("2. BirthDay");
                    System.out.println("3. Sex");
                    System.out.println("4. PersonId");
                    System.out.println("5. Phone Number");
                    System.out.println("6. Email");
                    System.out.println("7. Academic Level");
                    System.out.println("8. Position");
                    System.out.println("9. Salary");
                    System.out.println("10. Hoàn thành quá trình chỉnh sửa");
                    switch (Integer.parseInt(scanner.nextLine())) {
                        case 1:
                            System.out.println("Dữ liệu cũ là: " + listEmployee.get(i).getName());
                            System.out.println("Name:");
                            name = CheckRequire.isNotEmptyString("Không được bỏ trống");
                            continue;
                        case 2:
                            System.out.println("Dữ liệu cũ là: " + listEmployee.get(i).getBirthDay());
                            System.out.println("BirthDay (yyyy/MM/dd):");
                            birthDay = checkBirthDay.checkValidate(birthDay, DAYTIME_REGEX, "Hãy nhập lại ngày tháng năm sinh theo định đạng dd/MM/yyyy !");
                            continue;
                        case 3:
                            System.out.println("Dữ liệu cũ là: " + listEmployee.get(i).getSex());
                            System.out.println("Sex:");
                            boolean sexTrueValue = false;
                            while (!sexTrueValue) {
                                System.out.println("1.Nam");
                                System.out.println("2.Nữ");
                                System.out.println("3.Khác");
                                switch (Integer.parseInt(scanner.nextLine())) {
                                    case 1:
                                        sex = "Nam";
                                        sexTrueValue = true;
                                        break;
                                    case 2:
                                        sex = "Nữ";
                                        sexTrueValue = true;
                                        break;
                                    case 3:
                                        sex = "khác";
                                        sexTrueValue = true;
                                        break;
                                    default:
                                        System.out.println("hãy nhập lại đúng các lựa chọn yêu cầu");
                                }
                            }
                            continue;
                        case 4:
                            System.out.println("Dữ liệu cũ là: " + listEmployee.get(i).getPersonId());
                            System.out.println("PersonId:");
                            personId = CheckRequire.isNotEmptyString("Không được bỏ trống");
                            continue;
                        case 5:
                            System.out.println("Dữ liệu cũ là: " + listEmployee.get(i).getPhoneNumber());
                            System.out.println("Phone Number:");
                            phoneNumber = checkRegex.checkValidate(phoneNumber, PHONENUMBER_REGEX, "Hãy nhập lại số điện thoại là kiểu số có chiều dài từ 9 đến 13 ký tự!");
                            continue;
                        case 6:
                            System.out.println("Dữ liệu cũ là: " + listEmployee.get(i).getEmail());
                            System.out.println("Email:");
                            email = CheckRequire.isNotEmptyString("Không được bỏ trống");
                            continue;
                        case 7:
                            System.out.println("Dữ liệu cũ là: " + listEmployee.get(i).getAcademicLevel());
                            System.out.println("Academic Level:");
                            boolean academicLevelTrueValue = false;
                            while (!academicLevelTrueValue) {
                                System.out.println("1.Trung cấp");
                                System.out.println("2.Cao đẳng");
                                System.out.println("3.Đại học");
                                System.out.println("4.Sau đại học");
                                switch (Integer.parseInt(scanner.nextLine())) {
                                    case 1:
                                        academicLevel = "Trung cấp";
                                        System.out.println("Academic Level: Trung cấp");
                                        academicLevelTrueValue = true;
                                        break;
                                    case 2:
                                        academicLevel = "Cao đẳng";
                                        System.out.println("Academic Level: Cao đẳng");
                                        academicLevelTrueValue = true;
                                        break;
                                    case 3:
                                        academicLevel = "Đại học";
                                        System.out.println("Academic Level: Đại học");
                                        academicLevelTrueValue = true;
                                        break;
                                    case 4:
                                        academicLevel = "Sau đại học";
                                        System.out.println("Academic Level: Sau đại học");
                                        academicLevelTrueValue = true;
                                        break;
                                    default:
                                        System.out.println("hãy nhập lại đúng các lựa chọn yêu cầu");
                                }
                            }
                            continue;
                        case 8:
                            System.out.println("Dữ liệu cũ là: " + listEmployee.get(i).getPosition());
                            System.out.println("Position:");
                            boolean positionLevelTrueValue = false;
                            while (!positionLevelTrueValue) {
                                System.out.println("1.Lễ tân");
                                System.out.println("2.Phục vụ");
                                System.out.println("3.Chuyên viên");
                                System.out.println("4.Giám sát");
                                System.out.println("5.Quản lý");
                                System.out.println("6.Giám đốc");
                                switch (Integer.parseInt(scanner.nextLine())) {
                                    case 1:
                                        position = "Lễ tân";
                                        positionLevelTrueValue = true;
                                        break;
                                    case 2:
                                        position = "Phục vụ";
                                        positionLevelTrueValue = true;
                                        break;
                                    case 3:
                                        position = "Chuyên viên";
                                        positionLevelTrueValue = true;
                                        break;
                                    case 4:
                                        position = "Giám sát";
                                        positionLevelTrueValue = true;
                                        break;
                                    case 5:
                                        position = "Quản lý";
                                        positionLevelTrueValue = true;
                                        break;
                                    case 6:
                                        position = "Giám đốc";
                                        positionLevelTrueValue = true;
                                        break;
                                    default:
                                        System.out.println("hãy nhập lại đúng các lựa chọn yêu cầu");
                                }
                            }
                            continue;
                        case 9:
                            System.out.println("Dữ liệu cũ là: " + listEmployee.get(i).getSalary());
                            System.out.println("Salary:");
                            salary = CheckRequire.isNotEmptyInt("Không được bỏ trống");
                            continue;
                        case 10:
                            listEmployee.set(i, new Employee(id, name, birthDay, sex, personId, phoneNumber, email, academicLevel, position, salary));
                            ReadAndWrite.resetFile(filepath);
                            for (Employee employee : listEmployee) {
                                ReadAndWrite.writeNew(employee.getInfo(), filepath);
                            }
                            editDone = true;
                            break;
                        default:
                            System.out.println("Hãy nhập đúng yêu cầu");
                            break;
                    }
                }
            } else {
                System.out.println("ID đã nhập không tồn tại! Trở lại main menu");
            }
        }
    }

    @Override
    public void delete() {
        loadDataFromFile();
        System.out.println("Enter id do you want to delete");
        Scanner inputEdit = new Scanner(System.in);
        int id = Integer.parseInt(inputEdit.nextLine());
        int index = 0;
        boolean deleteAble = false;
        for (int i = 0; i < listEmployee.size(); i++) {
            if (id == listEmployee.get(i).getId()) {
                index = i;
                deleteAble = true;
                break;
            }
        }
        if (!deleteAble) {
            System.out.println("Không tim thấy Id cần xóa");
        } else {
            boolean deleteTrue = true;
            while (deleteTrue) {
                System.out.println("Thông tin mà bạn sẽ xóa đối tượng bên dưới");
                System.out.println(listEmployee.get(index).getInfo());
                System.out.println("Bạn có thực sự muốn xóa. Hãy nhập lựa chọn bằng số!");
                System.out.println("1. Có");
                System.out.println("2. Không");
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1:
                        listEmployee.remove(listEmployee.get(index));
                        ReadAndWrite.resetFile(filepath);
                        for (Employee employee : listEmployee) {
                            ReadAndWrite.writeNew(employee.getInfo(), filepath);
                        }
                        System.out.println("Đã thực hiện xóa thành công");
                        deleteTrue = false;
                        break;
                    case 2:
                        System.out.println("Bạn đã không thực hiện xóa");
                        deleteTrue = false;
                        break;
                    default:
                        System.out.println("hãy nhập lựa chọn bằng số như yêu cầu");
                }
            }
        }
    }

    @Override
    public void show() {
        loadDataFromFile();
        for (Employee employee : listEmployee) {
            System.out.println(employee);
        }
    }

    public void loadDataFromFile() {
        List<String[]> list = ReadAndWrite.read(filepath);
        listEmployee.clear();
        for (String[] item : list) {
            Employee employee = new Employee(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4], item[5], item[6], item[7], item[8], Integer.parseInt(item[9]));
            listEmployee.add(employee);
        }
    }

}
