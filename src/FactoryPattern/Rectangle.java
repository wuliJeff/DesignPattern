package FactoryPattern;

/**
 * @author : yzh
 * @description: 长方形的类
 * @date : 2020/11/17 18:42
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
