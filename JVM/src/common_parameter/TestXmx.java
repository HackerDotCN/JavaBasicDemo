package common_parameter;

import java.util.Vector;


/**
 * vm参数：-Xms10M -Xmx10M  -XX:+PrintGCDetails
 * @author 《Java程序性能优化》
 *
 * 新生代：上界-下界 = 3M，这里eden:from:to = 4:1:1
 * PSYoungGen      total 2560K, used 1514K [0x00000000ffd00000, 0x0000000100000000, 0x0000000100000000)
 *  eden space 2048K, 73% used [0x00000000ffd00000,0x00000000ffe7aab0,0x00000000fff00000)
 *  from space 512K, 0% used [0x00000000fff00000,0x00000000fff00000,0x00000000fff80000)
 *  to   space 512K, 0% used [0x00000000fff80000,0x00000000fff80000,0x0000000100000000)
 *
 * 老年代：上界-下界 = 7m
 * ParOldGen       total 7168K, used 6340K [0x00000000ff600000, 0x00000000ffd00000, 0x00000000ffd00000)
 *  object space 7168K, 88% used [0x00000000ff600000,0x00000000ffc31100,0x00000000ffd00000)
 *
 */
public class TestXmx {
	public static void main(String args[]){
		Vector v=new Vector();
		for(int i=1;i<=100;i++){
			byte[] b=new byte[1024*1024];
			v.add(b);
			System.out.println(i+"M is allocated");
		}
		System.out.println("Max memory:"+Runtime.getRuntime().maxMemory()/1024/1024+"M");
	}
}
