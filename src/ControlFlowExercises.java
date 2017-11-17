import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        long i = 2;
//
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);


//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }


//        for (int num = 1; num <= 100; num += 1) {
//            if (num % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (num % 3 == 0){
//                System.out.println("Fizz");
//            } else if (num % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(num);
//            }
//        }


        Scanner scan = new Scanner(System.in);
//
//
//        int userInput;
//
//        System.out.print("Please enter a number greater than 0: ");
//        userInput = scan.nextInt();
//
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | ------");
//
//        int base = 1;
//
//        for (base = 1; base <= userInput; base += 1) {
//        int number = base * 1;
//        int squared = base * base;
//        int cubed = base * base * base;
//            System.out.printf("%-7d| %-8d| %d\n", number, squared, cubed);
//        }

        System.out.println("Would you like to input a grade?");
        String userAgrees = scan.next();
        boolean confirmation = userAgrees.equals("yes");

            while (confirmation  == true) {
                System.out.print("Please enter a grade between 0 and 100: ");
                int gradeInput = scan.nextInt();
                if(gradeInput <= 100 && gradeInput >= 88) {
                    System.out.println("Grade is an 'A'");
                } else if (gradeInput <= 87 && gradeInput >= 80) {
                    System.out.println("Grade is a 'B'");
                } else if (gradeInput <= 79 && gradeInput >= 67) {
                    System.out.println("Grade is a 'C'");
                } else if (gradeInput <= 66 && gradeInput >= 60) {
                    System.out.println("Grade is a 'D'");
                } else {
                    System.out.printf("Grade is an 'F'");
                }
                System.out.println("Would you like to input a grade?");
                userAgrees = scan.next();
                confirmation = userAgrees.equals("yes");
            }
    }
}
