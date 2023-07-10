package michaelmai;


public class ForTest {
    public static void main(String[] args){
        // For 循环需要满足的三大条件，
        // 1）变量初始化；
        // 2）boolean判断条件；
        // 3) 循环体部分
        // 4）循环部分（主体代码）
        for(int i = 1,j=1; i <= 5 ;i++){
            //- for(;;)中的两个；不能多也不能少
            //- ①初始化部分可以声明多个变量，但必须是同一个类型，用逗号分隔
            //- ②循环条件部分为boolean类型表达式，当值为false时，退出循环
            //- ④可以有多个变量更新，用逗号分隔
            // 循环体
            System.out.println("Hello World");
            System.out.println(i+j);
        }
        int i =1, j=1;
        while(i <=5){
            i++;
            System.out.println("Hello World");
            System.out.println(i+j);
        }

    }
}
