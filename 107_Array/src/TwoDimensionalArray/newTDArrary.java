package TwoDimensionalArray;

public class newTDArrary {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,3},
                {1,2,3,4,5},
                {1,2}
        };
        System.out.println(arr.length);

        int[][] arr2 = {
                {1,2,3},
                {1,2}
        };
        System.out.println(arr2.length);
        //print the last element of the last array in arr2
        System.out.println(arr2[arr2.length-1][arr2[arr2.length-1].length-1]);
    }
}
