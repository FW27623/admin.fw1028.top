package test_people;

import java.util.Arrays;

class ChinaPeople extends People{
    public void chinaKongfu(String kongfuName){
        System.out.println(kongfuName);
    }

    @Override
    public void speakHello(String hello) {
        System.out.println(hello);
    }

    @Override
    public double averageHeight(String[] height) {
        return height(height);
    }

    @Override
    public double averageWeight(String[] weight) {
        return height(weight);
    }

    private double height(String[] height) {
        double[] x =new double[6];
        int a = 0;
        if (a < height.length) {
            do {
                x[a] = Double.parseDouble(height[a]);
                a++;
            } while (a < height.length);
        }
        double sum= Arrays.stream(x).sum();
        return sum/x.length;
    }
}