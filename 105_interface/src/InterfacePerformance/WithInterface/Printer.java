package InterfacePerformance.WithInterface;

public class Printer implements USB {
    @Override
    public void read() {
        System.out.println( "Printer is reading");
    }

    @Override
    public void write() {
        System.out.println( "Printer is writing");
    }
}
