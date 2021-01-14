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
public class No2 {
    public static void main(String[] args) {
        //perulangan baris secara horizontal
        for (int i = 1; i <= 4; i++) {
            //perulangan baris secara vertical, print karakter mengikuti jumlah looping pertama
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }System.out.println("");//ketika perulangan kedua false atau selesai maka ganti baris
        }
    }
    
    
}
