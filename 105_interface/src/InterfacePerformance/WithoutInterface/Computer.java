package InterfacePerformance.WithoutInterface;

public class Computer {
    public void connection(HD hd) {
        System.out.println("HD connected");
        hd.read();
        hd.write();
    }

    //当Printer创建出来后，需要重载一个方法
    public void connection(Printer printer) {
        System.out.println("Printer connected");
        printer.read();
        printer.write();
    }
}
