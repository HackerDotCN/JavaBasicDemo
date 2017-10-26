package _enum;


public class EnumPreviousTest {
    public EnumPreviousTest(EnumPrevious s) {
        System.out.println(s.getName() +
                "，这真是一个" + s.getDesc() + "的季节");
    }

    public static void main(String[] args) {
        // 直接使用Season的FALL常量代表一个Season对象
        new EnumPreviousTest(EnumPrevious.FALL);
    }
}
