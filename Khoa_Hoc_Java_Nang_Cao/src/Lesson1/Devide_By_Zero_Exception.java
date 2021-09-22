package Lesson1;

public class Devide_By_Zero_Exception extends Exception{
    
    float a, b;

    public Devide_By_Zero_Exception(float a, float b) 
    {
        this.a = a;
        this.b = b;
    }
    @Override
    public String getMessage() {
        return "Divide By Zero Exception ("+ a +"/"+ b +")";
    }
    
}
