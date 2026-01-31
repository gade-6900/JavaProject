public class NumberFormatExc {
    public static void main(String args[]){
        String str ="123";
        try{
            int num = Integer.parseInt(str);
            System.out.println("Converted Num: "+ num);

        }
        catch(NumberFormatException e){
            System.out.println("Invalid number format: "+ e.getMessage());
        }
    }
}
