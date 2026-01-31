class Employee{
    int empid;
    String EmpName;

    Employee(int empid, String EmpName){
        this.empid=empid;
        this.EmpName=EmpName;
    }
    public void display(){
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Name: "+EmpName);
    }   

}
public class BankSystem{
    public static void main(String args[]){
    Employee e = new Employee(1, "shubham");
    e.display();;
   }
}