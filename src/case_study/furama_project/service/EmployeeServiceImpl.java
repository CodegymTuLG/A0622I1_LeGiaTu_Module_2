package case_study.furama_project.service;

import case_study.furama_project.models.Employee;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    public EmployeeServiceImpl(Integer id, String name, String birthDay, String sex, long personId, long phoneNumber, String email, String academicLevel, String position, String salary) {
        super(id, name, birthDay, sex, personId, phoneNumber, email, academicLevel, position, salary);
    }

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
    public static boolean CheckId(Object input) {
        return input instanceof Integer;
    }
    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public String show() {
        return "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", birthDay='" + getBirthDay() + '\'' +
                ", sex='" + getSex() + '\'' +
                ", personId=" + getPersonId() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                ", academicLevel='" + getAcademicLevel() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", salary='" + getSalary() + '\'' + '\n';
    }

}
