package template;

/**
 * Author: zhang
 * Time: 9/29/2017
 * Description:
 */
/*
 * 具体实现类，宝马汽车模型
 */
public class BMWModel extends AbstractCarModel{

    //实现汽车抽象模板类的start()方法，使宝马能够启动
    @Override
    protected void start() {
        System.out.println("宝马启动！");
    }
    //实现汽车抽象模板类stop()方法，使宝马能够刹车
    @Override
    protected void stop() {
        System.out.println("宝马停车！");
    }
    //宝马汽车喇叭响声就是“滴滴滴”，继承父类alarm()方法即可
    //所有汽车的行驶流程都是一致的，继承父类run()方法
}
