package FactoryPattern;

/**
 * @author : yzh
 * @description: 主类
 * @date : 2020/11/17 18:48
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        // 创建一个智能手机工厂
        SmartPhoneFactory smartPhoneFactory = new SmartPhoneFactory();
        // 通过工厂创建小米手机的对象
        SmartPhone smartPhone1 = smartPhoneFactory.getPhone("Mi");
        // 调用小米手机的make方法
        smartPhone1.make();
        // 通过工厂创建华为手机的对象
        SmartPhone smartPhone2 = smartPhoneFactory.getPhone("HUAWEI");
        // 调用华为手机的make方法
        smartPhone2.make();
    }
}
