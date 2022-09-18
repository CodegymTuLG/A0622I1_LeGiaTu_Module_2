package ss5_accessmodifier_staticmethod_staticproperty.only_write_class_construction;

public class Student {
    private String name = "John";
    private String class_ = "CO2";
    public Student(){

    }
    public Student(String name, String class_){
        this.name = name;
        this.class_ = class_;
    }
    public void setName(String stringName){
        this.name = stringName;
    }
    public void setClasses(String stringClass){
        this.class_ = stringClass;
    }
    public String dispay(){
        return "Name is " + this.name + "\nClass is "+ this.class_ ;
    }
}
