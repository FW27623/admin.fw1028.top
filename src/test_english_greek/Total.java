package test_english_greek;

public class Total {
    public static void main(String[] args) {
        var e = new English();
        /*访问English.java*/
        var g = new Greek();
        /*访问Greek.java*/
        e.printEnglish();
        /*输出英语字母表*/
        g.printGreek();
        /*输出希腊字母表*/
    }
}
