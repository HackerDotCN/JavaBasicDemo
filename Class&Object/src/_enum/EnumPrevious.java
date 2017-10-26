package _enum;

//早期jdk不支持手动实现枚举类
public class EnumPrevious {
    // 把Season类定义成不可变的，将其成员变量也定义成final的
    private final String name;
    private final String desc;
    public static final EnumPrevious SPRING
            = new EnumPrevious("春天", "趁春踏青");
    public static final EnumPrevious SUMMER
            = new EnumPrevious("夏天", "夏日炎炎");
    public static final EnumPrevious FALL
            = new EnumPrevious("秋天", "秋高气爽");
    public static final EnumPrevious WINTER
            = new EnumPrevious("冬天", "围炉赏雪");

    public static EnumPrevious getSeason(int seasonNum) {
        switch (seasonNum) {
            case 1:
                return SPRING;
            case 2:
                return SUMMER;
            case 3:
                return FALL;
            case 4:
                return WINTER;
            default:
                return null;
        }
    }

    // 将构造器定义成private访问权限
    private EnumPrevious(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    // 只为name和desc提供getter方法
    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }
}
