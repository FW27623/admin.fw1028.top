package test_exam;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author FangWei
 */
public class exam_ui extends JFrame implements ActionListener {
        JTextField txt1,txt2,txt3;
        JButton btn1,btn2;
        JLabel lab1,lab2;
        base base;
        exam_ui(String s){
            super(s);
            base = new base();
            setLayout(new FlowLayout());
            txt1= new JTextField(6);
            txt2= new JTextField(6);
            txt3= new JTextField(6);
            lab1 = new JLabel("+");
            lab2 = new JLabel("请回答");
            btn1 = new JButton("获取题目");
            btn2 = new JButton("确认答案");
            add(btn1);
            add(txt1);
            add(lab1);
            add(txt2);
            add(new Label("="));
            add(txt3);
            add(btn2);
            add(lab2);
            txt3.requestFocus();
            txt1.setEditable(false);
            txt2.setEditable(false);
            btn1.addActionListener(this);
            btn2.addActionListener(this);
            txt3.addActionListener(this);
            setBounds(100,100,500,100);
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            validate();
            addWindowFocusListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
            );
        }

        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== btn1)
            {
                int number1 =base.giveNumberOne(100);
                int number2 =base.giveNumberTwo(100);
                String operator =base.giveOperator();
                txt1.setText(""+number1);
                txt2.setText(""+number2);
                txt3.setText(null);
                lab1.setText(operator);
                lab2.setText("请答题");
            }
            if(e.getSource()==btn2 )
            {
                String answer =txt3.getText();
                try{
                    int result=Integer.parseInt(answer);
                    if(base.getRight(result)) {
                        lab2.setText("答对了");
                    }else {
                        lab2.setText("答错了");
                    }
                }
                catch(NumberFormatException ex){
                    lab2.setText("请输入正确答案");
                }
            }
            txt3.requestFocus();
            validate();
        }
}
