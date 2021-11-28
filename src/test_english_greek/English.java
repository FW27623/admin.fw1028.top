package test_english_greek;

/**
 * @author FangWei
 */
public class English {
    public void printEnglish() {
        int firstEnglish, lastEnglish;
        char lastE = 'Z';
        firstEnglish = 'A';
        lastEnglish = lastE;
        System.out.println("英文字母表： ");
        for (int i = firstEnglish; i <= lastEnglish; ++i) {
            char uppercase, lowercase;
            uppercase = (char) i;
            lowercase = (char) (i + 32);
            System.out.print(" " + uppercase + lowercase);
        }
        System.out.println();
    }
}