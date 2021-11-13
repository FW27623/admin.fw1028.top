package test_family_name;

/**
 * @author FangWei
 */
public class Name {
    static String front_name;
    public String name;
}
    class Family {
        public static void main(String[] args) {
            Name.front_name="方";
            Name father=new Name();
            Name first_son=new Name();
            Name second_son=new Name();
            father.name="XX";
            first_son.name="X";
            second_son.name="XXX";
            System.out.println("父亲的名字为："+Name.front_name+father.name);
            System.out.println("大儿子的名字为："+Name.front_name+first_son.name);
            System.out.println("二儿子的名字为："+Name.front_name+second_son.name);
        }

    }
