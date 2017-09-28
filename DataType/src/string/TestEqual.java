package string;

public class TestEqual
{
 	public static void main(String[] args) 
 	{
 		String s1 = "Monday";            //s1指向字符串缓冲池中对象；
 		String s2 = new String("Monday");//s2指向堆中的对象；s1和s2引用的不是同一个对象，但是值相等（String中的equal方法已经重写为比较值，而非Object中比较内存地址）
 		String s3 = new String("Monday");
 			   s3 = s3.intern();		 //s3到字符串缓冲池中找值一样的字符串，有的话就返回缓冲池中的地址；
        // int s[] = s1.value;
        // System.out.println(s);        //intern（）这个方法的作用是返回在字符串缓冲池中的对象的引用
 		if (s1 == s2){
 			System.out.println("s1 == s2");
 		}
 	    else{
    		System.out.println("s1 != s2");
    	}

    	if(s1.equals(s2)){
    		System.out.println("s1 equals s2");
    	}
    	else{
    		System.out.println("s1 not equals s2");
    	}
    	if(s3 == s1){
    		System.out.println("s3 == s1");
    	}
    	else{
    		System.out.println("s3 != s1");
    	}

 	}
 }