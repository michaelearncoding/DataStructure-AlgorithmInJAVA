package michaelmai;
// 导入包
import java.util.Scanner;
// 创建一个Scanner类的实例



public class ElseTest {
    public static void main(String[] args){
        int num = 1;
        switch(num){
            case 0:
                System.out.println("zero");
                break;// 如果没有遇到break的话，就会继续执行其他case及default中的语句，最后才退出当前的switch-case结构
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                break;
        }
        // 类的实例,而且前面的声明 也是这个class的名字
        Scanner scan = new Scanner(System.in);
        //提示信息：
        System.out.println("请输入你的姓名");
        // 调用类中的方法，获取指定类型的变量
        String name = scan.next();
        System.out.println("Hi"+" " + name);

        // 包 -> 类 -> 方法






    }
}
