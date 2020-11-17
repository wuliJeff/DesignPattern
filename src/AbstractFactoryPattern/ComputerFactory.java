package AbstractFactoryPattern;

/**
 * @author : yzh
 * @description:
 * @date : 2020/11/17 21:24
 */
public class ComputerFactory extends AbstractFactory {
    @Override
    public Computer getComputer(String computerType) {
        if (computerType.equalsIgnoreCase("ASUS")){
            return new AsusComputer();
        } else if (computerType.equalsIgnoreCase("DELL")){
            return new DellComputer();
        } else {
            return null;
        }
    }

    @Override
    public SmartPhone getSmartPhone(String phoneType) {
        return null;
    }
}
