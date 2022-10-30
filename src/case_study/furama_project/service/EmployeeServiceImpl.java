package case_study.furama_project.service;

import case_study.furama_project.controllers.FuramaController;
import case_study.furama_project.models.Employee;
import case_study.furama_project.utils.CheckBirthDay;
import case_study.furama_project.utils.CheckRegex;
import case_study.furama_project.utils.ReadAndWrite;

import java.io.IOException;
import java.util.*;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    CheckRegex checkRegex = new CheckRegex();
    CheckBirthDay checkBirthDay = new CheckBirthDay();
    static List<Employee> listEmployee = new ArrayList<>();
    final String SEX_REGEX = "Nam|Nữ";
    final String ACADEMICLEVEL_REGEX = "Trung cấp|Cao đẳng|Đại học|Sau đại học";
    final String POSITION_REGEX = "Lễ tân|Phục vụ|Chuyên viên|Giám sát|Quản lý|Giám đốc";
    final String YEAR_REGEX = "[0-9]{4}";
    final String MONTH_REGEX = "(0[1-9]|1[0-2])";
    final String DAY_REGEX = "(0[1-9]|1[0-9]|2[0-9]|3[0-1])";
    final String DAYTIME_REGEX = DAY_REGEX + "/" + MONTH_REGEX + "/" + YEAR_REGEX;
    final String PHONENUMBER_REGEX = "[0-9]{9,13}";
    @Override
    public void add()  {
        System.out.println("Hãy input thông tin của Employee");
        System.out.println("ID:");
        String id = scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("BirthDay (dd/mm/yyyy):");
        String birthDay = "";
        birthDay = checkBirthDay.checkValidate(birthDay, DAYTIME_REGEX, "Hãy nhập lại!");
        System.out.println("Sex:");
        String sex = "";
        sex = checkRegex.checkValidate(sex, SEX_REGEX, "Hãy nhập lại!");
        System.out.println("PersonId:");
        String personId = scanner.nextLine();
        System.out.println("Phone Number:");
        String phoneNumber = "";
        phoneNumber = checkRegex.checkValidate(phoneNumber, PHONENUMBER_REGEX, "Hãy nhập lại!");
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("Academic Level:");
        String academicLevel = "";
        academicLevel = checkRegex.checkValidate(academicLevel, ACADEMICLEVEL_REGEX, "Hãy nhập lại!");
        System.out.println("Position:");
        String position = "";
        position = checkRegex.checkValidate(position, POSITION_REGEX, "Hãy nhập lại!");
        System.out.println("Input Salary:");
        String salary = scanner.nextLine();
        Employee newEmployee = new Employee(id, name, birthDay, sex, personId, phoneNumber, email, academicLevel, position, salary);
        listEmployee.add(newEmployee);
        ReadAndWrite.write(listEmployee, "E:\\Study\\CodegymStudyMaterials\\module_02\\src\\case_study\\furama_project\\data");
    }

    @Override
    public void edit() {
        System.out.println("Enter id do you want to edit");
        String id = scanner.nextLine();
        for (int i = 0; i < listEmployee.size(); i++) {
            if (id.equals(listEmployee.get(i).getId())) {
                System.out.println("Hãy input thông tin của Employee có ID là " + id);
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("BirthDay (yyyy/mm/dd):");
                String birthDay = "";
                birthDay = checkBirthDay.checkValidate(birthDay, DAYTIME_REGEX, "Hãy nhập lại!");
                System.out.println("Sex:");
                String sex = "";
                sex = checkRegex.checkValidate(sex, SEX_REGEX, "Hãy nhập lại!");
                System.out.println("PersonId:");
                String personId = scanner.nextLine();
                System.out.println("Phone Number:");
                String phoneNumber = "";
                phoneNumber = checkRegex.checkValidate(phoneNumber, PHONENUMBER_REGEX, "Hãy nhập lại!");
                System.out.println("Email:");
                String email = scanner.nextLine();
                System.out.println("Academic Level:");
                String academicLevel = "";
                academicLevel =checkRegex.checkValidate(academicLevel, ACADEMICLEVEL_REGEX, "Hãy nhập lại!");
                System.out.println("Position:");
                String position = "";
                position = checkRegex.checkValidate(position, POSITION_REGEX, "Hãy nhập lại!");
                System.out.println("Input Salary:");
                String inputSalary = scanner.nextLine();
                listEmployee.set(i, new Employee(id, name, birthDay, sex, personId, phoneNumber, email, academicLevel, position, inputSalary));
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter id do you want to delete");
        Scanner inputEdit = new Scanner(System.in);
        String id = inputEdit.nextLine();
        boolean isDelete = false;
        for (Employee ls : listEmployee) {
            if (id.equals(ls.getId())) {
                listEmployee.remove(ls);
                isDelete = true;
                break;
            }
            isDelete = false;
        }
        if (!isDelete) {
            System.out.println("Không tim thấy Id cần xóa");
        } else {
            System.out.println("Đã xóa thành công!");
        }
    }

    @Override
    public void show() {
        listEmployee = ReadAndWrite.read("E:\\Study\\CodegymStudyMaterials\\module_02\\src\\case_study\\furama_project\\data\\employee.csv");
        for (Employee ls : listEmployee) {
            System.out.println(ls);
        }
    }

}
