package test_Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author FangWei
 */
public class Login {
    public static void main(String[] args) {
        new LoginWindow();
    }
}

class LoginWindow extends JFrame{
    public LoginWindow() {
        JTextField txt = new JTextField(10);
        JPasswordField psw = new JPasswordField(10);
        JLabel txtLab = new JLabel("用户名:");
        JLabel pswLab = new JLabel("密    码:");
        JButton btn = new JButton("登    录");
        Container c = getContentPane();
        GridLayout grid = new GridLayout(3, 1);
        c.setLayout(grid);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p1.add(txtLab);
        p1.add(txt);
        p2.add(pswLab);
        p2.add(psw);
        p3.add(btn);
        LoginListener login = new LoginListener(txt, psw);
        btn.addActionListener(login);
        c.add(p1);
        c.add(p2);
        c.add(p3);
        setBounds(300, 300, 300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class LoginListener implements ActionListener{
    JTextField t;
    JPasswordField p;
    public LoginListener(JTextField t, JPasswordField p) {
        this.t = t;
        this.p = p;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = t.getText();
        String psw = String.valueOf(p.getPassword());
        if("admin".equals(user) && "admin".equals(psw)) {
            JOptionPane.showMessageDialog(null, "用户合法");
        } else if("admin1".equals(user) && "admin".equals(psw)){
            JOptionPane.showMessageDialog(null, "用户合法");
        }else if("admin2".equals(user) && "admin".equals(psw)){
            JOptionPane.showMessageDialog(null, "用户合法");
        }else if("admin3".equals(user) && "admin".equals(psw)){
            JOptionPane.showMessageDialog(null, "用户合法");
        }else if("admin4".equals(user) && "admin".equals(psw)){
            JOptionPane.showMessageDialog(null, "用户合法");
        }else{
            JOptionPane.showMessageDialog(null, "用户不合法");
        }
    }
}

