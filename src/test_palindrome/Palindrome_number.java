package test_palindrome;

import javax.swing.*;
/*导包，Swing是Java的GUI工具包。*/

/**
 * @author FangWei
 */
public class Palindrome_number {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("请输入一个数");
        /*显示请求用户输入的问题消息对话框，提示:"请输入一个数"*/
        char[] Palindrome = str.toCharArray();
        /*将此字符串转换为新的字符数组。*/
        String s = "";
        /*为输入的内容加上双引号*/
        int a = Palindrome.length - 1;
        while (a >= 0) {
            s = s + Palindrome[a];
            a--;
        }
        System.out.println("您输入的数字是：" + str);
        /*输出输入的数字str*/
        if (str.equals(s)) {
            /*当输出的数值与输入的数值相等时判定为true，输出以下信息*/
            System.out.println("根据计算得出您输入的数字“" + str + "”是一个回文数");
        } else {
            /*当输出的数值与输入的数值不等是判定为false，输出以下信息*/
            System.out.println("根据计算得出您输入的数字“" + str + "”不是一个回文数");
        }

    }
}
