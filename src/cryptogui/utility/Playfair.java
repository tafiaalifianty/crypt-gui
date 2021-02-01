package cryptogui.utility;

public class Playfair extends Crypt {
    //algoritma playfair cipher untuk karakter alfabet
    private String KeyWord = new String();
    private String Key = new String();
    private char matrix_arr[][] = new char[5][5];
 
    //konstruktor untuk inisialisasi kunci dalam bentuk matrix
    public Playfair(String Key){
        Key = clean(Key);
        String K_adjust = new String();
        boolean flag = false;
        K_adjust = K_adjust + Key.charAt(0);
        for (int i = 1; i <Key.length(); i++){
            for (int j = 0; j < K_adjust.length(); j++){
                if (Key.charAt(i) == K_adjust.charAt(j)){
                    flag = true;
                }
            }
            if (flag == false)
                K_adjust = K_adjust + Key.charAt(i);
            flag = false;
        }
        KeyWord = K_adjust;
        generateKey();
    }
    //fungsi untuk membersihkan data agar tidak karakter selain huruf
    private String clean(String text){
        String out = "";
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++){
            char cur = text.charAt(i);
            if(cur >= 97 && cur <= 122)
                out += cur;
        }
        return out;
    }
    //fungsi internal/private untuk generate key
    private void generateKey(){
        boolean flag = true;
        char current;
        Key = KeyWord;
        for (int i = 0; i < 26; i++){
            current = (char) (i + 97);
            if (current == 'j')
                continue;
            for (int j = 0; j < KeyWord.length(); j++){
                if (current == KeyWord.charAt(j))
                {
                    flag = false;
                    break;
                }
            }
            if (flag)
                Key = Key + current;
            flag = true;
        }
        genMatrix();
    }
    //menggenerate matrix bedasarkan kunci
    private void genMatrix(){
        int counter = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                matrix_arr[i][j] = Key.charAt(counter);
                counter++;
            }
        }
    }
    private String format(String old_text){
        int i = 0;
        int len = 0;
        String text = new String();
        len = old_text.length();
        for (int tmp = 0; tmp < len; tmp++)
        {
            if (old_text.charAt(tmp) == 'j')
            {
                text = text + 'i';
            }
            else
                text = text + old_text.charAt(tmp);
        }
        len = text.length();
        for (i = 0; i < len; i = i + 2){
            if (text.charAt(i + 1) == text.charAt(i))
            {
                text = text.substring(0, i + 1) + 'x' + text.substring(i + 1);
            }
        }
        return text;
    }
    //membagi pasangan playfair sehingga aturan untuk dekripsi/enkripsi dapat ditetapkan
    private String[] bagiPasangan(String new_string){
        //tambahkan karakter z apabila panjang string ganjil
        if(new_string.length() % 2 == 1){
            new_string += "z";
        }
        String plain = format(new_string);
        int size = plain.length();
        if (size % 2 != 0)
        {
            size++;
            plain = plain + 'x';
        }
        String x[] = new String[size / 2];
        int counter = 0;
        for (int i = 0; i < size / 2; i++)
        {
            x[i] = plain.substring(counter, counter + 2);
            counter = counter + 2;
        }
        return x;
    }
    //mendapatkan nilai masing-masing matriks yang sesungguhnya
    public int[] getDimen(char letter){
        int[] key = new int[2];
        if (letter == 'j')
            letter = 'i';
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (matrix_arr[i][j] == letter)
                {
                    key[0] = i;
                    key[1] = j;
                    break;
                }
            }
        }
        return key;
    }
    //fungsi untuk enkripsi menggunakan playfair
    public String encrypt(String plain){
        plain = clean(plain);
        String src_arr[] = bagiPasangan(plain);
        String cipher = new String();
        char one;
        char two;
        int part1[] = new int[2];
        int part2[] = new int[2];
        for (int i = 0; i < src_arr.length; i++)
        {
            one = src_arr[i].charAt(0);
            two = src_arr[i].charAt(1);
            part1 = getDimen(one);
            part2 = getDimen(two);
            if (part1[0] == part2[0])
            {
                if (part1[1] < 4)
                    part1[1]++;
                else
                    part1[1] = 0;
                if (part2[1] < 4)
                    part2[1]++;
                else
                    part2[1] = 0;
            }
            else if (part1[1] == part2[1])
            {
                if (part1[0] < 4)
                    part1[0]++;
                else
                    part1[0] = 0;
                if (part2[0] < 4)
                    part2[0]++;
                else
                    part2[0] = 0;
            }
            else
            {
                int temp = part1[1];
                part1[1] = part2[1];
                part2[1] = temp;
            }
            cipher = cipher + matrix_arr[part1[0]][part1[1]]
                    + matrix_arr[part2[0]][part2[1]];
        }
        return cipher;
    }
    //fungsi untuk dekripsi menggunakan playfair
    public String decrypt(String cipher){
        cipher = clean(cipher);
        String plain = new String();
        String src_arr[] = bagiPasangan(cipher);
        char one;
        char two;
        int part1[] = new int[2];
        int part2[] = new int[2];
        for (int i = 0; i < src_arr.length; i++)
        {
            one = src_arr[i].charAt(0);
            two = src_arr[i].charAt(1);
            part1 = getDimen(one);
            part2 = getDimen(two);
            if (part1[0] == part2[0])
            {
                if (part1[1] > 0)
                    part1[1]--;
                else
                    part1[1] = 4;
                if (part2[1] > 0)
                    part2[1]--;
                else
                    part2[1] = 4;
            }
            else if (part1[1] == part2[1])
            {
                if (part1[0] > 0)
                    part1[0]--;
                else
                    part1[0] = 4;
                if (part2[0] > 0)
                    part2[0]--;
                else
                    part2[0] = 4;
            }
            else
            {
                int temp = part1[1];
                part1[1] = part2[1];
                part2[1] = temp;
            }
            plain = plain + matrix_arr[part1[0]][part1[1]]
                    + matrix_arr[part2[0]][part2[1]];
        }
        return plain;
    }
}
