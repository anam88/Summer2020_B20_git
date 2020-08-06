package utility;

import java.util.Scanner;

public class gitFun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message");
        String msg = input.nextLine();
        System.out.println("Enter your batch name");
        String batchName = input.next();
        System.out.println("Enter your group name");
        String groupName = input.next();

        System.out.println(msg+" : "+batchName+" : "+groupName);
    }
}
