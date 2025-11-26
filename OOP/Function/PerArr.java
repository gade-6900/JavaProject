import java.util.*;
public class PerArr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int s1= sc.nextInt();
          int s2= sc.nextInt();
            int s3= sc.nextInt();
              int s4= sc.nextInt();
                int s5= sc.nextInt();
                  int s6= sc.nextInt();
        float stuper = getPer(s1,s2,s3,s4,s5,s6);
        System.out.println("Student percetage is:  "+stuper);



    }
    public static float getPer(int s1,int s2,int s3,int s4,int s5,int s6)
    {
        float per=(s1+s2+s3+s4+s5+s6)/6;
        return per;
    }
}