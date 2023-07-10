package michaelmai;
import java.util.Scanner;//导入class

public class GuessGame {
    public static void main(String[] args){
        //生成随机数, Math是某个package的class，然后可以通过它去调用方法
        // 注意要强制转化运算结果
        int randomNum = (int)(Math.random()*100) + 1;
        //使用Scanner，从外部获得值。需要使用new这个关键词，需要实例化
        Scanner scan = new Scanner(System.in);
        //并且第一次变量赋值需要变量的声明
        int guess = scan.nextInt();
        //声明变量，记录猜的次数
        int guessCount = 0;

        while(randomNum != guess){
            if (guess > randomNum){
                System.out.println("输入的数字过大啦");
            }else if(guess < randomNum){
                System.out.println("输入的数字过小啦");
            }
            // if/ else if 都需要满足condition才会进行运行～
            System.out.println("请输入新的数字进行猜测");
            guess = scan.nextInt(); //前面已经对变量和使用的方法进行说明了，这里直接调用method就好
            guessCount++;
        }

        //能结束循环，说明 randomNum 和 guess 一致了～
        System.out.println("恭喜你，猜对了！");
        scan.close();



    }
}
