package searchMax;

import java.util.Scanner;

public class searchMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please let me know how many numbers you want to enter: ");
        int arraynum = input.nextInt();
        int[] array = new int[arraynum];

        for (int i = 0; i < arraynum; i++) {
            System.out.print("Please enter the " + (i + 1) + " number: ");
            array[i] = input.nextInt();
        }

        System.out.println("The maximum number is: " + searchMax(array));

    }

    static int searchMax(int[] array) {
        int max = 0;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

}
