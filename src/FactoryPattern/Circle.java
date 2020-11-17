package FactoryPattern;

/**
 * @author : yzh
 * @description: 一个圆的类
 * @date : 2020/11/17 18:44
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}