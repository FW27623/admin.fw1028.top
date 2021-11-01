package test_table_attribute;

import static java.lang.System.out;

public class Table {
    String name;
    double weight,width,length,height;

    public Table(String name,double weight,double length,double width,double height){
        this.name=name;
        this.weight=weight;
        this.width=length;
        this.length=width;
        this.height=height;
    }

    public double Area(){
        return width * length;
    }

    public void Display(){
        out.println("桌子的名称为："+name+"\n桌子的重量为："+weight+" 千克"+"\n桌子的宽度为："+width+" 米"+"\n桌子的长度为："+length+" 米"+"\n桌子的高度为："+height+" 米");
        out.println("桌子的面积为："+Table.this.Area()+" 平方米");
        out.println();


    }

    public void ChangeWeight(double w){
        this.weight=w;
    }
}

