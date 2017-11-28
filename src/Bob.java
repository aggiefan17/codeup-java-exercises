import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please start a conversation");
        String userConversation = scan.nextLine();


        if (userConversation.endsWith("?")) {
            System.out.println("Sure");
        } else if (userConversation.trim().equals("")) {
            System.out.println("Fine. Be that way!");
        } else if (userConversation.equals(userConversation.toUpperCase())) {
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever.");
        }

    }
}
