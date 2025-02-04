// Program to Find ASCII Value of a character
public class AsciiValue {
    public static void main(String[] args){
        char ch = 'a';
        int ascii = ch;

        int castascii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castascii);
    }
}
