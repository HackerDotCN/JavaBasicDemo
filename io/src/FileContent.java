import java.io.File;

/**
 * Author: zhang
 * Time: 8/20/2017
 * Description:
 */
public class FileContent {
    public static void main(String[] args) {
        File dir = new File("D:\\Profession_Files\\apache-maven-3.2.1");
        //File dir=new File("F:\\");
        //如果使用上述的盘符的根目录，会出现java.lang.NullPointerException
        //为什么？
        getAllFiles(dir, 0);//0表示最顶层
    }

    //获取层级的方法
    public static String getLevel(int level) {
        //A mutable sequence of characters.
        StringBuilder sb = new StringBuilder();
        for (int l = 0; l < level; l++) {
            sb.append("|--");
        }
        return sb.toString();
    }

    public static void getAllFiles(File dir, int level) {
        System.out.println(getLevel(level) + dir.getName());
        level++;
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                //这里面用了递归的算法
                getAllFiles(files[i], level);
            } else {
                System.out.println(getLevel(level) + files[i]);
            }
        }
    }
}
