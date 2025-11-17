import java.util.*;
class Employee{
    int id;
    String name;
    int totalWorkingHour;
    int salary;
    int overTime;
    int overTimePay;

    Employee(int id,String name,int totalWoringHour){
        this.id=id;
        this.name=name;
        this.totalWorkingHour=totalWoringHour;


    }

    void displayDetail(){
        System.out.println("-------------------------------------------------");
        System.out.println("Employee ID : "+ id);
        System.out.println("Employee Name: "+ name);
        System.out.println("Working Hour: "+ totalWorkingHour);
        System.out.println("Over Time Hour: "+ overTime);
        System.out.println("Over TimePay: "+ overTimePay);
        System.out.println("Salary: "+ (salary + overTimePay));
    }
}

class OverTime{
    Employee emp[];

    void setEmployee(Employee emp[]){
        this.emp=emp;

    }
    void calculateOverTime(){
        for( Employee e : emp){
            if(e.totalWorkingHour>40){
                e.overTime = e.totalWorkingHour-40;

            }else{
                e.overTime=0;
            }
            e.overTimePay = e.overTime*50;

            e.salary = 50*40;

        }
    }
}
public class EmployeeApp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Employee employees[] = new Employee[5];

        System.out.println("Enter datail of 5 employees ");
        for(int i=0;i<=5;i++){
            System.out.println("\nEnter employee "+ (1+i)+ " ID:-");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Employee " + (i + 1) + " Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Total Working Hours for this week: ");
            int hours = sc.nextInt();

            employees[i] = new Employee(id, name, hours);
        }
        OverTime ot = new OverTime();
        ot.setEmployee(employees);
        ot.calculateOverTime();

        // displaying all employee details
        System.out.println("\n===== Employee Salary & Overtime Details =====");
        for (Employee e : employees) {
            e.displayDetail();
        }



    }
}


