package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category");
        System.out.println("Enter your choice: ");
        int userInput = scan.nextInt();

        if (userInput == 0) {
            return;
        } else if (userInput == 1) {
            System.out.println();
        } else if (userInput == 2) {
            System.out.println();
        } else if (userInput == 3) {
            System.out.println();
        } else if (userInput == 4) {
            System.out.println();
        } else if (userInput == 5) {
            System.out.println();
        }
    }
}
