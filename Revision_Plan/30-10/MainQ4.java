// Q4: Constructor and super()
class PersonalInfo {
    String name, middlename, lastname;

    PersonalInfo(String name, String middlename, String lastname) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
    }
}

class ProfessionalInfo extends PersonalInfo {
    int id, salary;
    String des, skillset;

    ProfessionalInfo(String name, 
    String middlename,
     String lastname, 
     int id, 
     String des, 
     int salary,
    String skillset) {
        super(name, middlename, lastname);
        this.id = id;
        this.des = des;
        this.salary = salary;
        this.skillset = skillset;
    }

    void show() {
        System.out.println("Name: " + name + " " + middlename + " " + lastname);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + des);
        System.out.println("Salary: " + salary);
        System.out.println("Skillset: " + skillset);
    }
}

public class MainQ4 {
    public static void main(String[] args) {
        ProfessionalInfo p = new ProfessionalInfo("Shubham", "P", "Gade", 101, "Java Developer", 50000, "Java, Spring");
        p.show();
    }
}
