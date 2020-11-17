package FactoryPattern;

/**
 * @author : yzh
 * @description:
 * @date : 2020/11/17 20:29
 */
public class SmartPhoneFactory {
    /**
     * 根据传入的参数来决定创建什么类型的对象
     */
    public SmartPhone getPhone(String type) {
        if (type.equalsIgnoreCase("Mi")){
            return new MiPhone();
        } else if (type.equalsIgnoreCase("Huawei")){
            return new HuaweiPhone();
        } else {
            return null;
        }
    }
}
