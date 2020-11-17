package AbstractFactoryPattern;

/**
 * @description:
 * @author     : yzh
 * @date       : 2020/11/17 20:27
 */
public class HuaweiPhone implements SmartPhone {
    @Override
    public void make() {
        System.out.println("HuaweiPhone::make()");
    }
}
