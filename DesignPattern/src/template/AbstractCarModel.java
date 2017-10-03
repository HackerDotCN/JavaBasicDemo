package template;

/**
 * Author: zhang
 * Time: 9/29/2017
 * Description:
 */

/*
 * 抽象模板类，抽象汽车模型
 */
public abstract class AbstractCarModel {
    //汽车要能启动
    protected abstract void start();
	//汽车要能刹车
    protected abstract void stop();
    //汽车要能响喇叭
    protected void alarm(){
        //一般汽车喇叭都是“滴滴滴”哦，要想“巴拉拉”或者“啪啪啪”去实现类自己重写去！
        System.out.println("滴滴滴滴滴滴");
    }
    //最重要的是，汽车要能行驶！而且行驶流程是固定的，不能改变！用final修饰
    protected final void run(){
        //启动
        this.start();
        //鸣笛
        this.alarm();
        //到达目的地就停车
        this.stop();
    }
}
