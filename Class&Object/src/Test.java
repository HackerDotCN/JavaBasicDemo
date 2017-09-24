/**
 * Author: zhang
 * Time: 9/22/2017
 * Description:
 */
public class Test {
    public void doAc1(C1 c1){
        c1.m1.m2= "changed";
    }

    public void doAc2(C1 c1){
        c1.m1 = new C2("changed");
    }

    public void doAc3(C1 c1){
        c1 = new C1("changed");
    }

    public static void main(String[] args) {
        C1 c = new C1("original");
        new Test().doAc1(c);
        System.out.println(c.m1.m2);
        c = new C1("original");
        new Test().doAc2(c);
        System.out.println(c.m1.m2);
        c = new C1("original");
        new Test().doAc3(c);
        System.out.println(c.m1.m2);
    }
}
