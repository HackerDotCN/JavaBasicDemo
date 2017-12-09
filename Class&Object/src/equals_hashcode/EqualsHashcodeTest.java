package equals_hashcode;

import java.util.HashMap;

/**
 * @author: zhangyongbin
 * @Time: 12/9/2017.
 * @Description: 参考链接：  http://www.cnblogs.com/dolphin0520/p/3681042.html
 * 只重写equals()方法而不重写hashcode()方法出现的问题，这里要结合hashmap的源码理解。
 */

public class EqualsHashcodeTest {

    public static void main(String[] args) {

        People p1 = new People("Jack", 12);
        System.out.println(p1.hashCode());

        HashMap<People, Integer> hashMap = new HashMap<>();
        hashMap.put(p1, 1);

        System.out.println(hashMap.get(new People("Jack", 12)));
    }
}

class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 重写equals()方法时一定要重写hashCode()方法，否则无法找到对象的问题，可将hashcode()方法注释掉测试下
     * @return
     */
    @Override
    public int hashCode() {
        return name.hashCode()*37+age;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((People) obj).name) && this.age == ((People) obj).age;
    }
}
