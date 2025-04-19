package TwoDimensionalArray;

public class dynamicNewTDArray {
    public static void main(String[] args) {
//        等长
        int[][] arr = new int[3][3];
        int value = 1;
        // This loop initializes the 2D array with sequential values starting from 1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value++;
            }
        }

        // This loop prints the 2D array elements, with each row on a new line
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(arr);

        //    不等长的二维数组
        int[][] arr2 = new int[3][];
        arr2[0] = new int[]{1,2,3};
        arr2[1] = new int[]{1,2};
        arr2[2] = new int[]{1,2,3,4,5};


    }
}
