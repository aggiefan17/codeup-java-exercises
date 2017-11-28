import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println(addNumbers(2, 3));
//        System.out.println(subtractNumbers(5, 4));
//        System.out.println(multiplyNumbers(3, 6));
//        System.out.println(divideNumbers(10, 2));
//        System.out.println(remainder(7, 4));
//
//        System.out.println(getInteger(1,10));

//        System.out.println(rollDiceGame(nSides));

    }

//    public static int addNumbers (int firstNumber, int secondNumber) {
//        return firstNumber + secondNumber;
//    }
//
//    public static int subtractNumbers (int firstInteger, int secondInteger) {
//        return firstInteger - secondInteger;
//    }
//
//    public static int multiplyNumbers (int firstMultiple, int secondMultiple) {
//        return firstMultiple * secondMultiple;
//    }
//
//    public static int divideNumbers (int numerator, int denominator) {
//        return numerator / denominator;
//    }
//
//    public static int remainder (int topNumber, int bottomNumber) {
//        return topNumber % bottomNumber;
//    }
//
//
//    public static int getInteger(int min, int max) {
//
        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter a number between " + min + " and " + max + ": ");
//        int userInput = scan.nextInt();
//
//        if (userInput < min || userInput > max) {
//            return getInteger(min, max);
//        } else {
//            return userInput;
//        }
//    }



//    public static int factorial(int n) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter number between 1 and 10: ");
//        int userNumber = scan.nextInt();
//
//        for (n = 1; n <= userNumber; n++) {
//            if (userNumber < 0) {
//                return factorial(n);
//            } else if (userNumber > 10) {
//                return factorial(n);
//            } else if (userNumber == 0) {
//                return 1;
//            } else {
//                return n * factorial(n - 1);
//            }
//        }
//    }

//    public static int getInteger(int min, int max) {
//                Scanner sc = new Scanner(System.in);
//                if (!sc.hasNextInt()) {
//                    System.out.println("Not a number!");
//                        return getInteger(min, max);
//                    }
//                int userInput = sc.nextInt();
//                if (userInput >= min && userInput <= max) {
//                        return userInput;
//                    } else {
//                        System.out.println("Number not in range!");
//                        return getInteger(min, max);
//                    }
//            }
//
//    public static int randomWithRange(int min, int max)
//     {
//         int range = (max - min) + 1;
//                return (int)(Math.random() * range) + min;
//            }
//
//     public static void rollDiceGame(Scanner sc) {
//        String userChoice;
//        System.out.print("Please enter the number of sides for the dice: ");
//        int nSides = getInteger(1, 20);
//        do {
//                System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
//                do {
//                        System.out.println("Would you like to roll again? [y/n]");
//                        userChoice = sc.next().trim();
//                    } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//
//                    } while (!userChoice.equals("n"));
//    }

 }



