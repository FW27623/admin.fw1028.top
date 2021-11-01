package test_english_greek;

public class Greek {
    public void printGreek() {
        int firstLetter, lastLetter;
        /*定义两个变量firstLetter和lastLetter*/
        char lastG = 'ω';
        firstLetter = 'α';
        /*定义最后一个希腊字母为ω，第一个希腊字母为α*/
        lastLetter = lastG;
        System.out.println("希腊字母表： ");
        /*输出“希腊字母表：”这几个字*/
        for (int i = firstLetter; i <= lastLetter; ++i) {
            /*从α加一直加到ω*/
            char greekLetter;
            greekLetter = (char) i;
            System.out.print(" " + greekLetter);
        }
        System.out.println();
        /*输出希腊字母*/
    }
}