/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

/**
 *
 * @author Admin
 */
public class RunGeneric {
    public static void main(String[] args) {
        Generic_Tra_Ve_Kieu_Du_Lieu_Bat_Ky<Integer, String> intString = new Generic_Tra_Ve_Kieu_Du_Lieu_Bat_Ky<>();
        
        intString.get(5);
        intString.pr(5, "haha");
    }
}
