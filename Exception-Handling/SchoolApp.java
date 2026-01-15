import java.util.*;
class AgeNotMatch extends RuntimeException{
    int age;
    public AgeNotMatch(int age){
        this.age=age;

    }
    public String getAgeMessage(){
        return "Age is less than 6 i.e "+ age;
    }
}
class Addmission{
    void verfiAge(int age){
        if(age<=6){
           throw new AgeNotMatch(age);
        }
        else{
            System.out.println("Student eligible for admission ");
        }
    }
}
public class SchoolApp{
    public static void main(String args[]){
        Addmission ad = new Addmission();
        try{
            ad.verfiAge(7);
        }
        catch(AgeNotMatch ex){
            System.out.println(ex.getAgeMessage());

        }
        

    }
}