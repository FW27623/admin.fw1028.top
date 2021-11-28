package test_people;

/**
 * @author FangWei
 */
public class test {
    public static void main(String[] args) {
        ChinaPeople aa=new ChinaPeople();
        String[] height={"169","175","178","162","185","166"};
        String[] weight={"125","124","105","110","104","116"};
        BeijingPeople ab=new BeijingPeople();
        System.out.println("ChinaPeople类中的平均身高是："+aa.averageHeight(height));
        System.out.println("ChinaPeople类中的平均体重是："+aa.averageWeight(weight));
        System.out.println("BeijingPeople类中的身高之和是："+ab.averageHeight(height));
        System.out.println("BeijingPeople类中的体重之和是："+ab.averageWeight(weight));
    }
}
