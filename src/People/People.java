package People;

abstract class People{
    protected double[] height;
    protected double[] weight;
    public abstract void speakHello(String hello);
    public abstract double averageHeight(String[] height);
    public abstract double averageWeight(String[] weight);
}
