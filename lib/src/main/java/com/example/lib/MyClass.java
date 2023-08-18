package com.example.lib;
interface shape{
    void draw();
}
class circle implements shape{
    @Override
    public void draw() {
        System.out.println("circle implements shape");
    }
}
class square implements shape{
    @Override
    public void draw() {
        System.out.println("square implements shape");
    }
}
class rectangle implements shape{
    @Override
    public void draw() {
        System.out.println("rectangle implements shape");
    }
}
public class MyClass {
    public static void main(String[] args) {
        circle obj=new circle();
        obj.draw();
        square obj1=new square();
        obj1.draw();
        rectangle obj2=new rectangle();
        obj2.draw();

    }
}