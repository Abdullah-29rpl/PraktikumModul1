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
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //perulangan baris secara horizontal
        for (int i = 1; i <= 4; i++) {
            //perulangan baris secara vertical
            for (int j = 1; j <= 4; j++) {
                //kondisi jika baris horizantal == 1 atau 4 maka print karakter sebanyak i<=4
                //kondisi jika baris vertical == 1 atau 4 maka print karakter sebanyak j<=4 
                if (i==1 || i==4 || j==1 || j==4){
                  System.out.print("@"); 
                  //selain kondisi diatas maka print spasi
                }else{
                  System.out.print(" ");  
                }
                
            }System.out.println("");//ketika perulangan pertama (i) di baris nya selesai maka ganti baris dan seterusnya
        }
    }
    
}
