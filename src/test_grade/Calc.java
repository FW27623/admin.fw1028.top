package test_grade;

import javax.swing.*;

class Calc {
    public static void main(String[] args) {
        double[] a;
        double[] b;
        String str1 = JOptionPane.showInputDialog("请输入打分数据，必须以空格分隔!\n结果保留两位小数！");
        String[] str_a=str1.split(" ");
        a=new double[str_a.length];
        for(int i=0;i<str_a.length;i++) {
            a[i]=Double.parseDouble(str_a[i]);
        }
        String str2 = JOptionPane.showInputDialog("请输入体重数据，必须以空格分隔!\n结果保留两位小数！");
        String[] str_b=str2.split(" ");
        b=new double[str_b.length];
        for(int i=0;i<str_b.length;i++) {
            b[i]=Double.parseDouble(str_b[i]);
        }
        ComputerAverage computer;
        computer=new SongGame();
        double result=computer.average(a);
        System.out.println("选手最后得分:"+String.format("%.2f",result)+"分");
        computer=new School();
        result=computer.average(b);
        System.out.println("班级平均体重:"+String.format("%.2f",result)+"kg");
    }
}