package utility;

import java.util.Scanner;

public class gitCommands {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The git commands");
        System.out.println("Which command we use to start a new repository?");
        String comm1 = input.nextLine();
        System.out.println("Which command we use to add a file to the staging area?");
        String comm2 = input.nextLine();
        System.out.println("Which command snapshots the file?");
        String comm3 = input.nextLine();
    }
}
