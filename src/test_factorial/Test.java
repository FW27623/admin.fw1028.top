package test_factorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author FangWei
 */
public class Test {
    public  static  void main(String[] args) {
        factorial f = new factorial();
        f.init();
    }
}
class  factorial extends JFrame implements ActionListener {
    JLabel lab1 =new JLabel("请输入一个非负整数：");
    JTextField txt1 = new JTextField(10);
    JLabel lab2 =new JLabel("你输入的数的阶乘是：");
    JTextField txt2 = new JTextField(10);
    JButton btn = new JButton("计算");

    void init() {
        setBounds(200, 200, 300, 200);
        Container c =getContentPane();
        GridLayout grid = new GridLayout(3, 1);
        c.setLayout(grid);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p1.add(lab1);
        p1.add(txt1);
        p2.add(lab2);
        p2.add(txt2);
        p3.add(btn);
        btn.addActionListener(this);
        c.add(p1);
        c.add(p2);
        c.add(p3);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int b = Integer.parseInt(txt1.getText().trim());
            calc test = new calc(b);
            String result = test.getResult();
            txt2.setText(result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"输入错误，请重新输入！");
        }
    }
}
class calc {
    private String result="";
    private final int[] a;

    public calc(int m) {
        int i, j;
        int sum;
        int c;
        a = new int[10000];
        for (i = 0; i < 1000; i++) {
            a[i] = 0;
        }
        a[0] = 1;
        for (i = 2; i <= m; i++) {
            c = 0;
            for (j = 0; j < m; j++) {
                sum = a[j] * i + c;
                a[j] = sum % 10;
                c = sum / 10;
            }
        }

    }

    public String getResult() {
        int i, j;
        for (i = 999; i >= 0; i--) {
            if (a[i] != 0) {
                break;
            }
        }
        j = i;
        while (j >= 0) {
            result = result + (a[j] + "");
            j--;
        }
        return result;
    }
}