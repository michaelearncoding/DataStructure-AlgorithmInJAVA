package michaelmai;

public class VariableTest {
    public static void main(String[] args){
        //定义变量的方式1：
        char gender;// 过程1：变量的声明
        gender = '男';// 过程2：变量的赋值

        System.out.println(gender);

        float f1 = 12.3f;
        System.out.println(f1);

//        long l1 = 12.3333;
//        System.out.println(l1);
        // 表现形式1：
        char c1 = 'M';
        System.out.println(c1);

        boolean isMarried = false;
        if (!isMarried){
            System.out.println("Can have more sex with girls");
        }
        int num1 = 888;
        long num2 = num1; //自动类型提升
        System.out.println(num2);
        // 从小转到大，就可能会信心损失，所以编译会报错～
        // 先自增，再计算！ 直接变量++


    }

}
