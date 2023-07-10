package michaelmai;

public class playground {
    public static void main(String[] args){
        int num1 = 10;
        int num2; //声明
        num2 = 20;//初始化

        //声明数据
        double[] prices;// 引用类型～
        prices = new double[]{20.32,43.21,43.22};//数组的初始化

//        String[] foods;
//        foods =new String[]{"","",""};

//        String[] foods;
//        foods = new String[4];

        //数组的声明&初始化
        String[] foods = new String[4];// 初始化完成，长度就确定了且不可更改～
        //类型推断：
//        double[] pricess = new double[]{};
        double pricess[] = {};
        // 上面代码等号省略了：new double[]


        int[] arr = new int[10];
        int max = arr[0];
        for (int i =0; i < arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);

        int[][] yangHui = new int[10][];
        for(int i= 0;i < yangHui.length; i++){
            yangHui[i] = new int[i+1];
        }

        //二分查找










    }
}
