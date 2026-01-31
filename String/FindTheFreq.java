public class FindTheFreq{
    public static void main(String[] args) {
        String s = "hello world";
        //i want count the frequency of the all charcter 
        for(char ch  ='a';ch <='z';ch++){
            int count =0;
            for(int i =0;i<s.length();i++){
              if(s.charAt(i)==ch){
                count++;
              } 
        }
        if(count>0){
            System.out.println(ch + "  = "+ count);
              
        }
       
    }
    }
}
