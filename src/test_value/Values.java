package test_value;

import javax.swing.*;

class Values {
    public static void main(String[] args) {
        String s=JOptionPane.showInputDialog("请输入两个整数，两个数之间以空格隔开！");
        String[] z;
        z = s.split(" ");
        if(z.length!=2) {
            System.out.printf("您输入的数字个数为%d个，与要求输入的个数：2个不相符，请重新输入！！%n", z.length);
            System.exit(1);
        }
        else{
            z=s.split(" ");
        }
        int a=Integer.parseInt(z[0]);
        int b=Integer.parseInt(z[1]);
        A c=new A();
        B d=new B();
        System.out.println("这两个数的最大公约数为："+c.f(a,b));
        System.out.println("这两个数的最小公倍数为："+d.f(a,b));
    }
}
