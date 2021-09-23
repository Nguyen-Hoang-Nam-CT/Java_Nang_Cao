package Lesson2;

import java.util.Iterator;
import java.util.Stack;

public class _Stack {
    public static void main(String[] args) 
    {
        Stack<Integer> MyStack = new Stack<>(); 
        //phương thức push thêm 1 phần tử vào stack
        MyStack.push(0);
        MyStack.push(1);
        MyStack.push(2);
        MyStack.push(3);
        
        //peek() trả vè phần tử đầu tiên trong stack
        System.out.println("Phần tử đầu tiên của stack hiện tại là: " + MyStack.peek());
        
        //pop() lấy và trả về phần tử đầu tiên của stack
        System.out.println("Phần tử vừa lấy ra từ stack là: " + MyStack.pop());
        System.out.println("Phần tử đầu tiên của stack hiện tại là: " + MyStack.peek());
        
        //search() trả về vị trí của phần tử cần tìm tính từ đỉnh stack
        System.out.println("Vị trị của phần tử có giá trị là 2 là: " + MyStack.search(2));// tìm phần tử có giá trị là hai
        
        //size trả về kích thước của stack
        System.out.println("kích thước của stack hiện tại là: " + MyStack.size());
        
        //Duyệt qua stack // duyệt từ gốc lên
        Iterator<Integer> iterator = MyStack.iterator();
        System.out.print("Cac phan tu trong stack la: " + iterator.next());
        while(iterator.hasNext())
        {
            System.out.print("\t " + iterator.next());
        }
    }
}
