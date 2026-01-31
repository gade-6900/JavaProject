import java.util.*;
class invalidVoterException extends Exception{
    String getVotermsg(){
        return "Invalid Voter Exception: Age is less than 18";
    }
    
}
class VotingMachine{
    int age;
    void checkEligibity(int age){
        if(age<18){
            invalidVoterException ive = new invalidVoterException();
            throw ive;
    
        }else{
            System.out.println("You are eligible for vote: " + age);
        }
    }
}
public class VoterIdApp {
    public static void main(String args[]){
         try{
            VotingMachine vm  = new VotingMachine();
            vm.checkEligibity(17);
         }catch(invalidVoterException ive){
            System.out.println(ive.getVotermsg());
         }
    }
}
