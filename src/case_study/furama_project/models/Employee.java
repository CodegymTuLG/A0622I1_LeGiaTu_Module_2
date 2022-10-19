package case_study.furama_project.models;

public class Employee extends Person {
    String academicLevel;
    String position;
    String salary;

    public Employee() {

    }

    public Employee(String id, String name, String birthDay, String sex, long personId, long phoneNumber, String email, String academicLevel, String position, String salary) {
        super(id,  name, birthDay, sex, personId, phoneNumber, email);
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String inputId, String inputName, String inputBirthDay, String inputSex, long inputPersonId, long inputPhoneNumber, String inputEmail, String inputCustomerType, String inputAddress) {
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", sex='" + sex + '\'' +
                ", personId=" + personId +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", academicLevel='" + academicLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}'+'\n';
    }
}
