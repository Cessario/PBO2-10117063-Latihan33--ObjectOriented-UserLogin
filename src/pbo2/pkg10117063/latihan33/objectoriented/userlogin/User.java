/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan33.objectoriented.userlogin;

/*Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Membuat login
 */
public class User {
    private  String username = "RizkiAdam";
    private  String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName,String parPassword){
    statusAkun = false;
    if(parUserName.equals(username) && parPassword.equals(password))
        statusAkun = true;
    return statusAkun;
    }
    private void hasiLogin(boolean status,String parUserName){
        this.cekAkun(parUserName, password);
        status = this.statusAkun;
        if (status == true){
            System.out.println("********HALLO " + parUserName.toUpperCase() + "********");
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else{
            System.out.println("Ooops, Username atau Password anda salah");
        }
        
        }
        public void pengecekkanLogin(String parUserName,String parPassword){
        this.cekAkun(parUserName, parPassword);
        this.hasiLogin(statusAkun, parUserName);
        
        
        }
        
        
}
