package test_english_greek;

public class English {
    public void printEnglish() {
        int firstEnglish, lastEnglish;
        /*定义两个变量firstEnglish和lastEnglish*/
        char lastE = 'Z';
        firstEnglish = 'A';
        /*定义最后一个字母为‘z’，定义第一个字母为'a'*/
        lastEnglish = lastE;
        System.out.println("英文字母表： ");
        /*输出“英文字母表：”这几个字*/
        for (int i = firstEnglish; i <= lastEnglish; ++i) {
            char uppercase, lowercase;
            /*定义大写为uppercase，小写为lowercase*/
            uppercase = (char) i;
            lowercase = (char) (i + 32);
            /*大小写互相转换方法，小写字母+32=大写字母；大写字母+32=小写字母*/
            System.out.print(" " + uppercase + lowercase);
        }
        System.out.println();
        /*输出英文字母表*/
    }

}