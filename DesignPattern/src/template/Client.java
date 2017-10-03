package template;

/**
 * Author: zhang
 * Time: 9/29/2017
 * Description:  http://blog.csdn.net/zhangliangzi/article/details/51475133
 */
/*
 * 实现场景类
 */
public class Client {
    public static void main(String[] args){

        //做个宝马
        AbstractCarModel bmw = new BMWModel();
        //开辆奔驰
        AbstractCarModel benz = new BENZModel();
        //宝马跑一跑
        bmw.run();
        System.out.println("*************分割线*************");
        //奔驰跑一跑
        benz.run();
    }
}

