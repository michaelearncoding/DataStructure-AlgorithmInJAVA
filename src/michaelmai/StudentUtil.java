package michaelmai;//包的概念


public class StudentUtil {


    public void printStudentsWithState(Student[] students, int state){
        for (int i = 0; i< students.length; i++){
            if (state == students[i].state){
                Student stu = students[i];
                System.out.println(stu.show());
            }

        }




    }



}
