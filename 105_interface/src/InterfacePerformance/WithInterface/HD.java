package InterfacePerformance.WithInterface;

public class HD implements USB {
    @Override
    public void read() {
        System.out.println( "HD is reading");
    }

    @Override
    public void write() {
        System.out.println( "HD is writing");
    }
}
