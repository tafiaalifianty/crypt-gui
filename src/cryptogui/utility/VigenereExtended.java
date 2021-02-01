package cryptogui.utility;

public class VigenereExtended extends Crypt {
    private String Key;
    //constructor untuk inisialisasi key vigenere extended
    public VigenereExtended(String Key){
        this.Key = Key;
    }
    //fungsi encrypt menggunakan vigenere extended
    public String encrypt(String plain) {
        String E = "";
        for (int i = 0, j = 0; i < plain.length(); i++) {
            char letter = plain.charAt(i);
            char curkey = Key.charAt(j);
            E += (char)(letter + curkey);
            j = ++j % Key.length();
        }
        return E;
    }
    //fungsi decrypt menggunakan vigenere extended
    public String decrypt(String cipher) {
        String D = "";
        for (int i = 0, j = 0; i < cipher.length(); i++) {
            char letter = cipher.charAt(i);
            char curkey = Key.charAt(j);
            D += (char)(letter - curkey);
            j = ++j % Key.length();
        }
        return D;
    }
}
