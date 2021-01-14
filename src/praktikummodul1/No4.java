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
public class No4 {
    public static void main(String[] args) {
        //perulangan baris secara horizontal
        for (int i = 1; i <= 2; i++) {
            //perulangan baris secara horizontal
            for (int j = 1; j <= 5; j++) {
                //kondisi mencetak karakter jika baris horizontal 2
                //juga baris horizontal hanya 1 dan baris vertikal hanya 2
                if ( i==2||i==1 && j==2){
                  System.out.print("@");
                }else{//selain itu print spasi
                    System.out.print(" ");
                }
                
            }System.out.println("");//ketika perulangan selesai ganti baris
        }
    }
}
