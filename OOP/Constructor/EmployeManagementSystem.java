import java.util.*;
class Employee{
    private int empId;
    private String name;
    private String designation;
    private double salary;
    private int experience;


    public Employee(int empId, String name, String designation, double salary, int experience){
        this.empId=empId;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.experience=experience;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void displayDetail(){
        System.out.println("------------------------------------------------");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: "+ name);
        System.out.println("Designatoin: "+ designation);
        System.out.println("Salary: " + salary);
        System.err.println("Experince: "+ experience + " Years");
        System.err.println("------------------------------------------------");
    }


}



public class EmployeManagementSystem{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] empArr = new Employee[10]; 
        int count = 0;

        while (true) {

            System.out.println("\n==============================");
            System.out.println("   EMPLOYEE MANAGEMENT MENU   ");
            System.out.println("==============================");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Search Employee by Name");
            System.out.println("5. Update Employee");
            System.out.println("6. Delete Employee");
            System.out.println("7. Display Employees with Salary > X");
            System.out.println("8. Display Employees with Experience > X");
            System.out.println("9. Sort Employees by Salary");
            System.out.println("10. Exit");
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < empArr.length) {

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Designation: ");
                        String desig = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        System.out.print("Enter Experience (years): ");
                        int exp = sc.nextInt();

                        empArr[count] = new Employee(id, name, desig, salary, exp);
                        count++;

                        System.out.println("Employee added successfully!");

                    } else {
                        System.out.println("Only 10 employees allowed. Cannot add more.");
                    }
                    break;

                case 2:
                    if (count == 0)
                        System.out.println("No employees found.");
                    else
                        for (int i = 0; i < count; i++)
                            empArr[i].displayDetail();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (empArr[i].getEmpId() == searchId) {
                            empArr[i].displayDetail();;
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Employee Not Found!");
                    break;

                case 4:
                    System.out.print("Enter Employee Name to search: ");
                    String searchName = sc.nextLine();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (empArr[i].getName().equalsIgnoreCase(searchName)) {
                            empArr[i].displayDetail();
                            found = true;
                        }
                    }
                    if (!found)
                        System.out.println("Employee Not Found!");
                    break;

                case 5:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (empArr[i].getEmpId() == updateId) {

                            System.out.print("Enter new Name: ");
                            empArr[i].setName(sc.nextLine());

                            System.out.print("Enter new Designation: ");
                            empArr[i].setDesignation(sc.nextLine());

                            System.out.print("Enter new Salary: ");
                            empArr[i].setSalary(sc.nextDouble());

                            System.out.print("Enter new Experience: ");
                            empArr[i].setExperience(sc.nextInt());

                            System.out.println("Employee updated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Employee Not Found!");
                    break;

                case 6:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (empArr[i].getEmpId() == deleteId) {

                            for (int j = i; j < count - 1; j++) {
                                empArr[j] = empArr[j + 1];
                            }

                            count--;

                            System.out.println("Employee deleted successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Employee Not Found!");
                    break;

                case 7:
                    System.out.print("Enter minimum salary: ");
                    double minSal = sc.nextDouble();
                    for (int i = 0; i < count; i++)
                        if (empArr[i].getSalary() > minSal)
                            empArr[i].displayDetail();
                    break;

                case 8:
                    System.out.print("Enter minimum experience: ");
                    int minExp = sc.nextInt();
                    for (int i = 0; i < count; i++)
                        if (empArr[i].getExperience() > minExp)
                            empArr[i].displayDetail();
                    break;

                case 9:
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = 0; j < count - i - 1; j++) {
                            if (empArr[j].getSalary() > empArr[j + 1].getSalary()) {
                                Employee temp = empArr[j];
                                empArr[j] = empArr[j + 1];
                                empArr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Employees sorted by salary!");
                    break;

                case 10:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
