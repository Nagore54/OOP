package OOP;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private String yearOfBirth;

    public Person(String name, String middleName, String familyName, String yearOfBirth) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name;}

    public String getFamilyName() { return familyName;}
    public void setFamilyName(String familyName) {this.familyName = familyName;}

    public String getMiddleName() { return middleName;}
    public void setMiddleName(String middleName) { this.middleName = middleName;}

    public String getAge() { return yearOfBirth;}
    public void setAge(String middleName) { this.yearOfBirth = yearOfBirth;}

    @Override
    public String toString() { return "{" + familyName + name + middleName + yearOfBirth + "}";}
}