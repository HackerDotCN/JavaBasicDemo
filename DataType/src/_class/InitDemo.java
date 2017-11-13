package _class;

/**
 * @author: zhangyongbin
 * @Time: 11/1/2017.
 * @Description:
 * string类型在代码中属于局部变量，那么局部变量必须赋值，哪怕是null,否则编译通不过的，
 * 会提示说此变量未初始化，如果是类的成员变量，则可以不赋值，它会有默认值的。
 * java为了规避一些运行期间的空指针错误，都会强调局部变量必须赋值，
 * 否则编译器会立即报错，提示用户修改。
 */
public class InitDemo {
    static String s;
    String x = "test";
    String y;

    public static void main(String[] args) {

        InitDemo t = new InitDemo();
        System.out.println(t.s);//输出null
        System.out.println(t.x);//输出null
//        System.out.println(x);//报错,没有初始化,或者不是类静态变量
        //方法中不能调用类的非静态变量属性??哪怕已经初始化.
        System.out.println("s=" + s);//输出null

    }

}
