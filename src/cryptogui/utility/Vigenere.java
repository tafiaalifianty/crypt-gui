package cryptogui.utility;

public class Vigenere extends Crypt {
    private String Key;
    //constructor untuk inisialisasi key vigenere cipher
    public Vigenere(String Key){
        this.Key = Key;
    }
    //fungsi encrypt menggunakan vigenere cipher
    public String encrypt(String plain) {
        String E = "";
        for (int i = 0, j = 0; i < plain.length(); i++) {
            char letter = plain.charAt(i);
            char curkey = Key.charAt(j);
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
            j = ++j % Key.length();
        }
        return E;
    }
    //fungsi decrypt menggunakan vigenere cipher
    public String decrypt(String cipher) {
        String D = "";
        for (int i = 0, j = 0; i < cipher.length(); i++) {
            char letter = cipher.charAt(i);
            char curkey = Key.charAt(j);
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
            j = ++j % Key.length();
        }
        return D;
    }
}
