package hashmap;

/**
 * Author: zhang
 * Time: 9/27/2017
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Integer i = 1,j,a;
        while (i<=4){
            j = 1;
            a = 0;
            while (a<= 5*i){
                a = 2^j;
                System.out.print(a);
                System.out.print(" ");
                j+=1;
            }
            System.out.println();
            i+=1;
        }

    }
}
