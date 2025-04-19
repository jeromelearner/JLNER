package getindex;

import java.util.Scanner;

public class getIndex {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int targetnum = sc.nextInt();

        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == targetnum) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The index of " + targetnum + " is " + index);
        } else {
            System.out.println("The number " + targetnum + " is not in the array.");
        }

    }
}
