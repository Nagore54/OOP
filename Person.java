package OOP.java.org.OOP;

import java.time.LocalDate;

public class Person {
    private String name;
    private String middleName;
    private String familyName;

    private String age;
    private String yearOfBirth;

    public Person(String name, String middleName, String familyName, String age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


    public String getFamilyName() {return familyName;}
    public void setFamilyName(String familyName) {this.familyName = familyName;}


    public String getMiddleName() {return middleName;}
    public void setMiddleName(String middleName) {this.middleName = middleName;}

    public String getAge() {return age;}
    public void setAge(String age) {this.age = age;}


    @Override
    public String toString() {

        return "{" + familyName + " " + name + " " + middleName + " " + age + "}";
    }
}

