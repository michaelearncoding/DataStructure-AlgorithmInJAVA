package michaelmai.object;

import michaelmai.object.Student;

public class StudentUtil {


    public void printStudentsWithState(Student[] students, int state){
        for (int i = 0; i< students.length; i++){
            if (state == students[i].state){
                Student stu = students[i];
                System.out.println(stu.show());
            }

        }
    }

    //遍历学生数组
    public void printStudents(michaelmai.object.Student[] students){
        for (int i = 0; i <students.length; i++){
            System.out.println(students[i].show());
        }
    }



}
