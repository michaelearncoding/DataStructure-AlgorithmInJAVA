package michaelmai;

/*
* 赋值运算符
*
*
* */

public class SetValueTest {
    public static void main(String[] args){
        int i =5;
        long b = (byte)i;

        System.out.println(b+"SHIT, whatever");

        int a1 = 1, a2 = 2;
        System.out.println(a1+"SHIT, whatever"+a2);

        if(false || true){
            System.out.println(a1+"SHIT, whatever"+a2);//1SHIT, whatever2
            //1SHIT, whatever2
            // 如果是 false && true， 就无法输出了，短路了
            // 如果是false | true/ false || true ， 就可以输出～因为是或
        }
        // 交换两个变量的值
        int m = 666;
        int n = 777;
        int temp = m;
        m = n;
        n = temp;
        System.out.println(m+n); // 如果直接 m+n 就会有问题～

        int week = 2;
        week += 10;
        week %= 7;
        System.out.println(week); // 如果直接 m+n 就会有问题～








    }
}

