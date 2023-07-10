package michaelmai;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr2 = new int[]{};
        int target = 5;

        int head = 0;//默认索引
        int end = arr2.length -1;//默认索引
        while (head<= end){
            int middle = (head + end)/2;

            if(target == arr2[middle]){
                System.out.println("找到了"+ target);
                break;
            }else if(target > arr2[middle]){
                head = middle + 1;
            }else{
                end = middle -1;
            }
        }
    }

}
