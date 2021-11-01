package test_guess_number;

import javax.swing.*;
import java.util.Random;

public class Difficult {
    public Difficult() {
        Random random = new Random();
        int num = random.nextInt(200);
        int count = 0;
        System.out.println("你选择的难度是：困难");
        for(int i = 0;i<200;i++){
            int a = Integer.parseInt(JOptionPane.showInputDialog("请输入一个数来开始游戏！退出请输入“-1”！"));

            if(a == -1){
                System.out.println("你输入的数字是："+a);
                System.out.println("你已退出程序！！");
                break;
            }

            if(a > num){
                count++;
                System.out.println("你输入的数字是："+a);
                System.out.println("你输入的数字大了！");
                continue;
            }
            if(a < num){
                count++;
                System.out.println("你输入的数字是："+a);
                System.out.println("你输入的数字小了");
                continue;
            }
            if(a == num){
                count++;
                System.out.println("你猜对了！这个数字是："+a);
                break;
            }
        }
        System.out.println("您一共用了"+count+"次机会！");
    }
}