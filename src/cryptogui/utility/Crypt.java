package cryptogui.utility;

//kelas abstrak untuk generalisasi ketika intansiasi
public abstract class Crypt {
    public abstract String decrypt(String cipher);
    public abstract String encrypt(String plain);
}
