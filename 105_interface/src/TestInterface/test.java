package TestInterface;

public class test {
    public static void main(String[] args) {
        System.out.println(TestInterface.num);
        System.out.println(TestInterface.num2);

        SonInterface sonInterface = new SonInterface();
        sonInterface.call();
    }
}
