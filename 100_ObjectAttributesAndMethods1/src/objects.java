public class objects {
    public static void main(String[] args) {
        User u = new User();
        add(u);
        System.out.println(u.age);

    }

    public static void add(User u) {
        u.age++;
    }
}

class User {
    int age = 10;
}

//这个时候u.age最终输出的时候的值为11，而不是10
//因为u是一个对象，其保存的是heap中实力变量u的地址。
//所以当add方法引用u的时候，实际引用（复制）的是其在jvm stack中的值=heap中u实力变量的地址
//所以add里面的u.age++改变的是heap中u实力变量的age的值
//最后输出的时候还是调用heap中u的实力变量的age的值

