package case_study.furama_project.models;

public class Employee extends Person {
    String academicLevel;
    String position;
    String salary;

    public Employee() {

    }

    public Employee(String id, String name, String birthDay, String sex, String personId, String phoneNumber, String email, String academicLevel, String position, String salary) {
        super(id, name, birthDay, sex, personId, phoneNumber, email);
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String line) {
        String[] data = line.split(",");
        this.id = data[0];
        this.name = data[1];
        this.birthDay = data[2];
        this.sex = data[3];
        this.personId = data[4];
        this.phoneNumber = data[5];
        this.email = data[6];
        this.academicLevel = data[7];
        this.position = data[8];
        this.salary = data[9];

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
                '}' + '\n';
    }

    public String getInfo() {
        return id +
                "," + name +
                "," + birthDay +
                "," + sex +
                "," + personId +
                "," + phoneNumber +
                "," + email +
                "," + academicLevel +
                "," + position +
                "," + salary;
    }
}
