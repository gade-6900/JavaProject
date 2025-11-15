import java.util.*;
class EmployeeDetail{
    String name;
    int salary;

    EmployeeDetail(String name,int salary){
        this.name=name;
        this.salary=salary;

    }


}

public class Employee{
    public static void main(String args[]){
        ArrayList<EmployeeDetail> list =new ArrayList<>();

        list.add(new EmployeeDetail("shubham",45000));
        list.add(new EmployeeDetail("swapnil", 75000));
        list.add(new EmployeeDetail("avinash", 21000));
        list.add(new EmployeeDetail("ganesh",250000));
        list.add(new EmployeeDetail("kalyani",100000));
        list.add(new EmployeeDetail("zen ",10000));
        list.add(new EmployeeDetail("shukesh",15000));


    System.out.println("-------sorted by salary-------");

    Collections.sort(list, new Comparator<EmployeeDetail>(){
        public int compare(EmployeeDetail e1, EmployeeDetail e2){
            return e1.salary - e2.salary;
        }
    });

    for(EmployeeDetail  e : list){
        System.out.println(e.name  + " ---" + e.salary);
    }
    System.out.println("------sorted by Alphabetically------");
    Collections.sort(list, new Comparator<EmployeeDetail>(){
        public int compare(EmployeeDetail e1 , EmployeeDetail e2){
            return e1.name.compareTo(e2.name);
        }
    });

    for(EmployeeDetail e : list){
        System.out.println(e.name + "---" + e.salary);
    }   
    }
}

