package michaelmai.object;

public class StudentTest {
    public static void main(String[] args){
        //创建student『』
        Student[] students = new Student[20]; //
//        String[] students = new String[20];

        // 使用循环，给数组元素赋值
        for (int i=0; i<students.length;i++){
            students[i] = new Student();
            //给每个学生对象的number, state, score属性赋值
            students[i].number = i +1;
            students[i].state = (int)(Math.random()*6 + 1 );
            students[i].score = (int)(Math.random()*101);
            students[i].show();// 在那边定义的只有returan的话，就不会显示的，需要用println的方法～
            System.out.println(students[i].show());
            //空指针问题～
        }

        System.out.println("This is a Method Test~");
        // 要调用方法，先创建对象：
        StudentUtil util = new StudentUtil();
        // 调用对象的方法：
        util.printStudentsWithState(students,3); //直接按照定义的参数的顺序去写～！就会有自动的提示补充～



    }



}
