/**
 * Author: zhang
 * Time: 9/3/2017
 * Description:
 */
import java.util.*;

public class EqualAndHashCode {
    public static void main(String[] args) {
        /*
        Collection c = new HashSet();
        c.add("hello");
        c.add(new Name("f1","l1"));
        c.add(new Integer(100));
        c.remove("hello");
        c.remove(new Integer(100));
        System.out.println(c.remove(new Name("f1","l1")));
        */
        Name n1 = new Name("01");
        Name n2 = new Name("01");

        Collection c = new HashSet();
        c.add(n1);
        System.out.println("------------");
        c.add(n2);
        System.out.println("------------");
        System.out.println(n1.equals(n2));
        System.out.println("------------");
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(c);
    }


}

class Name {
    private String id;
    public Name(String id) {
        this.id = id;
    }

    public String toString(){
        return this.id;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Name) {
            Name name = (Name) obj;
            System.out.println("equal-"+ name.id);
            return (id.equals(name.id));
        }
        return super.equals(obj);
    }

    public int hashCode() {
        Name name = (Name) this;
        System.out.println("HashCode:" + name.id);
        return id.hashCode();

    }
}
