/**
 * Author: zhang
 * Time: 9/27/2017
 * Description:
 */
public class ExtendTest {
    public static void main(String[] args) {
        Animal a = new Animal();//实例化父类对象;
        a.eat();
        a.sleep();
        Cat c = new Cat();//实例化子类对象;
        c.eat();
        Animal m = new Mouse();//父类引用指向子类对象,这是多态
        m.eat();
        m.sleep();
    }
}

class Animal {
    public static int num = 10;

    void eat() {
        int i = 10;
        System.out.println("动物吃东西");
    }

    void run() {
        System.out.println("动物跑跑跑");
    }

    void sleep() {
        System.out.println("动物睡大觉:num" + num);
    }
}

class Cat extends Animal {//这里我是没有写任何方法的,但是实例化之后,却能调用父类的eat()方法,证明Animl(父类)的成员方法被Cat(子类)继承了;
}

//这里是子类对父类方法的覆写,所以调用子类就用子类的方法,调用谁就输出谁(指子类和父类);
class Mouse extends Animal {

    /**
     * super关键字用官方的解释是: super保存了父类型的特征;
     * 有一种错误的但是很好理解的说法是,super代表了对父类的引用,这种说法是不正确的,super并不会创建父类对象,但是可以先这么记;
     * 父类型的特征就包括了方法属性等等,在子类里面可以用'super.方法名()'调用父类里面的方法和属性;
     * 需要值得注意的是,有一个和super在作用上比较相似的关键字this,在构造方法中,this和super都只能放在构造方法的第一行,而且两者是不能共存的,即有this就没有super,反之一样;
     * 同时,当构造方法中既没有this,也没有super时,系统会默认一个super;
     */
    public void eat() {
        super.eat();

        System.out.println("老鼠吃大米");
    }

    public void run() {
        super.run();
    }

    public void sleep() {
        System.out.println("老鼠睡大觉：num" + num);
    }
}
