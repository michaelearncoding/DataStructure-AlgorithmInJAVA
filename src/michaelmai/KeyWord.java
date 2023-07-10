package michaelmai;

public class KeyWord {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            if (i % 4 == 0){
//                break;//直接退出整个for循环结构
                continue;//4 和 8 直接跳开, 只是当次跳开
            }
            System.out.println(i);//4 和 8 直接跳开
        }

    }
}
