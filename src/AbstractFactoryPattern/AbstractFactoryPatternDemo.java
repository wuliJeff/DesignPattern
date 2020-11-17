package AbstractFactoryPattern;

/**
 * @author : yzh
 * @description:
 * @date : 2020/11/17 21:25
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 获取电脑工厂
        AbstractFactory computerFactory = FactoryProducer.getFactory("Computer");
        // 获取华硕电脑的对象
        Computer computer1 = computerFactory.getComputer("ASUS");
        // 调用华硕电脑的make方法
        computer1.make();
        //获取戴尔电脑的对象
        Computer computer2 = computerFactory.getComputer("DELL");
        //调用戴尔电脑的make方法
        computer2.make();

        // 获取智能手机工厂
        AbstractFactory smartPhoneFactory = FactoryProducer.getFactory("SmartPhone");
        // 获取小米手机的对象
        SmartPhone smartPhone1 = smartPhoneFactory.getSmartPhone("Mi");
        // 调用小米手机的make方法
        smartPhone1.make();
        // 获取华为手机的对象
        SmartPhone smartPhone2 = smartPhoneFactory.getSmartPhone("Huawei");
        // 调用华为手机的make方法
        smartPhone2.make();
    }
}
