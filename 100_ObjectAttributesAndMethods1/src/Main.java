public class Main {
    public static void main(String[] args) {
        int i = 10;
        add(i);
        System.out.println("MAIN-->" + i);
    }


    public static void add(int i) {
        i++;
        System.out.println("ADD-->" + i);
    }
}

//main中间的i是一个int变量i，在main方法中，i的值没有变。
//在add方法中，i是一个传入值的变量，你可以传入任何值或者任何变量，它的结果就是output
//所以执行add(i)的时候值是把i的值10给传了进去，然后执行了10++，然后输出了add-->11
//但是实际这个i的值没有变化（在main方法中）
//方法参数的传入的过程实际是复制的过程