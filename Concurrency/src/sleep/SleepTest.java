package sleep;

/**
 * @author: zhangyongbin
 * @Time: 12/7/2017.
 * @Description:
 */
public class SleepTest {
    public static void main(String[] args) {
        Runnable sleepTask = new SleepThread();
        Thread thread = new Thread(sleepTask, "sleep_test_thread");
//        System.out.println("current thread:"+this.currentThread.+);
        thread.start();
        try {
            Thread.sleep(6000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

 class SleepThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("sleep thread:");
        }
    }
}
