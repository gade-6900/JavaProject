import java.util.*;

public class CheckRepeatedWordsSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        boolean repeated = false;

        // simple nested loop
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[i].equals(words[j])){
                    repeated = true;
                    break;
                }
            }
            if(repeated) break;
        }

        if(repeated)
            System.out.println("No");   // words repeat
        else
            System.out.println("Yes");  // no repeat
    }
}
    