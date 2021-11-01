package test_java;

public class Teacher {
    static String teacher_name="张帅兵";
    public void show() {
        System.out.println("任课教师是"+teacher_name);
    }
    public static void main(String[] args) {
        Teacher test=new Teacher();
        test.show();
    }

}
