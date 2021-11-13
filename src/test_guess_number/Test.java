package test_guess_number;

import javax.swing.*;

/**
 * @author FangWei
 */
public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("猜大小：难度选择");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        JButton Easy = new JButton("简单");
        Easy.setBounds(0, 40, 80, 30);
        panel.add(Easy);

        JButton Common = new JButton("一般");
        Common.setBounds(100, 40, 80, 30);
        panel.add(Common);

        JButton Difficult = new JButton("困难");
        Difficult.setBounds(200, 40, 80, 30);
        panel.add(Difficult);

        JButton loginButton = new JButton("退出");
        loginButton.setBounds(100, 80, 80, 30);
        panel.add(loginButton);
    }
}

