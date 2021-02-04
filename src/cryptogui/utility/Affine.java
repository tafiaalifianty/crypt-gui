package cryptogui.utility;

import java.lang.Math; 

//spesifikasi affine cipher: hanya bisa mengenkripsi 26 karakter alfabet bukan kapital
public class Affine extends Crypt {
    private static final int Key1 = 5; //diambil 5 karena 5 relatif prima terhadap 26
    private int Key2; //jumlah pergeseran
    
    //constructor untuk inisialisasi key affine cipher
    public Affine(String Key2){
        int i = Integer.parseInt(Key2);
        this.Key2 = i;
    }
    
    //fungsi encrypt menggunakan affine cipher
    public String encrypt(String plain) {
        String E = "";
        for (int i = 0; i < plain.length(); i++) {
             char letter = plain.charAt(i);
             E += (char)(((this.Key1 * ((int) letter - 97) + this.Key2) % 26) + 97);
        }
        return E;
    }
    //fungsi decrypt menggunakan affine cipher
    public String decrypt(String cipher) {
        String D = "";
        for (int i = 0; i < cipher.length(); i++) {
            char letter = cipher.charAt(i);
            
            //cari modular inverse dari Key1
            int j = 0;
            boolean found = false;
            int inverse = 0;
            while (j < 26 && found == false) {
                if ((j * Key1)%26 == 1){
                    inverse = j;
                    found = true;
                } else {
                    j++;
                }
            }
            D += (char)(Math.floorMod((inverse * (letter - 97 - this.Key2)), 26) + 97);  
        }
        return D;
    }
}
