/**
 * Author: zhang
 * Time: 9/21/2017
 * Description:
 * 注意：static 的变量是在类装载的时候就会被初始化。也就是说，只要类被装载，不管你是否使用了这个static 变量，它都会被初始化
 */
public class StaticTest {
    static int i;
    int j;

    public static void main(String[] args) {
        StaticTest obj1 = new StaticTest();
        obj1.i = 10;
        obj1.j = 20;

        StaticTest obj2 = new StaticTest();

        System.out.println("obj1.i=" + obj1.i + ", obj1.j=" + obj1.j);
        System.out.println("obj2.i=" + obj2.i + ", obj2.j=" + obj2.j);
    }
}