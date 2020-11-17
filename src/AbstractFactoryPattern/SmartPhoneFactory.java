package AbstractFactoryPattern;

/**
 * @description:
 * @author     : yzh
 * @date       : 2020/11/17 20:29
 */
public class SmartPhoneFactory extends AbstractFactory {

    @Override
    public Computer getComputer(String computerType) {
        return null;
    }

    @Override
    public SmartPhone getSmartPhone(String phoneType) {
        if (phoneType.equalsIgnoreCase("Mi")){
            return new MiPhone();
        } else if (phoneType.equalsIgnoreCase("Huawei")){
            return new HuaweiPhone();
        } else {
            return null;
        }
    }
}
