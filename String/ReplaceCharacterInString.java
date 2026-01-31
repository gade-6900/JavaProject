public class ReplaceCharacterInString {
    public static void main(String args[]){
        String s = "hello wolrd";
        char old ='o';
        char newch = 'a';
        String newString = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch ==old){
                newString = newString + newch;
            }else{
                newString = newString +ch;
            }
        }
        System.out.println(newString);
    }
    
}
