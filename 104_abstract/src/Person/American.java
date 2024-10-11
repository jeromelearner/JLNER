package Person;

public class American extends Person {
    //继承抽象类的时候，必须要在子类中覆写抽象方法
    @Override
    public void greet() {
        System.out.println("Hello World!");
    }
}
