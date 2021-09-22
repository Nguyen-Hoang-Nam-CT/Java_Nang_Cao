package Lesson1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Run_Try_Catch_Tu_Tao_And_Calculator 
{
    public static void main(String[] args) 
    {
        try 
        {
            System.out.print("\nKet qua phep chia: " + Calculator.devide(5, 0));
        } catch (Devide_By_Zero_Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
}
