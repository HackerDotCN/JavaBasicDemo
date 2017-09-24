/**
 * Author: zhang
 * Time: 9/22/2017
 * Description:
 */
public class Child extends Parent {
    public int m=1;

    public void doAc1(){
        System.out.println(m);
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.doAc1();
        parent.doAc2();
        System.out.println(parent.m);
        Child child=(Child)parent;
        System.out.println(child.m);
        child.doAc1();
    }
}
