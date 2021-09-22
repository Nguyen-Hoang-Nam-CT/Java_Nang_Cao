package Lesson1;

import java.util.Scanner;
public class Exception_Try_Catch 
{
    public static void main(String[] args) 
    {
        int a[] = new int[3];
        try 
        {
            for(int i=0; i < 4; i++)
            {
                a[i] = i;
                System.out.print("\nGan a[" + i + "] Thanh cong");
            } 
        } 
        catch (Exception e)  // nếu lõi thì sẽ nhảy xuống đây
        {
            System.out.print("\n" + e.getMessage());
        }
        finally // không quan tâm lỗi hay không cũng nhảy xuống đây
        {
            System.out.print("\nFinish 1");
        }           
    }
}
