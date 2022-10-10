package case_study.furama_project.models;

public abstract class Person {
    double id;
    String name;
    String birthDay;
    String sex;
    double personId;
    double phoneNumber;
    String email;

    public Person() {

    }

    public Person(double id, String name, String birthDay, String sex, double personId, double phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.sex = sex;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getPersonId() {
        return personId;
    }

    public void setPersonId(double personId) {
        this.personId = personId;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
