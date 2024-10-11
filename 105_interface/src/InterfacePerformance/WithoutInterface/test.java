package InterfacePerformance.WithoutInterface;
/**
 * 创建Computer类和HD类，HD类中有read和write方法，电脑连接HD后，执行HD的read和write方法
 * 再创建一个Printer类，也有read和write的方法，电脑连接后，执行printer的read和write方法

 */
public class test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        HD hd = new HD();
        Printer printer = new Printer();

        computer.connection(hd);
        computer.connection(printer);
    }
}
