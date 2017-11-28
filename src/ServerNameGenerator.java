import java.util.Random;

public class ServerNameGenerator {


    public static void main(String[] args) {

    String[] adjectives = {"annoyed", "anxious", "clumsy", "foolish", "lazy", "happy", "mysterious", "peaceful", "enthusiastic", "jolly"};
    String[] nouns = {"man", "mountain", "ocean", "state", "country", "building", "cat", "website", "team", "group"};

    int randomAdjective = new Random().nextInt(adjectives.length);
    int randomNoun = new Random().nextInt(nouns.length);

    System.out.println("Here is your server name:\n" + adjectives[randomAdjective] + "-" + nouns[randomNoun]);

    }
}
