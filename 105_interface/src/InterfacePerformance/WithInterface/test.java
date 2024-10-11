package InterfacePerformance.WithInterface;

public class test {
    public static void main(String[] args) {
        Computer computer = new Computer();

        USB hd = new HD();
        USB printer = new Printer();

        computer.connection(hd);
        computer.connection(printer);

        Laotop laotop = new Laotop();
    }
}
