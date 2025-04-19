package reverse;

public class directReverse {
    public static void main(String[] args) {
        display(reverse(new int[]{1,2,3,4}));
    }

    static int[] reverse(int[] arr){
        //无论数组中个数是基数还是偶数，循环次数都是arr.length / 2
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
