package Person;

public class Chinese extends Person {

//    public Chinese(String name) {
//        this.name = name;
//    }

    @Override
    public void greet() {
        System.out.println("你好！");
    }

    String regionalLanguage;

    public String getRegionalLanguage() {
        return regionalLanguage;
    }

    public void setRegionalLanguage(String regionalLanguage) {
        this.regionalLanguage = regionalLanguage;
    }

    //String name = "Wu";

    public void call() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
