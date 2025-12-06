import java.io.File;
import java.io.IOException;
import javax.sound.midi.Track;

public class CreateFile{
    public static void main(String args[]){
        try{
            File myObj = new File("First.txt");
            if(myObj.createNewFile()){
                System.out.println("File Created : "+ myObj.getName());
            }else{
                System.out.println("File already Exists:  ");
            }
        }
        catch(IOException e){
            System.out.println("an error occured..");
            e.printStackTrace();

        }
    }

}