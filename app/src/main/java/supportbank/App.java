package supportbank;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Would you like to list all the accounts or search for an account?");
        System.out.println("Enter 'All' to list all or accounts or enter your criteria to search for it");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        if(userChoice.equals("All"))
        {
            Reader reader = new Reader("Transactions2014.csv");
            reader.Run();
        }
        else if (!userChoice.isEmpty()) {
            Reader reader = new Reader("Transactions2014.csv", userChoice);
            reader.Run();
        }
        

        
        
    }
}
