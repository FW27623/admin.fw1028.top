package test_java;

import static java.lang.System.out;

/**
 * @author FangWei
 */
public class ClassRoom {
    static String classroom="VBSE实验室";

    public static void main(String[] args) {
        out.println("我是"+Student.student+"，是2019级电子商务班的学生，所上课程名称为"+Course.course+","
           +"在"+classroom+"上课,任课教师是" +Teacher.teacher_name+"。");
    }
}