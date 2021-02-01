package cryptogui.utility;

public class VigenereAutoKey extends Crypt {
    private String Key;
    //constructor untuk inisialisasi key vigenere auto key
    public VigenereAutoKey(String Key){
        this.Key = Key;
    }
    //fungsi encrypt menggunakan vigenere autokey
    public String encrypt(String plain) {
        String E = "";
        for (int i = 0, j = 0, x = 0; i < plain.length(); i++) {
            char letter = plain.charAt(i);
            char curkey;
            if(j < Key.length()){
                curkey = Key.charAt(j);
            }else{
                curkey = plain.charAt(x);
                x = ++x % plain.length();
            }
            int init = 0, initkey = -1; 
            if(letter >= 65 && letter <= 90){
                init = 65;
            }else if(letter >= 97 && letter <= 122){
                init = 97;
            }
            if(curkey >= 65 && curkey <= 90){
                if(init == 65)
                    initkey = 0;
                else
                    initkey = 32;
            }else if(curkey >= 97 && curkey <= 122){
                if(init == 65)
                    initkey = -32;
                else
                    initkey = 0;
            }
            if(init != 0 && initkey != -1){
                E += (char)(((letter - init) + (curkey + initkey - init)) % 26 + init);
            }else{
                E += letter;
            }
            j++;
        }
        return E;
    }
    //fungsi decrypt menggunakan vigenere autokey
    public String decrypt(String cipher) {
        String D = "";
        for (int i = 0, j = 0, x = 0; i < cipher.length(); i++) {
            char letter = cipher.charAt(i);
            char curkey;
            if(j < Key.length()){
                curkey = Key.charAt(j);
            }else{
                curkey = D.charAt(x);
                x = ++x % cipher.length();
            }
            int init = 0, initkey = -1; 
            if(letter >= 65 && letter <= 90){
                init = 65;
            }else if(letter >= 97 && letter <= 122){
                init = 97;
            }
            if(curkey >= 65 && curkey <= 90){
                if(init == 65)
                    initkey = 0;
                else
                    initkey = 32;
            }else if(curkey >= 97 && curkey <= 122){
                if(init == 65)
                    initkey = -32;
                else
                    initkey = 0;
            }
            if(init != 0 && initkey != -1){
                D += (char)((letter - (curkey + initkey) + 26) % 26 + init);
            }else{
                D += letter;
            }
            j++;
        }
        return D;
    }
}
