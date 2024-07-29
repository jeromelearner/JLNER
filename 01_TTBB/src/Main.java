import com.TTBB.User.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //UserAccount currentUser;
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
            System.out.println("What do you want to do: \n1. Create User \n2. Current User \n3. Switch User \n4. Play Game \n5. Exit");
            System.out.print("Enter your choice: ");
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    UserAccount.CreateUserAccount(userAccountList[i]);
                    i++;
                    break;
                case 2:
                    UserAccount[] activeAccountList = new UserAccount[6];
                    for (int j = 0; j < userAccountList.length; j++) {
                        if (userAccountList[j].userBaseWallet != 0) {
                            activeAccountList[j] = userAccountList[j];
                        }
                    }
                    System.out.println("here's the user list");
                    for (int j = 0; j < activeAccountList.length; j++) {
                        System.out.println(activeAccountList[j].username);
                    }
                    break;
                case 3:
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