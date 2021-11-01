package test_java;

public class Course {
    static String course="Java程序设计";
    public void show() {
        System.out.println("课程名称是"+course);
    }
    public static void main(String[] args) {
        Course test=new Course();
        test.show();
    }

}
