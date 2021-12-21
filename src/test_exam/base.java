package test_exam;

/**
 * @author FangWei
 */

public class base {
    int One, Two;
    String operator = " ";
    boolean right;

    public int giveNumberOne(int n) {
        One = (int) (Math.random() * n) + 1;
        return One;
    }

    public int giveNumberTwo(int n) {
        Two = (int) (Math.random() * n) + 1;
        return Two;
    }

    public String giveOperator() {
        double d = Math.random();
        if (d >= 0.8) {
            operator = "+";
        } else if (d < 0.8 && d > 0.5) {
            operator = "-";
        }
        return operator;
    }

    public boolean getRight(int answer) {
        switch (operator) {
            case "+":
                right = answer == One + Two;
                break;
            case "-":
                right = answer == One - Two;
                break;
        }
        return right;
    }
}
