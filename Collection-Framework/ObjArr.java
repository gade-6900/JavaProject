
public class ObjArr{
    public static void main(String[] args) {
        
        Object[] obj = new Object[5];

        obj[0] = 100;
        obj[1] ="Good";
        obj[2] =123;
        obj[3] ="Shubham";
        obj[4] = new  java.util.Date();

        for(int i=0;i<obj.length;i++){
            System.err.println("Object : " + obj[i]+ " ");
        }

    }
}