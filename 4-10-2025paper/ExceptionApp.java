import java.util.Scanner;

// Custom checked exception
class InvalidVoterException extends Exception {
    public InvalidVoterException(String message) {
        super(message);
    }
}

public class ExceptionApp {
    // method that validates age and throws custom exception when age < 18
    public static void validateVoter(int age) throws InvalidVoterException {
        if (age < 18) {
            throw new InvalidVoterException("InvalidVoterException: Voter must be at least 18 years old. Provided age: " + age);
        }
        // else allowed to vote
        System.out.println("You are eligible to vote. Please cast your vote.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        // basic input validation
        if (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer for age.");
            sc.close();
            return;
        }

        int age = sc.nextInt();
        try {
            validateVoter(age);
        } catch (InvalidVoterException ive) {
            // handle the custom exception
            System.out.println(ive.getMessage());
        } finally {
            sc.close();
        }
    }
}
