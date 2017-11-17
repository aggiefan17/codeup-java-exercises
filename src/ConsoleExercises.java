import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        int userInput;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number.");
        userInput = scan.nextInt();


        String string1;
        String string2;
        String string3;

        System.out.println("Please enter 3 words and separate each with a space");

        string1 = scan.next();
        string3 = scan.next();
        string2 = scan.next();

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        String sentenceString;

        System.out.println("Please enter a complete sentence");

        sentenceString = scan.nextLine();

        System.out.println(sentenceString);


        float length;
        float width;
        float height;

        System.out.println("Please enter the length, width, and height of the classroom separated by a space");

        length = scan.nextFloat();
        width = scan.nextFloat();
        height = scan.nextFloat();

        float area = length * width;
        float perimeter = (2 * length) + (2 * width);
        float volume = length * width * height;

        System.out.println("The area of the classroom is " + area + " square feet.");
        System.out.println("The perimeter of the classroom is " + perimeter + " feet.");
        System.out.println("The volume of the classroom is " + volume + " cubic feet.");


    }
}
