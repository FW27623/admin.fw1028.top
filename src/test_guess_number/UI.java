package test_guess_number;

import javax.swing.*;

import static java.lang.System.out;

public class UI {

    public static void main(String[] args) {
        String grade = JOptionPane.showInputDialog("请选择一个难度级别！\n1.简单 2.普通 3.困难 -1.退出");
        switch (grade) {
            case "-1" -> System.exit(1);
            case "1" -> new Easy();
            case "2" -> new Common();
            case "3" -> new Difficult();
            default -> out.println("输入错误请重新输入！");
        }
    }
}