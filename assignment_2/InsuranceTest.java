package assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class InsuranceTest {

    public static ArrayList insurancePolicies = new ArrayList();

    // main method
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        encryption_loop: while (true) {
            System.out.println("1 - Create Health Insurance Policy");
            System.out.println("2 - Create Term-Life Insurance Policy");
            System.out.println("3 - Exit");
            System.out.println();
            System.out.println("Enter choice: ");
            String user_response = stdin.nextLine();

            switch(user_response) {
                case "1":
                    
                    System.out.println("Enter name of policy holder: ");
                    String par1PolicyHolder = stdin.nextLine();
                    System.out.println("Enter deductible amount: ");
                    String par2DeductibleAmount= stdin.nextLine();
                    System.out.println("Enter co-payment: ");
                    double par3Copay = stdin.nextDouble();
                    System.out.println("Enter total out-of-pocket amount: ");
                    double par4OutOfPocket = stdin.nextDouble();

                    System.out.println("1 - Create Health Insurance Policy");
                    System.out.println("2 - Create Term-Life Insurance Policy");
                    System.out.println("3 - Exit");
                    System.out.println();
                    System.out.println("Enter choice: ");
            
                    break encryption_loop;
                    
                case "2":
                    
                    System.out.println("Enter name of policy holder: ");
                    par1PolicyHolder = stdin.nextLine();
                    System.out.println("Enter name of beneficiary: ");
                    String par2Beneficiary = stdin.nextLine();
                    System.out.println("Enter number of years in term: ");
                    int par3Term = stdin.nextInt();
                    System.out.println("Enter amount of payout: ");
                    double par4Payout = stdin.nextDouble();

                    System.out.println("1 - Create Health Insurance Policy");
                    System.out.println("2 - Create Term-Life Insurance Policy");
                    System.out.println("3 - Exit");
                    System.out.println();
                    System.out.println("Enter choice: ");
                    
                    break encryption_loop;
                    
                case "3":
                    
                    break encryption_loop;
                    
                default:
                    System.out.println("Error: Please enter valid input\n");
            }
        }

        stdin.close();
    }

}
