package autoboxing;

/**
 * @author: zhangyongbin
 * @Time: 2017/9/11  0011.
 * @Description: 《深入理解Java虚拟机（第二版）》 语法糖章节有叙述
 * 可以查看反编译的class文件印证想法
 */
public class UnboxingTrap {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Integer h = new Integer(66);
        Integer i = new Integer(66);
        System.out.println(c == d);  //-128~127之间的数有缓存不会新创建对象，所以为true
        System.out.println(e == f);  //不缓存，新创建对象了，为false
        System.out.println(c == (a + b));   //有运算，自动unboxing，为true
        System.out.println(c.equals(a + b));//有运算，先auto-unboxing，再auto-boxing,为true
        System.out.println(g == (a + b));   //有运算，自动unboxing，为true
        System.out.println(g.equals(a + b)); //equals()方法没有自动类型转换，是两种不同的类型,为false
        System.out.println(h == i);  //虽然是-128~127范围，但是这种新建方式没有使用缓存，和新建其他普通对象一样，为false
    }
}
