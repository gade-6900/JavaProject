public class ConvertToLower{
    public static void main(String args[]){
        String s = "GADE SHUBHAM";
        String re="";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch <='Z'){
                ch =(char)(ch+32);

            }
            re = re+ch;
        }
        System.out.println("new : "+ re);
    }
}