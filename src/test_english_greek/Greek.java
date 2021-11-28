package test_english_greek;

/**
 * @author FangWei
 */
public class Greek {
    public void printGreek() {
        int firstLetter, lastLetter;
        char lastG = 'ω';
        firstLetter = 'α';
        lastLetter = lastG;
        System.out.println("希腊字母表： ");
        for (int i = firstLetter; i <= lastLetter; ++i) {
            char greekLetter;
            greekLetter = (char) i;
            System.out.print(" " + greekLetter);
        }
        System.out.println();
    }
}