package cryptogui.utility;

public class VigenereExtendedBytes{
    private String Key;
    //constructor untuk inisialisasi key vigenere extended bytes
    public VigenereExtendedBytes(String Key){
        this.Key = Key;
    }
    //fungsi encrypt menggunakan vigenere extended bytes
    public byte[] encrypt(byte[] plain) {
        for (int i = 0; i < plain.length; i++) {
            int curkey = Key.charAt(i % Key.length()) - 32;
            int c = plain[i] & 255;
            if ((c >= 32) && (c <= 127)) {
                int x = c - 32;
                x = (x + curkey) % 96;
                plain[i] = (byte) (x + 32);
            }
        }
        return plain;
    }
    //fungsi decrypt menggunakan vigenere extended bytes
    public byte[] decrypt(byte[] cipher) {
        for (int i = 0; i < cipher.length; i++) {
            int curkey = Key.charAt(i % Key.length()) - 32;
            int c = cipher[i] & 255;
            if ((c >= 32) && (c <= 127)) {
                int x = c - 32;
                x = (x - curkey + 96) % 96;
                cipher[i] = (byte) (x + 32);
            }
        }
        return cipher;
    }
}
