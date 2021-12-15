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
    Button button = new Button("Calculate");
    JTextArea showArea = new JTextArea();
    JTextField jTextField = new JTextField(5);

    void init() {
        setBounds(200, 200, 300, 200);
        JPanel p = new JPanel();
        p.add(new JLabel("请输入一个非负整数：", SwingConstants.LEADING));
        p.add(jTextField);
        p.add(button);
        button.addActionListener(this);
        add(p, BorderLayout.NORTH);
        add(new JScrollPane(showArea), BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int b = Integer.parseInt(jTextField.getText().trim());
            calc test = new calc(b);
            String result = test.getResult();
            showArea.append("数字" + b + "的阶乘为：" + result + "\n");

        } catch (Exception ex) {
            showArea.append("输入错误"+"\n");
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