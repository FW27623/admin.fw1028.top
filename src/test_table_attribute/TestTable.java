package test_table_attribute;

public class TestTable {
    public static void main(String[] args) {
        Table a = new Table("课桌", 10, 5, 2, 1.5);
        a.Display();
        a.ChangeWeight(20);
        a.Display();
    }
}