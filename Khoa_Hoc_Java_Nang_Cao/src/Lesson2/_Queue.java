package Lesson2;

import java.util.LinkedList;
import java.util.PriorityQueue; // phải import package này dô nếu muốn sử dụng Queue
import java.util.Queue;


public class _Queue 
{
    public static void main(String[] args) 
    {
        // cú pháp của Queue (hàng đợi)
        
        // add() or offer() thêm phân tử vào queue
        PriorityQueue<String> YourQueue = new PriorityQueue<>();//  cả 2 cách đều được
        Queue<String> MyQueue = new LinkedList<>();
        
        System.out.println("Đã thêm phần tử a1,a2,a3,a4 vào hàng đợi \n");
        MyQueue.offer("a1"); // thêm chuổi A1 vào queue// hàng đợi // tương tự với hàm push
        MyQueue.add("a2");
        MyQueue.offer("a3");
        MyQueue.add("a4");
        
        //peek(), element() trả về phần tử đầu tiên của hàng đợi
        System.out.println("Phần tử đầu tiên ở trong hàng đợi là: " + MyQueue.peek());
        System.out.println("Phần tử đầu tiên ở trong hàng đợi là: " + MyQueue.element());
        
        
        //poll(), remove() lấy và trả về phần tử đầu tiên của hàng đợi
        System.out.println("\nPhần tử vừa lấy ra từ hàng đợi là: " + MyQueue.poll());// tương tự với hàm pop 
        System.out.println("Phần tử vừa lấy ra từ hàng đợi là: " + MyQueue.remove());
        
       //isEmpty() kiểm tra hàng đợi có rỗng không // trả về true false
        System.out.println("hiện tại hàng đợi đang rỗng phải không mày?: " + MyQueue.isEmpty());
        
        //clear() xóa tất của các phần tử có trong hàng đợi
        MyQueue.clear();
        System.out.println("\nSau khi gọi hàm clear thì hàng đợi đang rỗng phải không mày?: " + MyQueue.isEmpty());
        
        //contains("hihi"); // tham số truyền vào là phần tử cần tìm trong hàng đợi trả về true nếu tìm thầy ngược lại false
        System.out.println("\nĐã thêm phần tử a5,a6,a7 dô hàng đợi");
        MyQueue.add("a5");
        MyQueue.add("a6");
        MyQueue.add("a7");
        System.out.println("\nPhần tử a5 có trong hàng đợi không?: " + MyQueue.contains("a5"));
        System.out.println("Phần tử a4 có trong hàng đợi không?: " + MyQueue.contains("a4"));
        
        //size(); trả về kích thước queue
        System.out.println("Size hàng đợi hiện tại là: "  + MyQueue.size());
        
        
        //duyệt queue
        System.out.print("\nCác phần tử có trong hàng đợi hiện tại là: ");
        for(String element: MyQueue)
        {
            System.out.print("\t " + element);
        }
    }
}
