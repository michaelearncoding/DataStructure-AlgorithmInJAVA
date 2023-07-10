package michaelmai;
//https://blog.csdn.net/NEXTLJP/article/details/77949597

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
/*
// main()方法是固定的：需要背诵，因为这个表示的是程序的入口
// public static void main(String[] args){}
// 严格区分大小写，eg :String

*/

public class DifferentProblems {
    public static void main(String args[]){
        System.out.println("Hello Michael, lets solve some problems~");
        // 从控制台输出数据的操作：
        // System.out.println(""),代码结束后需要带有;结尾

        //Queue 排队
        // First in and first out
        // A collectioin designed for holding elements prior to processing
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Michael");
        queue.offer("Helen");
        queue.offer("Nobody");

        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.size());

        // LinkedList 编程 Priorityueue,
        Queue<Double> queue2 = new PriorityQueue<>();
        queue2.offer(4.0);
        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }
    }

}
