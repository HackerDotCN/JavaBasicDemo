package template;

/**
 * Author: zhang
 * Time: 9/29/2017
 * Description:
 */

/*
 *具体实现类，奔驰汽车模型
 */
public class BENZModel extends AbstractCarModel {
    //实现汽车抽象模板类的start()方法，使奔驰能够启动
    @Override
    protected void start() {
        System.out.println("奔驰启动！");
    }

    //实现汽车抽象模板类stop()方法，使奔驰能够刹车
    @Override
    protected void stop() {
        System.out.println("奔驰停车！");
    }

    //奔驰汽车喇叭响声就是“巴拉巴拉巴拉”，需要重写父类alarm()方法
    @Override
    protected void alarm() {
        System.out.println("奔驰车alarm：巴拉巴拉巴拉");
    }
    //所有汽车的行驶流程都是一致的，继承父类run()方法
}
