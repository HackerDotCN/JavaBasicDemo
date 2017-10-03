package lambda;

/**
 * Author: zhang
 * Time: 9/29/2017
 * Description:   http://www.importnew.com/16436.html
 */
public class RunnableTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java 8,too much code for too little to do");
            }
        }).start();

        new Thread(() -> System.out.println("In Java 8, Lambda expression rocks!!")).start();

    }
}
