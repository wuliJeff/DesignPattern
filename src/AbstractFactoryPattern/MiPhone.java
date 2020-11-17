package AbstractFactoryPattern;

/**
 * @description:
 * @author     : yzh
 * @date       : 2020/11/17 20:24
 */
public class MiPhone implements SmartPhone {
    @Override
    public void make() {
        System.out.println("MiPhone::make()");
    }
}
