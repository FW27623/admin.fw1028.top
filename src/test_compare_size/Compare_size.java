package test_compare_size;

import javax.swing.*;

public class Compare_size {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("请输入一个数"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("请输入一个数"));
        int compare_size =compare_size(a,b);
        System.out.println("比大小：");
        System.out.println(a + "和" + b + "进行比较，两个数中较大的值是：" + compare_size);
    }

    public static int compare_size(int a, int b) {
        return Math.max(a, b);
    }
}