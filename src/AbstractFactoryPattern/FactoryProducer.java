package AbstractFactoryPattern;

/**
 * @author : yzh
 * @description:
 * @date : 2020/11/17 21:13
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Smartphone")){
            return new SmartPhoneFactory();
        } else if(choice.equalsIgnoreCase("Computer")){
            return new ComputerFactory();
        }
        return null;
    }
}
