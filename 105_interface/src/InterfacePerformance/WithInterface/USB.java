package InterfacePerformance.WithInterface;

//USB 接口的调用者是Computer，实现者是HD和Printer
public interface USB {
    void read();
    void write();
}
