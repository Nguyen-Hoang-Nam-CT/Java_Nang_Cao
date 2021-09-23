package Lesson2;
public class Generic_Tra_Ve_Kieu_Du_Lieu_Bat_Ky<E, E1> // với E là kiểu dữ liệu ngẫu nhiên mà khi người dùng gọi mới biết // có thể truyển dô nhiều chữ
{
    public E get(E e)
    {
        return e;
    }
    public void pr(E e, E1 e1)
    {
        System.out.print("\nTham so thu nhat la: " + e);
        System.out.print("\nTham so thu hai la: " + e1);
    }
}
