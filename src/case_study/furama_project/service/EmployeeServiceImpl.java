package case_study.furama_project.service;

import case_study.furama_project.models.Employee;

import java.util.*;

public class EmployeeServiceImpl extends Employee implements EmployeeService {

    static final List<Employee> listEmployee = new ArrayList<>();
    final static String[] SEX = {"Nam", "Nữ"};
    final static String[] ACADEMICLEVEL = {"Trung cấp", "Cao đẳng", "Đại học", "sau đại học"};
    final static String[] POSITION = {"lễ tân", "phục vụ", "chuyên viên", "giám sát", "quản lý", "giám đốc"};

    public static boolean checkSex(String input) {
        for (int i = 0; i < SEX.length - 1; i++) {
            if (input.equals(SEX[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean CheckAcademicLevel(String input) {
        for (int i = 0; i < ACADEMICLEVEL.length - 1; i++) {
            if (input.equals(ACADEMICLEVEL[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean CheckPosition(String input) {
        for (int i = 0; i < POSITION.length - 1; i++) {
            if (input.equals(POSITION[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add() {
        Scanner inputNewEmployee = new Scanner(System.in);
        System.out.println("Hãy input thông tin của Employee");
        System.out.println("ID:");
        String inputId = inputNewEmployee.nextLine();
        System.out.println("Name:");
        String inputName = inputNewEmployee.nextLine();
        System.out.println("BirthDay (yyyy/mm/dd):");
        String inputBirthDay = inputNewEmployee.nextLine();
        System.out.println("Sex (Nam/Nữ):");
        String inputSex = inputNewEmployee.nextLine();
        while (!EmployeeServiceImpl.checkSex(inputSex)) {
            inputSex = inputNewEmployee.nextLine();
            System.out.println("Please try again!");
        }
        System.out.println("PersonId:");
        long inputPersonId = inputNewEmployee.nextLong();
        System.out.println("Phone Number:");
        long inputPhoneNumber = inputNewEmployee.nextLong();
        System.out.println("Email:");
        String inputEmail = inputNewEmployee.nextLine();
        System.out.println("Academic Level:");
        String inputAcademicLevel = inputNewEmployee.nextLine();
        while (!EmployeeServiceImpl.CheckAcademicLevel(inputAcademicLevel)) {
            inputAcademicLevel = inputNewEmployee.nextLine();
            System.out.println("Please try again!");
        }
        System.out.println("Position:");
        String inputPosition = inputNewEmployee.nextLine();
        while (!EmployeeServiceImpl.CheckPosition(inputPosition)) {
            inputPosition = inputNewEmployee.nextLine();
            System.out.println("Please try again!");
        }
        System.out.println("Input Salary:");
        String inputSalary = inputNewEmployee.nextLine();
        Employee newEmployee = new Employee(inputId, inputName, inputBirthDay, inputSex, inputPersonId, inputPhoneNumber, inputEmail, inputAcademicLevel, inputPosition, inputSalary);
        listEmployee.add(newEmployee);
    }

    @Override
    public void edit() {
        System.out.println("Enter id do you want to edit");
        Scanner inputEdit = new Scanner(System.in);
        String id = inputEdit.nextLine();
        for (int i = 0; i < listEmployee.size(); i++) {
            if (id == listEmployee.get(i).getId()) {
                System.out.println("Hãy input thông tin của Employee có ID là " + id);
                System.out.println("Name:");
                String inputName = inputEdit.nextLine();
                System.out.println("BirthDay (yyyy/mm/dd):");
                String inputBirthDay = inputEdit.nextLine();
                System.out.println("Sex (Nam/Nữ):");
                String inputSex = inputEdit.nextLine();
                while (!EmployeeServiceImpl.checkSex(inputSex)) {
                    inputSex = inputEdit.nextLine();
                    System.out.println("Please try again!");
                }
                System.out.println("PersonId:");
                long inputPersonId = inputEdit.nextLong();
                System.out.println("Phone Number:");
                long inputPhoneNumber = inputEdit.nextLong();
                System.out.println("Email:");
                String inputEmail = inputEdit.nextLine();
                System.out.println("Academic Level:");
                String inputAcademicLevel = inputEdit.nextLine();
                while (!EmployeeServiceImpl.CheckAcademicLevel(inputAcademicLevel)) {
                    inputAcademicLevel = inputEdit.nextLine();
                    System.out.println("Please try again!");
                }
                System.out.println("Position:");
                String inputPosition = inputEdit.nextLine();
                while (!EmployeeServiceImpl.CheckPosition(inputPosition)) {
                    inputPosition = inputEdit.nextLine();
                    System.out.println("Please try again!");
                }
                System.out.println("Input Salary:");
                String inputSalary = inputEdit.nextLine();
                listEmployee.set(i, new Employee(id, inputName, inputBirthDay, inputSex, inputPersonId, inputPhoneNumber, inputEmail, inputAcademicLevel, inputPosition, inputSalary));
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter id do you want to delete");
        Scanner inputEdit = new Scanner(System.in);
        String id = inputEdit.nextLine();
        boolean isDelete = false;
        for (Employee ls : listEmployee){
            if(id.equals(ls.getId())){
                listEmployee.remove(ls);
                isDelete = true;
                break;
            }
            isDelete = false;
        }
        if(!isDelete){
            System.out.println("Không tim thấy Id cần xóa");
        }else {
            System.out.println("Đã xóa thành công!");
        }
    }

    @Override
    public void show() {
        for (Employee ls : listEmployee) {
            System.out.println(ls);
        }
    }

}
