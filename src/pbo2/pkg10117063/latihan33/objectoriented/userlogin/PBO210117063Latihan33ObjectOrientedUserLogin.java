/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan33.objectoriented.userlogin;

import java.util.Scanner;

/*Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Membuat login 
 */
public class PBO210117063Latihan33ObjectOrientedUserLogin {

    private String usName;
    private String passWord;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PBO210117063Latihan33ObjectOrientedUserLogin user = new PBO210117063Latihan33ObjectOrientedUserLogin();
        
        System.out.print("Masukkan Username : ");
        user.usName = sc.next();
        System.out.print("Masukkan Password : ");
        user.passWord = sc.next();
        
        User login = new User();
        login.pengecekkanLogin(user.usName,user.passWord);
        
        System.out.println("");
    
       
    }
    
    }
