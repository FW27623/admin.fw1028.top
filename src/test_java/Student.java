package test_java;

import javax.swing.*;

public class Student {
    public static String student= JOptionPane.showInputDialog("请输入你的姓名");
    public void show() {
        System.out.println("我是"+student+"，是2019级电子商务班的学生");
    }

    public static void main(String[] args) {
        Student test=new Student();
        test.show();
    }

}
