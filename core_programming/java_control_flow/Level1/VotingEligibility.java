import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("The person is to vote");
            
        } else{
            System.out.println("The person not allowed to vote");

        }
        input.close();
    }
}
