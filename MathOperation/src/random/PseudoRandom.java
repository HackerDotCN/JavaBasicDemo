package random;

import java.util.Random;

/**
 * Author: zhang
 * Time: 10/1/2017
 * Description:
 * 伪随机测试：相同的种子数生成的随机序列是相同的
 */
public class PseudoRandom {
    public static void main(String[] args) {
        Random r1 = new Random(20);
        Random r2 = new Random(20);
        for (int i = 0; i < 100; i++) {
            System.out.println(r1.nextInt(16) + " " + r2.nextInt(16));
        }
    }
}
