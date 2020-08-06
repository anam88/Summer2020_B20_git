package utility;
import java.util.Scanner;
public class reverseAString {
    public static void main(String[] args) {

        //067. Reverse it

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int wordLength = word.length();
        if (wordLength == 5) {
            System.out.println("" + word.charAt(4) + word.charAt(3)
                    + word.charAt(2) + word.charAt(1) + word.charAt(0));
        }else if (wordLength > 5) {
            System.out.println("Too long!");
        }else{
            System.out.println("Too short!");
        }

    }
}
