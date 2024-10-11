package InterfacePerformance.WithInterface;

public class Computer {

    //这边的参数就写抽象的接口，这样后续只要创建一个多态的hd或者printer的话就可以直接去调用read和write方法
    public void connection(USB usb) {
        usb.read();
        usb.write();
    }
}
