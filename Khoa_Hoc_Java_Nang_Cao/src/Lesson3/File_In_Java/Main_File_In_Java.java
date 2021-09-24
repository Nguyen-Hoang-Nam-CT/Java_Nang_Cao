/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3.File_In_Java;

//phần 1
import java.io.File;

//phần 2
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//phần 3
import java.io.FileReader;
import java.io.FileWriter;

//phần 4
import java.io.BufferedInputStream;


/**
 *
 * @author Admin
 */
public class Main_File_In_Java {
    public static void main(String[] args) throws IOException 
    {
        // Phần 1 tìm file, tạo file, xóa file
//        File file = new File("E:\\1_May_Tinh\\5_Mon_Hoc_Ki_5\\77_Huong_Doi_Tuong_Ngon_Ngu_Cao\\Code_Java\\KhoaHocJavaTrenMang_ChuaGit\\TXTCuaBai3\\test.txt");
//        if(file.isFile())
//        {
//            //file.delete();
//            System.out.println("Đã tìm thầy file");
//        }
//        else
//        {
//            System.out.println("Không tìm thấy file");
//            file.createNewFile();
//        }
        
//=====================================================================================================================================================================================      
//        // Phần 2 mở file để đọc mở file để ghi (file text và file nhị nhân)
//        FileInputStream fileInputStream = null;
//        FileOutputStream fileOutputStream = null;
//        try
//        {
//            fileInputStream = new FileInputStream("E:\\1_May_Tinh\\5_Mon_Hoc_Ki_5\\77_Huong_Doi_Tuong_Ngon_Ngu_Cao\\Code_Java\\KhoaHocJavaTrenMang_ChuaGit\\TXTCuaBai3\\test.txt");
//            fileOutputStream = new FileOutputStream("E:\\1_May_Tinh\\5_Mon_Hoc_Ki_5\\77_Huong_Doi_Tuong_Ngon_Ngu_Cao\\Code_Java\\KhoaHocJavaTrenMang_ChuaGit\\TXTCuaBai3\\text_cp.txt");
//            int ch;
//            while((ch = fileInputStream.read()) != -1) // phương thức trong đây trả về mã assci của ký tự
//            {
//                fileOutputStream.write(ch); // đọc từng ký tự của file test.txt sang test_cp.txt
//                System.out.print("\t" + (char)ch);
//            }
//        }
//        catch(FileNotFoundException ex)
//        {
//            System.out.println(ex.getMessage());
//        }
//        finally
//        {
//            if(fileInputStream != null)
//                fileInputStream.close();
//            if(fileOutputStream != null)
//                fileOutputStream.close();
//        }
        
//=====================================================================================================================================================================================       
//        //Phần 3: mở đọc và ghi file text (chỉ file text)
//        FileReader fileReader = null;
//        FileWriter fileWriter = null;
//        try
//        {
//            fileReader = new FileReader("E:\\1_May_Tinh\\5_Mon_Hoc_Ki_5\\77_Huong_Doi_Tuong_Ngon_Ngu_Cao\\Code_Java\\KhoaHocJavaTrenMang_ChuaGit\\TXTCuaBai3\\test.txt"); // nếu mà không tìm thầy thì báo lỗi :)) khóc la um sùm
//            fileWriter = new FileWriter("E:\\1_May_Tinh\\5_Mon_Hoc_Ki_5\\77_Huong_Doi_Tuong_Ngon_Ngu_Cao\\Code_Java\\KhoaHocJavaTrenMang_ChuaGit\\TXTCuaBai3\\test_cp2.txt"); // nếu mà không tìm thầy file thì tạo file mới để ghi luôn, nếu file đã tồn tại thì ghi đè lên file
//            int ascii;
//            while((ascii = fileReader.read()) != -1)
//            {
//                System.out.print("\t" + (char)ascii);
//                fileWriter.write(ascii);
//            }
//            fileWriter.write("\nHello world");
//        }
//        catch(FileNotFoundException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        finally
//        {
//            if(fileReader != null)
//                fileReader.close();
//            if(fileWriter != null);
//                fileWriter.close();
//        }
        
        
        
//=====================================================================================================================================================================================  
        //Phần 4: BufferedInputStream(), BufferedOutputStream() // tốc độ đọc nhanh muốn biết thêm thì lên google 
        FileInputStream fileInputStream1 = null;
        BufferedInputStream bufferedInputStream = null;
        try
        {
            fileInputStream1 = new FileInputStream("E:\\1_May_Tinh\\5_Mon_Hoc_Ki_5\\77_Huong_Doi_Tuong_Ngon_Ngu_Cao\\Code_Java\\KhoaHocJavaTrenMang_ChuaGit\\TXTCuaBai3\\test.txt"); // dùng thằng này để lấy đường dẫn
            bufferedInputStream = new BufferedInputStream(fileInputStream1); // xong đưa dô thằng để sử lý để tăng tốc độ
            
        }
        catch(FileNotFoundException e)
        {
            
        }
        finally
        {
            
        }
    }
}
