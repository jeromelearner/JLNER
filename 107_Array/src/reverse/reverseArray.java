package reverse;

public class reverseArray {
    public static void main(String[] args) {
        displayArr(reverseArray(new int[]{1,2,3,4,5}));
    }

    static int[] reverseArray(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr.length - i - 1] = arr[i];
        }
        return newArr;
    }

    static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
