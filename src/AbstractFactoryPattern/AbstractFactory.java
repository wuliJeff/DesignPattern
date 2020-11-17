package AbstractFactoryPattern;

/**
 * @author : yzh
 * @description:
 * @date : 2020/11/17 21:20
 */
public abstract class AbstractFactory {
    /**
     * 获取创建的电脑对象
     * @param computerType: 电脑品牌类型
     * @return 电脑对象
     */
    public abstract Computer getComputer(String computerType);

    /**
     * 返回创建的智能手机对象
     * @param phoneType: 智能手机品牌类型
     * @return 智能手机对象
     */
    public abstract SmartPhone getSmartPhone(String phoneType);
}
