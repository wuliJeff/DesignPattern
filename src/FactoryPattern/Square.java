package FactoryPattern;

/**
 * @author : yzh
 * @description: 正方形的类
 * @date : 2020/11/17 18:43
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
