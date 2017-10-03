package threadpool;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Author: zhang
 * Time: 8/14/2017
 * Description:不断的创建线程开销非常大，应该用线程池的方式
 */
public class ThreadSample {
    public static void main(String[] args) {

        int count = 200000;
        long startTime = System.currentTimeMillis();
        final List<Integer> l = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            Thread th = new Thread() {
                @Override
                public void run() {
                    l.add(random.nextInt());
                }
            };
            th.start();
            try {
                th.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(l.size());
    }
}
