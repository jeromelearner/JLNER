import com.TTBB.User.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserAccount currentUser = null;
        System.out.println("Welcome to TTBB!");

        boolean running = true;

        UserAccount u1 = new UserAccount();
        UserAccount u2 = new UserAccount();
        UserAccount u3 = new UserAccount();
        UserAccount u4 = new UserAccount();
        UserAccount u5 = new UserAccount();
        UserAccount u6 = new UserAccount();

        UserAccount[] userAccountList = {u1, u2, u3, u4, u5, u6};

        int i = 0;

        while (running) {
            System.out.println("\nWhat do you want to do: \n1. Create User \n2. Manage Account \n3. Switch User \n4. Play Game \n5. Exit");
            System.out.print("Enter your choice: ");
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    UserAccount.CreateUserAccount(userAccountList[i]);
                    currentUser = userAccountList[i];
                    i++;
                    break;

                case 2:
                    if (currentUser != null) {
                        currentUser.ManageAccount();
                    } else {
                        System.out.println("You have not created any accounts!");
                    }
                    break;

                case 3:
                    if (i <= 0) {
                        System.out.println("You have not created any accounts!");
                        break;
                    } else {
                        System.out.println("\nHere's the users lists:");
                        for (int j = 0; j < i; j++) {
                            System.out.printf("%d. %s\n", j+1, userAccountList[j].username);
                        }
                    }
                    while (true) {
                        System.out.print("Select an User: ");
                        int switchUserChoice = sc.nextInt();
                        if (switchUserChoice > 0 && switchUserChoice <= i) {
                            currentUser = userAccountList[switchUserChoice-1];
                            break;
                        } else {
                            System.out.println("Wrong Option, Please try again");
                        }
                    }
                    break;

                case 4:
                    break;

                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Error, please try again");
                    break;
            }
        }


    }
}