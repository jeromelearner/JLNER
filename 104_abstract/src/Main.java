import Person.American;
import Person.Chinese;

public class Main {
    public static void main(String[] args) {
        American american = new American();
        Chinese chinese = new Chinese();

        american.greet();

        chinese.greet();
        chinese.setRegionalLanguage("上海话");
        System.out.println(chinese.getRegionalLanguage());
        chinese.call();
    }
}
