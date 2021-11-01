package test_rectangle;

import javax.swing.*;

public class Rectangle {
    private final double width;
    private final double height;
    private double perimeter;
    private double area;

    public void getPerimeter(){
        perimeter=2*(width + height);
    }

    public void getArea(){
        area=width * height;
    }

    public void showRectangle(){
        System.out.println("根据上述数据计算得出，这个矩形的周长是:"+perimeter+"；这个矩形的面积是:"+area);
    }

    public Rectangle(){
        double a = Double.parseDouble(JOptionPane.showInputDialog("请输入矩形的宽"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("请输入矩形的高"));
        System.out.println("计算矩形的周长和面积：");
        System.out.println("您输入的这个矩形的宽为："+a+"; 高为："+b);
        this.width=a;
        this.height=b;
    }

    public static void main(String[] args){
        Rectangle scan=new Rectangle();
        scan.getPerimeter();
        scan.getArea();
        scan.showRectangle();
    }
}

	