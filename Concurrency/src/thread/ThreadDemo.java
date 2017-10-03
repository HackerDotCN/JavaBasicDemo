package thread;

/**
 * Author: zhang
 * Time: 9/27/2017
 * Description:
 */
public class ThreadDemo extends Thread {
    public void run(){
        System.out.println("before start method");
        this.stop();
        System.out.println("after stop method");
    }

    public static void main(String[] args) {
        ThreadDemo a = new ThreadDemo();
        a.start();
    }
}
