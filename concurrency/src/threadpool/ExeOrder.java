package threadpool;

import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Author: zhang
 * Time: 9/22/2017
 * Description: cisco
 */
public class ExeOrder {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(3);
        for (int i = 0; i < 10; i++) {
            final int j = i;
            executor.execute(new Thread(){
                @Override
                public void run(){
                    try{
                        Thread.sleep(new Random().nextInt(1000));
                        System.out.print(j);
                    }catch (InterruptedException e){}
                }
            });
        }
    }
}
