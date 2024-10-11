package Person;
/**
 * 创建一个Person类，定义greet方法 这个父类需要包含American和Chinese的公共属性和方法
 * 创建American和Chinese子类
 *
 */
public abstract class Person {
    String name = "People";

    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }

    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    public void greet() {
//        //在父类中，这个方法其实没法写，因为我们没法定义子类中greet的内容
//    }

    // 这种时候，可以将方法定义为抽象方法
    // 但是有个限制，抽象方法只能定义在抽象类中，所以Person也需要加上abstract
    public abstract void greet();

}
