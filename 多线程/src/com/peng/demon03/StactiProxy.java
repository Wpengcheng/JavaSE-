package com.peng.demon03;
/*静态代理总结：
真实对象(target)和代理对象(weddingCompany)都要实现同一个接口
代理对象要代理真实角色
* */
public class StactiProxy {
    public static void main(String[] args) {
        //同理，Thread也是一个代理，实现Runnable接口，代理能做更多的事情
        new Thread( ()-> System.out.println("我爱你")  ).start();
        //WeddingCompany相当于Thread，Marry相当于Runnable
        //                 把结婚的人的类实例化
        new WeddingCompany(new You()).HappyMraay();
    }
}
interface Marry{//接口
    void HappyMraay();//方法
}
//建一个结婚的人的类  真实角色
class You implements Marry{
    @Override
    public void HappyMraay() {
        System.out.println("结婚管我什么事");
    }
}
//婚庆公司代理婚礼   代理角色
class WeddingCompany implements Marry{
    private Marry target;//target结婚的对象，是You的实例
    //有参构造方法    构造器传参
    public WeddingCompany(Marry target) {//利用target把You传进来
        this.target = target;
    }
    @Override
    public void HappyMraay() {
        //代理角色的方法
        before();
        //代理角色可以调用真实对象的方法
        this.target.HappyMraay();
        after();
    }
private void before(){
    System.out.println("结婚之前，布置现场");
}
private void after(){
    System.out.println("结婚之后，撤场");
}
}

















