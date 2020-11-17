package SingletonPattern;

/**
 * @author : yzh
 * @description:
 * @date : 2020/11/17 21:36
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        // 不合法的构造函数
        // 编译时错误：构造函数 SingleObject() 是不可见的
        // SingleObject object = new SingleObject();

        // 获取唯一可用的对象
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();
        System.out.println("查看两个对象是否是一样的" + (object1 == object2));
    }
}
