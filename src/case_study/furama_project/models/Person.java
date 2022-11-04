package case_study.furama_project.models;

import java.util.Calendar;

public abstract class Person {
    int id;
    String name;
    String birthDay;
    String sex;
    String personId;
    String phoneNumber;
    String email;

    public Person() {

    }

    public Person(int id, String name, String birthDay, String sex, String personId, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.sex = sex;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
