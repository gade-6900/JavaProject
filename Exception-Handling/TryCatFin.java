public class TryCatFin {
    public static void mmain(String args[]){
        try{
            int a=10;
            int b=20;
            int c= a+b;
            System.out.println("Result: "   +c);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("I am always executed");

        }
    }
}
