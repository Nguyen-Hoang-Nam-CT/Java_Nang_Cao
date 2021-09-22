package Lesson1;
public class Calculator //máy tính (dùng để tính toán)
{ 
    public static float devide(float a, float b) throws Devide_By_Zero_Exception// chia
    {
        if(b == 0)
            throw new Devide_By_Zero_Exception(a, b);
        return a/b;
    }
    public static float plus(float a, float b)//cộng
    {
        return a + b;
    }
}
