package test_grade;

/**
 * @author FangWei
 */
public class SongGame implements ComputerAverage{
    @Override
    public double average (double[] x){
        double total = 0;
        double min,max;
        min = x[0];
        max = x[0];
        for (double v : x) {
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
        }
        for (double v : x) {
            total = total + v;
        }
        total = total - min - max;
        return total/(x.length-2);
    }
}
class School implements ComputerAverage{
    @Override
    public double average(double[] x) {
        double total = 0;
        for (double v : x) {
            total = total + v;
        }
        return total/x.length;
    }
}