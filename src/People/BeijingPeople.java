package People;

class BeijingPeople extends ChinaPeople{
    ChinaPeople a=new ChinaPeople();
    @Override
    public double averageHeight(String[] height) {
        return a.averageHeight(height) + height.length;
    }
    ChinaPeople b=new ChinaPeople();
    @Override
    public double averageWeight(String[] weight) {
        return b.averageWeight(weight) + weight.length;
    }
}
