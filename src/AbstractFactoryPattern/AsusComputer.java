package AbstractFactoryPattern;

/**
 * @author : yzh
 * @description:
 * @date : 2020/11/17 21:17
 */
public class AsusComputer implements Computer {
    @Override
    public void make() {
        System.out.println("AsusComputer::make()");
    }
}
