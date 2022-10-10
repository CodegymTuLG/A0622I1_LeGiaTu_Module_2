package case_study.furama_project.models;

public class Employee extends Person {
    String academicLevel;
    String position;
    String salary;

    public Employee() {

    }

    public Employee(int id, String name, String birthDay, String sex, int personId, int phoneNumber, String email, String academicLevel, String position, String salary) {
        super(id,  name, birthDay, sex, personId, phoneNumber, email);
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
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
        return "Employee{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", sex='" + sex + '\'' +
                ", personId=" + personId +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", academicLevel='" + academicLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
