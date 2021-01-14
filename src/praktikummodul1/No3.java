/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikummodul1;

/**
 *
 * @author apple
 */
public class No3 {
    public static void main(String[] args) {
        //perulangan baris secara horizontal
        for (int i = 1; i <= 5; i++) {
            //perulangan baris secara vertical
            for (int j = 1; j <= 5; j++) {
                //kondisi jika i = 1 atau i==2 dan j==4 atau i==3 dan j==3 maka cetak karakter 
                //cetak karakter di baris horizontal ke 1
                //atau hanya horizontal ke 2 dan hanya vertical ke 4 juga hanya horizontal ke 3 dan hanyavertical ke 3
                if ( i==1 || i==5||i==2 && j==4||i==3 && j==3||i==4&&j==2){
                  System.out.print("@");
                }else{//selain itu print spasi
                    System.out.print(" ");
                }
                
            }System.out.println("");//ganti baris ketika perulangan selesai
        }
    }
}
