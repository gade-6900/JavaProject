public class RemoveSpace{
    public static void main(String[] args) {
        String s = "gade shubham p";
        // String res ="";

        // for(int i=0;i<s.length();i++){
        // char ch = s.charAt(i);
        // if(ch != ' '){
        //     res=res+ch;
        // }
        // }
        // System.out.println("Result : "+ res);

        s=s.replace(" ", "");
        System.out.println("Result : "+ s);
    }
}